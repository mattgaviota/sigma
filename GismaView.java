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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel mainPanel;
    

    //Constructor
    public GismaView(SingleFrameApplication app) {
        
        super(app);
        
        initComponents();

     
    }

    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void initComponents() {
        
        sigma  = new Gis();
        parametros = new HashMap<String, String>();
        
        mainPanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        cbHotel123 = new javax.swing.JCheckBox();
        cbHotel45 = new javax.swing.JCheckBox();
        cbIglesias = new javax.swing.JCheckBox();
        cbMuseos = new javax.swing.JCheckBox();
        cbRentACar = new javax.swing.JCheckBox();
        cbTurismo = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnTodas = new javax.swing.JButton();
        btnNinguna = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cb2Hotel45 = new javax.swing.JCheckBox();
        cb2Hotel123 = new javax.swing.JCheckBox();
        cb2Iglesias = new javax.swing.JCheckBox();
        cb2Turismo = new javax.swing.JCheckBox();
        cb2RentAcar = new javax.swing.JCheckBox();
        cb2Museos = new javax.swing.JCheckBox();
        btn2Buscar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(GismaApp.class).getContext().getResourceMap(GismaView.class);
        mainPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, resourceMap.getColor("mainPanel.border.matteColor"))); // NOI18N
        mainPanel.setMaximumSize(new java.awt.Dimension(900, 200));
        mainPanel.setMinimumSize(new java.awt.Dimension(900, 200));
        mainPanel.setName("mainPanel"); // NOI18N
        mainPanel.setPreferredSize(new java.awt.Dimension(900, 200));
        mainPanel.setRequestFocusEnabled(false);

        jTabbedPane1.setForeground(resourceMap.getColor("jLabel9.foreground")); // NOI18N
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setName("jTabbedPane1"); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(850, 190));

        jPanel1.setAlignmentX(500.0F);
        jPanel1.setAlignmentY(500.0F);
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(880, 160));

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

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

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
                }
                catch (Exception ex) {
				ex.printStackTrace();
                }
                    
            }
        });


        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
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
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jTabbedPane1.addTab(resourceMap.getString("jPanel1.TabConstraints.tabTitle"), jPanel1); // NOI18N

        jPanel2.setForeground(resourceMap.getColor("jPanel2.foreground")); // NOI18N
        jPanel2.setName("jPanel2"); // NOI18N

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
                    sigma.buscar(parametros, jTextField1.getText());
                }
                catch (Exception ex) {
				ex.printStackTrace();
                }
                    
            }
        });

        jTextField1.setText(resourceMap.getString("jTextField1.text")); // NOI18N
        jTextField1.setName("jTextField1"); // NOI18N

        jLabel2.setForeground(resourceMap.getColor("jCheckBox8.foreground")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setForeground(resourceMap.getColor("jCheckBox8.foreground")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(47, 47, 47)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb2Hotel123)
                                    .addComponent(cb2RentAcar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb2Hotel45)
                                    .addComponent(cb2Museos))
                                .addGap(80, 80, 80))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jLabel2)
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
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cb2Hotel45)
                                .addGap(18, 18, 18)
                                .addComponent(cb2Museos))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cb2Hotel123)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addComponent(cb2RentAcar)))))
                .addGap(32, 32, 32))
        );

        jTabbedPane1.addTab(resourceMap.getString("jPanel2.TabConstraints.tabTitle"), jPanel2); // NOI18N

        jPanel3.setName("jPanel3"); // NOI18N

        jLabel4.setFont(resourceMap.getFont("jLabel4.font")); // NOI18N
        jLabel4.setForeground(resourceMap.getColor("jLabel9.foreground")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), resourceMap.getString("jPanel4.border.title"), javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP)); // NOI18N
        jPanel4.setForeground(resourceMap.getColor("jLabel9.foreground")); // NOI18N
        jPanel4.setName("jPanel4"); // NOI18N

        jLabel8.setForeground(resourceMap.getColor("jLabel9.foreground")); // NOI18N
        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N

        jLabel6.setForeground(resourceMap.getColor("jLabel9.foreground")); // NOI18N
        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        jLabel9.setForeground(resourceMap.getColor("jLabel9.foreground")); // NOI18N
        jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel7.setIcon(resourceMap.getIcon("jLabel7.icon")); // NOI18N
        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), resourceMap.getString("jPanel5.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP)); // NOI18N
        jPanel5.setName("jPanel5"); // NOI18N

        jLabel10.setForeground(resourceMap.getColor("jLabel9.foreground")); // NOI18N
        jLabel10.setText(resourceMap.getString("jLabel10.text")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(105, 105, 105)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(resourceMap.getString("jPanel3.TabConstraints.tabTitle"), jPanel3); // NOI18N

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
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

        setComponent(mainPanel);
        
    }

     

}
