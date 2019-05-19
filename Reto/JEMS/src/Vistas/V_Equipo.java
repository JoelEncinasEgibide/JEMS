/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import UML.Dueño;
import UML.Equipo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import jems.JEMS;

/**
 *
 * @author Miguel Barros
 * @author Eric Muñoz
 *
 * @version %I%, %G%
 * @since 1.0
 */
public class V_Equipo extends javax.swing.JFrame {

    private String dueño;
    private static String ope;
    private static Equipo equipo;
    private static ArrayList<Dueño> dueños;

    /**
     * Creates new form V_Equipo
     */
    public V_Equipo() {
        initComponents();
    }

    /**
     * Creacion de la ventana equipo dependiendo de la operacion.
     *
     * @param operacion (requerido) tipo de operacion
     * @throws Exception hereda excepciones
     */
    public V_Equipo(String operacion) throws Exception {
        initComponents();
        ope = operacion;
        dueños = JEMS.getListaDueños();
        for (int i = 0; i < dueños.size(); i++) {
            cbDueño.insertItemAt(dueños.get(i).getNombre(), i);
        }
        switch (ope) {
            case "modificar":
                tfCodigoEquipo.setVisible(true);
                tfNombre.setEditable(false);
                tfPuntuacion.setEditable(false);
                tfNacionalidad.setEditable(false);
                tfPresupuesto.setEditable(false);
                cbDueño.setEnabled(false);
                bAceptar.setEnabled(false);
                break;
            case "baja":
                tfCodigoEquipo.setVisible(true);
                tfNombre.setEditable(false);
                tfNacionalidad.setEditable(false);
                tfPresupuesto.setEditable(false);
                cbDueño.setEnabled(false);
                bAceptar.setEnabled(false);
                break;
            case "alta":
                tfCodigoEquipo.setVisible(false);
                bAceptar.setEnabled(false);
                break;
            case "consulta":
                tfCodigoEquipo.setVisible(true);
                tfNombre.setEditable(false);
                tfPuntuacion.setEditable(false);
                tfNacionalidad.setEditable(false);
                tfPresupuesto.setEditable(false);
                cbDueño.setEnabled(false);
                bAceptar.setEnabled(false);
                break;
        }
    }

    public boolean validarDatos() {
        if (validarNombre(tfNombre.getText()) && validarPuntuacion(tfPuntuacion.getText()) && validarNacionalidad(tfNacionalidad.getText()) && validarPresupuesto(tfPresupuesto.getText()) && validarDueño(cbDueño.getSelectedIndex())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarNombre(String nombre) {
        return true;
    }

    public boolean validarPuntuacion(String puntuacion) {
        return true;
    }

    public boolean validarNacionalidad(String nacionalidad) {
        return true;
    }

    public boolean validarPresupuesto(String presupuesto) {
        return true;
    }

    public boolean validarDueño(int posicion) {
        if (posicion == -1) {
            return false;
        } else {
            return true;
        }
    }

    public String buscarDueño(int codigoEquipo) throws Exception {
        dueño = JEMS.buscarDueño(codigoEquipo);
        return dueño;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bAceptar = new javax.swing.JButton();
        bVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfCodigoEquipo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfPuntuacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfNacionalidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfPresupuesto = new javax.swing.JTextField();
        cbDueño = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        bVolver.setText("Volver");
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo Equipo: ");

        tfCodigoEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoEquipoActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Puntuacion: ");

        jLabel4.setText("Nacionalidad: ");

        jLabel5.setText("Presupuesto: ");

        cbDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDueñoActionPerformed(evt);
            }
        });

        jLabel6.setText("Dueño");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bAceptar)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(bVolver))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbDueño, 0, 77, Short.MAX_VALUE)
                                    .addComponent(tfNacionalidad)
                                    .addComponent(tfPuntuacion)
                                    .addComponent(tfNombre)
                                    .addComponent(tfCodigoEquipo)
                                    .addComponent(tfPresupuesto))))))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bVolver)
                    .addComponent(bAceptar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Funcion para saber que opcion escojer dependiendo de la operacion al
     * pulsar aceptar.
     *
     * @param evt pulsar el boton
     */
    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        try {
            if (validarDatos()) {
                if (ope.compareToIgnoreCase("modificar") != 0) {
                    JEMS.modificarEquipo(tfNombre.getText(), tfNacionalidad.getText(), Integer.parseInt(tfPresupuesto.getText()), Integer.parseInt(tfPuntuacion.getText()), dueños.get(cbDueño.getSelectedIndex()).getCod_dueño());
                } else if (ope.compareToIgnoreCase("alta") != 0) {
                    JEMS.altaEquipo(tfNombre.getText(), tfNacionalidad.getText(), Integer.parseInt(tfPresupuesto.getText()), Integer.parseInt(tfPuntuacion.getText()), dueños.get(cbDueño.getSelectedIndex()).getCod_dueño());
                } else if (ope.compareToIgnoreCase("baja") != 0) {
                    JEMS.bajaEquipo(Integer.parseInt(tfCodigoEquipo.getText()));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getClass());
        }
    }//GEN-LAST:event_bAceptarActionPerformed

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        ControladorVistas.cerrarVentanaEquipo();
    }//GEN-LAST:event_bVolverActionPerformed
    /**
     * Funcion para saber que pasa y con que operacion al pulsar enter en
     * codigo_equipo.
     *
     * @param evt pulsar enter
     */
    private void tfCodigoEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoEquipoActionPerformed
        try {
            dueño = buscarDueño(equipo.getCod_equipo());
            switch (ope) {
                case "modificar":
                    tfNombre.setEditable(false);
                    tfPuntuacion.setEditable(true);
                    tfNacionalidad.setEditable(true);
                    tfPresupuesto.setEditable(true);
                    cbDueño.setEnabled(true);
                    bAceptar.setEnabled(true);
                    tfCodigoEquipo.setEditable(false);
                    tfCodigoEquipo.setText(String.valueOf(equipo.getCod_equipo()));
                    tfNombre.setText(equipo.getNombre());
                    tfPuntuacion.setText(String.valueOf(equipo.getPuntuacion()));
                    tfNacionalidad.setText(equipo.getNacionalidad());
                    tfPresupuesto.setText(String.valueOf(equipo.getPresupuesto()));
                    cbDueño.setSelectedItem(dueño);
                    break;
                case "baja":
                    tfNombre.setEditable(false);
                    tfPuntuacion.setEditable(false);
                    tfNacionalidad.setEditable(false);
                    tfPresupuesto.setEditable(false);
                    cbDueño.setEnabled(false);
                    bAceptar.setEnabled(true);
                    tfCodigoEquipo.setEditable(false);
                    tfCodigoEquipo.setText(String.valueOf(equipo.getCod_equipo()));
                    tfNombre.setText(equipo.getNombre());
                    tfPuntuacion.setText(String.valueOf(equipo.getPuntuacion()));
                    tfNacionalidad.setText(equipo.getNacionalidad());
                    tfPresupuesto.setText(String.valueOf(equipo.getPresupuesto()));
                    cbDueño.setSelectedItem(dueño);
                    break;
                case "consulta":
                    tfCodigoEquipo.setText(String.valueOf(equipo.getCod_equipo()));
                    tfNombre.setText(equipo.getNombre());
                    tfPuntuacion.setText(String.valueOf(equipo.getPuntuacion()));
                    tfNacionalidad.setText(equipo.getNacionalidad());
                    tfPresupuesto.setText(String.valueOf(equipo.getPresupuesto()));
                    cbDueño.setSelectedItem(dueño);
                    break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getClass());
        }

    }//GEN-LAST:event_tfCodigoEquipoActionPerformed

    private void cbDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDueñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDueñoActionPerformed

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
            java.util.logging.Logger.getLogger(V_Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Equipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bVolver;
    private javax.swing.JComboBox<String> cbDueño;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField tfCodigoEquipo;
    private javax.swing.JTextField tfNacionalidad;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfPresupuesto;
    private javax.swing.JTextField tfPuntuacion;
    // End of variables declaration//GEN-END:variables
}
