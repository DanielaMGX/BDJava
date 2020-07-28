/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberiabd.vista;

import barberiabd.modelo.Administrator;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Andrea Calderon
 */
public class Administrador extends javax.swing.JFrame {

    int id_ingresado;
    
    public Administrador() {
        initComponents();
        setSize(401, 470);
        setResizable(false);
        setTitle("Administrador");
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.decode("#dbdccd"));
        id_ingresado = IngresarAdministrador.idLogin;
        nombre_lbl.setText(Administrator.findAdmin(Integer.toString(id_ingresado)));
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

        crearMiembro_btn = new javax.swing.JButton();
        salir_btn = new javax.swing.JButton();
        Barberos_btn = new javax.swing.JButton();
        Ventas_btn = new javax.swing.JButton();
        AgregarCorte_btn = new javax.swing.JButton();
        AgregarProd_btn = new javax.swing.JButton();
        Productos_btn = new javax.swing.JButton();
        clientes_btn = new javax.swing.JButton();
        AgregarCliente_btn = new javax.swing.JButton();
        cortes_btn = new javax.swing.JButton();
        Admin_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre_lbl = new javax.swing.JLabel();
        agregarVenta_btn = new javax.swing.JButton();
        AgregarInven_btn = new javax.swing.JButton();
        inventario_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crearMiembro_btn.setText("Agregar miembro");
        crearMiembro_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearMiembro_btnActionPerformed(evt);
            }
        });
        getContentPane().add(crearMiembro_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 150, -1));

        salir_btn.setText("Salir");
        salir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir_btnActionPerformed(evt);
            }
        });
        getContentPane().add(salir_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 60, -1));

        Barberos_btn.setText("Barberos");
        Barberos_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Barberos_btnActionPerformed(evt);
            }
        });
        getContentPane().add(Barberos_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 120, -1));

        Ventas_btn.setText("Ventas");
        Ventas_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ventas_btnActionPerformed(evt);
            }
        });
        getContentPane().add(Ventas_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 120, 20));

        AgregarCorte_btn.setText("Agregar corte");
        AgregarCorte_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarCorte_btnActionPerformed(evt);
            }
        });
        getContentPane().add(AgregarCorte_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 150, -1));

        AgregarProd_btn.setText("Agregar producto");
        AgregarProd_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarProd_btnActionPerformed(evt);
            }
        });
        getContentPane().add(AgregarProd_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 150, -1));

        Productos_btn.setText("Producto");
        Productos_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Productos_btnActionPerformed(evt);
            }
        });
        getContentPane().add(Productos_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 120, -1));

        clientes_btn.setText("Clientes");
        clientes_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientes_btnActionPerformed(evt);
            }
        });
        getContentPane().add(clientes_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 120, -1));

        AgregarCliente_btn.setText("Agregar cliente");
        AgregarCliente_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarCliente_btnActionPerformed(evt);
            }
        });
        getContentPane().add(AgregarCliente_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 150, -1));

        cortes_btn.setText("Cortes");
        cortes_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cortes_btnActionPerformed(evt);
            }
        });
        getContentPane().add(cortes_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 120, -1));

        Admin_btn.setText("Administradores");
        Admin_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_btnActionPerformed(evt);
            }
        });
        getContentPane().add(Admin_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 150, -1));

        jLabel1.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel1.setText("Bienvenido");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vector.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, 70));

        nombre_lbl.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        getContentPane().add(nombre_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 150, 20));

        agregarVenta_btn.setText("Agregar venta");
        agregarVenta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarVenta_btnActionPerformed(evt);
            }
        });
        getContentPane().add(agregarVenta_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 150, 20));

        AgregarInven_btn.setText("Agregar a inventario");
        AgregarInven_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarInven_btnActionPerformed(evt);
            }
        });
        getContentPane().add(AgregarInven_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 150, -1));

        inventario_btn.setText("Inventario");
        inventario_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventario_btnActionPerformed(evt);
            }
        });
        getContentPane().add(inventario_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearMiembro_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearMiembro_btnActionPerformed
      dispose();
      CrearMiembro miembro = new CrearMiembro();
      miembro.setVisible(true);
    }//GEN-LAST:event_crearMiembro_btnActionPerformed

    private void AgregarCliente_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarCliente_btnActionPerformed
     dispose();
     CrearCliente cliente = new CrearCliente();
     cliente.setVisible(true);
    }//GEN-LAST:event_AgregarCliente_btnActionPerformed

    private void Admin_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_btnActionPerformed
     dispose();
     InformeAdministrador infoAdmin = new InformeAdministrador();
     infoAdmin.setVisible(true);
    }//GEN-LAST:event_Admin_btnActionPerformed

    private void Ventas_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ventas_btnActionPerformed
     dispose();
     InformeVentas infoVentas = new InformeVentas();
     infoVentas.setVisible(true);
    }//GEN-LAST:event_Ventas_btnActionPerformed

    private void Barberos_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Barberos_btnActionPerformed
     dispose();
     InformeBarberos infoBarberos = new InformeBarberos();
     infoBarberos.setVisible(true);
    }//GEN-LAST:event_Barberos_btnActionPerformed

    private void Productos_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Productos_btnActionPerformed
     dispose();
     InformeProducto infoProducto = new InformeProducto();
     infoProducto.setVisible(true);
    }//GEN-LAST:event_Productos_btnActionPerformed

    private void clientes_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientes_btnActionPerformed
     dispose();
     InformeClientes infoClientes = new InformeClientes();
     infoClientes.setVisible(true);
    }//GEN-LAST:event_clientes_btnActionPerformed

    private void cortes_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cortes_btnActionPerformed
     dispose();
     InformeCortes infoCortes = new InformeCortes();
     infoCortes.setVisible(true);
    }//GEN-LAST:event_cortes_btnActionPerformed

    private void salir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir_btnActionPerformed
     dispose();
     Principal regresar = new Principal();
     regresar.setVisible(true);
    }//GEN-LAST:event_salir_btnActionPerformed

    private void AgregarProd_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarProd_btnActionPerformed
     dispose();
     CrearProducto crear_Producto = new CrearProducto();
     crear_Producto.setVisible(true);
    }//GEN-LAST:event_AgregarProd_btnActionPerformed

    private void AgregarCorte_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarCorte_btnActionPerformed
     dispose();
     CrearCorte crear_Corte = new CrearCorte();
     crear_Corte.setVisible(true);
    }//GEN-LAST:event_AgregarCorte_btnActionPerformed

    private void agregarVenta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarVenta_btnActionPerformed
     dispose();
     CrearVenta crear_Venta = new CrearVenta();
     crear_Venta.setVisible(true);
    }//GEN-LAST:event_agregarVenta_btnActionPerformed

    private void AgregarInven_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarInven_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarInven_btnActionPerformed

    private void inventario_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventario_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inventario_btnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin_btn;
    private javax.swing.JButton AgregarCliente_btn;
    private javax.swing.JButton AgregarCorte_btn;
    private javax.swing.JButton AgregarInven_btn;
    private javax.swing.JButton AgregarProd_btn;
    private javax.swing.JButton Barberos_btn;
    private javax.swing.JButton Productos_btn;
    private javax.swing.JButton Ventas_btn;
    private javax.swing.JButton agregarVenta_btn;
    private javax.swing.JButton clientes_btn;
    private javax.swing.JButton cortes_btn;
    private javax.swing.JButton crearMiembro_btn;
    private javax.swing.JButton inventario_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nombre_lbl;
    private javax.swing.JButton salir_btn;
    // End of variables declaration//GEN-END:variables
}
