/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesBD;

import baseDatos.conectar;
import clases.proveedores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan WT
 */
public class proveedoresDB {
     //Inserta un nuevo Registro
    public static void guardar(proveedores pro) throws SQLException {
        Connection cnn = conectar.getConexion();
        PreparedStatement ps = null;
        
        String sql;

        sql="INSERT INTO proveedores (nombres, apellidos, telefono, cedula, direccion)VALUES (?,?,?,?,?)";
        try {
            ps=cnn.prepareStatement(sql);
            ps.setString(1,pro.getNombres());
            ps.setString(2,pro.getApellidos());
            ps.setString(3,pro.getTelefono());
            ps.setString(4,pro.getCedula());
            ps.setString(5,pro.getDieccion());
            
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
    
}
