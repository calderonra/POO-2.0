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
public class inventario {
    
    private ArrayList<producto>productos;

    public inventario(ArrayList<producto> productos) {
        this.productos = productos;
    }

    public ArrayList<producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<producto> productos) {
        this.productos = productos;
    }
    
    
}
