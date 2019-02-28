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
public class proveedores {
    private int idProveedores;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String cedula;
    private String dieccion;

    public proveedores(int idProveedores, String nombres, String apellidos, String telefono, String cedula, String dieccion) {
        this.idProveedores = idProveedores;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.cedula = cedula;
        this.dieccion = dieccion;
    }
    public proveedores(String nombres, String apellidos, String telefono, String cedula, String dieccion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.cedula = cedula;
        this.dieccion = dieccion;
    }

    /**
     * @return the idProveedores
     */
    public int getIdProveedores() {
        return idProveedores;
    }

    /**
     * @param idProveedores the idProveedores to set
     */
    public void setIdProveedores(int idProveedores) {
        this.idProveedores = idProveedores;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the dieccion
     */
    public String getDieccion() {
        return dieccion;
    }

    /**
     * @param dieccion the dieccion to set
     */
    public void setDieccion(String dieccion) {
        this.dieccion = dieccion;
    }
    
}
