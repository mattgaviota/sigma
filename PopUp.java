    //Libraries
import org.opengis.feature.simple.SimpleFeature;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.Icon;

/**
*       PopUp class: Makes a popup from a SimpleFeature
*    passed by parameter  
*    @author Gil-Novoa-Sarmiento
*/

public class PopUp {
    //Attributes
    private JFrame popUp;
/**
*      PopUp Constructor
*   @param feature SimpleFeature
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
        JLabel lblName = new JLabel();
        lblName.setFont( new Font("Arial",Font.PLAIN,14));
        lblName.setText("<html><b>Nombre:</b> "+feature.getAttribute("name"));
        constraints.gridx = 1; // initial column
        constraints.gridy = 0; // initial row
        constraints.gridwidth = 1; // column width
        constraints.gridheight = 1; // row height
        popUp.getContentPane().add(lblName, constraints);
        
        //put the lblAdrees in to the fram
        JLabel lblAddress = new JLabel("<html><b>Direccion:</b> "+feature.getAttribute("descriptio"));
        constraints.gridx = 1; // initial column
        constraints.gridy = 1; // initial row
        constraints.gridwidth = 1; // column width
        constraints.gridheight = 1; // row height
        popUp.getContentPane().add(lblAddress, constraints);
        
        //put the lblPhone in to the frame
        JLabel lblPhone = new JLabel("<html><b>Telefono:</b> "+feature.getAttribute("telephone"));
        constraints.gridx = 1; // initial column
        constraints.gridy = 2; // initial row
        constraints.gridwidth = 1; // column width
        constraints.gridheight = 1; // row height
        popUp.getContentPane().add(lblPhone, constraints);
        
        //put the lblPhone in to the frame
        JLabel lblWeb = new JLabel("<html><b>Web/e-mail:</b>: <a href='"+feature.getAttribute("webpage")+"'>"+feature.getAttribute("webpage")+"</a>");      
        constraints.gridx = 1; // initial column
        constraints.gridy = 3; // initial row
        constraints.gridwidth = 1; // column width
        constraints.gridheight = 1; // row height
        popUp.getContentPane().add(lblWeb, constraints);
        
        popUp.setSize(720, 300);
        popUp.setVisible(true);
        popUp.setResizable(false);
	}
	
}
