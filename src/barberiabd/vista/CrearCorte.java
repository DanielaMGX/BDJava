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
public class CrearCorte extends javax.swing.JFrame {

    static int idCorte;
    static String nombreCorte;
    static int precioCorte;
    static int producto1;
    static int producto2;
    static int propina;
    static int costoTotal;
    static boolean ocurreError;

    public CrearCorte() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        crear_btn = new javax.swing.JButton();
        salir_btn = new javax.swing.JButton();
        precioCorte_TF = new javax.swing.JTextField();
        producto2_TF = new javax.swing.JTextField();
        nombreCorte_TF = new javax.swing.JTextField();
        idCorte_TF = new javax.swing.JTextField();
        producto1_TF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 420));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vector.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 80, 70));

        jLabel1.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel1.setText("Ingrese el id del corte:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel3.setText("Ingrese el id del producto usado 1:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel4.setText("Ingrese el nombre del corte:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel6.setText("Ingrese el precio del corte:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel9.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel9.setText("Ingrese el id del producto usado 2 :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        crear_btn.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        crear_btn.setText("Crear Corte");
        crear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear_btnActionPerformed(evt);
            }
        });
        getContentPane().add(crear_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        salir_btn.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        salir_btn.setText("Salir");
        salir_btn.setMaximumSize(new java.awt.Dimension(105, 27));
        salir_btn.setMinimumSize(new java.awt.Dimension(105, 27));
        salir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir_btnActionPerformed(evt);
            }
        });
        getContentPane().add(salir_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 80, -1));
        getContentPane().add(precioCorte_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 110, -1));

        producto2_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                producto2_TFActionPerformed(evt);
            }
        });
        getContentPane().add(producto2_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 110, -1));
        getContentPane().add(nombreCorte_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 110, -1));

        idCorte_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCorte_TFActionPerformed(evt);
            }
        });
        getContentPane().add(idCorte_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 110, -1));
        getContentPane().add(producto1_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir_btnActionPerformed
        dispose();
        Administrador retorno = new Administrador();
        retorno.setVisible(true);
    }//GEN-LAST:event_salir_btnActionPerformed

    private void crear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_btnActionPerformed
        ocurreError = false;
        if (estaVacio(idCorte_TF) || noEsNumero(idCorte_TF.getText())) {
            mensajeError("Ingrese el id del corte, recuerde que debe ser un número");
            ocurreError = true;
        } else {
            idCorte = Integer.parseInt(idCorte_TF.getText());
            if (encuentraId("corte", "codigo", idCorte)) {
                mensajeError("El id del corte ya existe");
                ocurreError = true;
            }
        }
        if (estaVacio(nombreCorte_TF)) {
            mensajeError("Ingrese el nombre del corte");
            ocurreError = true;
        } else {
            nombreCorte = nombreCorte_TF.getText();
        }
        if (estaVacio(precioCorte_TF) || noEsNumero(precioCorte_TF.getText()) ){
            mensajeError("Ingrese el precio del corte, recuerde que debe ser un número");
            ocurreError = true;
        }
        else{
            precioCorte = Integer.parseInt(precioCorte_TF.getText());
        }

        if (estaVacio(producto1_TF) || noEsNumero(producto1_TF.getText())) {
            mensajeError("Ingrese el id del producto usado #1, recuerde que debe ser un número");
            ocurreError = true;
        }
        else {
            producto1 = Integer.parseInt(producto1_TF.getText());
            if (!encuentraId("producto", "codigo", producto1)) {
                mensajeError("El producto1 no existe");
                ocurreError = true;
            }
        }
        if (estaVacio(producto2_TF) || noEsNumero(producto2_TF.getText())) {
            mensajeError("Ingrese el ide del producto usado #2, recuerde que debe ser un número");
            ocurreError = true;
        } 
        else {
            producto2 = Integer.parseInt(producto2_TF.getText());
            if (!encuentraId("producto", "codigo", producto2)) {
                mensajeError("El producto2 no existe");
                ocurreError = true;
            }
        }
        
        if (!ocurreError){
                        try {
                Connection cn2 = Conexion.conectar();
                PreparedStatement pst2 = cn2.prepareStatement(
                        "insert into corte values (?,?,?,?,?)"); //Se agregan los datos a la base de datos

                pst2.setInt(1, precioCorte);
                pst2.setString(2, nombreCorte);
                pst2.setInt(3, idCorte);
                pst2.setInt(4, producto1);
                pst2.setInt(5, producto2);

                pst2.executeUpdate();
                cn2.close();

                JOptionPane.showMessageDialog(null, "Registro exitoso");

            } catch (SQLException e) {
                System.err.println("Error en registrar Barbero" + e);
                JOptionPane.showMessageDialog(null, "Error al registrar, contacte al desarrollador.");
            }

        }

        
    }//GEN-LAST:event_crear_btnActionPerformed

    private void producto2_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_producto2_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_producto2_TFActionPerformed

    private void idCorte_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCorte_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idCorte_TFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crear_btn;
    private javax.swing.JTextField idCorte_TF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nombreCorte_TF;
    private javax.swing.JTextField precioCorte_TF;
    private javax.swing.JTextField producto1_TF;
    private javax.swing.JTextField producto2_TF;
    private javax.swing.JButton salir_btn;
    // End of variables declaration//GEN-END:variables

    public void Limpiar() {

    }
    
    private static boolean noEsNumero(String cadena){
	try {
		Integer.parseInt(cadena);
		return false;
	} catch (NumberFormatException nfe){
		return true;
	}
    }
    
    private static boolean estaVacio(JTextField TF){
        if (TF.getText().length() == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    private static void mensajeError(String mensaje){
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