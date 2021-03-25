/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testventas;

import java.util.ArrayList;

/**
 *
 * @author Carmen
 */

public class Tienda {
    private ArrayList<Vendedor> vendedores;
    
    /**
     * Constructor de la tienda
     */
    public Tienda(){
        vendedores = new ArrayList<Vendedor>();
    } //Cierre del constructor
    
    /**
     * Método que inserta los vendedores en la tienda
     * @param ven Vendedor que deseamos insertar en la tienda
     */
    public void insertaVendedor(Vendedor ven){
        vendedores.add(ven);
    }//Cierre del constructor
 
    /**
     * Método que devuelve la suma de los importes de las ventas de todos los vendedores
     * @return Total de importe de las ventas realizadas por todos los vendedores
     */
    public double totalVentasDeTodosLosVendedores(){
        double salida =0;
        for (int i = 0; i < vendedores.size(); i++) {
            salida+= vendedores.get(i).sumaVentasDeVendedor();
            // nombre ---suma de ventas del vendedor
            System.out.println("Nombre: "+vendedores.get(i).getNombre()+
                        " ventas: "+vendedores.get(i).sumaVentasDeVendedor());
        }  
        return salida;
    }
    
    
    /**
     * Método que devuelve una cadena de caracteres con los vendedores de la tienda
     * @return Cadena de caracteres con los vendedores de la tienda
     */
    
    @Override
    public String toString() {
        return "Tienda{" + "vendedores=" + vendedores + '}';
    }
    
    
    
}



    
  