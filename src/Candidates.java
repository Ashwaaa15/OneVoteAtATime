import javax.swing.*;
import javax.swing.table.*;
import javax.swing.filechooser.*;
import java.io.*;
import java.awt.*;
import org.xml.sax.Attributes;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import net.proteanit.sql.DbUtils;
public class Candidates extends JFrame {

    public Candidates() {
        initComponents();
        GetElections();
        DisplayCandidate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CandidateTables = new javax.swing.JTable();
        CandidateAge = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        EditButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        DeleteButton = new javax.swing.JButton();
        CandidateNameTb = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CandidateGender = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        Elections = new javax.swing.JComboBox<>();
        CandidatePicture = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BrowseButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel5.setText("Age");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 320, -1, -1));

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
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 766, 186, 38));

        CandidateTables.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CandidateTables.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Gender", "Age", "Election"
            }
        ));
        CandidateTables.setSelectionBackground(new java.awt.Color(0, 204, 255));
        CandidateTables.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CandidateTablesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CandidateTables);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 583, 813, 209));
        getContentPane().add(CandidateAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 322, 76, 33));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ashwanth\\Downloads\\vote\\man-on-podium-being-resize.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 86, -1, 629));

        AddButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        AddButton.setText("ADD");
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
        });
        getContentPane().add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Handwriting", 3, 48)); // NOI18N
        jLabel3.setText("Manage Candidates");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 86, 602, -1));

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
        getContentPane().add(EditButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 516, 80, 30));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Candidate for the election");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 407, -1, -1));

        DeleteButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseClicked(evt);
            }
        });
        getContentPane().add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(955, 516, 80, 30));
        getContentPane().add(CandidateNameTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 221, 200, 33));

        jLabel6.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Changes");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 516, 102, -1));

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 30)); // NOI18N
        jLabel1.setText("Welcome Admin...");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel7.setText("Candidate Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 221, 157, -1));

        CandidateGender.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        CandidateGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(CandidateGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 320, 156, -1));

        jLabel8.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel8.setText("Gender");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 320, 76, -1));

        Elections.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        Elections.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElectionsActionPerformed(evt);
            }
        });
        getContentPane().add(Elections, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 459, 214, -1));

        CandidatePicture.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        CandidatePicture.setText("Picture");
        getContentPane().add(CandidatePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(812, 272, 204, 129));

        jLabel10.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel10.setText("Picture");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 221, 75, -1));

        BrowseButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        BrowseButton.setText("Browse");
        BrowseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BrowseButtonMouseClicked(evt);
            }
        });
        BrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BrowseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 410, 158, 33));

        jTextField1.setBackground(new java.awt.Color(16, 24, 32));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 1200, 450));

        jTextField2.setBackground(new java.awt.Color(254, 231, 21));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
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
            Elections.addItem(ElecId);
        }
        }catch(Exception e){
            
        }
    }
    private void BrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BrowseButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed

    }//GEN-LAST:event_BackButtonActionPerformed

    private void ElectionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElectionsActionPerformed
        
    }//GEN-LAST:event_ElectionsActionPerformed
    private ImageIcon ResizePhoto(String Imagepath,byte[] pic)
    {
        ImageIcon MyImage = null;
        if(Imagepath !=null)
        {
            MyImage = new ImageIcon(Imagepath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(CandidatePicture.getWidth(),CandidatePicture.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    String imgpath = null;
    private void BrowseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BrowseButtonMouseClicked
        JFileChooser choose = new JFileChooser();
        choose.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","gif","png");
        choose.addChoosableFileFilter(filter);
        int result = choose.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION)
        {
            File selectedfile = choose.getSelectedFile();
            String path = selectedfile.getAbsolutePath();
            CandidatePicture.setIcon(ResizePhoto(path,null));
            imgpath = path;
        }
    }//GEN-LAST:event_BrowseButtonMouseClicked

int CandidateId;
Statement St1 = null;
ResultSet Rs1 = null;
private void CandidateCount()
{
    try{
        St1 = Con.createStatement();
        Rs1 = St1.executeQuery("select MAx(CandidateId) from CandidatesTable");
        Rs1.next();
        CandidateId = Rs1.getInt(1)+1;
    }catch(Exception Ex){
        
    }
}
private void DisplayCandidate()
{
    try{
        Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onevoteatatime db","root","");
        St = Con.createStatement();
        Rs = St.executeQuery("Select * from CandidatesTable");
        CandidateTables.setModel(DbUtils.resultSetToTableModel(Rs));
    }catch(Exception e){
        
    }
}
    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        if(CandidateAge.getText().isEmpty()|| CandidateNameTb.getText().isEmpty() || (CandidateGender.getSelectedIndex()==-1) ||(Elections.getSelectedIndex()==-1))
        {
            JOptionPane.showMessageDialog(this, "Candidate Information Missing");            
        }
        else
        {
            try{
                CandidateCount();
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onevoteatatime db","root","");
            PreparedStatement Add = Con.prepareStatement("Insert into CandidatesTable Values(?,?,?,?,?,?)");
            InputStream img = new FileInputStream(imgpath);
            Add.setInt(1, CandidateId);
            Add.setString(2, CandidateNameTb.getText());
            Add.setInt(3, Integer.valueOf(CandidateAge.getText()));
            Add.setString(4, CandidateGender.getSelectedItem().toString());
            Add.setBlob(5, img);
            Add.setInt(6,Integer.valueOf(Elections.getSelectedItem().toString()));
            int row = Add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Candidate Added Successfully");
            Con.close();
            DisplayCandidate();
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_AddButtonMouseClicked
    private void GetPhoto()
    {
        String Query = "SELECT CANDIDATEPHOTO FROM CANDIDATESTABLE WHERE CANDIDATEID ="+key;
        Statement St;
        ResultSet Rs;
        try{
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onevoteatatime db","root","");
            St = Con.createStatement();
            Rs = St.executeQuery(Query);
            if(Rs.next())
            {
                CandidatePicture.setIcon(ResizePhoto(null,Rs.getBytes("CandidatePhoto")));
            }
        }catch(Exception e){
            
        }
    }
    int key = -1;
    private void CandidateTablesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CandidateTablesMouseClicked
        DefaultTableModel model = (DefaultTableModel)CandidateTables.getModel();
        int Index = CandidateTables.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(Index,0).toString());
        CandidateNameTb.setText(model.getValueAt(Index,1).toString());
        CandidateAge.setText(model.getValueAt(Index,2).toString());
        CandidateGender.setSelectedItem(model.getValueAt(Index,3).toString());
        Elections.setSelectedItem(model.getValueAt(Index,5).toString());
        GetPhoto();
    }//GEN-LAST:event_CandidateTablesMouseClicked

    private void DeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseClicked
        if(key==-1)
        {
            JOptionPane.showMessageDialog(this, "Select The Election to be Deleted");
        }
        else
        {
            try{
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onevoteatatime db","root","");
                String Query = "Delete from CANDIDATESTABLE where CandidateId ="+key;
                Statement delete = Con.createStatement();
                delete.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Candidate Deleted Successfully!");
                DisplayCandidate();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_DeleteButtonMouseClicked

    private void EditButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditButtonMouseClicked
        if(imgpath!=null)
        {
            try{
                InputStream img = new FileInputStream(imgpath);
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onevoteatatime db","root","");
                String Query = "UPDATE CANDIDATESTABLE SET CANDIDATENAME=?,CANDIDATEAGE=?,CANDIDATEGENDER=?,CANDIDATEPHOTO=?,CANDIDATEELECT=? WHERE CANDIDATEID=?";                
                PreparedStatement updateQuery = Con.prepareStatement(Query);
                updateQuery.setString(1, CandidateNameTb.getText());
                updateQuery.setInt(2, Integer.valueOf(CandidateAge.getText().toString()));
                updateQuery.setString(3, CandidateGender.getSelectedItem().toString());
                updateQuery.setBlob(4, img);
                updateQuery.setString(5, Elections.getSelectedItem().toString());
                updateQuery.setInt(6, key);
                if(updateQuery.executeUpdate()==1)
                {
                    JOptionPane.showMessageDialog(this, "Candidate Updated Successfully!");
                    DisplayCandidate();
                }else{
                    JOptionPane.showMessageDialog(this, "Select a Candidate to Update");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Select Photo");
            CandidatePicture.setIcon(null);
            CandidatePicture.setText("");
        }
        imgpath=null;
    }//GEN-LAST:event_EditButtonMouseClicked

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditButtonActionPerformed

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Candidates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Candidates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Candidates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Candidates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Candidates().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton BrowseButton;
    private javax.swing.JTextField CandidateAge;
    private javax.swing.JComboBox<String> CandidateGender;
    private javax.swing.JTextField CandidateNameTb;
    private javax.swing.JLabel CandidatePicture;
    private javax.swing.JTable CandidateTables;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JComboBox<String> Elections;
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
