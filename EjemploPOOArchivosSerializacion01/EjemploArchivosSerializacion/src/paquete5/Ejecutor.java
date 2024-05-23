/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;



public class Ejecutor {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "hospitales.data";
        
        Hospital h1 = new Hospital("Isidro Ayora", 110, 90000.2, 
                new Ciudad("Loja", 200));
        Hospital h2 = new Hospital("Militar", 40, 40000.4, 
                new Ciudad("Cuenca", 300));

        Hospital [] lista = {h1, h2};

        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial(nombreArchivo);

        for (int i = 0; i < lista.length; i++) {
            // establecer el valor del atributo registro
            archivo.establecerRegistro(lista[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerListaCalificaciones();
        System.out.println(lectura);
    }
}
