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
public interface IEstrategiaCosto {
    public double calcularCostoTotal( int[] cantidades,  double[] costos,  double[]porcDesc);
    public double[] calcularSubTotal(int[] cantidades,  double[] costo);
}
