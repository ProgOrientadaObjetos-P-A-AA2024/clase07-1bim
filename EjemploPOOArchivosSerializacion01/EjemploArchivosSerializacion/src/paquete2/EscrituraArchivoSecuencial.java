/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete0.AppendingObjectOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import paquete1.Profesor;

/**
 *
 * @author reroes
 */
public class EscrituraArchivoSecuencial {

    private String nombreArchivo;
    private ObjectOutputStream salida;
    private Profesor registroProfesor;

    public EscrituraArchivoSecuencial(String nombreArc) {
        nombreArchivo = nombreArc;
        // establecerListaProfesores(); // obtener los valores (objetos)
        // que tiene el archivo.

    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRegistroProfesor(Profesor p) {
        registroProfesor = p;
    }

    public void establecerSalida() {
        File f = new File(nombreArchivo);

        try {
            if (f.exists() == false) {
                salida = new AppendingObjectOutputStream(
                        new FileOutputStream(nombreArchivo));
            }

            salida = new AppendingObjectOutputStream(
                    new FileOutputStream(nombreArchivo, true));
            salida.writeObject(registroProfesor); // envía el registro como 
            // objeto al archivo
            salida.close();

        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }

    
    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }
    

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    public void cerrarArchivo() {
        try // cierra el archivo
        {
            if (salida != null) {
                salida.close();
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");

        } // fin de catch
    }

}
