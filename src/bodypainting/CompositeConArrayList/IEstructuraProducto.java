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
public interface IEstructuraProducto {
    public ArrayList<IEstructuraProducto> obtenerHijos();
    public void agregarHijo(IEstructuraProducto hijo);
    public void quitarHijo(IEstructuraProducto hijo);
    public ListaObject<Object> getDescripcionProducto(ListaObject<Object> descripcion);
    public String getDescripcion();    
}
