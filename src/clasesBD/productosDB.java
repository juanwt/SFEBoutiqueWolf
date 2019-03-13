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
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

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

        sql = "INSERT INTO productos (idCategoria,producto, modelo, caracteristicas, stock, precioCompra,precioVenta,estado)VALUES (?,?,?,?,?,?,?,?)";
        try {
            ps = cnn.prepareStatement(sql);
            ps.setInt(1, prod.getIdCategoria());
            ps.setString(2, prod.getProducto());
            ps.setString(3, prod.getModelo());
            ps.setString(4, prod.getCaracteristicas());
            ps.setDouble(5, prod.getStock());
            ps.setDouble(6, prod.getPrecioCompra());
            ps.setDouble(7, prod.getPrecioVenta());
            ps.setString(8, prod.getEstado());

            int n = ps.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Registrado con exito", "Grabar Registro", JOptionPane.INFORMATION_MESSAGE);
            }

            cnn.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se logro grabar el Registro..." + ex, "Grabar Registro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void consultarProducto(String cod, JTextField[] campos) {
        Connection cnn = conectar.getConexion();
        PreparedStatement ps = null;
        ResultSet res;
        String sql;
        sql = "SELECT idProductos,producto,modelo,caracteristicas,stock,precioCompra,precioVenta,estado FROM productos WHERE producto = '" + cod + "'";
        try {
            ps = cnn.prepareStatement(sql);
            res = ps.executeQuery();

            while (res.next()) {
                String idProd = res.getString("idProductos");
                if (idProd != null) {
                    for (int i = 0; i < campos.length; i++) {
                        campos[i].setText(res.getString(i + 1));
                    }
                }
            }
            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static String consultarid(String cod) {
        Connection cnn = conectar.getConexion();
        PreparedStatement ps = null;
        ResultSet res;
        String sql;
        sql = "SELECT idCategoria FROM productos WHERE producto = '" + cod + "'";
        try {
            ps = cnn.prepareStatement(sql);
            res = ps.executeQuery();
            // int cat = Integer.parseInt(res.getString("idProducto"));
            String idc=res.getString("idCategoria");
            return idc;
            /*while (res.next()) {
                String idcat = res.getString("idCategoria");
                if (idcat != null) {
                    for (int i = 0; i < campos.length; i++) {
                        campos[i].setSelectedItem(res.getString(i + 1));
                        //campos[i].setText(res.getString(i + 1));
                    }
                }
            }
            res.close();*/
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
               return null;
        }

    }
        /*public static boolean actualizar(productos obj, String cod) throws SQLException {
        Connection cnn = conectar.getConexion();
        PreparedStatement ps = null;
        String sql;
        sql = "UPDATE productos SET idProductos=?,idClientes=?,producto=?,modelo=?,caracteriticas=?,stokc=?,precioCompra=?,precioVenta=?,estado=? WHERE idCliente='" + cod + "'";
        ps = cnn.prepareStatement(sql);
        ps.setString(1, obj.getIdProductos());
        ps.setString(2, obj.getIdCategoria());
        ps.setString(3, obj.getProducto());
        ps.setString(4, obj.getModelo());
        ps.setString(5, obj.getCaracteristicas());
        ps.setString(6, obj.getStock());
        ps.setString(7, obj.getPrecioCompra());
        ps.setString(8, obj.getPrecioVenta());
        ps.setString(9, obj.getEstado());

        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "Actualización Exitosa", "Actualizar Registro", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo Actualizar el Registro", "Actualizar Registro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }*/
       public static boolean eliminar(String cod) throws SQLException {
        Connection cnn = conectar.getConexion();
        PreparedStatement ps = null;
        String sql;
        sql = "Delete from productos WHERE idProductos='" + cod+ "'";
        ps = cnn.prepareStatement(sql);
       
        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null,"Se ha borrado exitosamente", "Borrar Registro",JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(null,"No se pudo Borrar el Registro", "Borrar Registro",JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
