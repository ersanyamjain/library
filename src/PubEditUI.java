import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import java.lang.String;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PubEditUI.java
 *
 * Created on Dec 23, 2011, 11:52:11 AM
 */

/**
 *
 * @author d
 */
public class PubEditUI extends javax.swing.JFrame {
    private Connection Connection;

    /** Creates new form PubEditUI */
    public PubEditUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmdUpdate = new javax.swing.JButton();
        cmdExit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtpno = new javax.swing.JTextField();
        txtpname = new javax.swing.JTextField();
        txtpadd = new javax.swing.JTextField();
        txtph1 = new javax.swing.JTextField();
        txtph2 = new javax.swing.JTextField();
        txtstatus = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel1.setText("Publisher No./ ID");

        jLabel2.setText("Name");

        jLabel3.setText("Address");

        jLabel4.setText("Phone/Mobile");

        jLabel5.setText("Phone/Mobile");

        jLabel6.setText("Status");

        cmdUpdate.setText("Update");
        cmdUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUpdateActionPerformed(evt);
            }
        });

        cmdExit.setText("Exit");
        cmdExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExitActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Select a Publiser");

        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdUpdate)
                        .addGap(55, 55, 55)
                        .addComponent(cmdExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtstatus)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtpname, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtpno)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addComponent(txtpadd)
                                    .addComponent(txtph1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtph2, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))))
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtpname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtpadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtph1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtph2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmdUpdate)
                            .addComponent(cmdExit)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUpdateActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
        Connection con=(Connection)
                DriverManager.getConnection("jdbc:mysql://localhost:3306/lbsystem","root","tiger");
        Statement stmt=null;
        ResultSet rs=null;
        String SQL="SELECT * from publisher";
        stmt=con.createStatement();
        rs=stmt.executeQuery(SQL);
        int pno=Integer.parseInt(txtpno.getText());
        String PubName=txtpname.getText();
        String PubAdd=txtpadd.getText();
        String PubPh1=txtph1.getText();
         String PubPh2=txtph2.getText();
          String PStatus=txtstatus.getText();
    String strSQL="Update Publisher set pub_name='"+(PubName)+"',pub_address='"+(PubAdd)+"',pub_phone1='"+(PubPh1)+"',pub_phone2='"+(PubPh2)+"',status='"+(PStatus)+"'where pub_id="+(pno);
        int rowsEffected=stmt.executeUpdate(strSQL);
       if(rowsEffected==0)
           JOptionPane.showMessageDialog(this,"Record does not exists");

       else
          JOptionPane.showMessageDialog(this,"Record modifiefd");
     con.close();
        stmt.close();
        rs.close();
        
        }
        catch (Exception e) {
        JOptionPane.showMessageDialog(this,e.getMessage()); }
    }//GEN-LAST:event_cmdUpdateActionPerformed

    private void cmdExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExitActionPerformed
        // TODO add your handling code here:t
        this.setVisible(false);
        
}//GEN-LAST:event_cmdExitActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        txtpno.setEditable(false);
        DefaultListModel dModel=(DefaultListModel)jList1.getModel();
        dModel.clear();
        try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=(Connection)
                DriverManager.getConnection("jdbc:mysql://localhost:3306/lbsystem","root","tiger");
        Statement stmt=null;
        ResultSet rs=null;
        String SQL="select * from publisher";
        stmt=con.createStatement();
        rs=stmt.executeQuery(SQL);
        while(rs.next()){
            String Pno=rs.getString("pub_id");
            String Pname=rs.getString("pub_name");
            if(Pno=length()<4){
            int x=Pno.length();
            int nl=4-x;
            while(nl>0){
            Pno=Pno+" ";
            nl--;

            }

            }
        dModel.addElement(Pno+" "+Pname);

        }
        jList1.setModel(dModel);
        con.close();
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(this,e.getMessage());
        e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowGainedFocus

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PubEditUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdExit;
    private javax.swing.JButton cmdUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtpadd;
    private javax.swing.JTextField txtph1;
    private javax.swing.JTextField txtph2;
    private javax.swing.JTextField txtpname;
    private javax.swing.JTextField txtpno;
    private javax.swing.JTextField txtstatus;
    // End of variables declaration//GEN-END:variables

    private int length() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

}
