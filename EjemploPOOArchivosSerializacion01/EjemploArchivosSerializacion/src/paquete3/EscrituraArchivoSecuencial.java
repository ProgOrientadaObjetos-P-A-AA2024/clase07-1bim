/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import paquete0.AppendingObjectOutputStream;
import paquete1.Calificacion;

public class EscrituraArchivoSecuencial {

    private String nombreArchivo;
    private ObjectOutputStream salida; // envía los datos a un archivo
    private Calificacion registro;

    public EscrituraArchivoSecuencial(String nombreArc) {
        nombreArchivo = nombreArc;
            
    }
    
    public void establecerNombreArchivo(String n){
        nombreArchivo = n;
    }
    // agrega registros al archivo
    public void establecerRegistro(Calificacion p) {
        registro = p;
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
            salida.writeObject(registro); // envía el registro como salida
            // objeto al archivo
            salida.close();

        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }

    

    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    

    public ObjectOutputStream obtenerSalida(){
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
