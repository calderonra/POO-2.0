/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administradordetienda;
import java.util.ArrayList;
/**
 *
 * @author RAUL
 */
public class factura {
    
    private ArrayList<factura_aux>facturas;

    public factura() {}

    public ArrayList<factura_aux> getFacturas() {
        return facturas;
    }

    public void setFacturas(ArrayList<factura_aux> facturas) {
        this.facturas = facturas;
    }
    

    
}
