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
public class ProductoSimple implements IEstructuraProducto {
    private double costoUnitario;
    private String descripcion;
    private int stockActual;
    private int stockMinimo;

    public ProductoSimple() {
    }
    
    public ProductoSimple(double costoUnitario, String descripcion, int stockActual, int stockMinimo) {
        this.costoUnitario = costoUnitario;
        this.descripcion = descripcion;
        this.stockActual = stockActual;
        this.stockMinimo = stockMinimo;
    }
    
    public double getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    @Override
    public ArrayList<IEstructuraProducto> obtenerHijos() {
        throw new UnsupportedOperationException("Es el ultimo nivel de la composicion. No tiene Hijos."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarHijo(IEstructuraProducto hijo) {
        throw new UnsupportedOperationException("Es el ultimo nivel de la composicion. No puede tener hijos."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void quitarHijo(IEstructuraProducto hijo) {
        throw new UnsupportedOperationException("Es el ultimo nivel de la composicion. No tiene Hijos."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
   public ListaObject<Object> getDescripcionProducto(ListaObject<Object> hijosDes) {
    
        StringBuilder descripcion= new StringBuilder();
        
        descripcion.append("Producto: ");
        descripcion.append(this.descripcion);
        descripcion.append(" ");
        descripcion.append("\n"); 
        hijosDes.add(descripcion);
        return hijosDes;
               
    }
    
    
}
