/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obernardovieira.dimusique.frames;

/**
 *
 * @author user
 */
public class FrameControls extends javax.swing.JPanel {

    /**
     * Creates new form FramePlaying
     */
    public FrameControls() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_disc_image = new javax.swing.JPanel();
        lb_current_time = new javax.swing.JLabel();
        pb_music = new javax.swing.JProgressBar();
        lb_total_time = new javax.swing.JLabel();

        panel_disc_image.setBackground(new java.awt.Color(204, 255, 204));
        panel_disc_image.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout panel_disc_imageLayout = new javax.swing.GroupLayout(panel_disc_image);
        panel_disc_image.setLayout(panel_disc_imageLayout);
        panel_disc_imageLayout.setHorizontalGroup(
            panel_disc_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel_disc_imageLayout.setVerticalGroup(
            panel_disc_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        lb_current_time.setText("4:51");

        lb_total_time.setText("6:23");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_disc_image, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_current_time)
                .addGap(18, 18, 18)
                .addComponent(pb_music, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lb_total_time)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_disc_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_total_time)
                    .addComponent(pb_music, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_current_time))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lb_current_time;
    private javax.swing.JLabel lb_total_time;
    private javax.swing.JPanel panel_disc_image;
    private javax.swing.JProgressBar pb_music;
    // End of variables declaration//GEN-END:variables
}
