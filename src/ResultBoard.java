import java.awt.Image;
import java.text.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
public class ResultBoard extends JFrame {

Connection Con = null;
PreparedStatement pst = null;
ResultSet Rs = null;
Statement St = null;
    public ResultBoard() {
        initComponents();
        DisplayElection();
    }
private void DisplayElection()
{
    try{
        Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onevoteatatime db","root","");
        St = Con.createStatement();
        Rs = St.executeQuery("Select * from ElectionTable");
        ElectionsTable.setModel(DbUtils.resultSetToTableModel(Rs));
    }catch(Exception e){
        
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WinnerLabel = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ElectionsTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        CandidatePicture = new javax.swing.JLabel();
        VotesLabel = new javax.swing.JLabel();
        PercentageLabel = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WinnerLabel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        WinnerLabel.setText("Name");
        getContentPane().add(WinnerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 334, 141, -1));

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
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 675, 186, 38));

        jLabel10.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(254, 225, 5));
        jLabel10.setText("Elections List");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 429, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ashwanth\\Downloads\\vote\\onefinger vote resize.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 187, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Handwriting", 3, 48)); // NOI18N
        jLabel3.setText("Result Board...");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        ElectionsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ElectionsTable.setSelectionBackground(new java.awt.Color(102, 255, 102));
        ElectionsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ElectionsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ElectionsTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 480, 846, 233));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 30)); // NOI18N
        jLabel4.setText("Winner!");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 143, 70));

        CandidatePicture.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        CandidatePicture.setText("Picture");
        getContentPane().add(CandidatePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 231, 204, 180));

        VotesLabel.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        VotesLabel.setText("Votes");
        getContentPane().add(VotesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(703, 284, 145, 66));

        PercentageLabel.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        PercentageLabel.setForeground(new java.awt.Color(254, 225, 5));
        PercentageLabel.setText("Percentage");
        getContentPane().add(PercentageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(703, 378, 145, 66));

        jTextField1.setBackground(new java.awt.Color(16, 24, 32));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 1200, 360));

        jTextField2.setBackground(new java.awt.Color(254, 225, 5));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonMouseClicked

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed

    }//GEN-LAST:event_BackButtonActionPerformed

    int winnerid,votes,percentage;
    private void Winner(){
    try{
      Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onevoteatatime db","root","");
      St=Con.createStatement();
      String Query = "SELECT CandidateId, COUNT(CandidateId) FROM Calcvotes WHERE ElectId=" + key + " GROUP BY CandidateId ORDER BY count(CandidateId) DESC LIMIT 1";
      Rs=St.executeQuery(Query);
      while(Rs.next()){
          //JOptionPane.showMessageDialog(this,""+Rs.getInt(1));
          winnerid=Rs.getInt(1);
      }
    }catch(SQLException e){
        JOptionPane.showMessageDialog(this, e);
    }
}
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
    private void Winnerinfo()
    {
        String Query = "SELECT CANDIDATEPHOTO,CANDIDATENAME FROM CANDIDATESTABLE WHERE CANDIDATEID ="+winnerid;
        Statement St;
        ResultSet Rs;
        try{
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onevoteatatime db","root","");
            St = Con.createStatement();
            Rs = St.executeQuery(Query);
            if(Rs.next())
            {
                CandidatePicture.setIcon(ResizePhoto(null,Rs.getBytes("CandidatePhoto")));
                WinnerLabel.setText(Rs.getString("CandidateName"));
            }
        }catch(Exception e){
            
        }
    }
    private void GetVotes()
    {
        try{
      Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onevoteatatime db","root","");
      St=Con.createStatement();
      String Query="select Count(CandidateId) from Calcvotes where CandidateId="+winnerid;
      Rs=St.executeQuery(Query);
      while(Rs.next()){
        votes=Rs.getInt(1);
       // JOptionPane.showMessageDialog(this,""+votes);  
       VotesLabel.setText(votes+" Votes");
      }
    }catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
    }
    }
    int totalvotes;
    double winpercentage;
    private void GetPercentage()
    {
        try{
      Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onevoteatatime db","root","");
      St=Con.createStatement();
      String Query="select Count(*) from Calcvotes where ElectId="+key;
      Rs=St.executeQuery(Query);
      while(Rs.next()){
          totalvotes=Rs.getInt(1);
          //JOptionPane.showMessageDialog(this, totalvotes);
          winpercentage=(votes*100)/totalvotes;
          PercentageLabel.setText(new DecimalFormat("##.##").format(winpercentage)+"%");
      }
    }catch(SQLException e){
        JOptionPane.showMessageDialog(this, e);
        
    }
    }   
    int key=-1;
    private void ElectionsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ElectionsTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)ElectionsTable.getModel();
        int Index = ElectionsTable.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(Index,0).toString());
        Winner();
        Winnerinfo();
        GetVotes();
        GetPercentage();
        //GetPhoto();
    }//GEN-LAST:event_ElectionsTableMouseClicked

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
            java.util.logging.Logger.getLogger(ResultBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel CandidatePicture;
    private javax.swing.JTable ElectionsTable;
    private javax.swing.JLabel PercentageLabel;
    private javax.swing.JLabel VotesLabel;
    private javax.swing.JLabel WinnerLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
