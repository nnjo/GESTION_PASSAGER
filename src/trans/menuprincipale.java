
package trans;
import java.sql.*;
import java.awt.*;

public class menuprincipale extends javax.swing.JFrame {
   
    Connection connect=null;
    ResultSet RS = null;
    Statement S=null;
    String pilote="com.mysql.jdbc.Driver";
    String uid="";
    String mdp="";
    /** Creation nouvelle forme menuprincipal */
    public menuprincipale() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principale");

        jButton1.setText("Client");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Administration");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          // TODO add your handling code here:
        insertion iser = new insertion ();
        iser.jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        iser.jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        iser.jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        iser.jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        try{
            Class.forName(pilote);
            connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/voyage", "root", "");
            S=connect.createStatement();
            RS=S.executeQuery("Select * from voie");
            while(RS.next()){
                iser.jComboBox5.addItem(RS.getString("voie"));
            }
            RS=S.executeQuery("Select * from point");
            while(RS.next()){
                String det = RS.getString("point");
                iser.jComboBox1.addItem(det);
                iser.jComboBox2.addItem(det);
            }
            RS=S.executeQuery("Select * from nomtvoie");
            while(RS.next()){
                iser.jComboBox3.addItem(RS.getString("nomtvoie"));
            }
            Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
            iser.setLocation((screen.width - iser.getSize().width)/2,(screen.height - iser.getSize().height)/2);
            iser.jLabel13.setText("Résolution ecran : "+screen.width+" x "+screen.height);
            iser.setVisible(true);
        }catch(Exception e){
            System.err.println(e);
        }
        iser.setVisible(true);
        this.dispose();
        try{
            connect.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int cpt=0, cpt1=0;//compteur
        String selec="Select * from ";
        String table1= "point";
        try{
            Class.forName(pilote);
            connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/voyage", "root", "");
            System.out.println("Connexion réussie");
            client cl = new client();
            String loc = null,loc1 = null;
            cl.jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
            cl.jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
            S=connect.createStatement();
            RS=S.executeQuery(selec+""+table1);
            while(RS.next()){
                String point = RS.getString("point");
                cl.jComboBox1.addItem(point);
                cl.jComboBox2.addItem(point);
            }
            Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
            cl.setLocation((screen.width - cl.getSize().width)/2,(screen.height - cl.getSize().height)/2);
            cl.jLabel9.setText("Résolution ecran : "+screen.width+" x "+screen.height);
            cl.setVisible(true);
        }catch(Exception e){
            System.err.println("c'est le "+e);
        }
        try{
            connect.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables

}
