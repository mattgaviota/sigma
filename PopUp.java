/*
 *   PopUp class  
 *      
 */
import org.opengis.feature.simple.SimpleFeature;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.Icon;

public class PopUp {
    //Attributes
    JFrame popUp;
    /**
     * Constructor of PopUp Class
     * @param feature SimpleFeature
     * @author Gil-Novoa-Sarmiento
     */
	public PopUp (SimpleFeature feature) {		
		popUp = new JFrame("Info de: "+feature.getAttribute("name"));
        //set the layout of the frame
        popUp.getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        //put the photo in to the frame
        JPanel panelImagen = new JPanel(new FlowLayout());
        String urlPhoto = (String)feature.getAttribute("photo");
        ImageIcon IconPhoto = new ImageIcon(urlPhoto);
        JLabel etiquetaImg = new JLabel(IconPhoto);
        panelImagen.add(etiquetaImg);
        constraints.gridx = 0; // initial column
        constraints.gridy = 0; // initial row
        constraints.gridwidth = 1; // column width
        constraints.gridheight = 4; // row height
        popUp.getContentPane().add(panelImagen, constraints);
        //put the lblname in to the frame
        JLabel lblName = new JLabel("Nombre: "+feature.getAttribute("name"));
        constraints.gridx = 1; // initial column
        constraints.gridy = 0; // initial row
        constraints.gridwidth = 1; // column width
        constraints.gridheight = 1; // row height
        popUp.getContentPane().add(lblName, constraints);
        //put the lblAdrees in to the fram
        JLabel lblAddress = new JLabel("Dirección: "+feature.getAttribute("descriptio"));
        constraints.gridx = 1; // initial column
        constraints.gridy = 1; // initial row
        constraints.gridwidth = 1; // column width
        constraints.gridheight = 1; // row height
        popUp.getContentPane().add(lblAddress, constraints);
        
        popUp.setSize(720, 300);
        popUp.setVisible(true);
        popUp.setResizable(false);
	}
}
