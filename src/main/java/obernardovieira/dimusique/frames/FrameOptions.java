/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obernardovieira.dimusique.frames;

import javax.swing.JFrame;
import obernardovieira.dimusique.MainWindows;
import obernardovieira.dimusique.core.Basic;

/**
 *
 * @author user
 */
public class FrameOptions extends javax.swing.JPanel {

    /**
     * Creates new form FrameOptions
     */
    private final MainWindows window;
    public FrameOptions(JFrame window) {
        initComponents();
        this.window = (MainWindows)window;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_playlist = new javax.swing.JButton();
        bt_artists = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(60, 330));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        bt_playlist.setText("P");
        bt_playlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_playlistActionPerformed(evt);
            }
        });

        bt_artists.setText("A");
        bt_artists.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_artistsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bt_playlist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_artists, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bt_playlist, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_artists, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 202, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_playlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_playlistActionPerformed
        window.setViewer(Basic.framePlaylists);
    }//GEN-LAST:event_bt_playlistActionPerformed

    private void bt_artistsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_artistsActionPerformed
        window.setViewer(Basic.framePlaying);
    }//GEN-LAST:event_bt_artistsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_artists;
    private javax.swing.JButton bt_playlist;
    // End of variables declaration//GEN-END:variables
}
