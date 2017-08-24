/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  bodypainting.CompositeConArrayList;


import java.util.ArrayList;

/**
 *
 * @author Candelaria
 */
public class CompuestoProductos implements IEstructuraProducto {
   private ArrayList<IEstructuraProducto> productos;
   private double costoUnitario;
   private String descripcion;

    public CompuestoProductos() {    }   
   
    public CompuestoProductos(ArrayList<IEstructuraProducto> productos, double costoUnitario, String descripcion) {
        this.productos = productos;
        this.costoUnitario = costoUnitario;
        this.descripcion = descripcion;
    }   

    @Override
    public ArrayList<IEstructuraProducto> obtenerHijos() {
        return productos;  
    }

    @Override
    public void agregarHijo(IEstructuraProducto hijo) {
        productos.add(hijo);
    }

    @Override
    public void quitarHijo(IEstructuraProducto hijo) {
        productos.remove(hijo);
    }

    @Override
    public ListaObject<Object> getDescripcionProducto(ListaObject<Object> descripcion) {
        
        descripcion.add(" Kit: " + this.getDescripcion()+ "\n");
        ArrayList<IEstructuraProducto> hijos= this.obtenerHijos(); 
        ListaObject<Object> hijosDes = new ListaObject<>();
       for (IEstructuraProducto hijo : hijos) {
           hijosDes.add(hijo.getDescripcionProducto(hijosDes));
       }
        descripcion.add(hijosDes);
        return descripcion;
    }

    @Override
    public String getDescripcion() 
    {      
       return this.descripcion;
    }
   
    
}
