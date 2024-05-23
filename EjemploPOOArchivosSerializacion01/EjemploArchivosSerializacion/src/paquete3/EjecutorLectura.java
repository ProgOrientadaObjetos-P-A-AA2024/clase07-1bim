/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete1.Calificacion;
import paquete1.Profesor;

public class EjecutorLectura {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "data/calificaciones.data";

        
        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerListaCalificaciones();
        System.out.println(lectura);
    }
}
