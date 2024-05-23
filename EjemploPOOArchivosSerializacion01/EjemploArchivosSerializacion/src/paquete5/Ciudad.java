/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Ciudad implements Serializable{
    private String nombre;
    private int numeroBarrios;
    
    public Ciudad(String n, int v){
        nombre = n;
        numeroBarrios = v;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerNumeroBarrios(int n){
        numeroBarrios = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerNumeroBarrios(){
        return numeroBarrios;
    }
}
            

