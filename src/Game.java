
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Game extends javax.swing.JFrame {

    int key = 0;
    int control = 0;

    public void process(JButton button, JLabel label) {
        if (jRadioButtonX.isSelected()) {
            Icon i = jLabelX.getIcon();
            ImageIcon icon = (ImageIcon) i;
            Image image = icon.getImage().getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_SMOOTH);
            button.setIcon(new ImageIcon(image));
            button.setEnabled(false);
            key = 1;
        } else if (jRadioButtonO.isSelected()) {
            Icon i = jLabelO.getIcon();
            ImageIcon icon = (ImageIcon) i;
            Image image = icon.getImage().getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_SMOOTH);
            button.setIcon(new ImageIcon(image));
            button.setEnabled(false);
            key = 2;
        } else {
            JOptionPane.showMessageDialog(null, "Please select X or O from button.");
        }
        if (jRadioButtonX.isSelected()) {
            jLabelO.setEnabled(true);
            jRadioButtonO.setEnabled(true);
            jLabelX.setEnabled(false);
            jRadioButtonX.setEnabled(false);
        } else if (jRadioButtonO.isSelected()) {
            jLabelO.setEnabled(false);
            jRadioButtonO.setEnabled(false);
            jLabelX.setEnabled(true);
            jRadioButtonX.setEnabled(true);
        }
        if (key == 1) {
            label.setText("X");
            label.setEnabled(false);
            control++;
        } else if (key == 2) {
            label.setText("O");
            label.setEnabled(false);
            control++;
        } else {
            System.out.println("Error");
        }
    }

    public Game() {
        initComponents();
        Icon i2 = jLabelO.getIcon();
        ImageIcon icon2 = (ImageIcon) i2;
        Image image2 = icon2.getImage().getScaledInstance(jLabelO.getWidth(), jLabelO.getHeight(), Image.SCALE_SMOOTH);
        jLabelO.setIcon(new ImageIcon(image2));
        Icon i3 = jLabelX.getIcon();
        ImageIcon icon3 = (ImageIcon) i3;
        Image image3 = icon3.getImage().getScaledInstance(jLabelO.getWidth(), jLabelO.getHeight(), Image.SCALE_SMOOTH);
        jLabelX.setIcon(new ImageIcon(image3));
        jLabelO.setEnabled(false);
        jRadioButtonO.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jRadioButtonX = new javax.swing.JRadioButton();
        jLabelX = new javax.swing.JLabel();
        jRadioButtonO = new javax.swing.JRadioButton();
        jLabelO = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 110, 70));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 120, 70));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 110, 70));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 120, 70));

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 110, 70));

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 120, 70));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 110, 70));

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 110, 70));

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 110, 70));

        buttonGroup1.add(jRadioButtonX);
        jRadioButtonX.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButtonX.setText("Press for X");
        jPanel2.add(jRadioButtonX, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 331, 98, -1));

        jLabelX.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free-x-icon-10366-thumb.png"))); // NOI18N
        jLabelX.setText("jLabel2");
        jPanel2.add(jLabelX, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 306, 114, 75));

        buttonGroup1.add(jRadioButtonO);
        jRadioButtonO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButtonO.setText("Press for O");
        jPanel2.add(jRadioButtonO, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 331, 98, -1));

        jLabelO.setBackground(new java.awt.Color(0, 0, 0));
        jLabelO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelO.setForeground(new java.awt.Color(153, 153, 153));
        jLabelO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/indir.png"))); // NOI18N
        jLabelO.setText("jLabel1");
        jPanel2.add(jLabelO, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 306, 114, 75));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, -1, -1));

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setForeground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, -1, -1));

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setForeground(new java.awt.Color(204, 255, 204));
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, -1, -1));

        jLabel4.setBackground(new java.awt.Color(204, 255, 204));
        jLabel4.setForeground(new java.awt.Color(204, 255, 204));
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));

        jLabel5.setBackground(new java.awt.Color(204, 255, 204));
        jLabel5.setForeground(new java.awt.Color(204, 255, 204));
        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, -1, -1));

        jLabel6.setBackground(new java.awt.Color(204, 255, 204));
        jLabel6.setForeground(new java.awt.Color(204, 255, 204));
        jLabel6.setText("jLabel6");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, -1, -1));

        jLabel7.setBackground(new java.awt.Color(204, 255, 204));
        jLabel7.setForeground(new java.awt.Color(204, 255, 204));
        jLabel7.setText("jLabel7");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        jLabel8.setBackground(new java.awt.Color(204, 255, 204));
        jLabel8.setForeground(new java.awt.Color(204, 255, 204));
        jLabel8.setText("jLabel8");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, -1));

        jLabel9.setBackground(new java.awt.Color(204, 255, 204));
        jLabel9.setForeground(new java.awt.Color(204, 255, 204));
        jLabel9.setText("jLabel9");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelO;
    private javax.swing.JLabel jLabelX;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonO;
    private javax.swing.JRadioButton jRadioButtonX;
    // End of variables declaration//GEN-END:variables
}
