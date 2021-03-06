/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberiabd.vista;

import barberiabd.controlador.Conexion;
import barberiabd.modelo.Barber;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;
import barberiabd.vista.InformeBarberos;

/**
 *
 * @author Andrea Calderon
 */
public class GestionarBarbero extends javax.swing.JFrame {

    int id_barberoGestion = InformeBarberos.id_barbero;
    String direccion;

    public GestionarBarbero() {
        initComponents();
        setSize(400, 330);
        setResizable(false);
        setTitle("Actualizar barbero");
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.decode("#dbdccd"));
        nombre_jtf.setText(Barber.findBarber(Integer.toString(id_barberoGestion)));
        tel_jtf.setText(Integer.toString(Barber.findTel(Integer.toString(id_barberoGestion))));
        maquina_jtf.setText(Integer.toString(Barber.findMaquina(Integer.toString(id_barberoGestion))));
        porcentaje_jtf.setText(Integer.toString(Barber.findPorcentaje(Integer.toString(id_barberoGestion))));
        contraseña_jtf.setText(Integer.toString(Barber.findContraseña(Integer.toString(id_barberoGestion))));
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
        actualizar_btn = new javax.swing.JButton();
        salir_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombre_jtf = new javax.swing.JTextField();
        tel_jtf = new javax.swing.JTextField();
        maquina_jtf = new javax.swing.JTextField();
        porcentaje_jtf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        contraseña_jtf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        actualizar_btn.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        actualizar_btn.setText("Actualizar");
        actualizar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizar_btnActionPerformed(evt);
            }
        });
        getContentPane().add(actualizar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        salir_btn.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        salir_btn.setText("Salir");
        salir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir_btnActionPerformed(evt);
            }
        });
        getContentPane().add(salir_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        jLabel2.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel2.setText("Telefono");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel3.setText("Maquina asignada:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel4.setText("Porcentaje de comision:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));
        getContentPane().add(nombre_jtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 100, -1));
        getContentPane().add(tel_jtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 100, -1));
        getContentPane().add(maquina_jtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 100, -1));
        getContentPane().add(porcentaje_jtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 100, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/barber.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 70, 70));

        jLabel6.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel6.setText("Contraseña:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 130, 20));
        getContentPane().add(contraseña_jtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir_btnActionPerformed
        dispose();
        Principal regresar = new Principal();
        regresar.setVisible(true);
    }//GEN-LAST:event_salir_btnActionPerformed

    private void actualizar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizar_btnActionPerformed
        int validacion = 0, maquina_int, porcentaje_int, tel_int, contraseña_int;
        String nombre, tel, maquina, porcentaje, contraseña;

        nombre = nombre_jtf.getText().trim();
        tel = tel_jtf.getText().trim();
        maquina = maquina_jtf.getText().trim();
        porcentaje = porcentaje_jtf.getText().trim();
        contraseña = contraseña_jtf.getText().trim();

        if (nombre.equals("")) {
            nombre_jtf.setBackground(Color.red);
            validacion++;
        }
        if (tel.equals("")) {
            tel_jtf.setBackground(Color.red);
            validacion++;
        }
        if (maquina.equals("")) {
            maquina_jtf.setBackground(Color.red);
            validacion++;
        }
        if (porcentaje.equals("")) {
            porcentaje_jtf.setBackground(Color.red);
            validacion++;
        }
        if (GestionarBarbero.isNumerico(maquina) == false) {
            maquina_jtf.setBackground(Color.red);
            validacion++;
            JOptionPane.showMessageDialog(null, "Debe ser un campo numerico");
        }
        if (GestionarBarbero.isNumerico(porcentaje) == false) {
            validacion++;
            porcentaje_jtf.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "Debe ser un campo numerico");
        }
        if (GestionarBarbero.isNumerico(tel) == false) {
            tel_jtf.setBackground(Color.red);
            validacion++;
            JOptionPane.showMessageDialog(null, "Debe ser un campo numerico");
        }
        if (GestionarBarbero.isNumerico(contraseña) == false) {
            contraseña_jtf.setBackground(Color.red);
            validacion++;
            JOptionPane.showMessageDialog(null, "Debe ser un campo numerico");
        }

        if (validacion == 0) {
            tel_int = Integer.parseInt(tel_jtf.getText().trim());
            maquina_int = Integer.parseInt(maquina_jtf.getText().trim());
            porcentaje_int = Integer.parseInt(porcentaje_jtf.getText().trim());
            contraseña_int = Integer.parseInt(contraseña_jtf.getText().trim());
            try {
                Connection cn2 = Conexion.conectar();
                PreparedStatement pst2 = cn2.prepareStatement("select direccion from barbero where id = '" + id_barberoGestion + "'");
                ResultSet rs2 = pst2.executeQuery();
                if (rs2.next()) {
                    String direccion = rs2.getString("direccion");
                }
                try {
                    Connection cn = Conexion.conectar();
                    PreparedStatement pst = cn.prepareStatement("UPDATE barbero SET id = ?, nombre = ?, direccion=?,telefono=?, maquinaAsignada =?, porcentajeComision = ?, contraseña = ? where id = '" + id_barberoGestion + "'");

                    pst.setInt(1, id_barberoGestion);
                    pst.setString(2, nombre);
                    pst.setString(3, direccion);
                    pst.setInt(4, tel_int);
                    pst.setInt(5, maquina_int);
                    pst.setInt(6, porcentaje_int);
                    pst.setInt(7, contraseña_int);

                    pst.executeUpdate();
                    cn.close();
                } catch (SQLException e) {
                    System.err.print("Error en actualizar cliente" + e);
                    JOptionPane.showMessageDialog(null, "Error al actualizar cliente, contacte al desarrollador");
                }
                cn2.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al actualizar cliente, contacte al desarrollador");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
        }
        JOptionPane.showMessageDialog(null, "Barbero actualizado correctamente");
        this.dispose();
    }//GEN-LAST:event_actualizar_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar_btn;
    private javax.swing.JTextField contraseña_jtf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField maquina_jtf;
    private javax.swing.JTextField nombre_jtf;
    private javax.swing.JTextField porcentaje_jtf;
    private javax.swing.JButton salir_btn;
    private javax.swing.JTextField tel_jtf;
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
