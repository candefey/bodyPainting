/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodypainting.CompositeConArrayList;

import java.util.ArrayList;

/**
 *
 * @author Candelaria
 */
public class BodyPainting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //el ArtBasicKit está armado por un kit base de pinturas de tres colores a elección, 
        //un kit de 2 pinceles básicos, una esponja y un glitter neutro
        
        //Producto Simples
        ProductoSimple glitter = new ProductoSimple(249.90,"glitter neutro",30,10);
        ProductoSimple esponja = new ProductoSimple(200,"esponja punta redonda",30,10);
        
        //Kit Pinceles: Pincel Basico Mediano + Pincel Basico Grande
        //Creamos los productos simples
        ProductoSimple pincelBasicoMediano = new ProductoSimple(90,"pincel basico mediano",30,10);        
        ProductoSimple pincelBasicoGrande = new ProductoSimple(150,"pincel basico grande",30,10);        
        //Creamos el array de hijos formado por los productos simples anteriores.
        ArrayList<IEstructuraProducto> productosKitPinceles= new ArrayList<>();
        productosKitPinceles.add(pincelBasicoMediano);
        productosKitPinceles.add(pincelBasicoGrande);
        //Creamos el compuesto kitPinceles, pasandole por parametro el array recientemente creado.
        CompuestoProductos kitPinceles = new CompuestoProductos(productosKitPinceles,220,"2 Pinceles");
        
        
        //Kit Bases: Base Natural + Base Dorada + Base Bronceado
        //Creamos los productos simples
        ProductoSimple baseNatural = new ProductoSimple(200,"base color natural",30,10);
        ProductoSimple baseDorada = new ProductoSimple(200,"base color dorado",30,10);
        ProductoSimple baseBronceado = new ProductoSimple(200,"base efecto bronceado",30,10);    
        ArrayList<IEstructuraProducto> productosKitBases = new ArrayList<>();
        //Creamos el array de hijos formado por los productos simples anteriores.
        productosKitBases.add(baseNatural);
        productosKitBases.add(baseDorada);
        productosKitBases.add(baseBronceado);
        //Creamos el compuesto kitPinceles, pasandole por parametro el array recientemente creado.
        CompuestoProductos kitBases = new CompuestoProductos(productosKitBases, 500, "3 Bases");
        
        //Kit ArtBasic: Esponja + Glitter + KitBases + KitPinceles
        ArrayList<IEstructuraProducto> productosKitArtBasic = new ArrayList<>();
        productosKitArtBasic.add(esponja);
        productosKitArtBasic.add(glitter);
        productosKitArtBasic.add(kitBases);
        productosKitArtBasic.add(kitPinceles);
         
        CompuestoProductos artBasicKit= new CompuestoProductos(productosKitArtBasic,1000,"Super Art Basic" );
       
        System.out.println("DESCRIPCION DEL PRODUCTO:"+"\n" );
        ListaObject descripcion = new ListaObject();        
        String resultado = artBasicKit.getDescripcionProducto(descripcion).toString();
        System.out.println(resultado);
            
        
               
        
        
    }
    
}
