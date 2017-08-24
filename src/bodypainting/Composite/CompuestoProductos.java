/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodypainting.Composite;

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
    public String getDescripcionProducto(StringBuilder descripcionProducto) {
        descripcionProducto.append("Kit: ");
        descripcionProducto.append(this.getDescripcion());
        descripcionProducto.append("\n");
        ArrayList<IEstructuraProducto> hijos= this.obtenerHijos(); 
        descripcionProducto.append("[");
        for (int i = 0; i < hijos.size(); i++) 
        {     hijos.get(i).getDescripcionProducto(descripcionProducto);}
        descripcionProducto.append("]");
        descripcionProducto.append("\n");
        return descripcionProducto.toString();
    }

    @Override
    public String getDescripcion() 
    {      
       return this.descripcion;
    }

    public ArrayList<IEstructuraProducto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<IEstructuraProducto> productos) {
        this.productos = productos;
    }

    public double getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }
    
   
}
