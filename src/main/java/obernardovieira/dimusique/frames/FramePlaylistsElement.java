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
public class FramePlaylistsElement extends javax.swing.JPanel {

    /**
     * Creates new form FramePlaylistsElement
     */
    public FramePlaylistsElement() {
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

        panel_above = new javax.swing.JPanel();
        label_playlist_title = new javax.swing.JLabel();
        panel_below = new javax.swing.JPanel();
        label_total_songs = new javax.swing.JLabel();
        label_total_time = new javax.swing.JLabel();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        panel_above.setMaximumSize(new java.awt.Dimension(530, 33));
        panel_above.setMinimumSize(new java.awt.Dimension(530, 33));
        panel_above.setPreferredSize(new java.awt.Dimension(530, 33));
        panel_above.setLayout(new javax.swing.BoxLayout(panel_above, javax.swing.BoxLayout.X_AXIS));

        label_playlist_title.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        label_playlist_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_playlist_title.setText("My playlist");
        label_playlist_title.setMaximumSize(new java.awt.Dimension(530, 33));
        label_playlist_title.setMinimumSize(new java.awt.Dimension(530, 33));
        label_playlist_title.setPreferredSize(new java.awt.Dimension(530, 33));
        panel_above.add(label_playlist_title);

        add(panel_above);

        panel_below.setMaximumSize(new java.awt.Dimension(530, 32));
        panel_below.setMinimumSize(new java.awt.Dimension(530, 32));
        panel_below.setPreferredSize(new java.awt.Dimension(530, 32));
        panel_below.setLayout(new javax.swing.BoxLayout(panel_below, javax.swing.BoxLayout.X_AXIS));

        label_total_songs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_total_songs.setText("37 songs");
        label_total_songs.setMaximumSize(new java.awt.Dimension(265, 32));
        label_total_songs.setMinimumSize(new java.awt.Dimension(265, 32));
        label_total_songs.setPreferredSize(new java.awt.Dimension(265, 32));
        panel_below.add(label_total_songs);

        label_total_time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_total_time.setText("1:36:47");
        label_total_time.setMaximumSize(new java.awt.Dimension(265, 32));
        label_total_time.setMinimumSize(new java.awt.Dimension(265, 32));
        label_total_time.setPreferredSize(new java.awt.Dimension(265, 32));
        panel_below.add(label_total_time);

        add(panel_below);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label_playlist_title;
    private javax.swing.JLabel label_total_songs;
    private javax.swing.JLabel label_total_time;
    private javax.swing.JPanel panel_above;
    private javax.swing.JPanel panel_below;
    // End of variables declaration//GEN-END:variables
}
