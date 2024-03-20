/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LectorCsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class DatosCliente {
    /**private HashTable<String, Lista<String>> habitaciones;

    public DatosCliente() {
        habitaciones = new HashTable<>(300);
        String filePath = "Booking_hotel - estado.csv";
        leerCSV(filePath);
    }

    private void leerCSV(String filePath) {
        try (Scanner scanner = new Scanner(new File(filePath))) {
            scanner.useDelimiter(","); // Especifica el delimitador del archivo CSV

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] valores = linea.split(",");

                // Verificar si hay suficientes campos en la línea
                if (valores.length < 3) {
                    continue; // Omitir la línea si no tiene suficientes campos
                }

                String habitacion = valores[0].trim();
                String nombre = valores[1].trim().toUpperCase();
                String apellido = valores[2].trim().toUpperCase();



                String nombreCompleto = nombre + " " + apellido;

                if (habitaciones.get(nombreCompleto) == null) {
                    Lista<String> habitacionesAsociadas = new Lista<>();
                    habitacionesAsociadas.append(habitacion);
                    habitaciones.put(nombreCompleto, habitacionesAsociadas);
                } else {
                    //Lista<String> habitacionesAsociadas = habitaciones.get(nombreCompleto);
                    habitacionesAsociadas.append(habitacion);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public HashTable<String, Lista<String>> getHabitaciones() {
        return habitaciones;
    }
    
    public void updateData() {
        habitaciones.clear(); // Limpiar la tabla hash

        String filePath = "Booking_hotel - estado.csv";
        leerCSV(filePath);
    }
*/
}