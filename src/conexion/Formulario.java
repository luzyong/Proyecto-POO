/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
import conexion.conexion;
import java.sql.*;

/**
 *
 * @author luanb
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    public Formulario() {
        initComponents();
        this.setTitle("Registro de Alumnos");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_nb = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_ap = new javax.swing.JTextField();
        txt_am = new javax.swing.JTextField();
        btn_insertar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_consultar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        lbl_error = new javax.swing.JLabel();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Numero de boleta:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel3.setText("Apellido Paterno:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel4.setText("Apellido Materno:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));
        getContentPane().add(txt_nb, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 180, 30));

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 180, 30));
        getContentPane().add(txt_ap, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 180, 30));
        getContentPane().add(txt_am, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 180, 30));

        btn_insertar.setText("Registrar");
        btn_insertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_insertarMouseClicked(evt);
            }
        });
        btn_insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        btn_eliminar.setText("Eliminar Datos");
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseClicked(evt);
            }
        });
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        btn_consultar.setText("Consultar Datos");
        btn_consultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_consultarMouseClicked(evt);
            }
        });
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tekton Pro Cond", 0, 24)); // NOI18N
        jLabel5.setText("REGISTRO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 100, -1));

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, -1));
        getContentPane().add(lbl_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 260, 30));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conexion/imagenes/8911ff72f741ec73f6606d164e553491.jpg"))); // NOI18N
        lbl_fondo.setText("Salir");
        getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_insertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_insertarMouseClicked


    }//GEN-LAST:event_btn_insertarMouseClicked

    private void btn_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseClicked
     Eliminar eliminar =  new Eliminar();
     eliminar.setVisible(true);
    }//GEN-LAST:event_btn_eliminarMouseClicked

    private void btn_consultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_consultarMouseClicked
     Consultar consultar = new Consultar();
     consultar.setVisible(true);
    }//GEN-LAST:event_btn_consultarMouseClicked

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
      
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void btn_insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertarActionPerformed
        String nombre,ap,am,boleta;
        
        nombre = txt_nombre.getText();
        ap = txt_ap.getText();
        am = txt_am.getText();
        boleta = txt_nb.getText();
        try {
        conexion conec = new conexion();
        Connection con = conec.conexion();
        String consultar ="SELECT * FROM registro WHERE noboleta=?";
        PreparedStatement consu = con.prepareStatement(consultar);
        consu.setString(1, boleta);
        ResultSet rs = consu.executeQuery();
        System.out.println(rs);
        
        
        if(rs.next()){
            
            lbl_error.setText("El usuario ya existe");
            txt_nombre.setText("");
            txt_ap.setText("");
            txt_am.setText("");
            txt_nb.setText(""); 
            System.out.println("Los valores han sido recolectados"); 
            }
       
       else{
        String insertar ="INSERT INTO registro (Nombre,Apellidop,Apellidom,noboleta) VALUES(?,?,?,?)";
        PreparedStatement inser = con.prepareStatement(insertar);
         inser.setString(1, nombre);
         inser.setString(2, ap);
         inser.setString(3, am);
         inser.setString(4, boleta);
         inser.executeUpdate();
         lbl_error.setText("");
         txt_nombre.setText("");
         txt_ap.setText("");
         txt_am.setText("");
         txt_nb.setText("");
        System.out.println("Los valores han sido agregados a la base de datos ");
        }
        }
        catch(SQLException e){
           System.out.println(e.getMessage());
    }//GEN-LAST:event_btn_insertarActionPerformed
    /*Insertar inserta = new Insertar();
    inserta.setVisible(true);*/
    }
    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
     /*String nombre,ap,am,nb;
        
        
        try {
        conexion conec = new conexion();
        Connection con = conec.conexion();
        String consultar ="SELECT * FROM registro";
        Statement consu = con.createStatement();
        ResultSet rs = consu.executeQuery(consultar);
        while(rs.next()){
            nombre=rs.getString(1);
            ap=rs.getString(2);
            am=rs.getString(3);
            nb=rs.getString(4);
            
            txt_nombre.setText(nombre);
            txt_ap.setText(ap);
            txt_am.setText(am);
            txt_nb.setText(nb);
            
            System.out.println(nombre);
        }
         
         
        System.out.println("Los valores han sido recolectados");
        }
        catch(SQLException e){
           System.out.println(e.getMessage());
    }
        */Consultar consulta = new Consultar();
        consulta.setVisible(true);
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarActionPerformed
      
        
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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_insertar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JLabel lbl_error;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JTextField txt_am;
    private javax.swing.JTextField txt_ap;
    private javax.swing.JTextField txt_nb;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
