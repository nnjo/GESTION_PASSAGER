

package trans;
import java.sql.*;
import java.awt.*;

public class insertion extends javax.swing.JFrame {
    Connection connect=null;
    ResultSet RS = null;
    Statement S=null;
   String pilote="com.mysql.jdbc.Driver";
    String uid="";
    String mdp="";
    int cpt=0;
   
    public insertion() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administration");

        jPanel1.setLayout(null);

        jLabel1.setText("INSERTION VOYAGE");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(260, 10, 290, 20);

        jLabel2.setText("Point-depart");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 40, 90, 20);

        jComboBox1.setEditable(true);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(100, 40, 120, 20);

        jLabel3.setText("Point-arrivé");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(240, 40, 80, 20);

        jComboBox2.setEditable(true);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(320, 40, 120, 20);

        jLabel4.setText("Nom moyen");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 70, 80, 20);

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(100, 70, 120, 22);

        jLabel5.setText("Jour depart");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 120, 80, 20);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox4);
        jComboBox4.setBounds(100, 120, 120, 20);

        jLabel6.setText("Heure depart");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(240, 120, 80, 20);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(320, 120, 120, 20);

        jLabel7.setText("Coût");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(240, 70, 50, 20);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(320, 70, 80, 20);

        jButton1.setText("ANNULER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(650, 170, 80, 23);

        jButton2.setText("ANNULER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(370, 340, 80, 23);

        jLabel8.setText("Voie");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(500, 40, 40, 20);

        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox5);
        jComboBox5.setBounds(600, 40, 120, 22);

        jLabel9.setText("Type voie");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(500, 100, 60, 20);

        jComboBox6.setEditable(true);
        jPanel1.add(jComboBox6);
        jComboBox6.setBounds(600, 70, 120, 20);

        jLabel11.setText("Nom du mobile");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(500, 70, 90, 20);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(600, 100, 120, 20);

        jLabel12.setText("Nbre place");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(500, 130, 70, 20);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(600, 130, 50, 20);

        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(280, 340, 80, 23);

        jButton4.setText("OK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(570, 170, 70, 23);

        jButton5.setText("QUITTER");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(650, 450, 90, 30);

        jTextArea1.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBox.background"));
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(2);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 390, 440, 50);

        jScrollPane2.setAutoscrolls(true);
        jScrollPane2.setEnabled(false);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Code", "Jour/Heure de depart", "         Nom moyen", "      Coût"
            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(6);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(9);
        }

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 200, 460, 120);

        jLabel10.setText("Dure trajet ");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 150, 70, 20);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(100, 150, 60, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(20, 480, 200, 20);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(10, 30, 450, 150);

        jSeparator2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(490, 30, 250, 130);

        jLabel15.setText("N° du pilote");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(520, 230, 90, 20);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(610, 230, 110, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
        /*Le comboBox permet de se connecter à la BDD
         * à la table voie
         * afin d'obtenir l'identifiant de voie (id_voie)
         * qui est la clef primaire
         * par voie nous entendons (par exemple Aerienne, Terrestre, maritime,...
         *
         */
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        String Combo5=""+jComboBox5.getSelectedItem();
        String id_voie=null, tvoie=null;
        jTextArea1.setText("");
        try{
            Class.forName(pilote);
            connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/voyage", "root", "");
            S=connect.createStatement();
            RS=S.executeQuery("Select * from voie where voie like '"+Combo5+"'");
            while(RS.next()){
                id_voie = RS.getString("id_voie");
            }
            RS=S.executeQuery("Select * from tvoie where id_voie like '"+id_voie+"'");
            while(RS.next()){
                tvoie = RS.getString("tvoie");
                jComboBox6.addItem(tvoie);
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            connect.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        String Combo5=""+jComboBox5.getSelectedItem();
        String Combo6=""+jComboBox6.getSelectedItem();
        String nommoyen = null, nbreplace = null, marque = null, id_voie=null, id_tvoie=null;
        
        nommoyen = jTextField4.getText();
        nbreplace  = jTextField5.getText();
        try{
            Class.forName(pilote);
            connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/voyage", "root", "");
            S=connect.createStatement();
            RS=S.executeQuery("Select * from voie where voie like '"+Combo5+"'");
            while(RS.next()){
                id_voie = RS.getString("id_voie");
            }
            //inserttion ds tvoie
            S.executeUpdate("Insert into tvoie (`id_voie`,`tvoie`) value ('"+id_voie+"','"+Combo6+"')");
            RS=S.executeQuery("Select * from tvoie where tvoie like '"+Combo6+"'");
            while(RS.next()){
                id_tvoie = RS.getString("id_tvoie");
            }
            S.executeUpdate("Insert into nomtvoie (`id_tvoie`,`nomtvoie`,`nbre_place`) value ('"+id_tvoie+"','"+nommoyen+"', '"+nbreplace+"')");
            jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
            jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
            jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
            jTextField4.setText("");
            jTextField5.setText("");
            RS=S.executeQuery("Select * from voie");
            while(RS.next()){
                jComboBox5.addItem(RS.getString("voie"));
            }
            
            RS=S.executeQuery("Select * from nomtvoie");
            while(RS.next()){
                jComboBox3.addItem(RS.getString("nomtvoie"));
            }
            jTextArea1.setText("Information suivant ajouté dans la BDD. \n");
            jTextArea1.append("Nom moyen : "+nommoyen+"\n");
            jTextArea1.append("Nbre place : "+nbreplace+"\n");
        }catch(Exception e){
            System.out.println(e);
            jTextArea1.setText("Erreur :"+e+"\n");
            jTextArea1.append("Please contact system administrator");
        }
        try{
            connect.close();
        }catch(Exception e){
            jTextArea1.setText("Problème lors de la fermeture de la base de donnée.\n");
            jTextArea1.append("Erreur : "+e);
        }        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText("");
        String Combo1=""+jComboBox1.getSelectedItem();
        String Combo2=""+jComboBox2.getSelectedItem();
        String id_horaire=null, id_nomtvoie=null, Cout=null;
        int j=0;
        cpt=0;
        try{
            Class.forName(pilote);
            connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/voyage", "root", "");
            S=connect.createStatement();

            if(!Combo1.equals(Combo2)){
                RS=S.executeQuery("Select * from itineraire where point_depart Like '"+Combo1+"' and point_arrive like '"+Combo2+"'");
                while(RS.next()){
                    cpt++;
                }
                String [] Element1 = new String [cpt];
                String [] Element2 = new String [cpt];
                RS=S.executeQuery("Select * from itineraire where point_depart Like '"+Combo1+"' and point_arrive like '"+Combo2+"' Order by `id_itineraire` DESC");
                while(RS.next()){
                    id_horaire = RS.getString("id_horaire");
                    id_nomtvoie = RS.getString("id_nomtvoie");
                    Element1 [j]=id_horaire;
                    Element2 [j]=id_nomtvoie;
                    jTable1.setValueAt(RS.getString("id_itineraire"),j,0);
                    jTable1.setValueAt(RS.getString("Cout"),j,3);
                    j++;
                }
                for(int i=0;i<cpt;i++){
                    RS=S.executeQuery("Select * from nomtvoie where id_nomtvoie = "+Element2 [i]+" Order by id_nomtvoie DESC");
                    while(RS.next()){
                        jTable1.setValueAt(RS.getString("nomtvoie"),i,2);
                    }
                }
                for(int i=0;i<cpt;i++){
                    RS=S.executeQuery("Select * from horaire where id_horaire = "+Element1 [i]+" Order by id_horaire DESC");
                    while(RS.next()){
                        jTable1.setValueAt(RS.getString("jour")+" "+RS.getString("heure"),i,1);
                    }
                }
            }else {
                jTextArea1.setText("Vous ne pouvez selectionner un même lieu comme point de depart et point d'arrive \n");
                jTextArea1.append("Votre choix \' "+Combo1+" \'correspond au point de depart et celui d'arrive ");
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String Combo1=""+jComboBox1.getSelectedItem();
        String Combo2=""+jComboBox2.getSelectedItem();
        String Combo3=""+jComboBox3.getSelectedItem();
        String jour=""+jComboBox4.getSelectedItem();
        String id_horaire=null, id_nomtvoie=null, Cout=null, heure = null, dure=null;
        heure = jTextField1.getText();
        Cout = jTextField2.getText();
        dure = jTextField3.getText();
        int j=0,k=0;
        try{
            Class.forName(pilote);
            connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/voyage", "root", "");
            S=connect.createStatement();
            if(Combo1.equalsIgnoreCase(Combo2)){
                jTextArea1.setText("Vous ne pouvez selectionner à la fois pour depart et arrive un même lieu \n");
                jTextArea1.append("Vous avez selectionnez \""+Combo1+"\" comme depart et arrive veuillez reverifier ");
            }else{
                RS=S.executeQuery("Select * from horaire where `jour` like '"+jour+"' and '"+heure+"' and '"+Cout+"'");
                while(RS.next()){
                    id_horaire = RS.getString("id_horaire");
                }
                RS=S.executeQuery("Select * from nomtvoie where nomtvoie like '"+Combo3+"' ");
                while(RS.next()){
                    id_nomtvoie=RS.getString("id_nomtvoie");
                }
                RS=S.executeQuery("Select * from itineraire where id_nomtvoie like '"+id_nomtvoie+"' and `id_horaire` like '"+id_horaire+"' and `point_depart` like '"+Combo1+"' and point_arrive like '"+Combo2+"' ");
                while(RS.next()){
                    k++;
                }
                if(k!=0){
                    jTextArea1.setText("Il y a deja une itineraire avec ce moyen de déplacement");
                }else {
                    S.executeUpdate("Insert into horaire (`jour`, `heure`, `dure`) value ('"+jour+"','"+heure+"', '"+dure+"') ");
                    RS=S.executeQuery("Select * from horaire where `jour` like '"+jour+"' and  `heure` like '"+heure+"' and `dure` like '"+dure+"'");
                    while(RS.next()){
                        id_horaire = RS.getString("id_horaire");
                    }
                    S.executeUpdate("Insert into itineraire (`id_nomtvoie`, `id_horaire`, `point_depart`, `point_arrive`, `cout`) value ('"+id_nomtvoie+"','"+id_horaire+"','"+Combo1+"','"+Combo2+"','"+Cout+"') ");
                    jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                            {null, null, null, null},
                            {null, null, null, null},
                            {null, null, null, null},
                            {null, null, null, null},
                            {null, null, null, null},
                            {null, null, null, null}
                        },
                        new String [] {
                            "Code", "Jour/Heure de depart", "          Nom moyen", "      Coût"
                        }
                    ));

                    jTable1.getTableHeader().setReorderingAllowed(false);

                    jScrollPane2.setViewportView(jTable1);

                    jTable1.getColumnModel().getColumn(0).setPreferredWidth(6);
                    jTable1.getColumnModel().getColumn(3).setPreferredWidth(9);

                    RS=S.executeQuery("Select * from itineraire where `point_depart` Like '"+Combo1+"' and `point_arrive` like '"+Combo2+"'");
                    while(RS.next()){
                        cpt++;
                    }
                    String [] Element1 = new String [cpt];
                    String [] Element2 = new String [cpt];
                    RS=S.executeQuery("Select * from itineraire where point_depart Like '"+Combo1+"' and point_arrive like '"+Combo2+"' Order by `id_itineraire` DESC");
                    while(RS.next()){
                        id_horaire = RS.getString("id_horaire");
                        id_nomtvoie = RS.getString("id_nomtvoie");
                        Element1 [j]=id_horaire;
                        Element2 [j]=id_nomtvoie;
                        jTable1.setValueAt(RS.getString("id_itineraire"),j,0);
                        jTable1.setValueAt(RS.getString("Cout"),j,3);
                        j++;
                    }
                    for(int i=0;i<cpt;i++){
                        RS=S.executeQuery("Select * from nomtvoie where id_nomtvoie = "+Element2 [i]+" Order by id_nomtvoie DESC");
                        while(RS.next()){
                            jTable1.setValueAt(RS.getString("nomtvoie"),i,2);
                        }
                    }
                    for(int i=0;i<cpt;i++){
                        RS=S.executeQuery("Select * from horaire where id_horaire = "+Element1 [i]+" Order by id_horaire DESC");
                        while(RS.next()){
                            jTable1.setValueAt(RS.getString("jour")+" "+RS.getString("heure"),i,1);
                        }
                    }
                }
                
                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
                jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
                jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                RS=S.executeQuery("Select * from point");
                while(RS.next()){
                    String det = RS.getString("point");
                    jComboBox1.addItem(det);
                    jComboBox2.addItem(det);
                }
                RS=S.executeQuery("Select * from nomtvoie");
                while(RS.next()){
                    jComboBox3.addItem(RS.getString("nomtvoie"));
                }
            }//fin if/else de verification sur le depart et arriver
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            connect.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName(pilote);
            connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/voyage", "root", "");
            S=connect.createStatement();
            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
            jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
            jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextArea1.setText("");
            RS=S.executeQuery("Select * from point");
            while(RS.next()){
                String det = RS.getString("point");
                jComboBox1.addItem(det);
                jComboBox2.addItem(det);
            }
            RS=S.executeQuery("Select * from nomtvoie");
            while(RS.next()){
                jComboBox3.addItem(RS.getString("nomtvoie"));
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        jTextField4.setText("");
        jTextField5.setText("");
        jTextArea1.setText("");
        try{
            Class.forName(pilote);
            connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/voyage", "root", "");
            S=connect.createStatement();
            RS=S.executeQuery("select * from voie");
            while(RS.next()){
                jComboBox1.addItem(RS.getString("voie"));
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        menuprincipale men = new menuprincipale();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        men.setLocation((screen.width - men.getSize().width)/2,(screen.height - men.getSize().height)/2);
        this.dispose();
        men.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName(pilote);
            connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/voyage", "root", "");
            S=connect.createStatement();
            if(jTextField6.equals(null)){
                jTextArea1.setText("La zone reservée à point est vide veuillez vezrifier et resaaisir");
            }else{
                S.executeUpdate("Insert into point (`point`) value ('"+jTextField6.getText()+"')");
                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
                jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
                RS=S.executeQuery("Select * from point");
                while(RS.next()){
                    String point = RS.getString("point");
                    jComboBox1.addItem(point);
                    jComboBox2.addItem(point);
                }
            }
            jTextField6.setText("");
            jTextArea1.setText("Information enregistré");
        }catch(Exception e){
            jTextArea1.setText("Error : Please contact system administrator "+e);
        }
        try{
            connect.close();
        }catch(Exception e){
            jTextArea1.setText("Erreur lors de la fermeture de la BDD");
        }
    }//GEN-LAST:event_jTextField6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    public javax.swing.JComboBox jComboBox1;
    public javax.swing.JComboBox jComboBox2;
    public javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    public javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

}
