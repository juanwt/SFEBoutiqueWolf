/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesBD;
import Clases.*;
import baseDatos.conectar;
import clases.clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan WT
 */
public class clientesDB {
    //Inserta un nuevo Registro
    public static void guardar(clientes per) throws SQLException {
        Connection cnn = conectar.getConexion();
        PreparedStatement ps = null;
        String sql;
        sql="INSERT INTO clientes (nombres,apellidos,direccion,telefono,cedula)VALUES (?,?,?,?,?)";
        try {
            ps=cnn.prepareStatement(sql);
            ps.setString(1,per.getNombres());
            ps.setString(2,per.getApellidos());
            ps.setString(3,per.getDireccion());
            ps.setString(4,per.getTelefono());
            ps.setString(5,per.getCedula());
 
            int n=ps.executeUpdate();
            if (n>0){
                JOptionPane.showMessageDialog(null,"Registrado con exito", "Grabar Registro",JOptionPane.INFORMATION_MESSAGE);
            }
            cnn.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"No se logro grabar el Registro..."+ex, "Grabar Registro",JOptionPane.ERROR_MESSAGE);
        }
    }
     //Inserta un nuevo Registro
//    public static void guardarCli(clientes obj) throws SQLException {
//        Connection cnn = conectar.getConexion();
//        PreparedStatement ps = null;
//        
//        String sql;
//
//        sql="INSERT INTO clientes (nombres, apellidos, direccion, telefono, cedula)VALUES (?,?,?,?,?)";
//        try {
//            ps=cnn.prepareStatement(sql);
//            ps.setString(1,obj.getNombres());
//            ps.setString(2,obj.getApellidos());
//            ps.setString(3,obj.getDireccion());
//            ps.setString(4,obj.getTelefono());
//            ps.setString(5,obj.getCedula());
//            
//            int n=ps.executeUpdate();
//            if (n>0){
//                JOptionPane.showMessageDialog(null,"Registrado con exito", "Grabar Registro",JOptionPane.INFORMATION_MESSAGE);
//            }
//            
//            cnn.close();
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null,"No se logro grabar el Registro..."+ex, "Grabar Registro",JOptionPane.ERROR_MESSAGE);
//            
//        }
//    }
    
}
