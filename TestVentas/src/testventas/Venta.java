/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testventas;

import java.time.LocalDate;

/**
 *
 * @author Carmen
 */
public class Venta {
    private Producto producto;
    private int unidades;
    private LocalDate fecha;
    
    
   
    /**
     * Constructor de las ventas
     * @param producto Producto que se ha vendido en la venta
     * @param unidades Cantidad que hemos vendido de ese producto
     * @param fecha Fecha en la que se ha realizado la venta
     */
    public Venta(Producto producto, int unidades, String fecha) {
        this.producto = producto;
        this.unidades = unidades;
        this.fecha = LocalDate.parse(fecha);//"yyyy-mm-dd"
    } //Cierre del constructor
    
    /**
     * Metodo getter del ImporteVenta
     * @return ImporteVenta del venta
     */
    public double getImporteVenta(){
        return producto.precioVentaPublico()*unidades;
    }
    
    /**
     * Metodo getter del Producto
     * @return Producto del venta
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * Metodo setter del Producto
     * @param producto Producto de la venta
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * Metodo getter del Unidades
     * @return Unidades del venta
     */
    public int getUnidades() {
        return unidades;
    }

    /**
     * Metodo setter del Unidades
     * @param unidades Unidades de la venta
     */
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
    /**
     * Metodo getter del Fecha
     * @return Fecha del venta
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Metodo setter del Fecha
     * @param fecha Fecha de la venta
     */
    public void setFecha(String fecha) {
        this.fecha = LocalDate.parse(fecha);
    }

    /**
     * Método que devuelve una cadena de caracteres con los atributos de la venta
     * @return Cadena de caracteres con los atributos de la venta
     */
    @Override
    public String toString() {
        return "Venta{" + "producto=" + producto + ", unidades=" + unidades + ", fecha=" + fecha + '}';
    }
    
    
    
    
}
