/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obernardovieira.vucor.frames;

import java.awt.Color;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import obernardovieira.vucor.MainWindows;
import obernardovieira.vucor.core.Basic;
import obernardovieira.vucor.core.Playlist;
import obernardovieira.vucor.core.data.DataFiles;
import obernardovieira.vucor.frames.elements.FrameNewPLElement;

/**
 *
 * @author user
 */
public class FrameNewPlaylist extends javax.swing.JPanel {

    private final HashMap<FrameNewPLElement, String> new_playlist;
    private String playlist_name;
    private final FrameControls frameControls;
    private final MainWindows mainWindow;
    /**
     * Creates new form FrameNewPlaylist
     * @param window
     * @param mainWindow
     */
    public FrameNewPlaylist(javax.swing.JPanel window, JFrame mainWindow)
    {
        initComponents();
        //
        panel_edit.add(new PicPanel("src/main/resources/images/083__setting_edit.png",
                167, 167, 40, 40, panel_edit.getParent().getBackground()));
        panel_edit.invalidate();
        panel_edit.repaint();
        //
        playlist_name = label_playlist_title.getText();
        new_playlist = new HashMap<>();
        this.frameControls = (FrameControls)window;
        this.mainWindow = (MainWindows)mainWindow;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_title = new javax.swing.JPanel();
        label_playlist_title = new javax.swing.JLabel();
        panel_edit = new javax.swing.JPanel();
        panel_content = new javax.swing.JPanel();
        scrollpanel_musics = new javax.swing.JScrollPane();
        panel_musics = new javax.swing.JPanel();
        panel_buttons = new javax.swing.JPanel();
        button_create = new javax.swing.JButton();
        button_add_music = new javax.swing.JButton();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        panel_title.setPreferredSize(new java.awt.Dimension(530, 40));
        panel_title.setLayout(new javax.swing.BoxLayout(panel_title, javax.swing.BoxLayout.LINE_AXIS));

        label_playlist_title.setFont(new java.awt.Font("Yu Gothic Light", 0, 22)); // NOI18N
        label_playlist_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_playlist_title.setText("You new playlist");
        label_playlist_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_playlist_title.setMaximumSize(new java.awt.Dimension(470, 40));
        label_playlist_title.setMinimumSize(new java.awt.Dimension(470, 40));
        label_playlist_title.setPreferredSize(new java.awt.Dimension(470, 40));
        panel_title.add(label_playlist_title);

        panel_edit.setMaximumSize(new java.awt.Dimension(40, 40));
        panel_edit.setMinimumSize(new java.awt.Dimension(40, 40));
        panel_edit.setPreferredSize(new java.awt.Dimension(40, 40));
        panel_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_editMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panel_editMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout panel_editLayout = new javax.swing.GroupLayout(panel_edit);
        panel_edit.setLayout(panel_editLayout);
        panel_editLayout.setHorizontalGroup(
            panel_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        panel_editLayout.setVerticalGroup(
            panel_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panel_title.add(panel_edit);

        add(panel_title);

        panel_content.setMaximumSize(new java.awt.Dimension(530, 290));
        panel_content.setMinimumSize(new java.awt.Dimension(530, 290));
        panel_content.setPreferredSize(new java.awt.Dimension(530, 290));
        panel_content.setLayout(new javax.swing.BoxLayout(panel_content, javax.swing.BoxLayout.Y_AXIS));

        scrollpanel_musics.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel_musics.setLayout(new javax.swing.BoxLayout(panel_musics, javax.swing.BoxLayout.Y_AXIS));
        scrollpanel_musics.setViewportView(panel_musics);

        panel_content.add(scrollpanel_musics);

        panel_buttons.setMaximumSize(new java.awt.Dimension(150, 40));
        panel_buttons.setMinimumSize(new java.awt.Dimension(150, 40));
        panel_buttons.setPreferredSize(new java.awt.Dimension(150, 40));
        panel_buttons.setLayout(new javax.swing.BoxLayout(panel_buttons, javax.swing.BoxLayout.X_AXIS));

        button_create.setText("Create");
        button_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_createActionPerformed(evt);
            }
        });
        panel_buttons.add(button_create);

        button_add_music.setText("Add Music");
        button_add_music.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_add_musicActionPerformed(evt);
            }
        });
        panel_buttons.add(button_add_music);

        panel_content.add(panel_buttons);

        add(panel_content);
    }// </editor-fold>//GEN-END:initComponents

    private void button_add_musicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_add_musicActionPerformed
        String complete_path = DataFiles.selectMusicFromDisk();
        if(complete_path != null)
        {
            Path path = Paths.get(complete_path);
            String music_name = path.getFileName().toString();
            FrameNewPLElement frame = new FrameNewPLElement(this, music_name);
            panel_musics.add(frame);
            panel_musics.invalidate();
            panel_musics.repaint();
            panel_musics.setVisible(false);
            panel_musics.setVisible(true);
            new_playlist.put(frame, complete_path);
        }
    }//GEN-LAST:event_button_add_musicActionPerformed

    private void button_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_createActionPerformed
        Playlist playlist = new Playlist(playlist_name);
        new_playlist.forEach((k,v) -> playlist.add(v));
        
        frameControls.addPlaylist(playlist);
        mainWindow.setViewer(Basic.framePlaylists);
    }//GEN-LAST:event_button_createActionPerformed

    private void panel_editMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_editMousePressed
        panel_edit.add(new PicPanel("src/main/resources/images/083__setting_edit.png",
                167, 167, 40, 40, new Color(0,153,153)));
        panel_edit.invalidate();
        panel_edit.repaint();
    }//GEN-LAST:event_panel_editMousePressed

    private void panel_editMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_editMouseReleased
        panel_edit.add(new PicPanel("src/main/resources/images/083__setting_edit.png",
                167, 167, 40, 40, panel_edit.getParent().getBackground()));
        panel_edit.invalidate();
        panel_edit.repaint();
        //
        String s = (String)JOptionPane.showInputDialog(
            this,
            "Insert a new name for the playlist:\n",
            "Set playlist name",
            JOptionPane.PLAIN_MESSAGE,
            null,
            null,
            playlist_name);

        if (s == null || s.length()  < 1)
        {
            return;
        }
        playlist_name = s;
        label_playlist_title.setText(playlist_name);
        label_playlist_title.invalidate();
        label_playlist_title.repaint();
    }//GEN-LAST:event_panel_editMouseReleased
    
    public void removeFromList(javax.swing.JPanel panel)
    {
        new_playlist.remove((FrameNewPLElement)panel);
        panel_musics.remove((FrameNewPLElement)panel);
        panel_musics.invalidate();
        panel_musics.repaint();
        panel_musics.setVisible(false);
        panel_musics.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_add_music;
    private javax.swing.JButton button_create;
    private javax.swing.JLabel label_playlist_title;
    private javax.swing.JPanel panel_buttons;
    private javax.swing.JPanel panel_content;
    private javax.swing.JPanel panel_edit;
    private javax.swing.JPanel panel_musics;
    private javax.swing.JPanel panel_title;
    private javax.swing.JScrollPane scrollpanel_musics;
    // End of variables declaration//GEN-END:variables
}
