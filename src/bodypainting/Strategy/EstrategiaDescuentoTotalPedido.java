/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodypainting.Strategy;

/**
 *
 * @author Candelaria
 */
public class EstrategiaDescuentoTotalPedido implements IEstrategiaCosto {

    public EstrategiaDescuentoTotalPedido() {
        
    }

    @Override
    public double calcularCostoTotal(int[] cantidades, double[] costos, double[] porcDesc) {
        double costoTotal=0;
        double[] subtotales = this.calcularSubTotal(cantidades, costos);
        for (int i = 0; i < subtotales.length; i++) 
        {
            costoTotal += subtotales[i];
        }
        return costoTotal - costoTotal*porcDesc[0]; 
    }

    @Override
      public double[] calcularSubTotal(int[] cantidades, double[] costo) {
        double[] subtotales= new double[cantidades.length]; 
        for (int i = 0; i < costo.length; i++) {
            subtotales[i]= costo[i]*cantidades[i];
            
        }
        return subtotales;
    }
    
}
