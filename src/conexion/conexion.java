/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author luanb
 */


public class conexion {
    Connection conect = null;
    public Connection conexion()
        {
            try {
                
                Class.forName("com.mysql.jdbc.Driver");
                conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnos?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","lmyr1399");
                System.out.println("conexion establecida");
                JOptionPane.showMessageDialog(null,"Conectado");
                
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("error de conexion");
                JOptionPane.showMessageDialog(null,"Error de conexion"+e);
            }
            return conect;
        }
     
}
    

