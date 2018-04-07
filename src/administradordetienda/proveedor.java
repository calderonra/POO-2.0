/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administradordetienda;

/**
 *
 * @author RAUL
 */
public class proveedor {
    private String nombre;
    private String empresa; 
    
    public proveedor(){}

    public String getNombre() {
        return nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

}
