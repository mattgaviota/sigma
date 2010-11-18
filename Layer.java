    //Libraries
import org.geotools.styling.*;
import org.opengis.feature.type.GeometryDescriptor;
import org.geotools.data.simple.SimpleFeatureSource;

/**
*       Layer Class: generates a layer specifying its feature and its style
*     @author Gil-Novoa-Sarmiento
*/


public class Layer{
        //Attributes
	private SimpleFeatureSource featureSource ;
	private Style style ;
	private String geometryAttributeName;
	private boolean enabled;
	
 /**
*       Layer Constructor
*     @param featureSource SimpleFeatureSource
*     @param style Style
*/    
        //Constructor
    public Layer(SimpleFeatureSource featureSource,Style style){
		enabled=false;
		this.featureSource=featureSource;
		this.style=style;
        //in this two lines we put inside the attribute geometryAttributename an string wich will be used as an ID for the filter
		GeometryDescriptor geomDesc = featureSource.getSchema().getGeometryDescriptor();
        this.geometryAttributeName = geomDesc.getLocalName();
	}
    
/**
*       setEnabled Method
*           cond boolean 
*/     
        //Set and Get methods
    public void setEnabled(boolean cond){
		enabled=cond;
	}    
/**
*       getFeatureSource  Method  
*   @return featureSource
*/
	public SimpleFeatureSource getFeatureSource(){
		return featureSource;
	}
/**
*       getStyle Method
*   @return Style
*/ 
	public Style getStyle(){
		return style;
	}
/**
*       getStyle Method
*   @return geometryAttributeName
*/ 
	public String getGeometry(){
		return geometryAttributeName;
	}
/**
*       getStyle Method
*   @return enabled
*/ 
	public boolean getEnabled(){
		return enabled;
	}
	
}
