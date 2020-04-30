/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueo;

import java.io.Serializable;

/**
 *
 * @author Nicolas
 */
public class Cliente  implements Serializable,Comparable<Cliente> {
    private String Nombre;
    private String Apellido;
    private int codigo;
    //private Carro carro;
    private String correo;

    public Cliente(String Nombre, String Apellido, int codigo, String correo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.codigo = codigo;
        this.correo = correo;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
/*
    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
*/
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public int compareTo(Cliente t) {
        return 1; //To change body of generated methods, choose Tools | Templates.
    }
     
}
