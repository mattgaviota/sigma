import java.util.Vector;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import org.geotools.data.*;
import org.geotools.coverage.GridSampleDimension;
import org.geotools.coverage.grid.GridCoverage2D;
import org.geotools.coverage.grid.io.AbstractGridCoverage2DReader;
import org.geotools.coverage.grid.io.AbstractGridFormat;
import org.geotools.coverage.grid.io.GridFormatFinder;
import org.geotools.data.FileDataStore;
import org.geotools.data.FileDataStoreFinder;
import org.geotools.data.Parameter;
import org.geotools.data.simple.SimpleFeatureSource;
import org.geotools.factory.CommonFactoryFinder;
import org.geotools.map.DefaultMapContext;
import org.geotools.map.MapContext;
import org.geotools.styling.*;
import org.geotools.swing.JMapFrame;
import org.geotools.swing.action.SafeAction;
import org.geotools.swing.data.JParameterListWizard;
import org.geotools.swing.wizard.JWizard;
import org.geotools.swing.data.JFileDataStoreChooser;
import org.geotools.util.KVP;
import org.opengis.filter.FilterFactory2;
import org.opengis.style.ContrastMethod;

public class Gis {
	public static void main(String[] args) throws Exception {
		//ATENCION, la idea de todas las capas q cargo, es que se carguen
		//en base al filtro, aplicado por la ventana hecha con Swing..
		//osea q se cambiarian esas lineas de cargar los shp..
		Mapa mapita;
		AbstractGridCoverage2DReader reader ;
		Estilos creadorEstilo = new Estilos();
		Vector <Capa> capas = new Vector();
		Capa capa;
		Style estilo;
		FeatureSource featureSource;
		FileDataStore store;
		File mapa;
		//saco una capa, la convierto, en base a ella genero un estilo
		//y con eso creo un objeto Capa con el featureSource y el estilo.
		mapa = new File("./mapas/salta/lugares.shp");
		store = FileDataStoreFinder.getDataStore(mapa);
        featureSource = store.getFeatureSource();
        estilo = creadorEstilo.estiloPunto(2,20,1);
        //agrego esa capa al vector
        capas.add(new Capa(featureSource,estilo));
        
        //lo mismo para otras capas
        mapa = new File("./mapas/salta/lugares2.shp");
		store = FileDataStoreFinder.getDataStore(mapa);
        featureSource= store.getFeatureSource();
        estilo = creadorEstilo.estiloPunto(1,20,2);
        //agrego esa capa al vector
        capas.add(new Capa(featureSource,estilo));
        
        mapa = new File("./mapas/salta/lugares3.shp");
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
}

