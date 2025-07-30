
public class MainMenu extends javax.swing.JFrame {

    public MainMenu() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        Candidates = new javax.swing.JLabel();
        Voters = new javax.swing.JLabel();
        ResultBoard = new javax.swing.JLabel();
        Elections = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CandidateName = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 1, 48)); // NOI18N
        jLabel3.setText("Home...");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 97, 250, -1));

        Candidates.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        Candidates.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ashwanth\\OneDrive\\Pictures\\Screenshots\\Screenshot 2023-11-22 083019.png")); // NOI18N
        Candidates.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CandidatesMouseClicked(evt);
            }
        });
        getContentPane().add(Candidates, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 225, -1, -1));

        Voters.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        Voters.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ashwanth\\OneDrive\\Pictures\\Screenshots\\Screenshot 2023-11-22 083423.png")); // NOI18N
        Voters.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VotersMouseClicked(evt);
            }
        });
        getContentPane().add(Voters, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, 150, -1));

        ResultBoard.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        ResultBoard.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ashwanth\\OneDrive\\Pictures\\Screenshots\\Screenshot 2023-11-22 083700.png")); // NOI18N
        ResultBoard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResultBoardMouseClicked(evt);
            }
        });
        getContentPane().add(ResultBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 220, 204, 187));

        Elections.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        Elections.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ashwanth\\OneDrive\\Pictures\\Screenshots\\Screenshot 2023-11-22 083239.png")); // NOI18N
        Elections.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ElectionsMouseClicked(evt);
            }
        });
        getContentPane().add(Elections, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 225, -1, 187));

        jLabel5.setBackground(new java.awt.Color(0, 153, 255));
        jLabel5.setFont(new java.awt.Font("Lucida Handwriting", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("lets make a difference...");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 590, -1, 30));

        jLabel8.setBackground(new java.awt.Color(0, 153, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Elections");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 430, -1, 30));

        CandidateName.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        CandidateName.setForeground(new java.awt.Color(255, 255, 255));
        CandidateName.setText("Back");
        CandidateName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CandidateNameMouseClicked(evt);
            }
        });
        getContentPane().add(CandidateName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1105, 502, 64, 48));

        jLabel9.setBackground(new java.awt.Color(0, 153, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Candidates");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 430, -1, 30));

        jLabel10.setBackground(new java.awt.Color(0, 153, 255));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Results");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 430, -1, 30));

        jLabel11.setBackground(new java.awt.Color(0, 153, 255));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Voters");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, -1, 30));

        jTextField1.setBackground(new java.awt.Color(16, 24, 32));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 1230, 320));

        jTextField2.setBackground(new java.awt.Color(254, 231, 21));
        jTextField2.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 340));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ElectionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ElectionsMouseClicked
        new Elections().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ElectionsMouseClicked

    private void CandidatesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CandidatesMouseClicked
        new Candidates().setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_CandidatesMouseClicked

    private void VotersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VotersMouseClicked
        new Civilians().setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_VotersMouseClicked

    private void ResultBoardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResultBoardMouseClicked
        new ResultBoard().setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_ResultBoardMouseClicked

    private void CandidateNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CandidateNameMouseClicked
        new Intro().setVisible(true);
        this.dispose();      // TODO add your handling code here:
    }//GEN-LAST:event_CandidateNameMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CandidateName;
    private javax.swing.JLabel Candidates;
    private javax.swing.JLabel Elections;
    private javax.swing.JLabel ResultBoard;
    private javax.swing.JLabel Voters;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
