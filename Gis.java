import java.util.Vector;
import java.io.File;
import org.geotools.coverage.grid.io.AbstractGridCoverage2DReader;
import org.geotools.coverage.grid.io.AbstractGridFormat;
import org.geotools.coverage.grid.io.GridFormatFinder;
import org.geotools.data.FileDataStore;
import org.geotools.data.FileDataStoreFinder;
import org.geotools.data.simple.SimpleFeatureSource;
import org.geotools.styling.*;



public class Gis {
	public void muestra () throws Exception {
		//ATENCION, la idea de todas las capas q cargo, es que se carguen
		//en base al filtro, aplicado por la ventana hecha con Swing..
		//osea q se cambiarian esas lineas de cargar los shp..
		Mapa mapita; 
		AbstractGridCoverage2DReader reader ;
		Estilos creadorEstilo = new Estilos();
		Vector <Capa> capas = new Vector();
		Capa capa;
		Style estilo;
		SimpleFeatureSource featureSource;
		FileDataStore store;
		File mapa;
		//saco una capa, la convierto, en base a ella genero un estilo
		//y con eso creo un objeto Capa con el featureSource y el estilo.
		mapa = new File("./shp/hoteles1.shp");
		store = FileDataStoreFinder.getDataStore(mapa);
        featureSource = store.getFeatureSource();
        estilo = creadorEstilo.estiloPunto(2,20,1);
        //agrego esa capa al vector
        capas.add(new Capa(featureSource,estilo));
        
        //lo mismo para otras capas
        mapa = new File("./shp/iglesias.shp");
		store = FileDataStoreFinder.getDataStore(mapa);
        featureSource= store.getFeatureSource();
        estilo = creadorEstilo.estiloPunto(1,20,2);
        //agrego esa capa al vector
        capas.add(new Capa(featureSource,estilo));
        
        mapa = new File("./shp/turismo.shp");
		store = FileDataStoreFinder.getDataStore(mapa);
        featureSource = store.getFeatureSource();
        estilo = creadorEstilo.estiloPunto(4,20,4);
        //agrego esa capa al vector
        capas.add(new Capa(featureSource,estilo));
        
        
        //ahora la img de fondo 
        File img = new File("./mapas/salta/centrosalta.jpg");
        AbstractGridFormat format = GridFormatFinder.findFormat(img);        
        reader = format.getReader(img);
        estilo = creadorEstilo.RGB(reader); //para q sea con color
        //agrego esa capa al vector
        
        
        
        //mando lo q quiero en el mapa
		mapita = new Mapa(capas,reader,estilo);
	}
    
    public void toggleLayerVisibility(String msje){
        System.out.println(msje);
    }
    public void updateMap(){
        try {
            this.muestra();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

