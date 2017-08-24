/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodypainting.Strategy;

import java.util.Date;

/**
 *
 * @author Candelaria
 */
public class CuponDescuento {
    Date fechaExpiracion;
    Date fechaEntrega;
    boolean usado;
    int codigo;
    Oferta oferta;

    public CuponDescuento(int codigo, Oferta oferta) {
        this.codigo = codigo;
        this.oferta = oferta;
        this.usado = false;
    }
    
    public boolean esCuponNro(int nro)
    {
        return (this.codigo == nro);
        
    }
    
    public boolean esDescuentoATodoElPedido()
    {
       return oferta.isEsParaPedidoCompleto();
        
    }
    

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Oferta getOferta() {
        return oferta;
    }

    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }
    
    
    
}
