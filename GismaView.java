/*
 * GismaView.java
 */




import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.HashMap;


/**
 * The application's main frame.
 */
public class GismaView extends FrameView {
    //Atributos
    private Gis sigma;
    private HashMap<String, String> parametros;
    private javax.swing.JButton btn2Buscar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnNinguna;
    private javax.swing.JButton btnTodas;
    private javax.swing.JCheckBox cb2Hotel123;
    private javax.swing.JCheckBox cb2Hotel45;
    private javax.swing.JCheckBox cb2Iglesias;
    private javax.swing.JCheckBox cb2Museos;
    private javax.swing.JCheckBox cb2RentAcar;
    private javax.swing.JCheckBox cb2Turismo;
    private javax.swing.JCheckBox cbHotel123;
    private javax.swing.JCheckBox cbHotel45;
    private javax.swing.JCheckBox cbIglesias;
    private javax.swing.JCheckBox cbMuseos;
    private javax.swing.JCheckBox cbRentACar;
    private javax.swing.JCheckBox cbTurismo;
    private javax.swing.JLabel lblLayersSelection;
    private javax.swing.JLabel lblWebPage;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblFilters;
    private javax.swing.JLabel lblSigma;
    private javax.swing.JLabel lblMattsName;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblDieguitsName;
    private javax.swing.JLabel lblNilsasName;
    private javax.swing.JPanel panLayers;
    private javax.swing.JPanel panSearch;
    private javax.swing.JPanel panAbout;
    private javax.swing.JPanel panAuthors;
    private javax.swing.JPanel panSource;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField SearchTextField;
    private javax.swing.JPanel panMain;
    private javax.swing.JFrame probando;

    //Constructor
    public GismaView(SingleFrameApplication app) {
     
        super(app);
      
        initComponents();

        probando= app.getMainFrame();
    }

    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
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

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(GismaApp.class).getContext().getResourceMap(GismaView.class);
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
        panLayers.setName("panLayers"); // NOI18N
        panLayers.setPreferredSize(new java.awt.Dimension(880, 160));

        cbHotel123.setText(resourceMap.getString("cbHotel123.text")); // NOI18N
        cbHotel123.setName("cbHotel123"); // NOI18N
        cbHotel123.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (cbHotel123.isSelected()){
                    sigma.toggleLayerVisibility("Hotel123");
                }
                else sigma.toggleLayerVisibility("Hotel123");
            }
        });

        cbHotel45.setText(resourceMap.getString("cbHotel45.text")); // NOI18N
        cbHotel45.setName("cbHotel45"); // NOI18N
        cbHotel45.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (cbHotel45.isSelected()){
                    sigma.toggleLayerVisibility("Hotel45");
                }
                else sigma.toggleLayerVisibility("Hotel45");
            }
        });


        cbIglesias.setText(resourceMap.getString("cbIglesias.text")); // NOI18N
        cbIglesias.setName("cbIglesias"); // NOI18N
        cbIglesias.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (cbIglesias.isSelected()){
                    sigma.toggleLayerVisibility("Iglesias");
                }
                else sigma.toggleLayerVisibility("Iglesias");
            }
        });

        cbMuseos.setText(resourceMap.getString("cbMuseos.text")); // NOI18N
        cbMuseos.setName("cbMuseos"); // NOI18N
        cbMuseos.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (cbMuseos.isSelected()){
                    sigma.toggleLayerVisibility("Museos");
                }
                else sigma.toggleLayerVisibility("Museos");
            }
        });

        cbRentACar.setText(resourceMap.getString("cbRentACar.text")); // NOI18N
        cbRentACar.setName("cbRentACar"); // NOI18N
        cbRentACar.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (cbRentACar.isSelected()){
                    sigma.toggleLayerVisibility("RentACar");
                }
                else sigma.toggleLayerVisibility("RentACar");
            }
        });

        cbTurismo.setText(resourceMap.getString("cbTurismo.text")); // NOI18N
        cbTurismo.setName("cbTurismo"); // NOI18N
        cbTurismo.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (cbTurismo.isSelected()){
                    sigma.toggleLayerVisibility("Turismo");
                }
                else sigma.toggleLayerVisibility("Turismo");
            }
        });

        lblLayersSelection.setText(resourceMap.getString("lblLayersSelection.text")); // NOI18N
        lblLayersSelection.setName("lblLayersSelection"); // NOI18N

        btnActualizar.setIcon(resourceMap.getIcon("btnActualizar.icon")); // NOI18N
        btnActualizar.setText(resourceMap.getString("btnActualizar.text")); // NOI18N
        btnActualizar.setBorder(null);
        btnActualizar.setName("btnActualizar"); // NOI18N
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

        btnTodas.setText(resourceMap.getString("btnTodas.text")); // NOI18N
        btnTodas.setName("btnTodas"); // NOI18N
        btnTodas.addActionListener (new ActionListener (){
            public void actionPerformed (ActionEvent e){
                try {
                    cbHotel123.setSelected(true);
                    cbHotel45.setSelected(true);
                    cbIglesias.setSelected(true);
                    cbMuseos.setSelected(true);
                    cbTurismo.setSelected(true);
                    cbRentACar.setSelected(true);
                    btnActualizar.setEnabled(true);
                }
                catch (Exception ex) {
				ex.printStackTrace();
                }
                    
            }
        });


        btnNinguna.setText(resourceMap.getString("btnNinguna.text")); // NOI18N
        btnNinguna.setName("btnNinguna"); // NOI18N
        btnNinguna.addActionListener (new ActionListener (){
            public void actionPerformed (ActionEvent e){
                try {
                    cbHotel123.setSelected(false);
                    cbHotel45.setSelected(false);
                    cbIglesias.setSelected(false);
                    cbMuseos.setSelected(false);
                    cbTurismo.setSelected(false);
                    cbRentACar.setSelected(false);
                    btnActualizar.setEnabled(false);
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

        jTabbedPane1.addTab(resourceMap.getString("panLayers.TabConstraints.tabTitle"), panLayers); // NOI18N

        panSearch.setForeground(resourceMap.getColor("panSearch.foreground")); // NOI18N
        panSearch.setName("panSearch"); // NOI18N

        cb2Hotel45.setForeground(resourceMap.getColor("jCheckBox8.foreground")); // NOI18N
        cb2Hotel45.setText(resourceMap.getString("cb2Hotel45.text")); // NOI18N
        cb2Hotel45.setName("cb2Hotel45"); // NOI18N
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

        cb2Hotel123.setForeground(resourceMap.getColor("cb2Hotel123.foreground")); // NOI18N
        cb2Hotel123.setText(resourceMap.getString("cb2Hotel123.text")); // NOI18N
        cb2Hotel123.setName("cb2Hotel123"); // NOI18N
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

        cb2Iglesias.setForeground(resourceMap.getColor("jCheckBox8.foreground")); // NOI18N
        cb2Iglesias.setText(resourceMap.getString("cb2Iglesias.text")); // NOI18N
        cb2Iglesias.setName("cb2Iglesias"); // NOI18N
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

        

        cb2Turismo.setForeground(resourceMap.getColor("jCheckBox8.foreground")); // NOI18N
        cb2Turismo.setText(resourceMap.getString("cb2Turismo.text")); // NOI18N
        cb2Turismo.setName("cb2Turismo"); // NOI18N
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

        

        cb2RentAcar.setForeground(resourceMap.getColor("jCheckBox8.foreground")); // NOI18N
        cb2RentAcar.setText(resourceMap.getString("cb2RentAcar.text")); // NOI18N
        cb2RentAcar.setName("cb2RentAcar"); // NOI18N
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

        

        cb2Museos.setForeground(resourceMap.getColor("jCheckBox8.foreground")); // NOI18N
        cb2Museos.setText(resourceMap.getString("cb2Museos.text")); // NOI18N
        cb2Museos.setName("cb2Museos"); // NOI18N
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


        btn2Buscar.setForeground(resourceMap.getColor("jCheckBox8.foreground")); // NOI18N
        btn2Buscar.setIcon(resourceMap.getIcon("btnBuscar.icon")); // NOI18N
        btn2Buscar.setText(resourceMap.getString("btnBuscar.text")); // NOI18N
        btn2Buscar.setName("btnBuscar"); // NOI18N
        btn2Buscar.addActionListener (new ActionListener (){
            public void actionPerformed (ActionEvent e){
                try {
                    sigma.buscar(parametros, SearchTextField.getText());
                }
                catch (Exception ex) {
				ex.printStackTrace();
                }
                    
            }
        });

        SearchTextField.setText(resourceMap.getString("SearchTextField.text")); // NOI18N
        SearchTextField.setName("SearchTextField"); // NOI18N

        lblSearch.setForeground(resourceMap.getColor("jCheckBox8.foreground")); // NOI18N
        lblSearch.setText(resourceMap.getString("lblSearch.text")); // NOI18N
        lblSearch.setName("lblSearch"); // NOI18N

        lblFilters.setForeground(resourceMap.getColor("jCheckBox8.foreground")); // NOI18N
        lblFilters.setText(resourceMap.getString("lblFilters.text")); // NOI18N
        lblFilters.setName("lblFilters"); // NOI18N

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

        jTabbedPane1.addTab(resourceMap.getString("panSearch.TabConstraints.tabTitle"), panSearch); // NOI18N

        panAbout.setName("panAbout"); // NOI18N

        lblSigma.setFont(resourceMap.getFont("lblSigma.font")); // NOI18N
        lblSigma.setForeground(resourceMap.getColor("lblNilsasName.foreground")); // NOI18N
        lblSigma.setText(resourceMap.getString("lblSigma.text")); // NOI18N
        lblSigma.setName("lblSigma"); // NOI18N

        panAuthors.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), resourceMap.getString("panAuthors.border.title"), javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP)); // NOI18N
        panAuthors.setForeground(resourceMap.getColor("lblNilsasName.foreground")); // NOI18N
        panAuthors.setName("panAuthors"); // NOI18N

        lblDieguitsName.setForeground(resourceMap.getColor("lblNilsasName.foreground")); // NOI18N
        lblDieguitsName.setText(resourceMap.getString("lblDieguitsName.text")); // NOI18N
        lblDieguitsName.setName("lblDieguitsName"); // NOI18N

        lblMattsName.setForeground(resourceMap.getColor("lblNilsasName.foreground")); // NOI18N
        lblMattsName.setText(resourceMap.getString("lblMattsName.text")); // NOI18N
        lblMattsName.setName("lblMattsName"); // NOI18N

        lblNilsasName.setForeground(resourceMap.getColor("lblNilsasName.foreground")); // NOI18N
        lblNilsasName.setText(resourceMap.getString("lblNilsasName.text")); // NOI18N
        lblNilsasName.setName("lblNilsasName"); // NOI18N

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

        lblLogo.setIcon(resourceMap.getIcon("lblLogo.icon")); // NOI18N
        lblLogo.setText(resourceMap.getString("lblLogo.text")); // NOI18N
        lblLogo.setName("lblLogo"); // NOI18N

        panSource.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), resourceMap.getString("panSource.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP)); // NOI18N
        panSource.setName("panSource"); // NOI18N

        lblWebPage.setForeground(resourceMap.getColor("lblNilsasName.foreground")); // NOI18N
        lblWebPage.setText(resourceMap.getString("lblWebPage.text")); // NOI18N
        lblWebPage.setName("lblWebPage"); // NOI18N

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

        jTabbedPane1.addTab(resourceMap.getString("panAbout.TabConstraints.tabTitle"), panAbout); // NOI18N

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
