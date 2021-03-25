/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testventas;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Carmen
 */
public class Vendedor {
    private String nombre;
    private LocalDate fechaNacimiento;
    private Venta[] ventas;
    private int nVentas;
    private double comision;

    /**
     * Constructor de los productos
     * @param nombre El nombre del vendedor
     * @param comision Parte correspondiente que se queda el vendedor por unidad vendida
     * @param fechaNacimiento Fecha en la que el vendedor nacio
     */
    public Vendedor(String nombre, double comision, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.comision = comision;
        this.fechaNacimiento = fechaNacimiento;
        ventas = new Venta[10];
        nVentas =0;
    } //Cierre del constructor

    /**
     * Método que inserta la venta en el vendedor
     * @param venta Venta que deseamos insertar al vendedor
     * @return Verdadero en el caso de que hay sido inseertado y falso en el caso de que no se haya podido insertar
     */
    public boolean insertaVenta(Venta venta){
        if (nVentas < ventas.length){
            //nVentas = 3;
            ventas[nVentas++] = venta;
           // nVentas++;
            return true;
        }
        return false;
    }
    
    /**
     * Método que suma el total del importe de ventas de un vendedor
     * @return Sumatorio del importe de todas las ventas de un vendedor
     */
    public double sumaVentasDeVendedor(){
        double suma =0;
        
        for (int i = 0; i < nVentas; i++) {
            suma+= ventas[i].getImporteVenta();
        }
        return suma;
    }
    
    /**
     * Método que devuelves las ventas realizadas por dicho vendedor
     * @return Cadena con las ventas realizadas por ese vendedor
     */
    public String ventasToString(){
        String salida="";
        for (int i=0; i<nVentas;i++){
            salida+= ventas[i].toString()+"\n";
        }
        return salida;
    }
    
    /**
     * Metodo que devuelva un resumen de ventas mensuales de un año dado
     * @param aa Año en el que queremos el resumen de las ventas
     * @return Una cadena de caracteres con las ventas por meses del año
     */
    public String resumenVentas(int aa){
        String salida = "";
        for (int mes = 1; mes <= 12; mes++) {
           
           for (int i = 0; i < nVentas; i++) {
               if(ventas[i].getFecha().getYear()==aa  &&
                  ventas[i].getFecha().getMonthValue()==mes){
                  salida +=  ventas[i].toString();
               }
           }       
        }
        return salida;  
    }
    
    /**
     * Metodo getter del Nombre
     * @return Nombre del vendedor
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo setter del Nombre
     * @param nombre Nombre del vendedor
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo getter de la FechaNacimiento
     * @return FechaNacimiento del vendedor
     */
    public String getFechaNacimiento() {
        return fechaNacimiento.toString();
    }

    /**
     * Metodo getter de la Comision
     * @return Comision del vendedor
     */
    public double getComision() {
        return comision;
    }

    /**
     * Metodo setter del Comision
     * @param comision Comision del vendedor
     */
    public void setComision(double comision) {
        this.comision = comision;
    }

    /**
     * Metodo setter del FechaNacimiento
     * @param fechaNacimiento FechaNacimiento del vendedor
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento);
    }
    
    /**
     * Metodo setter del FechaNacimiento
     * @param dd Dia de la FechaNacimiento del vendedor
     * @param mm Mes de la FechaNacimiento del vendedor
     * @param aa Año de la FechaNacimiento del vendedor
     */
     public void setFechaNacimiento(int dd, int mm, int aa) {
        this.fechaNacimiento = LocalDate.of(aa,mm,dd);
    }

    /**
     * Metodo getter de las Ventas
     * @return Ventas del vendedor
     */
    public Venta[] getVentas() {
        return ventas;
    }

    /**
     * Metodo setter de las Ventas
     * @param ventas Ventas del vendedor
     */
    public void setVentas(Venta[] ventas) {
        this.ventas = ventas;
    }
    
    
    /**
     * Método que devuelve una cadena de caracteres con los atributos del vendedor
     * @return Cadena de caracteres con los atributos de cada vendedor
     */
   
    @Override
    public String toString() {
        return "Vendedor{" + "nombre=" + nombre + ", \ncomisión=" + comision +
                ", \nfechaNacimiento=" + fechaNacimiento + ", \nventas=\n" + ventasToString()
                + ",\nnVentas=" + nVentas + '}';
    }

    
    
    
    
}
