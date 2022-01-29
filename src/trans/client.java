package trans;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;

public class client extends javax.swing.JFrame {
    Connection connect=null;
    ResultSet RS = null;
    Statement S=null;
   // String pilote = "sun.jdbc.odbc.JdbcOdbcDriver";
   String pilote="com.mysql.jdbc.Driver";
    String uid="";
    String mdp="";
    String combo =null, Code = null,combo1 =null;
    int cpt=0;
    /** Creation nouveau client */
    public client() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Enregistrement des clients");
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel1.setText("Nom ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 40, 50, 20);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(60, 40, 120, 20);

        jLabel2.setText("Prenom");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(220, 40, 60, 20);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(290, 40, 110, 20);

        jLabel3.setText("Adresse ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 100, 60, 20);

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(2);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 80, 280, 50);

        jLabel4.setText("Départ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 160, 50, 20);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(60, 160, 110, 22);

        jLabel5.setText("Destination");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(200, 160, 70, 20);

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(270, 160, 110, 22);

        jButton1.setText("VALIDER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(50, 410, 90, 23);

        jButton2.setText("ANNULER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(170, 410, 90, 23);

        jLabel16.setText("Enregistrement des clients ");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(160, 10, 160, 20);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Code", "Heure dep/duree", "Nom Moyen", "Frais payer", "Nbre places"
            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(3);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(18);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(18);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(6);
        }

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(50, 230, 470, 110);

        jLabel6.setText("Code");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 190, 40, 20);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(60, 190, 50, 20);

        jLabel7.setText("Nombre de place disponible");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(190, 190, 150, 20);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(290, 190, 90, 20);

        jTextArea2.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBox.background"));
        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(2);
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextArea2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea2.setEnabled(false);
        jScrollPane3.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(50, 350, 450, 50);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 420, 190, 20);

        jLabel11.setFont(new java.awt.Font("Sylfaen", 2, 12)); // NOI18N
        jLabel11.setText(" ");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(370, 430, 110, 16);

        jButton3.setText("Annuler");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(170, 410, 90, 23);

        jButton4.setText("Annuler");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(170, 410, 90, 23);

        jButton5.setText("QUITTER");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(430, 410, 90, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        
        String Combo1=""+jComboBox1.getSelectedItem();
        String Combo2=""+jComboBox2.getSelectedItem();
        String id_horaire=null, id_nomtvoie=null, Cout=null;
        int j=0,nbrepl=0;
        cpt=0;
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null}
        },
        new String [] {
            "Code", "Heure dep/duree", "Nom Moyen", "Frais payer", "Nbre place"
        }
        ));

        jTable1.getTableHeader().setReorderingAllowed(false);

        jScrollPane2.setViewportView(jTable1);

        jTable1.getColumnModel().getColumn(0).setPreferredWidth(3);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(18);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(18);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(6);
        try{
            Class.forName(pilote);
           
            connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/voyage", "root", "");
            S=connect.createStatement();
            System.out.println(Combo1+" "+Combo2);
            if(!Combo1.equalsIgnoreCase(Combo2)){
                jTextField3.setEnabled(true);
                jTextArea2.setText("");
                RS=S.executeQuery("Select * from itineraire where point_depart Like '"+Combo1+"' and point_arrive like '"+Combo2+"'");
                while(RS.next()){
                    cpt++;
                }
                String [] Element1 = new String [cpt];
                String [] Element2 = new String [cpt];
                String id_itineraire = null;
                RS=S.executeQuery("Select * from itineraire where point_depart Like '"+Combo1+"' and point_arrive like '"+Combo2+"' Order by `id_itineraire` DESC");
                while(RS.next()){
                    id_horaire = RS.getString("id_horaire");
                    id_nomtvoie = RS.getString("id_nomtvoie");
                    id_itineraire =RS.getString("id_itineraire");
                    Element1 [j]=id_horaire;
                    Element2 [j]=id_nomtvoie;
                    jTable1.setValueAt(id_itineraire,j,0);
                    jTable1.setValueAt(RS.getString("Cout"),j,3);
                    j++;
                }
                for(int i=0;i<cpt;i++){
                    RS=S.executeQuery("Select * from nomtvoie where id_nomtvoie = "+Element2 [i]+" Order by id_nomtvoie DESC");
                    while(RS.next()){
                        jTable1.setValueAt(RS.getString("nomtvoie"),i,2);
                        jTable1.setValueAt(RS.getString("nbre_place"),i,4);
                    }
                }
                for(int i=0;i<cpt;i++){
                    RS=S.executeQuery("Select * from horaire where id_horaire = "+Element1 [i]+" Order by id_horaire DESC");
                    while(RS.next()){
                        jTable1.setValueAt(RS.getString("jour")+" "+RS.getString("heure"),i,1);
                    }
                }
            }else{                
                jTextArea2.setText("Vous ne pouvez selectionner un même lieu comme point de depart et point d'arrive \n");
                jTextArea2.append("Votre choix \' "+Combo1+" \'correspond au point de depart et celui d'arrive ");
                jTextField3.setEnabled(false);
            }          
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            connect.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        
        String id_nomtvoie=null;
        int nbre_place=0, cpt2=0;
        cpt=0;
        Code = jTextField3.getText();
        try{
            Class.forName(pilote);
            connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/voyage", "root", "");
            S=connect.createStatement();
            RS=S.executeQuery("Select * from reservation where id_itineraire like '"+Code+"'");
            while(RS.next()){
                cpt++;
            }
            RS=S.executeQuery("Select * from itineraire where id_itineraire = "+Code+" ");
            while(RS.next()){
                id_nomtvoie = RS.getString("id_nomtvoie");
                cpt2++;
            }
            if(cpt2==0){
                jTextArea2.setText("Il n'existe pas d'itineraire correspondant à ce code \n");                
                jTextField3.setText("");
            }
            RS=S.executeQuery("Select * from nomtvoie where id_nomtvoie = "+id_nomtvoie+" ");
            while(RS.next()){
                nbre_place = RS.getInt("nbre_place");
            }
            cpt = nbre_place-cpt;
            if(cpt<0 || cpt==0){
                jLabel8.setText(0+"");
            }else{
                jLabel8.setText(cpt+"");
            }
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            connect.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String place=null, nom=null, nom1=null,postnom=null, adresse=null,id_client=null, Combo2=null;
        nom1=jTextField1.getText();
        postnom=jTextField2.getText();
        adresse=jTextArea1.getText();
        nom = nom1+" "+postnom;
        place = jLabel8.getText();
        Combo2=""+jComboBox2.getSelectedItem();
        try{
            Class.forName(pilote);
            connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/voyage", "root", "");
            S=connect.createStatement();
            if(!place.equals(0+"")){
                jTextArea2.setText("");
                S.executeUpdate("Insert into client (`nom_client`,`adresse`) value ('"+nom+"','"+adresse+"')");
                RS=S.executeQuery("Select * from client where `nom_client` like '"+nom+"'and `adresse` like '"+adresse+"' ");
                while(RS.next()){
                    id_client = RS.getString("id_client");
                }
                S.executeUpdate("Insert into reservation (`id_client`,`id_itineraire`) value ('"+id_client+"','"+Code+"')");
                jTextArea2.setText("Le Client \'' "+nom+" \'' a effectué une reservation pour \'' "+Combo2);
            }
            else if(place.equals("0")){
                jTextArea2.setText("Il n'y a pas de place disponoble");
            }

        }catch(Exception e){
            System.out.println(e);
        }
        try{
            connect.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jLabel8.setText("");
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        jTextArea1.setText("");
        jTextArea2.setText("");
        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Code", "Heure dep/duree", "Nom Moyen", "Frais payer", "Nbre pla"
            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);

        jTable1.getColumnModel().getColumn(0).setPreferredWidth(3);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(18);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(18);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(6);

        try{
            Class.forName(pilote);
            connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/voyage", "root", "");
            S=connect.createStatement();
            RS=S.executeQuery("Select * from point ");
            while(RS.next()){
                jComboBox1.addItem(RS.getString("point"));
            }
            RS=S.executeQuery("Select * from point ");
            while(RS.next()){
                jComboBox2.addItem(RS.getString("point"));
            }
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            connect.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
       
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
        menuprincipale men = new menuprincipale();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        men.setLocation((screen.width - men.getSize().width)/2,(screen.height - men.getSize().height)/2);
        this.dispose();
        men.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    public javax.swing.JComboBox jComboBox1;
    public javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

}
