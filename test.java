
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

class aux{
		StyleFactory sf = CommonFactoryFinder.getStyleFactory(null);
		FilterFactory2 ff = CommonFactoryFinder.getFilterFactory2(null);
		
		Style hacerRGB(AbstractGridCoverage2DReader reader){
		Style stylo;
        GridCoverage2D cov = null;
        try {
            cov = reader.read(null);
        } catch (IOException giveUp) {
            throw new RuntimeException(giveUp);
        }
        // We need at least three bands to create an RGB style
        int numBands = cov.getNumSampleDimensions();
        if (numBands < 3) {
            stylo=null;
        }
        // Get the names of the bands
        String[] sampleDimensionNames = new String[numBands];
        for (int i = 0; i < numBands; i++) {
            GridSampleDimension dim = cov.getSampleDimension(i);
            sampleDimensionNames[i] = dim.getDescription().toString();
        }
        final int RED = 0, GREEN = 1, BLUE = 2;
        int[] channelNum = { -1, -1, -1 };
        // We examine the band names looking for "red...", "green...", "blue...".
        // Note that the channel numbers we record are indexed from 1, not 0.
        for (int i = 0; i < numBands; i++) {
            String name = sampleDimensionNames[i].toLowerCase();
            if (name != null) {
                if (name.matches("red.*")) {
                    channelNum[RED] = i + 1;
                } else if (name.matches("green.*")) {
                    channelNum[GREEN] = i + 1;
                } else if (name.matches("blue.*")) {
                    channelNum[BLUE] = i + 1;
                }
            }
        }
        // If we didn't find named bands "red...", "green...", "blue..."
        // we fall back to using the first three bands in order
        if (channelNum[RED] < 0 || channelNum[GREEN] < 0 || channelNum[BLUE] < 0) {
            channelNum[RED] = 1;
            channelNum[GREEN] = 2;
            channelNum[BLUE] = 3;
        }
        // Now we create a RasterSymbolizer using the selected channels
        SelectedChannelType[] sct = new SelectedChannelType[cov.getNumSampleDimensions()];
        ContrastEnhancement ce = sf.contrastEnhancement(ff.literal(1.0), ContrastMethod.NORMALIZE);
        for (int i = 0; i < 3; i++) {
            sct[i] = sf.createSelectedChannelType(String.valueOf(channelNum[i]), ce);
        }
        RasterSymbolizer sym = sf.getDefaultRasterSymbolizer();
        ChannelSelection sel = sf.channelSelection(sct[RED], sct[GREEN], sct[BLUE]);
        sym.setChannelSelection(sel);

        stylo = SLD.wrapSymbolizers(sym);
        return stylo;//stylo
	}
	
	Style elPunto(int tipo,int tam,int color){
		Graphic gr = sf.createDefaultGraphic();
		Mark mark = null;
        switch (tipo) {
			case 1:mark = sf.getCircleMark();break;
			case 2:mark = sf.getStarMark();break;
			case 3:mark = sf.getSquareMark();break;
			case 4:mark = sf.getTriangleMark();break;
		}
		mark.setStroke(sf.createStroke(ff.literal(Color.BLACK), ff.literal(1)));
        switch (color) {
			case 1:mark.setFill(sf.createFill(ff.literal(Color.RED)));break;
			case 2:mark.setFill(sf.createFill(ff.literal(Color.BLUE)));break;
			case 3:mark.setFill(sf.createFill(ff.literal(Color.YELLOW)));break;
			case 4:mark.setFill(sf.createFill(ff.literal(Color.BLACK)));break;
		}
        //mark.setStroke(sf.createStroke(ff.literal(Color.BLUE), ff.literal(1)));
        //mark.setFill(sf.createFill(ff.literal(Color.RED)));
		gr.setSize(ff.literal(tam));
		
        gr.graphicalSymbols().clear();
        gr.graphicalSymbols().add(mark);
        
        /*
         * Setting the geometryPropertyName arg to null signals that we want to
         * draw the default geomettry of features
         */
        PointSymbolizer sym2 = sf.createPointSymbolizer(gr, null);

        Rule rule = sf.createRule();
        rule.symbolizers().add(sym2);
        FeatureTypeStyle fts = sf.createFeatureTypeStyle(new Rule[]{rule});
        Style style = sf.createStyle();
        style.featureTypeStyles().add(fts);
        return style;
	}
	
}


public class test{
	public static void main(String[] args) throws Exception {
		JMapFrame frame;
		AbstractGridCoverage2DReader reader;
		aux cosas = new aux();
		File mapa = new File("/home/dieguit/unsa/meto/proyecto/maps/salta/lugares.shp");
		File mapa2 = new File("/home/dieguit/unsa/meto/proyecto/maps/salta/lugares2.shp");
		File mapa3 = new File("/home/dieguit/unsa/meto/proyecto/maps/salta/lugares3.shp");
        if (mapa == null) {
            return;
        }
        FileDataStore store = FileDataStoreFinder.getDataStore(mapa);
        FeatureSource featureSource = store.getFeatureSource();
        store = FileDataStoreFinder.getDataStore(mapa2);
        FeatureSource featureSource2 = store.getFeatureSource();
        store = FileDataStoreFinder.getDataStore(mapa3);
        FeatureSource featureSource3 = store.getFeatureSource();
        
        File img = new File("/home/dieguit/unsa/meto/proyecto/maps/salta/centrosalta.jpg");
        if (img == null) {
            return;
        }
        AbstractGridFormat format = GridFormatFinder.findFormat(img);        
        reader = format.getReader(img);
        

        Style stylo=cosas.hacerRGB(reader);
        
        final MapContext map = new DefaultMapContext();
        map.setTitle("Testing");
        map.addLayer(reader, stylo);
        map.addLayer(featureSource, cosas.elPunto(2,20,1));
        map.addLayer(featureSource2, cosas.elPunto(1,20,2));
        map.addLayer(featureSource3, cosas.elPunto(4,20,4));
        frame = new JMapFrame(map);
        //frame = new JFrame("lala");
        frame.setSize(600, 600);
        
        frame.enableStatusBar(false);
        frame.enableTool(JMapFrame.Tool.ZOOM, JMapFrame.Tool.PAN, JMapFrame.Tool.RESET);
        frame.enableToolBar(true);
        
        frame.setVisible(true);
	}
}
