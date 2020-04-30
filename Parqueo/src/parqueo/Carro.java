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
 * @param <T>
 */
public class Carro  implements Serializable,Comparable<Carro>  {
    private String Marca;
    private String Modelo;
    private String placa;
    private Cliente propietario;

    public Carro(String Marca, String Modelo, String placa,Cliente propietario) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.placa = placa;
        this.propietario = propietario;
    }
    
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    @Override
    public int compareTo(Carro t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
