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
import org.geotools.swing.JMapFrame;
import java.util.Vector;
import org.geotools.data.*;
import org.geotools.styling.*;


class Mapa{
	JMapFrame frame;
	Mapa(Vector<Capa> sources,AbstractGridCoverage2DReader reader,Style estilo){
        final MapContext map = new DefaultMapContext();
        //titulo de la ventana
        map.setTitle("Testing");
        //agrego mapa de fondo
        map.addLayer(reader,estilo);
        //agrego las capas (sustituible con un for, cuando tengamos mas capas..)
        map.addLayer(sources.get(0).getFeatureSource(),sources.get(0).getEstilo());
        map.addLayer(sources.get(1).getFeatureSource(),sources.get(1).getEstilo());
        map.addLayer(sources.get(2).getFeatureSource(),sources.get(2).getEstilo());
        //agrego un mapframe con sus propiedades
        frame = new JMapFrame(map);
        frame.setSize(600, 600);
        frame.enableStatusBar(false);
        frame.enableTool(JMapFrame.Tool.ZOOM, JMapFrame.Tool.PAN, JMapFrame.Tool.RESET);
        frame.enableToolBar(true);
        //muestro el mapa
        frame.setVisible(true);
	}
}
