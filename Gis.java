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
 
/**
*      Gis Class: This class is in charge of show and update the map with its layers. Also searchs a point specified by parameters.
*   @author Gil-Novoa-Sarmiento
*/


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
        
/**
*      Shows Method Puts inside a MapView the background image and all its layers.
*/
        //Methods    
    public void Shows () throws Exception {
        //in the variable FileMap we open an shp file in order to convert it into a Layer, this convertion requests an style and features
        //saved in the variables style and featureSource
		FileMap = new File("./shp/hoteles1.shp");
		Store = FileDataStoreFinder.getDataStore(FileMap);
        featureSource = Store.getFeatureSource();
        style = styleMaker.estiloPunto(1,10,1);
        //We add the layer "hoteles1"" in the vector
        VectorOfLayers.add(new Layer(featureSource,style));
        
        //We repeat the process for layer's hoteles5
        FileMap = new File("./shp/hoteles5.shp");
		Store = FileDataStoreFinder.getDataStore(FileMap);
        featureSource = Store.getFeatureSource();
        style = styleMaker.estiloPunto(2,10,2);
        //We add the layer "hoteles5" in the vector
        VectorOfLayers.add(new Layer(featureSource,style));
        
        //We repeat the process for layer's iglesias
        FileMap = new File("./shp/iglesias.shp");
		Store = FileDataStoreFinder.getDataStore(FileMap);
        featureSource= Store.getFeatureSource();
        style = styleMaker.estiloPunto(3,10,3);
        //We add the layer iglesias in the vector
        VectorOfLayers.add(new Layer(featureSource,style));
        
        //We repeat the process for layer's rentcar
        FileMap = new File("./shp/rentcar.shp");
		Store = FileDataStoreFinder.getDataStore(FileMap);
        featureSource= Store.getFeatureSource();
        style = styleMaker.estiloPunto(4,10,4);
        //We add the layer rentcar in the vector
        VectorOfLayers.add(new Layer(featureSource,style));
        
        //We repeat the process for layer's museos
        FileMap = new File("./shp/museos.shp");
		Store = FileDataStoreFinder.getDataStore(FileMap);
        featureSource= Store.getFeatureSource();
        style = styleMaker.estiloPunto(5,10,5);
        //We add the layer museos in the vector
        VectorOfLayers.add(new Layer(featureSource,style));
        
        //We repeat the process for layer's turismo
        FileMap = new File("./shp/turismo.shp");
		Store = FileDataStoreFinder.getDataStore(FileMap);
        featureSource = Store.getFeatureSource();
        style = styleMaker.estiloPunto(6,10,6);
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

/**     toggleLayerVisibility Method sets the visibility of a layer specificied by an integer.
     * Agreement:
     * 1 = hoteles 1,2,3 *
	 * 2 = hoteles 4,5 *
	 * 3 = iglesias
	 * 4 = rentcar
	 * 5 = museos
	 * 6 = turismo
*/
		
    public void toggleLayerVisibility(int id){
	
        mapita.LayerVisibility(id);
	}
    
/**
*       updateMap Method 
*/
    public void updateMap(){
        try {
            mapita.repaint();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
/**
*       Search Method Searchs a point
*     @param params  HashMap
*     @param buscado A String
*/ 
    public void Search(HashMap params, String buscado){
        Iterator iterador = params.keySet().iterator();
        Object key;
        mapita.setMaxPopUp(); 
        while (iterador.hasNext()) {
            key = iterador.next();
            Integer num = (Integer) params.get(key);
            mapita.Search(num.intValue(),buscado);
        }
    }
}

