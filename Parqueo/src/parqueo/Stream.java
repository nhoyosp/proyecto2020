/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueo;

import java.io.*;

/**
 *
 * @author Nicolas
 */
public class Stream {
    private static final long serialVersionUID = 6529685098267757690L;
    private ObjectInputStream entrada;
    private ObjectOutputStream salida;
    public void escribir(Object object){
        try{
            salida = new ObjectOutputStream(new FileOutputStream("Datos.bin"));
            salida.writeObject(object);
            salida.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    
    }

    public Object leer(){
        Object object;
        try{
            entrada = new ObjectInputStream(new FileInputStream("Datos.bin"));
            object = entrada.readObject();
            return object;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
