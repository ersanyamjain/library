import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.*;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PubNavUI.java
 *
 * Created on Dec 23, 2011, 11:52:26 AM
 */

/**
 *
 * @author d
 */
public class PubNavUI extends javax.swing.JFrame {
Statement stmt=null;
        ResultSet rs=null;
        String SQL="select * from publisher";
        public void disable_textfields(){
            txtpno.setEditable(false);
            txtpname.setEditable(false);
            txtpadd.setEditable(false);
            txtph1.setEditable(false);
            txtph2.setEditable(false);
            txtpstatus.setEditable(false);
    /** Creates new form PubNavUI */
    public PubNavUI() {
        initComponents();
        
        }

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmdfirst = new javax.swing.JButton();
        cmdnext = new javax.swing.JButton();
        cmdprev = new javax.swing.JButton();
        cmdlast = new javax.swing.JButton();
        cmdexit = new javax.swing.JButton();
        txtpno = new javax.swing.JTextField();
        txtpname = new javax.swing.JTextField();
        txtpadd = new javax.swing.JTextField();
        txtph1 = new javax.swing.JTextField();
        txtph2 = new javax.swing.JTextField();
        txtpstatus = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel1.setText("PUBLISHER INFORMATION");

        jLabel2.setText("Publisher No./ ID");

        jLabel3.setText("Name");

        jLabel4.setText("Address");

        jLabel5.setText("Phone/Mobile");

        jLabel6.setText("Phone/Mobile");

        jLabel7.setText("Status");

        cmdfirst.setText("First");
        cmdfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdfirstActionPerformed(evt);
            }
        });

        cmdnext.setText("Next");
        cmdnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdnextActionPerformed(evt);
            }
        });

        cmdprev.setText("Previous");
        cmdprev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdprevActionPerformed(evt);
            }
        });

        cmdlast.setText("Last");
        cmdlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdlastActionPerformed(evt);
            }
        });

        cmdexit.setText("Exit");
        cmdexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdexitActionPerformed(evt);
            }
        });

        txtpname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpnameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cmdfirst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdnext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdprev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdlast)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdexit)))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtpname, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpno, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpadd, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(txtph1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtph2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtpno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtpname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtpadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtph1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtph2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtpstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdfirst)
                    .addComponent(cmdnext)
                    .addComponent(cmdprev)
                    .addComponent(cmdlast)
                    .addComponent(cmdexit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpnameActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtpnameActionPerformed

    private void cmdprevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdprevActionPerformed
        // TODO add your handling code here:
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=(Connection)
                DriverManager.getConnection("jdbc:mysql://localhost:3306/lbsystem","root","tiger");
        if(rs.prev()){
            String PubN=rs.getString("pub_id");
            String PubName=rs.getString("pub_name");
        String PubAdd=rs.getString("pub_address");
        txtpno.setText(PubN);
        txtpname.setText(PubName);
        txtpadd.setText(PubAdd);
        txtpph1.setText(PubPh1);
        txtph2.setText(PubPh2);
        txtpstatus.setText(PStatus);
        cmdfirst.setEnabled(true);
        cmdnext.setEnabled(true);
        cmdprev.setEnabled(true);
        cmdlast.setEnabled(true);
        }else{
            cmdprev.setEnabled(false);
          JOptionPane.showMessageDialog(this,"You are at First Position","student",0);
        }
        }
        catch(Exception e){
            JOptionpane.showMessageDialog(this,e.getMessage());
        }
    }



}//GEN-LAST:event_cmdprevActionPerformed

    private void cmdfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdfirstActionPerformed
        // TODO add your handling code here:
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=(Connection)
                DriverManager.getConnection("jdbc:mysql://localhost:3306/lbsystem","root","tiger");
        if(rs.first()){
            String PubN=rs.getString("pub_id");
            String PubName=rs.getString("pub_name");
        String PubAdd=rs.getString("pub_address");
        txtpno.setText(PubN);
        txtpname.setText(PubName);
        txtpadd.setText(PubAdd);
        txtpph1.setText(PubPh1);
        txtph2.setText(PubPh2);
        txtpstatus.setText(PStatus);
        cmdfirst.setEnabled(false);
        cmdnext.setEnabled(false);
        cmdprev.setEnabled(false);
        cmdlast.setEnabled(true);
        }else{
        cmdfirst.setEnabled(false);
        cmdnext.setEnabled(false);
        cmdprev.setEnabled(false);
        cmdlast.setEnabled(false);
        JOptionPane.showMessageDialog(this,"Here is no record in table","student",0);
        }
        }
        catch(Exception e){
            JOptionpane.showMessageDialog(this,e.getMessage());
        }
    }

    }//GEN-LAST:event_cmdfirstActionPerformed

private void cmdnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdnextActionPerformed
    // TODO add your handling code here:
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=(Connection)
                DriverManager.getConnection("jdbc:mysql://localhost:3306/lbsystem","root","tiger");
        if(rs.next()){
            String PubN=rs.getString("pub_id");
            String PubName=rs.getString("pub_name");
        String PubAdd=rs.getString("pub_address");
        txtpno.setText(PubN);
        txtpname.setText(PubName);
        txtpadd.setText(PubAdd);
        txtpph1.setText(PubPh1);
        txtph2.setText(PubPh2);
        txtpstatus.setText(PStatus);
        cmdfirst.setEnabled(true);
        cmdnext.setEnabled(true);
        cmdprev.setEnabled(true);
        cmdlast.setEnabled(true);
        }else {
            cmdnext.setEnabled(false);

        JOptionPane.showMessageDialog(this,"You are at last record position","student",0);
        }
        }
        catch(Exception e){
            JOptionpane.showMessageDialog(this,e.getMessage());
        }
    }

}//GEN-LAST:event_cmdnextActionPerformed

private void cmdexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdexitActionPerformed
    // TODO add your handling code here:
    this.setVisible(false);
}//GEN-LAST:event_cmdexitActionPerformed

private void cmdlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdlastActionPerformed
    // TODO add your handling code here:
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=(Connection)
                DriverManager.getConnection("jdbc:mysql://localhost:3306/lbsystem","root","tiger");
        if(rs.last()){
            String PubN=rs.getString("pub_id");
            String PubName=rs.getString("pub_name");
        String PubAdd=rs.getString("pub_address");
        txtpno.setText(PubN);
        txtpname.setText(PubName);
        txtpadd.setText(PubAdd);
        txtpph1.setText(PubPh1);
        txtph2.setText(PubPh2);
        txtpstatus.setText(PStatus);
        cmdfirst.setEnabled(true);
        cmdnext.setEnabled(false);
        cmdprev.setEnabled(true);
        cmdlast.setEnabled(true);
        }else{

        JOptionPane.showMessageDialog(this,"You are already at last record","student",0);
        }
        }
        catch(Exception e){
            JOptionpane.showMessageDialog(this,e.getMessage());
        }
    }

}//GEN-LAST:event_cmdlastActionPerformed

private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
    // TODO add your handling code here:
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=(Connection)
                DriverManager.getConnection("jdbc:mysql://localhost:3306/lbsystem","root","tiger");
        stmt=con.createStatement();
        rs=stmt.executeQuery(SQL);

        if(rs.first()){
            String PubN=rs.getString("pub_id");
            String PubName=rs.getString("pub_name");
        String PubAdd=rs.getString("pub_address");
        String PubAdd=rs.getString("pub_address");
        String PubPh1=rs.getString("pub_phone1");
        String PubPh2=rs.getString("pub_phone2");
        String PubStatus=rs.getString("pub_status");

        txtpno.setText(PubN);
        txtpname.setText(PubName);
        txtpadd.setText(PubAdd);
        txtpph1.setText(PubPh1);
        txtph2.setText(PubPh2);
        txtpstatus.setText(PStatus);
        cmdfirst.setEnabled(false);
        cmdnext.setEnabled(true);
        cmdprev.setEnabled(false);
        cmdlast.setEnabled(true);
        }else{
            cmdFirst.setEnabled(false);
        cmdnext.setEnabled(false);
        cmdprev.setEnabled(false);
        cmdlast.setEnabled(false);
        JOptionPane.showMessageDialog(this,"Here is no record in table","student",0);
        }
        }
        catch(Exception e){
            JOptionpane.showMessageDialog(this,e.getMessage());
        }
    }

}//GEN-LAST:event_formWindowGainedFocus

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PubNavUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdexit;
    private javax.swing.JButton cmdfirst;
    private javax.swing.JButton cmdlast;
    private javax.swing.JButton cmdnext;
    private javax.swing.JButton cmdprev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtpadd;
    private javax.swing.JTextField txtph1;
    private javax.swing.JTextField txtph2;
    private javax.swing.JTextField txtpname;
    private javax.swing.JTextField txtpno;
    private javax.swing.JTextField txtpstatus;
    // End of variables declaration//GEN-END:variables

}
