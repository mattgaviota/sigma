    //Libraries
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.HashMap;


/**
 * The application's main frame.
 */

public class SigmaView extends FrameView {
    //Attributes
    private  Gis sigma;
    private  HashMap<String, String> parametros;
    private  JButton btn2Buscar;
    private  JButton btnActualizar;
    private  JButton btnNinguna;
    private  JButton btnTodas;
    private  JCheckBox cb2Hotel123;
    private  JCheckBox cb2Hotel45;
    private  JCheckBox cb2Iglesias;
    private  JCheckBox cb2Museos;
    private  JCheckBox cb2RentAcar;
    private  JCheckBox cb2Turismo;
    private  JCheckBox cbHotel123;
    private  JCheckBox cbHotel45;
    private  JCheckBox cbIglesias;
    private  JCheckBox cbMuseos;
    private  JCheckBox cbRentACar;
    private  JCheckBox cbTurismo;
    private  JLabel lblLayersSelection;
    private  JLabel lblWebPage;
    private  JLabel lblSearch;
    private  JLabel lblFilters;
    private  JLabel lblSigma;
    private  JLabel lblMattsName;
    private  JLabel lblLogo;
    private  JLabel lblDieguitsName;
    private  JLabel lblNilsasName;
    private  JPanel panLayers;
    private  JPanel panSearch;
    private  JPanel panAbout;
    private  JPanel panAuthors;
    private  JPanel panSource;
    private  JTabbedPane jTabbedPane1;
    private  JTextField SearchTextField;
    private  JPanel panMain;
    private  JPanel probando;

    //Constructor
    public SigmaView(SingleFrameApplication app) {
        
        super(app);
        
        initComponents();
        
    }

    

    /** This method is called from within the constructor to
     * initialize the form.
     */
    @SuppressWarnings("unchecked")
    
    private void initComponents() {
        
        sigma  = new Gis();
        try {
            sigma.muestra();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        parametros = new HashMap<String, String>();
        
        panMain = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panLayers = new javax.swing.JPanel();
        cbHotel123 = new javax.swing.JCheckBox();
        cbHotel45 = new javax.swing.JCheckBox();
        cbIglesias = new javax.swing.JCheckBox();
        cbMuseos = new javax.swing.JCheckBox();
        cbRentACar = new javax.swing.JCheckBox();
        cbTurismo = new javax.swing.JCheckBox();
        lblLayersSelection = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnTodas = new javax.swing.JButton();
        btnNinguna = new javax.swing.JButton();
        panSearch = new javax.swing.JPanel();
        cb2Hotel45 = new javax.swing.JCheckBox();
        cb2Hotel123 = new javax.swing.JCheckBox();
        cb2Iglesias = new javax.swing.JCheckBox();
        cb2Turismo = new javax.swing.JCheckBox();
        cb2RentAcar = new javax.swing.JCheckBox();
        cb2Museos = new javax.swing.JCheckBox();
        btn2Buscar = new javax.swing.JButton();
        SearchTextField = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        lblFilters = new javax.swing.JLabel();
        panAbout = new javax.swing.JPanel();
        lblSigma = new javax.swing.JLabel();
        panAuthors = new javax.swing.JPanel();
        lblDieguitsName = new javax.swing.JLabel();
        lblMattsName = new javax.swing.JLabel();
        lblNilsasName = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        panSource = new javax.swing.JPanel();
        lblWebPage = new javax.swing.JLabel();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(SigmaApp.class).getContext().getResourceMap(SigmaView.class);
        panMain.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, resourceMap.getColor("panMain.border.matteColor"))); // NOI18N
        panMain.setMaximumSize(new java.awt.Dimension(900, 200));
        panMain.setMinimumSize(new java.awt.Dimension(900, 200));
        panMain.setName("panMain"); // NOI18N
        panMain.setPreferredSize(new java.awt.Dimension(900, 200));
        panMain.setRequestFocusEnabled(false);

        jTabbedPane1.setForeground(resourceMap.getColor("lblNilsasName.foreground")); // NOI18N
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setName("jTabbedPane1"); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(850, 190));

        panLayers.setAlignmentX(500.0F);
        panLayers.setAlignmentY(500.0F);
        panLayers.setName("panLayers"); 
        panLayers.setPreferredSize(new java.awt.Dimension(880, 160));

        cbHotel123.setText(resourceMap.getString("cbHotel123.text")); 
        cbHotel123.setName("cbHotel123"); 
        cbHotel123.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                sigma.toggleLayerVisibility(1);
            }
        });

        cbHotel45.setText(resourceMap.getString("cbHotel45.text")); 
        cbHotel45.setName("cbHotel45"); 
        cbHotel45.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                sigma.toggleLayerVisibility(2);
            }
        });


        cbIglesias.setText(resourceMap.getString("cbIglesias.text")); 
        cbIglesias.setName("cbIglesias"); 
        cbIglesias.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                sigma.toggleLayerVisibility(3);
            }
        });

        cbRentACar.setText(resourceMap.getString("cbRentACar.text"));
        cbRentACar.setName("cbRentACar"); 
        cbRentACar.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                sigma.toggleLayerVisibility(4);
            }
        });

        cbMuseos.setText(resourceMap.getString("cbMuseos.text")); 
        cbMuseos.setName("cbMuseos"); 
        cbMuseos.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                sigma.toggleLayerVisibility(5);
            }
        });

        cbTurismo.setText(resourceMap.getString("cbTurismo.text")); 
        cbTurismo.setName("cbTurismo"); 
        cbTurismo.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                sigma.toggleLayerVisibility(6);
            }
        });

        lblLayersSelection.setText(resourceMap.getString("lblLayersSelection.text")); 
        lblLayersSelection.setName("lblLayersSelection"); 

        btnActualizar.setIcon(resourceMap.getIcon("btnActualizar.icon")); 
        btnActualizar.setText(resourceMap.getString("btnActualizar.text")); 
        btnActualizar.setBorder(null);
        btnActualizar.setName("btnActualizar"); 
        btnActualizar.addActionListener (new ActionListener (){
            public void actionPerformed (ActionEvent e){
                try {
                    
                    sigma.updateMap();
                }
                catch (Exception ex) {
				ex.printStackTrace();
                }
                    
            }
        });

        btnTodas.setText(resourceMap.getString("btnTodas.text")); 
        btnTodas.setName("btnTodas"); 
        btnTodas.addActionListener (new ActionListener (){
            public void actionPerformed (ActionEvent e){
                try {
                    cbHotel123.setSelected(true);
                    cbHotel45.setSelected(true);
                    cbIglesias.setSelected(true);
                    cbMuseos.setSelected(true);
                    cbTurismo.setSelected(true);
                    cbRentACar.setSelected(true);
                }
                catch (Exception ex) {
				ex.printStackTrace();
                }
                    
            }
        });


        btnNinguna.setText(resourceMap.getString("btnNinguna.text")); 
        btnNinguna.setName("btnNinguna"); 
        btnNinguna.addActionListener (new ActionListener (){
            public void actionPerformed (ActionEvent e){
                try {
                    cbHotel123.setSelected(false);
                    cbHotel45.setSelected(false);
                    cbIglesias.setSelected(false);
                    cbMuseos.setSelected(false);
                    cbTurismo.setSelected(false);
                    cbRentACar.setSelected(false);
                }
                catch (Exception ex) {
				ex.printStackTrace();
                }
                    
            }
        });


        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(panLayers);
        panLayers.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbMuseos)
                            .addComponent(cbHotel123)
                            .addComponent(cbIglesias))
                        .addGap(176, 176, 176)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbHotel45)
                            .addComponent(cbRentACar)
                            .addComponent(cbTurismo))
                        .addGap(149, 149, 149)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnTodas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNinguna, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblLayersSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblLayersSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnTodas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNinguna, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbHotel123)
                                .addGap(18, 18, 18)
                                .addComponent(cbMuseos))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbHotel45)
                                .addGap(18, 18, 18)
                                .addComponent(cbRentACar)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbTurismo)
                            .addComponent(cbIglesias))))
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab(resourceMap.getString("panLayers.TabConstraints.tabTitle"), panLayers); 

        panSearch.setForeground(resourceMap.getColor("panSearch.foreground")); 
        panSearch.setName("panSearch"); 

        cb2Hotel45.setForeground(resourceMap.getColor("jCheckBox8.foreground")); 
        cb2Hotel45.setText(resourceMap.getString("cb2Hotel45.text")); 
        cb2Hotel45.setName("cb2Hotel45"); 
        cb2Hotel45.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (cb2Hotel45.isSelected()){
                    parametros.put("cb2Hotel45","Hotel45");
                }
                else {
                    if (parametros.containsKey("cb2Hotel45")){
                        parametros.remove("cb2Hotel45");
                    }
                }
            }
        });

        cb2Hotel123.setForeground(resourceMap.getColor("cb2Hotel123.foreground")); 
        cb2Hotel123.setText(resourceMap.getString("cb2Hotel123.text")); 
        cb2Hotel123.setName("cb2Hotel123"); 
        cb2Hotel123.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (cb2Hotel123.isSelected()){
                    parametros.put("cb2Hotel123","Hotel123");
                }
                else {
                    if (parametros.containsKey("cb2Hotel123")){
                        parametros.remove("cb2Hotel123");
                    }
                }
            }
        });

        cb2Iglesias.setForeground(resourceMap.getColor("jCheckBox8.foreground"));
        cb2Iglesias.setText(resourceMap.getString("cb2Iglesias.text")); 
        cb2Iglesias.setName("cb2Iglesias"); 
        cb2Iglesias.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (cb2Iglesias.isSelected()){
                    parametros.put("cb2Iglesias","Iglesias");
                }
                else {
                    if (parametros.containsKey("cb2Iglesias")){
                        parametros.remove("cb2Iglesias");
                    }
                }
            }
        });

        

        cb2Turismo.setForeground(resourceMap.getColor("jCheckBox8.foreground")); 
        cb2Turismo.setText(resourceMap.getString("cb2Turismo.text")); 
        cb2Turismo.setName("cb2Turismo"); 
        cb2Turismo.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (cb2Turismo.isSelected()){
                    parametros.put("cb2Turismo","Turismo");
                }
                else {
                    if (parametros.containsKey("cb2Turismo")){
                        parametros.remove("cb2Turismo");
                    }
                }
            }
        });

        

        cb2RentAcar.setForeground(resourceMap.getColor("jCheckBox8.foreground")); 
        cb2RentAcar.setText(resourceMap.getString("cb2RentAcar.text")); 
        cb2RentAcar.setName("cb2RentAcar"); 
        cb2RentAcar.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (cb2RentAcar.isSelected()){
                    parametros.put("cb2RentAcar","RentAcar");
                }
                else {
                    if (parametros.containsKey("cb2RentAcar")){
                        parametros.remove("cb2RentAcar");
                    }
                }
            }
        });

        

        cb2Museos.setForeground(resourceMap.getColor("jCheckBox8.foreground")); 
        cb2Museos.setText(resourceMap.getString("cb2Museos.text")); 
        cb2Museos.setName("cb2Museos"); 
        cb2Museos.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (cb2Museos.isSelected()){
                    parametros.put("cb2Museos","Museos");
                }
                else {
                    if (parametros.containsKey("cb2Museos")){
                        parametros.remove("cb2Museos");
                    }
                }
            }
        });


        btn2Buscar.setForeground(resourceMap.getColor("jCheckBox8.foreground")); 
        btn2Buscar.setIcon(resourceMap.getIcon("btnBuscar.icon")); 
        btn2Buscar.setText(resourceMap.getString("btnBuscar.text")); 
        btn2Buscar.setName("btnBuscar"); 
        btn2Buscar.addActionListener (new ActionListener (){
            public void actionPerformed (ActionEvent e){
                try {
                    sigma.Search(parametros, SearchTextField.getText());
                }
                catch (Exception ex) {
				ex.printStackTrace();
                }
                    
            }
        });

        SearchTextField.setText(resourceMap.getString("SearchTextField.text")); 
        SearchTextField.setName("SearchTextField"); 

        lblSearch.setForeground(resourceMap.getColor("jCheckBox8.foreground")); 
        lblSearch.setText(resourceMap.getString("lblSearch.text")); 
        lblSearch.setName("lblSearch"); 

        lblFilters.setForeground(resourceMap.getColor("jCheckBox8.foreground")); 
        lblFilters.setText(resourceMap.getString("lblFilters.text")); 
        lblFilters.setName("lblFilters"); 

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(panSearch);
        panSearch.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblFilters)
                                .addGap(47, 47, 47)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb2Hotel123)
                                    .addComponent(cb2RentAcar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb2Hotel45)
                                    .addComponent(cb2Museos))
                                .addGap(80, 80, 80))
                            .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(SearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cb2Turismo)
                    .addComponent(cb2Iglesias)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btn2Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addGap(92, 92, 92))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSearch)
                .addContainerGap(140, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn2Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cb2Iglesias)
                        .addGap(18, 18, 18)
                        .addComponent(cb2Turismo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(SearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cb2Hotel45)
                                .addGap(18, 18, 18)
                                .addComponent(cb2Museos))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cb2Hotel123)
                                    .addComponent(lblFilters))
                                .addGap(18, 18, 18)
                                .addComponent(cb2RentAcar)))))
                .addGap(32, 32, 32))
        );

        jTabbedPane1.addTab(resourceMap.getString("panSearch.TabConstraints.tabTitle"), panSearch); 

        panAbout.setName("panAbout"); 

        lblSigma.setFont(resourceMap.getFont("lblSigma.font")); 
        lblSigma.setForeground(resourceMap.getColor("lblNilsasName.foreground")); 
        lblSigma.setText(resourceMap.getString("lblSigma.text")); 
        lblSigma.setName("lblSigma"); 

        panAuthors.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), resourceMap.getString("panAuthors.border.title"), javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP)); // NOI18N
        panAuthors.setForeground(resourceMap.getColor("lblNilsasName.foreground")); 
        panAuthors.setName("panAuthors"); 

        lblDieguitsName.setForeground(resourceMap.getColor("lblNilsasName.foreground")); 
        lblDieguitsName.setText(resourceMap.getString("lblDieguitsName.text")); 
        lblDieguitsName.setName("lblDieguitsName"); 

        lblMattsName.setForeground(resourceMap.getColor("lblNilsasName.foreground")); 
        lblMattsName.setText(resourceMap.getString("lblMattsName.text")); 
        lblMattsName.setName("lblMattsName"); 

        lblNilsasName.setForeground(resourceMap.getColor("lblNilsasName.foreground")); 
        lblNilsasName.setText(resourceMap.getString("lblNilsasName.text")); 
        lblNilsasName.setName("lblNilsasName"); 

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(panAuthors);
        panAuthors.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNilsasName)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblMattsName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblDieguitsName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lblDieguitsName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMattsName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNilsasName)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        lblLogo.setIcon(resourceMap.getIcon("lblLogo.icon")); 
        lblLogo.setText(resourceMap.getString("lblLogo.text")); 
        lblLogo.setName("lblLogo");

        panSource.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), resourceMap.getString("panSource.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP)); // NOI18N
        panSource.setName("panSource"); 

        lblWebPage.setForeground(resourceMap.getColor("lblNilsasName.foreground")); 
        lblWebPage.setText(resourceMap.getString("lblWebPage.text"));
        lblWebPage.setName("lblWebPage"); 

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(panSource);
        panSource.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblWebPage)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(lblWebPage, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(panAbout);
        panAbout.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(lblSigma, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panAuthors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(lblLogo)
                .addGap(105, 105, 105)
                .addComponent(panSource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblSigma, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(panAuthors, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panSource, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(resourceMap.getString("panAbout.TabConstraints.tabTitle"), panAbout); 

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(panMain);
        panMain.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        setComponent(panMain);
        
    }

     

}
