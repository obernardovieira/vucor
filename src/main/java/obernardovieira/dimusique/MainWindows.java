/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obernardovieira.dimusique;

import obernardovieira.dimusique.core.Basic;
import obernardovieira.dimusique.frames.*;

/**
 *
 * @author user
 */
public class MainWindows extends javax.swing.JFrame {

    /**
     * Creates new form MainWindows
     */
    public MainWindows() {
        initComponents();
        panel_left_upper.add(new FrameOptions(this));
        panel_left_upper.invalidate();
        panel_left_upper.repaint();
        
        panel_right_upper.add(new FramePlaying());
        panel_right_upper.invalidate();
        panel_right_upper.repaint();
        
        pannel_lower.add(new FrameControls());
        pannel_lower.invalidate();
        pannel_lower.repaint();
    }
    
    public void setViewer(Integer _case)
    {
        if(_case.equals(Basic.framePlaylists))
        {
            panel_right_upper.removeAll();
            panel_right_upper.add(new FramePlaylists());
        }
        else if(_case.equals(Basic.framePlaying))
        {
            panel_right_upper.removeAll();
            panel_right_upper.add(new FramePlaying());
        }
        panel_right_upper.invalidate();
        panel_right_upper.repaint();
        panel_right_upper.setVisible(false);
        panel_right_upper.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_main = new javax.swing.JPanel();
        panel_upper = new javax.swing.JPanel();
        panel_left_upper = new javax.swing.JPanel();
        panel_right_upper = new javax.swing.JPanel();
        pannel_lower = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 500));

        panel_main.setMinimumSize(new java.awt.Dimension(0, 0));
        panel_main.setPreferredSize(new java.awt.Dimension(600, 500));
        panel_main.setLayout(new javax.swing.BoxLayout(panel_main, javax.swing.BoxLayout.Y_AXIS));

        panel_upper.setLayout(new javax.swing.BoxLayout(panel_upper, javax.swing.BoxLayout.X_AXIS));

        panel_left_upper.setLayout(new javax.swing.BoxLayout(panel_left_upper, javax.swing.BoxLayout.LINE_AXIS));
        panel_upper.add(panel_left_upper);

        panel_right_upper.setLayout(new javax.swing.BoxLayout(panel_right_upper, javax.swing.BoxLayout.LINE_AXIS));
        panel_upper.add(panel_right_upper);

        panel_main.add(panel_upper);

        pannel_lower.setLayout(new javax.swing.BoxLayout(pannel_lower, javax.swing.BoxLayout.LINE_AXIS));
        panel_main.add(pannel_lower);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindows().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panel_left_upper;
    private javax.swing.JPanel panel_main;
    private javax.swing.JPanel panel_right_upper;
    private javax.swing.JPanel panel_upper;
    private javax.swing.JPanel pannel_lower;
    // End of variables declaration//GEN-END:variables
}
