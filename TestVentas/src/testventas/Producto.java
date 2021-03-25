/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testventas;

/**
 *
 * @author Carmen
 */
public class Producto {
    private String nombre;
    private double precioCosto;
    private double ganancia;
    private double tipoIva;
    
    /**
     * Constructor de los productos
     * @param nombre El nombre del producto
     * @param precioCosto El precio que cuesta comprar 1 de cantidad de dicho producto
     * @param ganancia Cantidad que se gana con cada producto vendido
     * @param tipoIva El iva que tiene dicho producto
     */
    public Producto(String nombre, double precioCosto, double ganancia, double tipoIva) {
        this.nombre = nombre;
        this.precioCosto = precioCosto;
        this.ganancia = ganancia;
        this.tipoIva = tipoIva;
    } //Cierre del constructor
    
    /**
     * Método que devuelve el precio del producto para el público
     * @return El precio de cara al publico que tendrá el producto
     */
    public double precioVentaPublico(){
        return (precioCosto+(precioCosto*ganancia/100))*(1+tipoIva/100);
    }

    /**
     * Metodo getter del Nombre
     * @return Nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo setter del Nombre
     * @param nombre Nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo getter del PrecioCosto
     * @return PrecioCosto del producto
     */
    public double getPrecioCosto() {
        return precioCosto;
    }

    /**
     * Metodo setter del PrecioCosto
     * @param precioCosto PrecioCosto del producto
     */
    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    /**
     * Metodo getter del Ganancia
     * @return Ganancia del producto
     */
    public double getGanancia() {
        return ganancia;
    }

    /**
     * Metodo setter del Ganancia
     * @param ganancia Ganancia del producto
     */
    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    /**
     * Metodo getter del TipoIva
     * @return TipoIva del producto
     */
    public double getTipoIva() {
        return tipoIva;
    }

    /**
     * Metodo setter del TipoIva
     * @param tipoIva TipoIva del producto
     */
    public void setTipoIva(double tipoIva) {
        this.tipoIva = tipoIva;
    }
    
    
    
    
    /**
     * Método que devuelve una cadena de caracteres con los atributos del producto
     * @return Cadena de caracteres con los atributos de cada producto
     */
    
    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precioCosto=" + precioCosto + ", ganancia=" + ganancia + ", tipoIva=" + tipoIva + '}';
    }
    
    
    
    
}
