/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberiabd.vista;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Andrea Calderon
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setSize(480,260);
        setResizable(false);
        setTitle("Uncle B's");
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.decode("#dbdccd"));

    }
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Logo.jpeg"));
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
        Ingresar_btn = new javax.swing.JButton();
        Salir_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ingresarBarbero_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(159, 179, 211));
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoP.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 50, 50));

        jLabel2.setFont(new java.awt.Font("Leelawadee", 3, 24)); // NOI18N
        jLabel2.setText("Bienvenido a Uncle B's");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 290, 40));

        Ingresar_btn.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        Ingresar_btn.setText("Ingresar administrador");
        Ingresar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingresar_btnActionPerformed(evt);
            }
        });
        getContentPane().add(Ingresar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 190, 30));

        Salir_btn.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        Salir_btn.setText("Salir");
        Salir_btn.setBorderPainted(false);
        Salir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir_btnActionPerformed(evt);
            }
        });
        getContentPane().add(Salir_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 80, 30));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel3.setText("Recuerde que para registrar ventas debe ingresar como administrador");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        ingresarBarbero_btn.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        ingresarBarbero_btn.setText("Ingresar barbero");
        ingresarBarbero_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarBarbero_btnActionPerformed(evt);
            }
        });
        getContentPane().add(ingresarBarbero_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 160, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Ingresar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingresar_btnActionPerformed
       dispose();
       IngresarAdministrador entrar = new IngresarAdministrador();
       entrar.setVisible(true);
    }//GEN-LAST:event_Ingresar_btnActionPerformed

    private void Salir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir_btnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Salir_btnActionPerformed

    private void ingresarBarbero_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarBarbero_btnActionPerformed
       dispose();
       IngresarBarbero entrarB = new IngresarBarbero();
       entrarB.setVisible(true);
    }//GEN-LAST:event_ingresarBarbero_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ingresar_btn;
    private javax.swing.JButton Salir_btn;
    private javax.swing.JButton ingresarBarbero_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
