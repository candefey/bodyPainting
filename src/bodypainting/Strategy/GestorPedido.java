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
public class GestorPedido {
    
    ArrayList<CuponDescuento> cupones; 
    int nroCuponIngresado;
    CuponDescuento cuponDescuento;
    ArrayList<IEstrategiaCosto> estrategias;
    int[] cantidades;
    double[] costos;
    double[] porcDesc;

    public GestorPedido() {
        this.estrategias = new ArrayList<IEstrategiaCosto>();
        ArrayList<CuponDescuento> cupones = new ArrayList<CuponDescuento>(); 
    }

    
    
    public boolean validarOferta()
    {
        for (int i = 0; i < cupones.size(); i++) {
            if(cupones.get(i).esCuponNro(nroCuponIngresado)){   
                cuponDescuento = cupones.get(i);
               
                break;
            }            
        }
        if (cuponDescuento.esDescuentoATodoElPedido())
        {   double porcentaje = cuponDescuento.getOferta().getPorcentajeDescuento();
            this.porcDesc = new double[]{porcentaje};
            return true;}
        else
            //TODO implementar el seteo del vector de descuentos para cada producto.
            return false;
        
    }
      
            
    public double calcularTotalPedidoSinDescuento()
    {
        EstrategiaSinDescuento sinDesc = new EstrategiaSinDescuento();
        this.agregarEstrategia(0,sinDesc);
        return sinDesc.calcularCostoTotal(cantidades, costos, porcDesc);
    }
    
    
    public double calcularTotalPedidoConDescuento()
    {
        EstrategiaDescuentoTotalPedido DescPedido = new EstrategiaDescuentoTotalPedido();
        this.agregarEstrategia(1,DescPedido);
        return DescPedido.calcularCostoTotal(cantidades, costos, porcDesc);
    }
    
    public double calcularTotalPedidoDescuentoProducto()
    {
        EstrategiaDescuentoProducto DescPro = new EstrategiaDescuentoProducto();
        this.agregarEstrategia(2,DescPro);
        return DescPro.calcularCostoTotal(cantidades, costos, porcDesc);
    }     
    
    public void agregarEstrategia(int posicion, IEstrategiaCosto e)
    {
        estrategias.add(posicion,e);
    }

    public ArrayList<CuponDescuento> getCupones() {
        return cupones;
    }

    public void setCupones(ArrayList<CuponDescuento> cupones) {
        this.cupones = cupones;
    }

    public int getNroCuponIngresado() {
        return nroCuponIngresado;
    }

    public void setNroCuponIngresado(int nroCuponIngresado) {
        this.nroCuponIngresado = nroCuponIngresado;
    }

    public CuponDescuento getCuponDescuento() {
        return cuponDescuento;
    }

    public void setCuponDescuento(CuponDescuento cuponDescuento) {
        this.cuponDescuento = cuponDescuento;
    }

    public ArrayList<IEstrategiaCosto> getEstrategias() {
        return estrategias;
    }

    public void setEstrategias(ArrayList<IEstrategiaCosto> estrategias) {
        this.estrategias = estrategias;
    }

    public int[] getCantidades() {
        return cantidades;
    }

    public void setCantidades(int[] cantidades) {
        this.cantidades = cantidades;
    }

    public double[] getCostos() {
        return costos;
    }

    public void setCostos(double[] costos) {
        this.costos = costos;
    }

    public double[] getPorcDesc() {
        return porcDesc;
    }

    public void setPorcDesc(double[] porcDesc) {
        this.porcDesc = porcDesc;
    }

    
}
