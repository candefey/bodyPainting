/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodypainting.CompositeConArrayList;

import bodypainting.Composite.CompuestoProductos;
import java.util.*;

/**
 *
 * @author Candelaria
 */
public class ListaObject<Object> extends ArrayList<Object>
{
@Override
public String toString() {
        Iterator<Object> it = iterator();
        if (! it.hasNext())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (;;) {
            Object e = it.next();
            sb.append(e == this? "" : e);
            if (! it.hasNext())
                return sb.append(']' + "\n").toString();
            //sb.append(',').append(' ');
        }
    }
//    @Override
//    public String toString()  {
//        Iterator<Object> it = iterator();
//        if (! it.hasNext())
//            return "[]";
//
//        StringBuilder sb = new StringBuilder();
//        sb.append('[');
//        for (;;) {
//            Object e = it.next();
//            if (! it.hasNext())
//                return sb.append(']').toString();
//            sb.append(',').append(' ');
//        }
//    }
    
}

