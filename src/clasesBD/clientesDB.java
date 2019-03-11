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
import java.sql.ResultSet;
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
        
       /*public static boolean actualizar(clientes obj) throws SQLException {
        Connection cnn = conectar.getConexion();
        PreparedStatement ps = null;
        
        String sql;
        sql = "UPDATE clientes SET idUsuario=?, usuario=?,clave=? WHERE udUsuario="+ obj.getIdUsuarios();
        //JOptionPane.showMessageDialog(null,"bb"+per.getCli_codigo(), "Actualizar Registro",JOptionPane.INFORMATION_MESSAGE);
        ps = cnn.prepareStatement(sql);
        ps.setString(1,obj.getNombres());
        ps.setString(2,obj.getApellidos());
        ps.setString(3,obj.getUsuario());
        ps.setString(4,obj.getUsuario());
        ps.setString(5,obj.getUsuario());
        //ps.setString(11,per.getCli_tipo());

            
        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null,"Actualización Exitosa", "Actualizar Registro",JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(null,"No se pudo Actualizar el Registro", "Actualizar Registro",JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }*/
    public static String consultarIdCliente(String cod) {
        
        Connection cnn = conectar.getConexion();
        PreparedStatement ps = null;
        ResultSet res;
        String sql;
        sql = "SELECT idCliente, nombres FROM clientes WHERE cedula = '" + cod+ "'";
        try{
            ps = cnn.prepareStatement(sql);
            res = ps.executeQuery();
            while(res.next()){
                String idcli = res.getString("idCliente");
                String nombcli=res.getString("nombres");
                if ( idcli != null ){
                    return idcli+nombcli;
                } 
            }
            res.close();            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;        
    }
    
}
