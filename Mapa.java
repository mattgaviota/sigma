import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import org.geotools.coverage.grid.io.AbstractGridCoverage2DReader;
import org.geotools.factory.CommonFactoryFinder;
import org.geotools.map.DefaultMapContext;
import org.geotools.map.MapContext;
import org.geotools.map.MapLayer;
import org.geotools.swing.JMapFrame;
import javax.swing.JToolBar;
import java.util.Vector;
import org.geotools.styling.*;
import org.geotools.swing.event.MapMouseEvent;
import org.geotools.swing.tool.CursorTool;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import org.opengis.feature.simple.SimpleFeature;
import org.geotools.data.simple.SimpleFeatureCollection;
import org.geotools.data.simple.SimpleFeatureIterator;
import org.geotools.geometry.jts.ReferencedEnvelope;
import org.opengis.filter.Filter;
import org.opengis.filter.FilterFactory2;


class InterfaceOfMap{
        //Attributes
    private MapContext Map = new DefaultMapContext();
    private JMapFrame MapFrame;
	private Vector<Layers> VectorOfLayers;
    private FilterFactory2 filterFactory = CommonFactoryFinder.getFilterFactory2(null);
        
        //Constructor
   public InterfaceOfMap(Vector<Layers> VectorOfLayers,AbstractGridCoverage2DReader reader,Style estilo){  //reader es el mapa y estilo es el estilo del mapa
		this.VectorOfLayers=VectorOfLayers;
        Map.setTitle("Sigma");
        //this method adds the georeferenced image in the background
        Map.addLayer(reader,estilo);
        for(Layers layer : VectorOfLayers)
            Map.addLayer(layer.getFeatureSource(),layer.getEstilo());
        for(MapLayer layerMap : Map.getLayers())
            layerMap.setVisible(false);
        Map.getLayer(0).setVisible(true);
        //We add a MapFrame with all his features
        MapFrame = new JMapFrame(Map);
        MapFrame.setSize(600, 400);
        MapFrame.enableStatusBar(false);   
        MapFrame.setResizable(false);
        MapFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        MapFrame.setLocation((int)(screenSize.getWidth() - MapFrame.getWidth()) / 2 , 0);
        MapFrame.enableTool(JMapFrame.Tool.ZOOM, JMapFrame.Tool.PAN, JMapFrame.Tool.RESET);
        MapFrame.enableToolBar(true);
        JToolBar toolBar = MapFrame.getToolBar();
        Icon InfoIcono = new ImageIcon("./images/information.gif");
        JButton btn = new JButton(InfoIcono);
        toolBar.addSeparator();
        toolBar.add(btn);

        //We set an actionlistener for information icon       
        btn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                MapFrame.getMapPane().setCursorTool(
                        new CursorTool() {

                            @Override
                            public void onMouseClicked(MapMouseEvent ev) {
                                mostrarInfo(ev);
                            }
                        });
            }
        });
        //In this method the visibility of the map is changed so We're able to see the map
        MapFrame.setVisible(true);
	}
	
	public void mostrarInfo(MapMouseEvent ev) {
        //We make a 20x20 mm rectangle wich is the radio in where we are able click in 
		Point screenPos = ev.getPoint();
        Rectangle screenRect = new Rectangle(screenPos.x-2, screenPos.y-2, 20, 20);
        AffineTransform screenToWorld = MapFrame.getMapPane().getScreenToWorldTransform();
        Rectangle2D worldRect = screenToWorld.createTransformedShape(screenRect).getBounds2D();
        ReferencedEnvelope bbox = new ReferencedEnvelope( worldRect, MapFrame.getMapContext().getCoordinateReferenceSystem());
        //We iterate checking the availability of the layers...
        for(Layers lay:VectorOfLayers){
			if(lay.getEnabled()){
				//...We identify the object in the area where the click was done and we show his features
				Filter filter = filterFactory.intersects(filterFactory.property(lay.getGeometry()), filterFactory.literal(bbox));
				try {
					SimpleFeatureCollection selectedFeatures = lay.getFeatureSource().getFeatures(filter);
					SimpleFeatureIterator iter = selectedFeatures.features();
					try {
						while (iter.hasNext()) {
							SimpleFeature feature = iter.next();
							System.out.println("Se muestra info de:" + lay.getEnabled());
							JFrame popUp = new JFrame("Info de: "+feature.getAttribute("name"));
							popUp.getContentPane().setLayout(new GridLayout(1, 2));
							JPanel panelImagen = new JPanel(new FlowLayout());
							String urlPhoto = (String)feature.getAttribute("photo");
							ImageIcon img = new ImageIcon(urlPhoto);
							JLabel etiquetaImg = new JLabel(img);
							panelImagen.add(etiquetaImg);
							JLabel etiqueta = new JLabel("Nombre: "+feature.getAttribute("name"));
							JLabel etiqueta2 = new JLabel("Dirección: "+feature.getAttribute("descriptio"));
							popUp.getContentPane().add(panelImagen);
							popUp.getContentPane().add(etiqueta);
							popUp.getContentPane().add(etiqueta2);
							popUp.pack();
							popUp.setVisible(true);
							popUp.setResizable(false);
							
						}
					} 
					finally	{ iter.close(); }
				}
				catch (Exception ex) {
					ex.printStackTrace();
					return;
				}
			}
		}
	}
    
    MapLayer getLayer(int pos){
        return Map.getLayer(pos);
    }
    
    public void repaint(){
        MapFrame.repaint();
    }
    
    public void setEnabled(int id,boolean cond){
		id-=1;
		VectorOfLayers.get(id).setEnabled(cond);
		System.out.println(id+"chilla-"+VectorOfLayers.get(id).getEnabled());
	}
    
}
