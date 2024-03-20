/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LectorCsv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author PC
 */
public class AdaptadorCsv {
    public void adaptador(String filePath) throws IOException {
        File archivoDado = new File(filePath);
        File archivoTemp = new File(archivoDado.getAbsolutePath() + ".tmp");

        BufferedReader lector = new BufferedReader(new FileReader(archivoDado));
        BufferedWriter Escritor = new BufferedWriter(new FileWriter(archivoTemp));
        String linea;

        while ((linea = lector.readLine()) != null) {
            String[] datos = linea.split(",");

            // Remueve los puntos de la cédula
            String ciSinPuntos = datos[0].replace(".", "");

            // Reemplaza el valor en el array con la cédula sin puntos
            datos[0] = ciSinPuntos;

            // Escribe la línea procesada al archivo temporal
            Escritor.write(String.join(",", datos));
            Escritor.newLine();
            
        }

        lector.close();
        Escritor.close();

        // Borra el archivo original
        if (!archivoDado.delete()) {
            throw new IOException("No se pudo borrar el archivo original: " + archivoDado);
        }

        // Renombra el archivo temporal para reemplazar el archivo original
        if (!archivoTemp.renameTo(archivoDado)) {
            throw new IOException("No se pudo renombrar el archivo temporal: " + archivoTemp);
        }
    }
}
