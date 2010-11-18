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


class Mapa{
        //Atributos
    MapContext map = new DefaultMapContext();
    JMapFrame frame;
	Vector<Capa> sources;
	StyleFactory sf = CommonFactoryFinder.getStyleFactory(null);
    FilterFactory2 ff = CommonFactoryFinder.getFilterFactory2(null);
        //Constructor
    Mapa(Vector<Capa> sources,AbstractGridCoverage2DReader reader,Style estilo){  //reader es el mapa y estilo es el estilo del mapa
		this.sources=sources;
        //titulo de la ventana
        map.setTitle("Testing");
        //agrego mapa de fondo
        map.addLayer(reader,estilo);
        for(Capa layer : sources)
            map.addLayer(layer.getFeatureSource(),layer.getEstilo());
        for(MapLayer layerMap : map.getLayers())
            layerMap.setVisible(false);
        map.getLayer(0).setVisible(true);
        //agrego un mapframe con sus propiedades
        frame = new JMapFrame(map);
        frame.setSize(600, 400);
        //frame.pack();
        frame.enableStatusBar(false);   
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //frame.setUndecorated(true);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((int)(screenSize.getWidth() - frame.getWidth()) / 2 , 0);
        frame.enableTool(JMapFrame.Tool.ZOOM, JMapFrame.Tool.PAN, JMapFrame.Tool.RESET);
        frame.enableToolBar(true);
        JToolBar toolBar = frame.getToolBar();
        Icon InfoIcono = new ImageIcon("./images/information.gif");
        JButton btn = new JButton(InfoIcono);
        toolBar.addSeparator();
        toolBar.add(btn);

        btn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                frame.getMapPane().setCursorTool(
                        new CursorTool() {

                            @Override
                            public void onMouseClicked(MapMouseEvent ev) {
                                mostrarInfo(ev);
                            }
                        });
            }
        });
        //muestro el mapa
        frame.setVisible(true);
	}
	
	void mostrarInfo(MapMouseEvent ev) {
		//hago un rectangulo de 20x20mm (asi no hay q hacer click en el punto EXACTO)
		Point screenPos = ev.getPoint();
        Rectangle screenRect = new Rectangle(screenPos.x-2, screenPos.y-2, 20, 20);
        AffineTransform screenToWorld = frame.getMapPane().getScreenToWorldTransform();
        Rectangle2D worldRect = screenToWorld.createTransformedShape(screenRect).getBounds2D();
        ReferencedEnvelope bbox = new ReferencedEnvelope( worldRect, frame.getMapContext().getCoordinateReferenceSystem());
        //por cada capa del mapa que este habilitada (visible)...
        for(Capa lay:sources){
			if(lay.getEnabled()){
				//...intersecto donde se hizo click, por la poscicion donde esta algun objeto
				Filter filter = ff.intersects(ff.property(lay.getGeometry()), ff.literal(bbox));
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
							ImageIcon img = new ImageIcon("./fotos/marilian.jpeg");
							JLabel etiquetaImg = new JLabel(img);
							panelImagen.add(etiquetaImg);
							JLabel etiqueta = new JLabel(" el lugar es: "+feature.getAttribute("name"));
							popUp.getContentPane().add(panelImagen);
							popUp.getContentPane().add(etiqueta);
							popUp.pack();
							//popUp.setSize(500, 300);
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
        return map.getLayer(pos);
    }
    
    void repaint(){
        frame.repaint();
    }
    
    void setEnabled(int id,boolean cond){
		id-=1;
		sources.get(id).setEnabled(cond);
		System.out.println(id+"chilla-"+sources.get(id).getEnabled());
	}
    
}
