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
    Mapa mapita; 
	AbstractGridCoverage2DReader reader ;
	Estilos creadorEstilo = new Estilos();
	Vector <Capa> capas = new Vector();
	Capa capa;
	Style estilo;
	SimpleFeatureSource featureSource;
	FileDataStore store;
	File mapa;
	public void muestra () throws Exception {
		//saco una capa, la convierto, en base a ella genero un estilo
		//y con eso creo un objeto Capa con el featureSource y el estilo.
		mapa = new File("./shp/hoteles1.shp");
		store = FileDataStoreFinder.getDataStore(mapa);
        featureSource = store.getFeatureSource();
        estilo = creadorEstilo.estiloPunto(2,10,1);
        //agrego esa capa al vector
        capas.add(new Capa(featureSource,estilo));
        
        mapa = new File("./shp/hoteles5.shp");
		store = FileDataStoreFinder.getDataStore(mapa);
        featureSource = store.getFeatureSource();
        estilo = creadorEstilo.estiloPunto(2,10,1);
        //agrego esa capa al vector
        capas.add(new Capa(featureSource,estilo));
        
        //lo mismo para otras capas
        mapa = new File("./shp/iglesias.shp");
		store = FileDataStoreFinder.getDataStore(mapa);
        featureSource= store.getFeatureSource();
        estilo = creadorEstilo.estiloPunto(1,10,2);
        //agrego esa capa al vector
        capas.add(new Capa(featureSource,estilo));
        
        //lo mismo para otras capas
        mapa = new File("./shp/rentcar.shp");
		store = FileDataStoreFinder.getDataStore(mapa);
        featureSource= store.getFeatureSource();
        estilo = creadorEstilo.estiloPunto(1,10,2);
        //agrego esa capa al vector
        capas.add(new Capa(featureSource,estilo));
        
        //lo mismo para otras capas
        mapa = new File("./shp/museos.shp");
		store = FileDataStoreFinder.getDataStore(mapa);
        featureSource= store.getFeatureSource();
        estilo = creadorEstilo.estiloPunto(1,10,2);
        //agrego esa capa al vector
        capas.add(new Capa(featureSource,estilo));
        
        mapa = new File("./shp/turismo.shp");
		store = FileDataStoreFinder.getDataStore(mapa);
        featureSource = store.getFeatureSource();
        estilo = creadorEstilo.estiloPunto(4,10,4);
        //agrego esa capa al vector
        capas.add(new Capa(featureSource,estilo));
        
        
        //ahora la img de fondo 
        File img = new File("./mapas/mapasalta.png");
        AbstractGridFormat format = GridFormatFinder.findFormat(img);        
        reader = format.getReader(img);
        estilo = creadorEstilo.RGB(reader); //para q sea con color
        //agrego esa capa al vector

        //mando lo q quiero en el mapa
		mapita = new Mapa(capas,reader,estilo);
	}

    public void toggleLayerVisibility(int id){
		/*
		 * Por Convencion:
		 * 1 = hoteles 1,2,3 *
		 * 2 = hoteles 4,5 *
		 * 3 = iglesias
		 * 4 = rentcar
		 * 5 = museos
		 * 6 = turismo
		 */
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
    public void buscar(HashMap params, String buscado){
        Iterator iterador = params.keySet().iterator();
        Object key; 
        while (iterador.hasNext()) {
            key = iterador.next();
            System.out.println(params.get(key) + buscado);
        }
    }
}

