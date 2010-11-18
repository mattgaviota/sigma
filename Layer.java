    //Libraries
import org.geotools.styling.*;
import org.opengis.feature.type.GeometryDescriptor;
import org.geotools.data.simple.SimpleFeatureSource;


public class Layer{
        //Attributes
	private SimpleFeatureSource featureSource ;
	private Style style ;
	private String geometryAttributeName;
	private boolean enabled;
	
        //Constructor
    public Layer(SimpleFeatureSource featureSource,Style style){
		enabled=false;
		this.featureSource=featureSource;
		this.style=style;
		//estas 2 lineas meten en el atributo geometryAttributeName 
		//una cadena que vamos a usar como ID para el filtro..
		GeometryDescriptor geomDesc = featureSource.getSchema().getGeometryDescriptor();
        this.geometryAttributeName = geomDesc.getLocalName();
	}
        //Set and Get methods
    public void setEnabled(boolean cond){
		enabled=cond;
	}    
	public SimpleFeatureSource getFeatureSource(){
		return featureSource;
	}
	public Style getStyle(){
		return style;
	}
	public String getGeometry(){
		return geometryAttributeName;
	}

	public boolean getEnabled(){
		return enabled;
	}
	
}
