/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberiabd.vista;

import barberiabd.controlador.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author Andrea Calderon
 */
public class CrearProducto extends javax.swing.JFrame {

    static int idProducto;
    static String nombreProducto;
    static boolean ocurreError;

    public CrearProducto() {
        initComponents();
        setResizable(false);
        setSize(425, 440);
        setTitle("Registrar nuevo miembro");
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.decode("#dbdccd"));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        crear_btn = new javax.swing.JButton();
        salir_btn = new javax.swing.JButton();
        nombreProducto_TF = new javax.swing.JTextField();
        idProducto_TF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 420));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vector.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 80, 70));

        jLabel1.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel1.setText("Ingrese el id del producto:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel4.setText("Ingrese el nombre del producto:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        crear_btn.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        crear_btn.setText("Crear Producto");
        crear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear_btnActionPerformed(evt);
            }
        });
        getContentPane().add(crear_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        salir_btn.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        salir_btn.setText("Salir");
        salir_btn.setMaximumSize(new java.awt.Dimension(105, 27));
        salir_btn.setMinimumSize(new java.awt.Dimension(105, 27));
        salir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir_btnActionPerformed(evt);
            }
        });
        getContentPane().add(salir_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 80, -1));
        getContentPane().add(nombreProducto_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 110, -1));

        idProducto_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idProducto_TFActionPerformed(evt);
            }
        });
        getContentPane().add(idProducto_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir_btnActionPerformed
        dispose();
        Administrador retorno = new Administrador();
        retorno.setVisible(true);
    }//GEN-LAST:event_salir_btnActionPerformed

    private void crear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_btnActionPerformed
        ocurreError = false;
        if (estaVacio(idProducto_TF) || noEsNumero(idProducto_TF.getText())) {
            mensajeError("Ingrese el id del producto, recuerde que debe ser un número");
            ocurreError = true;
        } else {
            idProducto = Integer.parseInt(idProducto_TF.getText());
            if (encuentraId("producto", "codigo", idProducto)) {
                mensajeError("El producto ya existe");
                ocurreError = true;
            }
        }
        if (estaVacio(nombreProducto_TF)) {
            mensajeError("Ingrese el nombre del producto");
            ocurreError = true;
        } else {
            nombreProducto = nombreProducto_TF.getText();
        }

        if (!ocurreError) {
            try {
                Connection cn2 = Conexion.conectar();
                PreparedStatement pst2 = cn2.prepareStatement(
                        "insert into producto values (?,?)"); //Se agregan los datos a la base de datos

                pst2.setInt(1, idProducto);
                pst2.setString(2, nombreProducto);

                pst2.executeUpdate();
                cn2.close();

                JOptionPane.showMessageDialog(null, "Registro exitoso");
                this.dispose();

            } catch (SQLException e) {
                System.err.println("Error en registrar" + e);
                JOptionPane.showMessageDialog(null, "Error al registrar, recuerde que el nombre debe tener menos de 20 caracteres.");
            }

        }


    }//GEN-LAST:event_crear_btnActionPerformed

    private void idProducto_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idProducto_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idProducto_TFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crear_btn;
    private javax.swing.JTextField idProducto_TF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nombreProducto_TF;
    private javax.swing.JButton salir_btn;
    // End of variables declaration//GEN-END:variables

    public void Limpiar() {

    }

    private static boolean noEsNumero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return false;
        } catch (NumberFormatException nfe) {
            return true;
        }
    }

    private static boolean estaVacio(JTextField TF) {
        if (TF.getText().length() == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void mensajeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    private static boolean encuentraId(String tabla, String nombreId, int id) {
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select " + nombreId + " from " + tabla + " where "+nombreId+" = '" + id
                    + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return true;

            } else {
                return false;
            }
        } catch (SQLException e) {
            return false;
        }
    }
}
