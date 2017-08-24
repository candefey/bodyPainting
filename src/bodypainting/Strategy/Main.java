/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodypainting.Strategy;

import java.util.ArrayList;

/**
 *
 * @author Candelaria
 */
public class Main {
     public static void main(String[] args) {
     
    int[] cantidades={2,4,2};
    double[] costos ={100,50,100};
         System.out.println("El carrito actual tiene las siguientes cantidades y precios de productos: ");
         for (int i = 0; i < costos.length; i++) {
             System.out.println(" Cant: " + cantidades[i]);
             System.out.println(" Precio: " + costos[i]);
             System.out.println("_____________________");
         }
         
         
     //Oferta del 25 % de descuento
     Oferta oferta25 = new Oferta(true,0.25);
     //Cupones para la Oferta del 25 % de descuento
     CuponDescuento cupon1 = new CuponDescuento(123,oferta25);
     CuponDescuento cupon2 = new CuponDescuento(124,oferta25);
     //Oferta del 10 % de descuento
     Oferta oferta10 = new Oferta(true,0.15);   
        System.out.println("La oferta es de " + oferta10.getPorcentajeDescuento() + " % ");
        System.out.println("¿Es oferta para todo el pedido? " + oferta10.esParaPedidoCompleto);
     //Cupones para la Oferta del 10 % de descuento
     CuponDescuento cupon3 = new CuponDescuento(125,oferta10);
     CuponDescuento cupon4 = new CuponDescuento(126,oferta10);
     
     ArrayList<CuponDescuento> cupones = new ArrayList<>();
     cupones.add(cupon1);
     cupones.add(cupon2);
     cupones.add(cupon3);
     cupones.add(cupon4);
     
     GestorPedido gestor = new GestorPedido();
     gestor.setCupones(cupones);
     gestor.setNroCuponIngresado(126);
     gestor.setCantidades(cantidades);
     gestor.setCostos(costos);
         System.out.println("Total Sin Descuento: " + gestor.calcularTotalPedidoSinDescuento());
     if (gestor.validarOferta())
             System.out.println("Total Con Descuento: " + gestor.calcularTotalPedidoConDescuento());
     
     
     
     
     }
}
