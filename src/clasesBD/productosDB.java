/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesBD;

import baseDatos.conectar;
import clases.productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan WT
 */
public class productosDB {
     //Inserta un nuevo Registro
    public static void guardar(productos prod) throws SQLException {
        Connection cnn = conectar.getConexion();
        PreparedStatement ps = null;
        
        String sql;

        sql="INSERT INTO productos (idCategoria,producto, modelo, caracteristicas, stock, precioCompra,precioVenta,estado)VALUES (?,?,?,?,?,?,?,?)";
        try {
            ps=cnn.prepareStatement(sql);
            ps.setInt(1,prod.getIdCategoria());
            ps.setString(2,prod.getProducto());
            ps.setString(3,prod.getModelo());
            ps.setString(4,prod.getCaracteristicas());
            ps.setDouble(5,prod.getStock());
            ps.setDouble(6,prod.getPrecioCompra());
            ps.setDouble(7,prod.getPrecioVenta());
            ps.setString(8,prod.getEstado());
            
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
