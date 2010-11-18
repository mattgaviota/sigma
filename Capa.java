import org.geotools.styling.*;
import org.opengis.feature.type.GeometryDescriptor;
import org.geotools.data.simple.SimpleFeatureSource;

class Capa{
	SimpleFeatureSource fs ;
	Style est ;
	String geometryAttributeName;
	boolean enabled;
	Capa(SimpleFeatureSource fs,Style est){
		enabled=false;
		this.fs=fs;
		this.est=est;
		//estas 2 lineas meten en el atributo geometryAttributeName 
		//una cadena que vamos a usar como ID para el filtro..
		GeometryDescriptor geomDesc = fs.getSchema().getGeometryDescriptor();
        this.geometryAttributeName = geomDesc.getLocalName();
	}
	SimpleFeatureSource getFeatureSource(){
		return fs;
	}
	Style getEstilo(){
		return est;
	}
	String getGeometry(){
		return geometryAttributeName;
	}
	void setEnabled(boolean cond){
		enabled=cond;
	}
	boolean getEnabled(){
		return enabled;
	}
	
}
