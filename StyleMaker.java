    //Libraries
import java.awt.Color;
import java.io.IOException;
import org.geotools.coverage.GridSampleDimension;
import org.geotools.coverage.grid.GridCoverage2D;
import org.geotools.coverage.grid.io.AbstractGridCoverage2DReader;
import org.geotools.factory.CommonFactoryFinder;
import org.geotools.styling.*;
import org.opengis.filter.FilterFactory2;
import org.opengis.filter.identity.FeatureId;
import org.opengis.style.ContrastMethod;

/**
*     StyleMaker class: Creates two differents styles
*   @author Gil-Novoa-Sarmiento
*/

    
public class StyleMaker{
    //Attributes
    StyleFactory styleFactory = CommonFactoryFinder.getStyleFactory(null);
    FilterFactory2 filterFactory = CommonFactoryFinder.getFilterFactory2(null);
/**
*       RGB Method: puts colours in the image passed by parameter
*     @param BackgroundImage AbstractGridCoverage2DReader
*/
    public Style RGB(AbstractGridCoverage2DReader BackgroundImage){
        
        Style style;
        GridCoverage2D cov = null;
        try {
            cov = BackgroundImage.read(null);
        } 
        catch (IOException giveUp) {
            throw new RuntimeException(giveUp);
        }
        // We need at least three bands to create an RGB style
        int numBands = cov.getNumSampleDimensions();
        if (numBands < 3) {
            style=null;
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
					} 
                else if (name.matches("green.*")) {
                    channelNum[GREEN] = i + 1;
					} 
                else if (name.matches("blue.*")) {
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
        ContrastEnhancement ce = styleFactory.contrastEnhancement(filterFactory.literal(1.0), ContrastMethod.NORMALIZE);
        for (int i = 0; i < 3; i++) {
            sct[i] = styleFactory.createSelectedChannelType(String.valueOf(channelNum[i]), ce);
        }
       
        RasterSymbolizer sym = styleFactory.getDefaultRasterSymbolizer();
        ChannelSelection sel = styleFactory.channelSelection(sct[RED], sct[GREEN], sct[BLUE]);
        sym.setChannelSelection(sel);

        style = SLD.wrapSymbolizers(sym);
        
        return style;//stylo
	}
	

/**
*        estiloPunto Method: sets type, size and colour of a point
*      @return estiloPunto Style
*/  
	public Style estiloPunto(int tipo,int tam,int color){
		Graphic gr = styleFactory.createDefaultGraphic();
		Mark mark = null;
        switch (tipo) {
			case 1:mark = styleFactory.getCircleMark();break;
			case 2:mark = styleFactory.getStarMark();break;
			case 3:mark = styleFactory.getSquareMark();break;
			case 4:mark = styleFactory.getTriangleMark();break;
			case 5:mark = styleFactory.getXMark();break;
			case 6:mark = styleFactory.getCrossMark();break;
		}
		mark.setStroke(styleFactory.createStroke(filterFactory.literal(Color.BLACK), filterFactory.literal(1)));
        switch (color) {
			case 1:mark.setFill(styleFactory.createFill(filterFactory.literal(Color.RED)));break;
			case 2:mark.setFill(styleFactory.createFill(filterFactory.literal(Color.BLUE)));break;
			case 3:mark.setFill(styleFactory.createFill(filterFactory.literal(Color.YELLOW)));break;
			case 4:mark.setFill(styleFactory.createFill(filterFactory.literal(Color.BLACK)));break;
			case 5:mark.setFill(styleFactory.createFill(filterFactory.literal(Color.GREEN)));break;
			case 6:mark.setFill(styleFactory.createFill(filterFactory.literal(Color.ORANGE)));break;
		}
		gr.setSize(filterFactory.literal(tam));
        gr.graphicalSymbols().clear();
        gr.graphicalSymbols().add(mark);
        
         // Setting the geometryPropertyName arg to null signals that we want to draw the default geomettry of features
    
        PointSymbolizer sym2 = styleFactory.createPointSymbolizer(gr, null);

        Rule rule = styleFactory.createRule();
        rule.symbolizers().add(sym2);
        FeatureTypeStyle fts = styleFactory.createFeatureTypeStyle(new Rule[]{rule});
        Style style = styleFactory.createStyle();
        style.featureTypeStyles().add(fts);
        return style;
	}	
}
