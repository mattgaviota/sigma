    //Libraries
import java.util.Vector;
import java.util.HashMap;
import java.util.Iterator;
import java.io.File;
import org.geotools.coverage.grid.io.AbstractGridCoverage2DReader;
import org.geotools.coverage.grid.io.AbstractGridFormat;
import org.geotools.coverage.grid.io.GridFormatFinder;
import org.geotools.data.FileDataStore;
import org.geotools.data.FileDataStoreFinder;
import org.geotools.data.simple.SimpleFeatureSource;
import org.geotools.styling.*;



public class Gis {
        //Attributes
    private MapView mapita; 
	private AbstractGridCoverage2DReader BackgroundImage ;
	private StyleMaker styleMaker = new StyleMaker();
	private Vector <Layer> VectorOfLayers = new Vector();
	private Style style;
	private SimpleFeatureSource featureSource;
	private FileDataStore Store;
	private File FileMap;
        
        
        //Methods    
    public void muestra () throws Exception {
        //in the variable FileMap we open an shp file in order to convert it into a Layer, this convertion requests an style and features
        //saved in the variables style and featureSource
		FileMap = new File("./shp/hoteles1.shp");
		Store = FileDataStoreFinder.getDataStore(FileMap);
        featureSource = Store.getFeatureSource();
        style = styleMaker.estiloPunto(2,10,1);
        //We add the layer "hoteles1"" in the vector
        VectorOfLayers.add(new Layer(featureSource,style));
        
        //We repeat the process for layer's hoteles5
        FileMap = new File("./shp/hoteles5.shp");
		Store = FileDataStoreFinder.getDataStore(FileMap);
        featureSource = Store.getFeatureSource();
        style = styleMaker.estiloPunto(2,10,1);
        //We add the layer "hoteles5" in the vector
        VectorOfLayers.add(new Layer(featureSource,style));
        
        //We repeat the process for layer's iglesias
        FileMap = new File("./shp/iglesias.shp");
		Store = FileDataStoreFinder.getDataStore(FileMap);
        featureSource= Store.getFeatureSource();
        style = styleMaker.estiloPunto(1,10,2);
        //We add the layer iglesias in the vector
        VectorOfLayers.add(new Layer(featureSource,style));
        
        //We repeat the process for layer's rentcar
        FileMap = new File("./shp/rentcar.shp");
		Store = FileDataStoreFinder.getDataStore(FileMap);
        featureSource= Store.getFeatureSource();
        style = styleMaker.estiloPunto(1,10,2);
        //We add the layer rentcar in the vector
        VectorOfLayers.add(new Layer(featureSource,style));
        
        //We repeat the process for layer's museos
        FileMap = new File("./shp/museos.shp");
		Store = FileDataStoreFinder.getDataStore(FileMap);
        featureSource= Store.getFeatureSource();
        style = styleMaker.estiloPunto(1,10,2);
        //We add the layer museos in the vector
        VectorOfLayers.add(new Layer(featureSource,style));
        
        //We repeat the process for layer's turismo
        FileMap = new File("./shp/turismo.shp");
		Store = FileDataStoreFinder.getDataStore(FileMap);
        featureSource = Store.getFeatureSource();
        style = styleMaker.estiloPunto(4,10,4);
        //agrego esa capa al vector
        VectorOfLayers.add(new Layer(featureSource,style));
        
        
        // Here we set the png image in the background
        File img = new File("./mapas/mapasalta.png");
        AbstractGridFormat format = GridFormatFinder.findFormat(img);        
        BackgroundImage = format.getReader(img);
        //this method sets colours in the background image
        style = styleMaker.RGB(BackgroundImage); 

        //Just now I'm able to create an object of the class InterfaceOfMap
		mapita = new MapView(VectorOfLayers,BackgroundImage,style);
	}

	/*
		 * Agreement:
		 * 1 = hoteles 1,2,3 *
		 * 2 = hoteles 4,5 *
		 * 3 = iglesias
		 * 4 = rentcar
		 * 5 = museos
		 * 6 = turismo
    */
		
    public void toggleLayerVisibility(int id){
	
        if (mapita.getLayer(id).isVisible()){
			System.out.println(id+"-"+mapita.getLayer(id).isVisible());
			mapita.getLayer(id).setVisible(false);
			mapita.setEnabled(id,false);
			System.out.println(id+"cambio-"+mapita.getLayer(id).isVisible());
		}
		else {
			System.out.println(id+"-"+mapita.getLayer(id).isVisible());
			mapita.getLayer(id).setVisible(true);        
			mapita.setEnabled(id,true);
			//System.out.println(id+"cambioasdasd-"+mapita.getLayer(id).isVisible());
		}
		//System.out.println(msje);
	}
    
    
    public void updateMap(){
        try {
            mapita.repaint();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void Search(HashMap params, String buscado){
        Iterator iterador = params.keySet().iterator();
        Object key; 
        while (iterador.hasNext()) {
            key = iterador.next();
            System.out.println(params.get(key) + buscado);
        }
    }
}

