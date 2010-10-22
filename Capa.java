import java.util.Vector;
import org.geotools.data.*;
import org.geotools.styling.*;

class Capa{
	FeatureSource fs ;
	Style est ;
	Capa(FeatureSource fs ,	Style est){
		this.fs=fs;
		this.est=est;
	}
	FeatureSource getFeatureSource(){
		return fs;
	}
	Style getEstilo(){
		return est;
	}
	
}
