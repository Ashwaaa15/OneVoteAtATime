import javax.swing.*;
import javax.swing.table.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import net.proteanit.sql.DbUtils;

public class Elections extends JFrame {

Connection Con = null;
PreparedStatement pst = null;
ResultSet Rs = null;
Statement St = null;

    public Elections() {
        initComponents();
        DisplayElection();
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ElectionNameTb = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ElectionTable = new javax.swing.JTable();
        ElectionDate = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 30)); // NOI18N
        jLabel1.setText("Welcome Admin...");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 66, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ashwanth\\Downloads\\vote\\man-on-podium-being-resize.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 158, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Handwriting", 3, 48)); // NOI18N
        jLabel3.setText("Manage Elections");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 518, -1));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel4.setText("Election Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 225, 145, -1));
        getContentPane().add(ElectionNameTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 227, 200, 33));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel5.setText("Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 295, 133, -1));

        ElectionTable.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        ElectionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "Date"
            }
        ));
        ElectionTable.setRowHeight(25);
        ElectionTable.setSelectionBackground(new java.awt.Color(0, 204, 255));
        ElectionTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ElectionTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ElectionTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(704, 225, -1, 327));
        getContentPane().add(ElectionDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 297, 200, 33));

        AddButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        AddButton.setText("ADD");
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
        });
        getContentPane().add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 365, 90, 42));

        EditButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        EditButton.setText("Edit");
        EditButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditButtonMouseClicked(evt);
            }
        });
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EditButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 480, 90, 42));

        DeleteButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseClicked(evt);
            }
        });
        getContentPane().add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 480, 90, 42));

        jLabel6.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Changes");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 479, 102, 42));

        BackButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        BackButton.setText("Back to Home");
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 638, 186, 37));

        jTextField1.setBackground(new java.awt.Color(16, 24, 32));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 1200, 400));

        jTextField2.setBackground(new java.awt.Color(254, 225, 5));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed

    }//GEN-LAST:event_BackButtonActionPerformed

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditButtonActionPerformed
int ElectionId;
Statement St1 = null;
ResultSet Rs1 = null;
private void ElectionCount()
{
    try{
        St1 = Con.createStatement();
        Rs1 = St1.executeQuery("select MAx(ElectionId) from ElectionTable");
        Rs1.next();
        ElectionId = Rs1.getInt(1)+1;
    }catch(Exception Ex){
        
    }
}
private void DisplayElection()
{
    try{
        Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onevoteatatime db","root","");
        St = Con.createStatement();
        Rs = St.executeQuery("Select * from ElectionTable");
        ElectionTable.setModel(DbUtils.resultSetToTableModel(Rs));
    }catch(Exception e){
        
    }
}
    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        if(ElectionNameTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter the Election Name");
        }
        else
        {
            try{
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onevoteatatime db","root","");
                PreparedStatement Add = Con.prepareStatement("Insert into ElectionTable values(?,?,?)");
                ElectionCount();
                Add.setInt(1, ElectionId);
                Add.setString(2, ElectionNameTb.getText());
                Add.setString(3, ElectionDate.getText());
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Election Added Successfully");
                Con.close();
                DisplayElection();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_AddButtonMouseClicked
int key= -1;
    private void ElectionTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ElectionTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)ElectionTable.getModel();
        int Index = ElectionTable.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(Index,0).toString());
        ElectionNameTb.setText(model.getValueAt(Index,1).toString());
        ElectionDate.setText(model.getValueAt(Index,2).toString());
    }//GEN-LAST:event_ElectionTableMouseClicked

    private void DeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseClicked
        if(key==-1)
        {
            JOptionPane.showMessageDialog(this, "Select The Election to be Deleted");
        }
        else
        {
            try{
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onevoteatatime db","root","");
                String Query = "Delete from ElectionTable where ElectionId ="+key;
                Statement delete = Con.createStatement();
                delete.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Deleted Successfully!");
                DisplayElection();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_DeleteButtonMouseClicked

    private void EditButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditButtonMouseClicked
        if(key==-1 || ElectionDate.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Select an Election to Update");
        }
        else
        {
            try{
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onevoteatatime db","root","");
                String Query = "UPDATE ELECTIONTABLE SET ELECTIONNAME=?,ELECTIONDATE=? WHERE ELECTIONID=?";                
                PreparedStatement updateQuery = Con.prepareStatement(Query);
                updateQuery.setString(1, ElectionNameTb.getText());
                updateQuery.setString(2, ElectionDate.getText());
                updateQuery.setInt(3, key);
                updateQuery.executeUpdate();
                JOptionPane.showMessageDialog(this, "Updated Successfully!");
                DisplayElection();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_EditButtonMouseClicked

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        new MainMenu().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_BackButtonMouseClicked


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Elections().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JTextField ElectionDate;
    private javax.swing.JTextField ElectionNameTb;
    private javax.swing.JTable ElectionTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
