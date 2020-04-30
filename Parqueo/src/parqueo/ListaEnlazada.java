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
public class ListaEnlazada<T extends Comparable<T>> implements Serializable {
private class NodeGeneric <T> implements Serializable{
private T data; 
private NodeGeneric<T> next;
    public NodeGeneric() { 
        this(null);
    } 
    public NodeGeneric(T data) { 
        this.data = data; 
        next = null;
    }
}
private NodeGeneric<T> head;
public ListaEnlazada(){ 
    head = null;
} 

public boolean insert(T item) { 
    boolean inserted; 
    NodeGeneric<T>ptr,prev; 
    inserted = false; 
    ptr = head; 
    prev = null; 
    while(ptr != null && ptr.data.compareTo(item) < 0){ 
    prev = ptr; ptr = ptr.next; 
    } 
    if(ptr == null || !(ptr.data.equals(item))){ 
        inserted = true; 
        NodeGeneric<T>newp = new NodeGeneric(); 
        newp.data = item; 
        newp.next = ptr; 
        if(prev == null) 
            head = newp; 
        else 
            prev.next = newp; }
return inserted;
}
public void delete(T item){ 
    NodeGeneric<T> ptr, prev;
    prev= head;
    while((prev.next).data!=item)
        prev=prev.next;
    ptr = prev;
    if(prev.next==null)
        prev.next=null;
    else
        prev.next=ptr.next.next;
    //completar
    //return deleted;  
//defectooooooo
   }
public void printRecursive() { 
    System.out.print("List Recursive: "); 
    printR(head); 
    System.out.println(); 
}
private void printR(NodeGeneric<T> p){
    if(p != null){
    System.out.println(p.data + " "); 
    printR(p.next); 
    } 
}
}
