/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initialdesign;
import java.awt.Color;
import internalpages.*;
import internalpages.dashboardPage;

/**
 *
 * @author SCC-PC04
 */
public class jinternalframe extends javax.swing.JFrame {

    /**
     * Creates new form jinternalframe
     */
    public jinternalframe() {
        initComponents();
    }
    
   Color dashcolors = new Color(255,255,0);
   Color headcolors = new Color(204,204,204);
   Color bodycolors = new Color(255,255,255);        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dashcolor = new javax.swing.JPanel();
        reportpane = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dashpane = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        user1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        headcolor = new javax.swing.JPanel();
        maindesktop = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));
        jPanel1.setLayout(null);

        dashcolor.setBackground(new java.awt.Color(255, 255, 0));
        dashcolor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reportpane.setBackground(new java.awt.Color(255, 255, 0));
        reportpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportpaneMouseExited(evt);
            }
        });
        reportpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REPORTS");
        reportpane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 110, 20));

        dashcolor.add(reportpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 110, 40));

        dashpane.setBackground(new java.awt.Color(255, 255, 0));
        dashpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashpaneMouseExited(evt);
            }
        });
        dashpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DASHBOARD");
        dashpane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 110, 20));

        dashcolor.add(dashpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 110, 40));

        user1.setBackground(new java.awt.Color(255, 255, 0));
        user1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                user1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                user1MouseExited(evt);
            }
        });
        user1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("USER");
        user1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 110, 20));

        dashcolor.add(user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 110, 40));

        jPanel1.add(dashcolor);
        dashcolor.setBounds(0, 0, 110, 390);

        headcolor.setBackground(new java.awt.Color(0, 51, 153));

        javax.swing.GroupLayout headcolorLayout = new javax.swing.GroupLayout(headcolor);
        headcolor.setLayout(headcolorLayout);
        headcolorLayout.setHorizontalGroup(
            headcolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        headcolorLayout.setVerticalGroup(
            headcolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(headcolor);
        headcolor.setBounds(110, 0, 550, 60);

        maindesktop.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout maindesktopLayout = new javax.swing.GroupLayout(maindesktop);
        maindesktop.setLayout(maindesktopLayout);
        maindesktopLayout.setHorizontalGroup(
            maindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        maindesktopLayout.setVerticalGroup(
            maindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        jPanel1.add(maindesktop);
        maindesktop.setBounds(110, 60, 550, 330);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void reportpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportpaneMouseEntered
        reportpane.setBackground(bodycolors);
    }//GEN-LAST:event_reportpaneMouseEntered

    private void reportpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportpaneMouseExited
        reportpane.setBackground(dashcolors);
    }//GEN-LAST:event_reportpaneMouseExited

    private void dashpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseEntered
        dashpane.setBackground(bodycolors);
    }//GEN-LAST:event_dashpaneMouseEntered

    private void dashpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseExited
        dashpane.setBackground(dashcolors);
    }//GEN-LAST:event_dashpaneMouseExited

    private void user1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user1MouseEntered
        user1.setBackground(bodycolors);
    }//GEN-LAST:event_user1MouseEntered

    private void user1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user1MouseExited
        user1.setBackground(dashcolors);
    }//GEN-LAST:event_user1MouseExited

    private void user1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user1MouseClicked
        userPage up = new userPage();
        maindesktop.add(up).setVisible(true);
    }//GEN-LAST:event_user1MouseClicked

    private void dashpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseClicked
        dashboardPage dop = new dashboardPage();
        maindesktop.add(dop).setVisible(true);
    }//GEN-LAST:event_dashpaneMouseClicked
 
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
            java.util.logging.Logger.getLogger(jinternalframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jinternalframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jinternalframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jinternalframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jinternalframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dashcolor;
    private javax.swing.JPanel dashpane;
    private javax.swing.JPanel headcolor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDesktopPane maindesktop;
    private javax.swing.JPanel reportpane;
    private javax.swing.JPanel user1;
    // End of variables declaration//GEN-END:variables
}
