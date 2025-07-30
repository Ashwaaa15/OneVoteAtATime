import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Civilians extends JFrame {

    /**
     * Creates new form Civilians
     */
    public Civilians() {
        initComponents();
        GetElections();
        DisplayVoters();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        DeleteButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        VoterPassword = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        VotersTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        VoterAge = new javax.swing.JTextField();
        VoterGender = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        Addbutton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        EditButton = new javax.swing.JButton();
        VoterElection = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        VoterName = new javax.swing.JTextField();
        BackButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel4.setText("Eligible for Election...");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 369, -1, -1));

        DeleteButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseClicked(evt);
            }
        });
        getContentPane().add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1019, 368, -1, 27));

        jLabel10.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel10.setText("Password");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 211, 99, -1));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel5.setText("Age");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 283, -1, -1));

        VoterPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoterPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(VoterPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(894, 213, 200, 33));

        jLabel6.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel6.setText("Changes");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 368, 102, -1));

        VotersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Age", "Password", "Gender", "Elect"
            }
        ));
        VotersTable.setSelectionBackground(new java.awt.Color(0, 204, 255));
        VotersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VotersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(VotersTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 448, 807, 284));

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel7.setText("Candidate Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 211, 157, -1));
        getContentPane().add(VoterAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 285, 78, 33));

        VoterGender.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        VoterGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(VoterGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 277, 164, 42));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ashwanth\\Downloads\\vote\\man-on-podium-being-resize.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        Addbutton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        Addbutton.setText("ADD");
        Addbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddbuttonMouseClicked(evt);
            }
        });
        getContentPane().add(Addbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(954, 301, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel8.setText("Gender");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 283, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Handwriting", 3, 48)); // NOI18N
        jLabel3.setText("Manage Voters");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 73, 435, -1));

        EditButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        EditButton.setText("Edit");
        EditButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditButtonMouseClicked(evt);
            }
        });
        getContentPane().add(EditButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(905, 368, -1, 27));

        VoterElection.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        getContentPane().add(VoterElection, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 368, 156, 33));

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 30)); // NOI18N
        jLabel1.setText("Welcome Admin...");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 73, -1, -1));
        getContentPane().add(VoterName, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 213, 206, 33));

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
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 693, 186, 39));

        jTextField1.setBackground(new java.awt.Color(16, 24, 32));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 1210, 380));

        jTextField2.setBackground(new java.awt.Color(254, 225, 5));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Connection Con = null;
    PreparedStatement pst = null;
    java.sql.ResultSet Rs = null;
    Statement St = null;
    private void GetElections()
    {
        try{
        Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onevoteatatime db","root","");
        St = Con.createStatement();
        String Query = "SELECT * FROM ELECTIONTABLE";
        Rs = St.executeQuery(Query);
        while(Rs.next())
        {
            String ElecId = Rs.getString("ElectionId");
            VoterElection.addItem(ElecId);
        }
        }catch(Exception e){
            
        }
    }
int VoterId;
Statement St1 = null;
java.sql.ResultSet Rs1 = null;
private void VoterCount()
{
    try{
        St1 = Con.createStatement();
        Rs1 = St1.executeQuery("select MAx(VoterId) from VotersTable");
        Rs1.next();
        VoterId = Rs1.getInt(1)+1;
    }catch(Exception Ex){
        
    }
}
private void DisplayVoters()
{
    try{
        Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onevoteatatime db","root","");
        St = Con.createStatement();
        Rs = St.executeQuery("Select * from VotersTable");
        VotersTable.setModel(DbUtils.resultSetToTableModel(Rs));
    }catch(Exception e){
        
    }
}
    private void VoterPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoterPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VoterPasswordActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed

    }//GEN-LAST:event_BackButtonActionPerformed

    private void AddbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbuttonMouseClicked
        if(VoterAge.getText().isEmpty()|| VoterName.getText().isEmpty() || (VoterGender.getSelectedIndex()==-1)||(VoterElection.getSelectedIndex()==-1))  // 
        {
            JOptionPane.showMessageDialog(this, "Voter Information Missing");            
        }
        else
        {
            try{
                VoterCount();
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onevoteatatime db","root","");
            PreparedStatement Add = Con.prepareStatement("Insert into VotersTable Values(?,?,?,?,?,?)");      
            Add.setInt(1, VoterId);
            Add.setString(2, VoterName.getText());
            Add.setInt(3, Integer.valueOf(VoterAge.getText()));
            Add.setString(4,VoterPassword.getText());
            Add.setString(5, VoterGender.getSelectedItem().toString());
            Add.setInt(6,Integer.valueOf(VoterElection.getSelectedItem().toString()));
            int row = Add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Voter Registered Successfully");
            Con.close();
            DisplayVoters();
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(this, ex);
            }
        }
       
    }//GEN-LAST:event_AddbuttonMouseClicked

    private void DeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseClicked
        if(key==-1)
        {
            JOptionPane.showMessageDialog(this, "Select The Election to be Deleted");
        }
        else
        {
            try{
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onevoteatatime db","root","");
                String Query = "Delete from VOTERSTABLE where VoterId ="+key;
                Statement delete = Con.createStatement();
                delete.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Civilian Deleted Successfully!");
                DisplayVoters();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }        
    }//GEN-LAST:event_DeleteButtonMouseClicked
int key=-1;
    private void VotersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VotersTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)VotersTable.getModel();
        int Index = VotersTable.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(Index,0).toString());
        VoterName.setText(model.getValueAt(Index,1).toString());
        VoterAge.setText(model.getValueAt(Index,2).toString());
        VoterPassword.setText(model.getValueAt(Index,3).toString());
        VoterGender.setSelectedItem(model.getValueAt(Index, 4).toString());
        VoterElection.setSelectedItem(model.getValueAt(Index,5).toString());        
    }//GEN-LAST:event_VotersTableMouseClicked

    private void EditButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditButtonMouseClicked
        if(VoterAge.getText().isEmpty()|| VoterName.getText().isEmpty() || (VoterGender.getSelectedIndex()==-1) ||(VoterElection.getSelectedIndex()==-1))
        {
            JOptionPane.showMessageDialog(this, "Select a Civilian Info to Update");
        }
        else
        {
            try{
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onevoteatatime db","root","");
                String Query = "UPDATE VOTERSTABLE SET VOTERNAME=?,VOTERAGE=?,VOTERPASS=?,VOTERGENDER=?,VOTERELECT=? WHERE VOTERID=?";                
                PreparedStatement updateQuery = Con.prepareStatement(Query);
                updateQuery.setString(1, VoterName.getText());
                updateQuery.setInt(2, Integer.valueOf(VoterAge.getText()));
                updateQuery.setString(3, VoterPassword.getText());
                updateQuery.setString(4,VoterGender.getSelectedItem().toString());
                updateQuery.setInt(5, Integer.valueOf(VoterElection.getSelectedItem().toString()));
                updateQuery.setInt(6, key);
                updateQuery.executeUpdate();
                JOptionPane.showMessageDialog(this, "Updated Successfully!");
                DisplayVoters();
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
                new Civilians().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbutton;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JTextField VoterAge;
    private javax.swing.JComboBox<String> VoterElection;
    private javax.swing.JComboBox<String> VoterGender;
    private javax.swing.JTextField VoterName;
    private javax.swing.JTextField VoterPassword;
    private javax.swing.JTable VotersTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
