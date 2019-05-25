/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Color;
import java.sql.SQLException;
import jems.JEMS;

/**
 * Ventana de modificacion del usuario.
 *
 * @author Miguel Barros
 * @author Eric Muñoz
 * @author Sergio Zulueta
 * @author Joel Encinas
 *
 * @version %I%, %G%
 * @since 1.0
 */
public class V_Usuario extends javax.swing.JFrame {

    /**
     * Construcotr de usuario.
     *
     */
    public V_Usuario() {
        setUndecorated(true);
        initComponents();
        myInitComponents();
        bCerrarSesion.setVisible(true);
    }

    /**
     * Formato de la ventana.
     *
     */
    public void myInitComponents() {
        try {
            setSize(1280, 720);
            setLocationRelativeTo(null);
            if (JEMS.consultarLiga() == null) {
                setLigaOffline();
            } else {
                if (JEMS.consultarLiga().getEstado() == true) {
                    setLigaOnline();
                } else {
                    setLigaOffline();
                }
            }
        } catch (SQLException ex) {
            ControladorVistas.abrirVentanaAviso("Error: " + ex.getMessage());
        } catch (Exception e) {
            ControladorVistas.abrirVentanaAviso("Error: " + e.getMessage());
        }
    }

    /**
     * cuando se esta Ofline.
     *
     */
    public void setLigaOffline() {
        lbEstadoliga.setText("Offline");
        lbEstadoliga.setForeground(Color.RED);
        bLiga.setVisible(false);
        bJornada.setVisible(false);
    }

    /**
     * Cuando se esta Online.
     *
     */
    public void setLigaOnline() {
        lbEstadoliga.setText("Online");
        lbEstadoliga.setForeground(Color.GREEN);
        bLiga.setVisible(true);
        bJornada.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bLiga = new javax.swing.JButton();
        bJornada = new javax.swing.JButton();
        lbRiot = new javax.swing.JLabel();
        lbVersion = new javax.swing.JLabel();
        bSalir = new javax.swing.JButton();
        bCerrarSesion = new javax.swing.JButton();
        lbEstadoliga = new javax.swing.JLabel();
        lbEstadoLigaTitulo = new javax.swing.JLabel();
        lbSubtitulo = new javax.swing.JLabel();
        lbFiller = new javax.swing.JLabel();
        lbBackgroundUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        bLiga.setBackground(new java.awt.Color(252, 124, 0));
        bLiga.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        bLiga.setForeground(new java.awt.Color(255, 255, 255));
        bLiga.setText("VER CLASIFICACIÓN");
        bLiga.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bLiga.setBorderPainted(false);
        bLiga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bLiga.setFocusPainted(false);
        bLiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLigaActionPerformed(evt);
            }
        });
        getContentPane().add(bLiga);
        bLiga.setBounds(460, 340, 410, 80);

        bJornada.setBackground(new java.awt.Color(252, 124, 0));
        bJornada.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        bJornada.setForeground(new java.awt.Color(255, 255, 255));
        bJornada.setText("VER JORNADAS");
        bJornada.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bJornada.setBorderPainted(false);
        bJornada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bJornada.setFocusPainted(false);
        bJornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bJornadaActionPerformed(evt);
            }
        });
        getContentPane().add(bJornada);
        bJornada.setBounds(460, 460, 410, 70);

        lbRiot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/riotLogo.png"))); // NOI18N
        getContentPane().add(lbRiot);
        lbRiot.setBounds(10, 670, 100, 50);

        lbVersion.setFont(new java.awt.Font("Source Serif Pro Black", 3, 12)); // NOI18N
        lbVersion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVersion.setText("FINAL_BUILD_V1.0.0");
        getContentPane().add(lbVersion);
        lbVersion.setBounds(1100, 680, 180, 30);

        bSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/error.png"))); // NOI18N
        bSalir.setBorderPainted(false);
        bSalir.setContentAreaFilled(false);
        bSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bSalir.setFocusPainted(false);
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });
        getContentPane().add(bSalir);
        bSalir.setBounds(1230, 10, 40, 40);

        bCerrarSesion.setBackground(new java.awt.Color(252, 124, 0));
        bCerrarSesion.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        bCerrarSesion.setForeground(new java.awt.Color(0, 0, 0));
        bCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logout.png"))); // NOI18N
        bCerrarSesion.setText("CERRAR SESION");
        bCerrarSesion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bCerrarSesion.setBorderPainted(false);
        bCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bCerrarSesion.setFocusPainted(false);
        bCerrarSesion.setIconTextGap(20);
        bCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(bCerrarSesion);
        bCerrarSesion.setBounds(970, 13, 220, 35);

        lbEstadoliga.setFont(new java.awt.Font("Bahnschrift", 3, 24)); // NOI18N
        lbEstadoliga.setForeground(new java.awt.Color(51, 255, 51));
        lbEstadoliga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEstadoliga.setText("Online");
        lbEstadoliga.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbEstadoliga);
        lbEstadoliga.setBounds(200, 0, 100, 50);

        lbEstadoLigaTitulo.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        lbEstadoLigaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbEstadoLigaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEstadoLigaTitulo.setText("Estado de la liga");
        lbEstadoLigaTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbEstadoLigaTitulo);
        lbEstadoLigaTitulo.setBounds(10, 0, 200, 50);

        lbSubtitulo.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        lbSubtitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSubtitulo.setText("<html>BIENVENIDO A LA <br> APLICACIÓN OFICIAL <br> DE JEMS E-SPORTS");
        lbSubtitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbSubtitulo);
        lbSubtitulo.setBounds(410, 120, 520, 170);

        lbFiller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/user_background.jpg"))); // NOI18N
        getContentPane().add(lbFiller);
        lbFiller.setBounds(0, 0, 1280, 720);

        lbBackgroundUsuario.setBackground(new java.awt.Color(13, 9, 32));
        lbBackgroundUsuario.setForeground(new java.awt.Color(13, 9, 32));
        lbBackgroundUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/background_main_color.png"))); // NOI18N
        getContentPane().add(lbBackgroundUsuario);
        lbBackgroundUsuario.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Funcion que nos dirijira a la clase mostrarVentanaLiga situada en el
     * controlador de vistas.
     *
     * @param evt pulsar enter
     */
    private void bLigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLigaActionPerformed
        try {
            ControladorVistas.mostrarVentanaLiga();
        } catch (SQLException ex) {
            ControladorVistas.abrirVentanaAviso("Error: " + ex.getMessage());
        } catch (Exception e) {
            ControladorVistas.abrirVentanaAviso("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_bLigaActionPerformed
    /**
     * Funcion que nos dirijira a la clase mostrarVentanaJornadas situada en el
     * controlador de vistas.
     *
     * @param evt pulsar enter
     */
    private void bJornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bJornadaActionPerformed
        try {
            ControladorVistas.mostrarVentanaJornadas();
        } catch (SQLException ex) {
            ControladorVistas.abrirVentanaAviso("Error: " + ex.getMessage());
        } catch (Exception e) {
            ControladorVistas.abrirVentanaAviso("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_bJornadaActionPerformed

    /**
     * Funcion para salir de la ventana.
     *
     * @param evt pulsar enter
     */
    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bSalirActionPerformed

    /**
     * Cierra la sesion y vuelve al login.
     *
     * @param evt
     */
    private void bCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCerrarSesionActionPerformed
        ControladorVistas.cerrarVentanaUsuario();
        ControladorVistas.mostrarVentanaLogin();
    }//GEN-LAST:event_bCerrarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(V_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCerrarSesion;
    private javax.swing.JButton bJornada;
    private javax.swing.JButton bLiga;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel lbBackgroundUsuario;
    private javax.swing.JLabel lbEstadoLigaTitulo;
    private javax.swing.JLabel lbEstadoliga;
    private javax.swing.JLabel lbFiller;
    private javax.swing.JLabel lbRiot;
    private javax.swing.JLabel lbSubtitulo;
    private javax.swing.JLabel lbVersion;
    // End of variables declaration//GEN-END:variables
}
