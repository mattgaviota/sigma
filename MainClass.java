import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.ButtonModel;
import javax.swing.AbstractButton;
import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class MainClass {
    static Gis gis = new Gis();
    
    public static void CreateAndShowGUI() throws Exception{
        gis.asd();
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new JTabbedPaneDemo(), BorderLayout.CENTER);
        f.setSize(550, 200);
        f.setVisible(true);
    }
  
    public static void main(String[] args) throws Exception{
        SwingUtilities.invokeLater(new Runnable() {
            
        public void run() {
            //Turn off metal's use of bold fonts
            UIManager.put("swing.boldMetal", Boolean.FALSE);
            try {
                CreateAndShowGUI();}
            catch (Exception ex) {
            ex.printStackTrace();
            }
        }
    });
  }
}

class JTabbedPaneDemo extends JPanel {

    public JTabbedPaneDemo() throws Exception{
        super(new GridLayout(1, 1));
        
        JTabbedPane jtp = new JTabbedPane();
        jtp.addTab("Inicio", new ImageIcon("./images/middle.gif"),new Principal(), "Muestra mapa");
        jtp.addTab("Capas", new ImageIcon("./images/middle.gif"),new Capas(), "Capas disponibles");
        jtp.addTab("About", new ImageIcon("./images/middle.gif"), new About(), "Acerca de");
    
        jtp.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        jtp.setTabPlacement(JTabbedPane.LEFT);
        add(jtp);
    
    }
}



class Capas extends JPanel {
    JCheckBox cb1, cb2, cb3, cb4, cb5, cb6;

    public Capas() {
        super(new GridLayout(2, 3)); 
        cb1 = new JCheckBox("Hoteles *|**|***");
        cb1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (cb1.isSelected()){
                    System.out.println("hola");
                }
                else System.out.println("chau");
            }
        });
        add(cb1);
        cb2 = new JCheckBox("RentCars");
        add(cb2);
        cb3 = new JCheckBox("Iglesias");
        add(cb3);
        cb4 = new JCheckBox("Museos");
        add(cb4);
        cb5 = new JCheckBox("Turismo");
        add(cb5);
        cb6 = new JCheckBox("Hoteles ****|*****");
        add(cb6);
    }
}

class Principal extends JPanel{
    JButton btn1;
        
    public Principal() throws Exception{
        btn1 = new JButton("Mostrar mapa");
        btn1.addActionListener (new ActionListener (){
            public void actionPerformed (ActionEvent e){
                try {
                    System.out.println("troz");
                }
                catch (Exception ex) {
				ex.printStackTrace();
                }
                    
            }
        });
        add(btn1);
    }

}

    
class About extends JPanel {
    //Atributos
    JLabel lb1, lb2, lb3, lb4;
    
    public About(){
        super(new GridLayout(4, 1));
        //titulo
        lb1 = new JLabel("Sigma");
        lb1.setHorizontalAlignment(JLabel.CENTER);
        lb1.setVerticalAlignment(JLabel.CENTER);
        //Descripcion
        lb2 = new JLabel("Gis para el turismo");
        lb2.setHorizontalAlignment(JLabel.CENTER);
        lb2.setVerticalAlignment(JLabel.CENTER);
        //titulo Autores
        lb3 = new JLabel("Autores :");
        //nombres de los autores
        lb4 = new JLabel("<html>Diego Gil<br>Nilsa Sarmiento<br>Matias Novoa");
        lb4.setHorizontalAlignment(JLabel.CENTER);
        lb4.setVerticalAlignment(JLabel.CENTER);
        
        //Agregando label al panel
        add(lb1);
        add(lb2);
        add(lb3);
        add(lb4);
           
        }
}

