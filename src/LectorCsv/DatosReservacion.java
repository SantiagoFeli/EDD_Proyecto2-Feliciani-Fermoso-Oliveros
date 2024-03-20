/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LectorCsv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author PC
 */
public class DatosReservacion {
    public static String agregarNuevoElementoCSV(String filePath, String nuevoUsuario) {
        String ultimoElemento = null;
        filePath = "Booking_hotel - reservas.csv";

        try {
            // Leer el archivo CSV existente
            BufferedReader lector = new BufferedReader(new FileReader(filePath));
            String linea;
            StringBuilder contenidoArch = new StringBuilder();

            // Leer y almacenar el contenido actual del archivo
            while ((linea = lector.readLine()) != null) {
                contenidoArch.append(linea).append(System.lineSeparator());
            }
            lector.close();

            // Agregar el nuevo elemento después de la última fila de la primera columna
            String[] filas = contenidoArch.toString().split(System.lineSeparator());
            String valorUltimaCelda = filas[filas.length - 1].split(",")[0];

            // Construir la nueva línea con el nuevo elemento
            StringBuilder newLine = new StringBuilder();
            newLine.append(valorUltimaCelda).append(",").append(nuevoUsuario);

            // Agregar la nueva línea al contenido del archivo
            contenidoArch.append(newLine.toString()).append(System.lineSeparator());

            // Escribir el contenido actualizado en el archivo CSV
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(contenidoArch.toString());
            writer.close();

            System.out.println("Proceso de reserva exitoso. ¡Hasta pronto!");

            // Establecer el último elemento como resultado
            ultimoElemento = nuevoUsuario;
        } catch (IOException e) {
            System.out.println("Error al manipular el archivo CSV: " + e.getMessage());
        }

        return ultimoElemento;
    }
}
