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
public class TestVentas {

    /**
     * Metodo main
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Producto producto;
       Venta venta;
       Vendedor vendedor, ven01;
       Tienda tienda;
       
       
       tienda = new Tienda();
       
       vendedor = new Vendedor("Pepe", 10, LocalDate.of(1999,10,10));//nombre,comision,fecha N.
       ven01 = new Vendedor("juan", 15, LocalDate.of(2000,1,1));
       
       
        
       producto = new Producto("Taladro", 25, 15, 21);//nombre, p. costo, ganancia,iva
       venta = new Venta(producto,2,"2020-10-01");//producto, unidades, fecha
       vendedor.insertaVenta(venta);
       
       
       venta = new Venta(producto,3,"2020-11-01");//producto, unidades, fecha
       vendedor.insertaVenta(venta);
       
       
       producto = new Producto("Sierra", 20, 10, 21);//nombre, p. costo, ganancia,iva
       venta = new Venta(producto,4,"2020-10-10");//producto, unidades, fecha
       vendedor.insertaVenta(venta);
       
       
       venta = new Venta(producto,2,"2020-11-10");//producto, unidades, fecha
       vendedor.insertaVenta(venta);
       
//        System.out.println("vendedor: "+vendedor.toString());
//       
//        System.out.println("ventas: "+vendedor.ventasToString());
       
       tienda.insertaVendedor(vendedor);
       tienda.insertaVendedor(ven01);
       
       
       venta = new Venta(producto,2,"2020-11-19");//producto, unidades, fecha
       ven01.insertaVenta(venta);
        System.out.println("Vendedores: "+tienda.toString());
        System.out.println("Total ventas de los vendedores: "+tienda.totalVentasDeTodosLosVendedores());
        
    }//Cierre del metodo main
    
}
