/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberiabd.vista;

import barberiabd.controlador.Conexion;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Andrea Calderon
 */
public class CrearCliente extends javax.swing.JFrame {

    static String nombre;
    static String direccion;
    static int id;
    static String telefono;
    static String contraseña;
    static String tipo_String;
    static int maquinaAsignada;
    static int porcentajeComision;

    public CrearCliente() {
        initComponents();
        setResizable(false);
        setSize(400, 300);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombre_tf = new javax.swing.JTextField();
        id_tf = new javax.swing.JTextField();
        dir_tf = new javax.swing.JTextField();
        tel_tf = new javax.swing.JTextField();
        crear_btn = new javax.swing.JButton();
        salir_btn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel1.setText("Ingrese su nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese su identificación:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel3.setText("Ingrese su dirección:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel4.setText("Ingrese su telefono:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        nombre_tf.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        getContentPane().add(nombre_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 120, 20));

        id_tf.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        getContentPane().add(id_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 120, 20));

        dir_tf.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        getContentPane().add(dir_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 120, 20));

        tel_tf.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        getContentPane().add(tel_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 120, 20));

        crear_btn.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        crear_btn.setText("Crear");
        crear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear_btnActionPerformed(evt);
            }
        });
        getContentPane().add(crear_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        salir_btn.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        salir_btn.setText("Salir");
        salir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir_btnActionPerformed(evt);
            }
        });
        getContentPane().add(salir_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vector.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 80, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_btnActionPerformed
        int validacion = 0;
        nombre = nombre_tf.getText().trim();
        direccion = dir_tf.getText().trim();
        id = Integer.parseInt(id_tf.getText().trim());
        telefono = tel_tf.getText().trim();

        if (nombre.equals("")) {
            nombre_tf.setBackground(Color.red);
            validacion++;
        }
        if ((Integer.toString(id)).equals("")) {
            id_tf.setBackground(Color.red);
            validacion++;
        }

        if (validacion == 0) {
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "select id from cliente where id = '" + id + "'");
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    id_tf.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Identificacion ya existente");
                    cn.close();
                } else {
                    cn.close();
                    if (validacion == 0) {
                        if(direccion.equals("")){
                            direccion = null;
                        }
                        if(telefono.equals("")){
                            telefono = null;
                        }
                            
                        try {
                            Connection cn2 = Conexion.conectar();
                            PreparedStatement pst2 = cn2.prepareStatement(
                                    "insert into cliente values (?,?,?,?)"); //Se agregan los datos a la base de datos

                            pst2.setInt(1, id);
                            pst2.setString(2, nombre);
                            pst2.setString(3, direccion);
                            pst2.setString(4, telefono);

                            pst2.executeUpdate();
                            cn2.close();

                            Limpiar();

                            nombre_tf.setBackground(Color.green);
                            id_tf.setBackground(Color.green);
                            dir_tf.setBackground(Color.green);
                            tel_tf.setBackground(Color.green);

                            JOptionPane.showMessageDialog(null, "Registro exitoso");
                            this.dispose();

                        } catch (SQLException e) {
                            System.err.println("Error en registrar cliente" + e);
                            JOptionPane.showMessageDialog(null, "Error al registrar, contacte al desarrollador.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe llenar todos los campos obligatorios.");
                    }
                }
            } catch (SQLException e) {
                System.err.println("Error en validar id del cliente." + e);
                JOptionPane.showMessageDialog(null, "Error al comparar cliente");
            }
        }
    }//GEN-LAST:event_crear_btnActionPerformed

    private void salir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir_btnActionPerformed
     dispose();
     Administrador regreso = new Administrador();
     regreso.setVisible(true);
    }//GEN-LAST:event_salir_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crear_btn;
    private javax.swing.JTextField dir_tf;
    private javax.swing.JTextField id_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nombre_tf;
    private javax.swing.JButton salir_btn;
    private javax.swing.JTextField tel_tf;
    // End of variables declaration//GEN-END:variables

    public void Limpiar() {
        nombre_tf.setText("");
        id_tf.setText("");
        dir_tf.setText("");
        tel_tf.setText("");
    }
}
