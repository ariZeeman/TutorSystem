/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 068682053
 */
public class InterFace extends javax.swing.JFrame {

    boolean subjectCheck = false;
    /**
     * Creates new form InterFace
     */
    public InterFace() {
        initComponents();
        subjectComboBox.removeAllItems();
        subjectComboBox.addItem("English");
        subjectComboBox.addItem("Math");
        subjectComboBox.addItem("Physics");
        subjectComboBox.addItem("Chemistry");
        subjectComboBox.addItem("Biology");
        subjectComboBox.addItem("French");
        subjectComboBox.addItem("Science");
        subjectComboBox.addItem("FI French");
        subjectComboBox.addItem("Other");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        findATutorLabel = new javax.swing.JLabel();
        subjectToFindField = new javax.swing.JTextField();
        subjectToFindLabel = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        confirmButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        signUpLabel = new javax.swing.JLabel();
        subjectComboBox = new javax.swing.JComboBox();
        subjectLabel = new javax.swing.JLabel();
        availabilityLabel = new javax.swing.JLabel();
        monRadio = new javax.swing.JRadioButton();
        tuesRadio = new javax.swing.JRadioButton();
        wedRadio = new javax.swing.JRadioButton();
        thursRadio = new javax.swing.JRadioButton();
        friRadio = new javax.swing.JRadioButton();
        confirmationButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        period1Check = new javax.swing.JRadioButton();
        period1Check1 = new javax.swing.JRadioButton();
        period1Check2 = new javax.swing.JRadioButton();
        period1Check3 = new javax.swing.JRadioButton();
        period1Check4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 725, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Become a Tutor", jPanel2);

        findATutorLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        findATutorLabel.setText("Find a tutor");

        subjectToFindLabel.setText("Subject:");

        loginLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        loginLabel.setText("Login");

        confirmButton1.setText("Confirm");
        confirmButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 218, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(findATutorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 516, Short.MAX_VALUE)
                        .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(310, 310, 310))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(confirmButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subjectToFindLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subjectToFindField, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(findATutorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subjectToFindLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subjectToFindField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(379, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Find a Tutor", jPanel1);

        signUpLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        signUpLabel.setText("Sign up");

        subjectComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        subjectLabel.setText("Subject to be taught");

        availabilityLabel.setText("Times available to be tutored:");

        monRadio.setText("Monday");

        tuesRadio.setText("Tuesday");

        wedRadio.setText("Wednesday");

        thursRadio.setText("Thursday");

        friRadio.setText("Friday");

        confirmationButton2.setText("Confirm");

        jLabel1.setText("Periods available:");

        period1Check.setText("Period 1");

        period1Check1.setText("Period 1");

        period1Check2.setText("Period 1");

        period1Check3.setText("Period 1");

        period1Check4.setText("Period 1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(signUpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(subjectLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(subjectComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(availabilityLabel)
                    .addComponent(confirmationButton2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(monRadio)
                                        .addGap(18, 18, 18)
                                        .addComponent(tuesRadio)))
                                .addGap(18, 18, 18)
                                .addComponent(wedRadio))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(period1Check)
                                .addGap(18, 18, 18)
                                .addComponent(period1Check2)
                                .addGap(18, 18, 18)
                                .addComponent(period1Check3)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(period1Check1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(thursRadio)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(period1Check4)
                                    .addComponent(friRadio))))))
                .addContainerGap(630, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(signUpLabel)
                .addGap(18, 18, 18)
                .addComponent(subjectLabel)
                .addGap(4, 4, 4)
                .addComponent(subjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(availabilityLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monRadio)
                    .addComponent(tuesRadio)
                    .addComponent(wedRadio)
                    .addComponent(thursRadio)
                    .addComponent(friRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(period1Check)
                    .addComponent(period1Check2)
                    .addComponent(period1Check3)
                    .addComponent(period1Check1)
                    .addComponent(period1Check4))
                .addGap(23, 23, 23)
                .addComponent(confirmationButton2)
                .addContainerGap(447, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Become a peer", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButton1MouseClicked
        // TODO add your handling code here:
//        if (){
//        subjectCheck = true;    
//        }
    }//GEN-LAST:event_confirmButton1MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(InterFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterFace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel availabilityLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton confirmButton1;
    private javax.swing.JButton confirmationButton2;
    private javax.swing.JLabel findATutorLabel;
    private javax.swing.JRadioButton friRadio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JRadioButton monRadio;
    private javax.swing.JRadioButton period1Check;
    private javax.swing.JRadioButton period1Check1;
    private javax.swing.JRadioButton period1Check2;
    private javax.swing.JRadioButton period1Check3;
    private javax.swing.JRadioButton period1Check4;
    private javax.swing.JLabel signUpLabel;
    private javax.swing.JComboBox subjectComboBox;
    private javax.swing.JLabel subjectLabel;
    private javax.swing.JTextField subjectToFindField;
    private javax.swing.JLabel subjectToFindLabel;
    private javax.swing.JRadioButton thursRadio;
    private javax.swing.JRadioButton tuesRadio;
    private javax.swing.JRadioButton wedRadio;
    // End of variables declaration//GEN-END:variables
}
