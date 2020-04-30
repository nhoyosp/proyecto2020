/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueo;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Nicolas
 */
public class Parqueo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro[] carros= new Carro[10000000];
        Cliente lok = new Cliente("n","a",124,"s");
        ListaEnlazada<Cliente> cliente = new ListaEnlazada<>();
        ArrayList<Cliente> ayno = new ArrayList<>();
        Parqueadero park = new Parqueadero("blu",708,708);
        Cliente general= new Cliente("El","Jefe",123,"mail.com");
       /*
        for (int i = 0; i < 500000; i++) {
            carros[i]= new Carro("audi", "a3", "KLO-183", general);
            park.insertarCarro(carros[i]);
        }
        */
        
        //park.verParqueadero();
        //cliente.printRecursive();
        /*
        park.verParqueadero();
        Carro audi = new Carro("Audi","A3","jui-129");
        park.insertarCarro(audi);
        Carro mt= new Carro("mazda","2","Has-231");
        park.insertarCarro(mt);
        park.verParqueadero();
        Carro[][] caro = park.getCarros();
        System.out.println(caro[0][1].getModelo());
        Stream stream = new Stream();
        */
        //stream.escribir(lista);
        //lista = (ListaEnlazada)stream.leer();
        //System.out.println(lista.toString());
        //lista.printRecursive();
        Stream stream = new Stream();
        //stream.escribir(park);
        Parqueadero parkea=(Parqueadero)stream.leer();
        parkea.vaciarParqueadero();
    }
    
}
