/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Juan WT
 */
public class productos {
    private int idProductos;
    private int idCategoria;
    private String producto;
    private String modelo;
    private String caracteristicas;
    private String estado;
    private double stock;
    private double precioCompra;
    private double precioVenta;

    public productos(int idProductos, int idCategoria,String producto, String modelo, String caracteristicas, double stock, double precioCompra, double precioVenta, String estado) {
        this.idProductos = idProductos;
        this.idCategoria=idCategoria;
        this.producto = producto;
        this.modelo = modelo;
        this.caracteristicas = caracteristicas;
        this.stock = stock;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.estado = estado;
    }
    public productos(int idCategoria,String producto, String modelo, String caracteristicas, double stock, double precioCompra, double precioVenta, String estado) {
        this.idCategoria=idCategoria;
        this.producto = producto;
        this.modelo = modelo;
        this.caracteristicas = caracteristicas;
        this.stock = stock;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.estado = estado;
    }

    /**
     * @return the idProductos
     */
    public int getIdProductos() {
        return idProductos;
    }

    /**
     * @param idProductos the idProductos to set
     */
    public void setIdProductos(int idProductos) {
        this.idProductos = idProductos;
    }

    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the caracteristicas
     */
    public String getCaracteristicas() {
        return caracteristicas;
    }

    /**
     * @param caracteristicas the caracteristicas to set
     */
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the stock
     */
    public double getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(double stock) {
        this.stock = stock;
    }

    /**
     * @return the precioCompra
     */
    public double getPrecioCompra() {
        return precioCompra;
    }

    /**
     * @param precioCompra the precioCompra to set
     */
    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    /**
     * @return the precioVenta
     */
    public double getPrecioVenta() {
        return precioVenta;
    }

    /**
     * @param precioVenta the precioVenta to set
     */
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    /**
     * @return the idCategoria
     */
    public int getIdCategoria() {
        return idCategoria;
    }

    /**
     * @param idCategoria the idCategoria to set
     */
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    
}
