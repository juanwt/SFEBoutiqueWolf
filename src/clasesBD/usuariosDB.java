/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesBD;

import Formularios.JFLogin;
import baseDatos.conectar;
import clases.usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan WT
 */
public class usuariosDB {
     //Inserta un nuevo Registro
    public static void guardar(usuarios obj) throws SQLException {
        Connection cnn = conectar.getConexion();
        PreparedStatement ps = null;
        
        String sql;

        sql="INSERT INTO usuarios (nombres, apellidos, usuario, clave, tipo)VALUES (?,?,?,?,?)";
        try {
            ps=cnn.prepareStatement(sql);
            ps.setString(1,obj.getNombres());
            ps.setString(2,obj.getApellidos());
            ps.setString(3,obj.getUsuario());
            ps.setString(4,obj.getClave());
            ps.setString(5,obj.getTipo());
            
            int n=ps.executeUpdate();
            if (n>0){
                JOptionPane.showMessageDialog(null,"Registrado con exito", "Grabar Registro",JOptionPane.INFORMATION_MESSAGE);
            }
            
            cnn.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"No se logro grabar el Registro..."+ex, "Grabar Registro",JOptionPane.ERROR_MESSAGE);
            //Logger.getLogger(JIFPersonalInterno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static boolean actualizar(usuarios obj) throws SQLException {
        Connection cnn = conectar.getConexion();
        PreparedStatement ps = null;
        
        String sql;
        sql = "UPDATE usuarios SET idUsuario=?, usuario=?,clave=? WHERE udUsuario="+ obj.getIdUsuarios();
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
    }
    
    public static String consultarUsuario(String cod) {
        
        Connection cnn = conectar.getConexion();
        PreparedStatement ps = null;
        ResultSet res;
        String sql;
        //sql = "UPDATE certificacion SET cli_codigo=?, cer_c003=?, cer_valor_certificacion=?, cer_examinacion_teorica=?, cer_examinacion_practica=?, cer_certificado=?, WHERE per_numero="+ per.getCer_codigo();
        sql = "SELECT idUsuario, usuario FROM usuarios WHERE usuario = '" + cod+ "'";
        try{
            //String query1 = "SELECT escExpediente FROM KCPro WHERE escExpediente = ?";
            ps = cnn.prepareStatement(sql);
            res = ps.executeQuery();
            while(res.next()){
                String usucod = res.getString("idUsuario");
                //System.out.println("Expediente: " + exp);
                //if ( cerexa.equals('s') ){
                if ( usucod != null ){
                    //JOptionPane.showMessageDialog(null, "Expediente encontrado: " + cerexa, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    return usucod;
                } 
            }
            res.close();            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;        
    }
    
    public static boolean consultarContrasena(String cod,String contrasena) {
        
        Connection cnn = conectar.getConexion();
        PreparedStatement ps = null;
        ResultSet res;
        
        String sql;
        
        sql = "SELECT idUsuario, clave FROM usuarios WHERE idUsuario = '" + cod + "' AND clave = '" + contrasena+ "'";
        try{
            ps = cnn.prepareStatement(sql);
            res = ps.executeQuery();
            while(res.next()){
                String usucon = res.getString("clave");
                if ( usucon != null ){
                    return true;
                } 
            }
            res.close();            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
        
    }
    
}
