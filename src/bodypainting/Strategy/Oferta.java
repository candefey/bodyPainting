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
public class Oferta {
    boolean esParaPedidoCompleto;
    double porcentajeDescuento;

    public Oferta(boolean esParaPedidoCompleto, double porcentajeDescuento) {
        this.esParaPedidoCompleto = esParaPedidoCompleto;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public boolean isEsParaPedidoCompleto() {
        return esParaPedidoCompleto;
    }

    public void setEsParaPedidoCompleto(boolean esParaPedidoCompleto) {
        this.esParaPedidoCompleto = esParaPedidoCompleto;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
    
}
