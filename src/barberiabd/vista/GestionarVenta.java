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
import javax.swing.WindowConstants;

/**
 *
 * @author Andrea Calderon
 */
public class GestionarVenta extends javax.swing.JFrame {

    
    static int codventa,codcliente,codbarbero,costo;
    int id_ingresado = InformeVentas.ventaIngresado;
    
    public GestionarVenta() {
        initComponents();
        setResizable(false);
        setSize(337, 280);
        setTitle("Informe de venta");
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.decode("#dbdccd"));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select id,idCliente,idBarbero,costo from venta where id ='" + id_ingresado + "'");
            ResultSet rs = pst.executeQuery(); //Nos permite recoger lo que tomamos luego de leer la base de datos
            if (rs.next()) {
                codventa = rs.getInt("id");
                codcliente = rs.getInt("idCliente");
                codbarbero = rs.getInt("idBarbero");
                costo = rs.getInt("costo");
                
                codVenta_lbl.setText(Integer.toString(codventa));
                codCliente_lbl.setText(Integer.toString(codcliente));
                codBarbero_lbl.setText(Integer.toString(codbarbero));
                costo_lbl.setText(Integer.toString(costo));
                
                
            }
        } catch (SQLException e) {
            System.err.println("Error en conexión desde la interfaz administrador");
        }
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        regresar_btn = new javax.swing.JButton();
        codVenta_lbl = new javax.swing.JLabel();
        codCliente_lbl = new javax.swing.JLabel();
        codBarbero_lbl = new javax.swing.JLabel();
        costo_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Codigo venta:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel2.setText("Codigo cliente:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel3.setText("Costo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel4.setText("Codigo barbero:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vector.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 80, 70));

        regresar_btn.setText("Regresar");
        regresar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresar_btnActionPerformed(evt);
            }
        });
        getContentPane().add(regresar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));
        getContentPane().add(codVenta_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 80, 20));
        getContentPane().add(codCliente_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 80, 20));
        getContentPane().add(codBarbero_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 80, 20));
        getContentPane().add(costo_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 80, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresar_btnActionPerformed
      this.dispose();
      InformeVentas infoventa = new InformeVentas();
      infoventa.setVisible(true);
    }//GEN-LAST:event_regresar_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel codBarbero_lbl;
    private javax.swing.JLabel codCliente_lbl;
    private javax.swing.JLabel codVenta_lbl;
    private javax.swing.JLabel costo_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton regresar_btn;
    // End of variables declaration//GEN-END:variables
}
