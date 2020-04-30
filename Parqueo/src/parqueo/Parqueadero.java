/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Nicolas
 */
public class Parqueadero implements Serializable {
    private String nombre;
    private int[][] capacidad;
    private Carro[][] carros;
    private static final long serialVersionUID = 3345865576853431083L;
    public Parqueadero(String nombre,int n, int m){
        nombre = this.nombre;
        carros = new Carro[n][m];
    }
    public void insertarCarro(Carro carro){
        loop:
        for(int i =0;i<708;i++)
            for(int j =0; j < 708 ;j++)
                if(!(carros[i][j] instanceof Carro)){
                    carros[i][j]=carro;
                    break loop;
                }
    }
    public void vaciarParqueadero(){
        for(int i = 0;i<708;i++)
            for(int j = 0; j<708;j++)
        this.carros[i][j]=null;
    }
    public void verParqueadero(){       
        System.out.println(Arrays.deepToString(carros).replace("], ", "]\n"));
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[][] getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int[][] capacidad) {
        this.capacidad = capacidad;
    }    

    public Carro[][] getCarros() {
        return carros;
    }

    public void setCarros(Carro[][] carros) {
        this.carros = carros;
    }
    
}
