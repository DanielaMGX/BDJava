/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberiabd.vista;

import barberiabd.controlador.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Andrea Calderon
 */
public class IngresarBarbero extends javax.swing.JFrame {

    public static int idLogin;
    public static String contraseña;

    public IngresarBarbero() {
        initComponents();
        setSize(400, 250);
        setResizable(false);
        setTitle("Uncle B's");
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.decode("#dbdccd"));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/LogoP.png"));
        return retValue;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id_tf = new javax.swing.JTextField();
        pass_tf = new javax.swing.JTextField();
        Ingresar_btn = new javax.swing.JButton();
        Salir_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel1.setText("Ingrese su identificación:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese su contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        id_tf.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        getContentPane().add(id_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 140, 20));

        pass_tf.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        getContentPane().add(pass_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 140, 20));

        Ingresar_btn.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        Ingresar_btn.setText("Ingresar");
        Ingresar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingresar_btnActionPerformed(evt);
            }
        });
        getContentPane().add(Ingresar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        Salir_btn.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        Salir_btn.setText("Salir");
        Salir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir_btnActionPerformed(evt);
            }
        });
        getContentPane().add(Salir_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vector.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 80, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Ingresar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingresar_btnActionPerformed
        String id_string = id_tf.getText().trim();
        contraseña = pass_tf.getText().trim();

        if (id_string.equals("") || IngresarBarbero.isNumerico(id_string) == false) {
            JOptionPane.showMessageDialog(null, "Debe llenar una identificacion valida.");
        } else {
            idLogin = Integer.parseInt(id_tf.getText().trim());
        }

        if (!contraseña.equals("")) {
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select id, contraseña from barbero where id = '" + idLogin
                        + "' and contraseña = '" + contraseña + "'");
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    dispose();
                    Barbero barber = new Barbero();
                    barber.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Datos de acceso incorrectos");
                    id_tf.setText("");
                    pass_tf.setText("");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al iniciar sesión, contacte al administrador. ");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos.");
        }
    }//GEN-LAST:event_Ingresar_btnActionPerformed

    private void Salir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir_btnActionPerformed
        dispose();
        Principal retorno = new Principal();
        retorno.setVisible(true);
    }//GEN-LAST:event_Salir_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ingresar_btn;
    private javax.swing.JButton Salir_btn;
    private javax.swing.JTextField id_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField pass_tf;
    // End of variables declaration//GEN-END:variables

    private static boolean isNumerico(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
