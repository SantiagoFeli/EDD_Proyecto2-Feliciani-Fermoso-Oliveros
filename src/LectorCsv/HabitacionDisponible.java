/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LectorCsv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author PC
 */
public class HabitacionDisponible {
    public void crearHabitacionesDisponiblesCSV() {
    /**HashTable<String, String> rooms = new HashTable<>(1000);
    Lista<String> HabitacionesOcupadas = new Lista<>(); //ni idea que lista usar aqui
    try {
        // Leer el archivo CSV de habitaciones
        BufferedReader br = new BufferedReader(new FileReader("Booking_hotel - habitaciones.csv"));
        String linea;
        while ((linea = br.readLine()) != null) {
            String roomNumber = linea.split(",")[0]; // Asumiendo que el número de habitación es el primer campo
            rooms.put(roomNumber, linea);
        }
        br.close();

        // Leer el archivo CSV de habitaciones ocupadas
        br = new BufferedReader(new FileReader("Booking_hotel - estado.csv"));
        while ((linea = br.readLine()) != null) {
            HabitacionesOcupadas.append(linea.split(",")[0]); // Asumiendo que el número de habitación es el primer campo
        }
        br.close();

        // Crear el archivo CSV de habitaciones disponibles
       
PrintWriter pw = new PrintWriter(new File("habitaciones_disponibles.csv"));
Lista<String> keys = rooms.keys(); //ni idea que lista usar ahi
Cliente<String> node = keys.getHead();
while (node != null) {
    String room = node.getData();
    if (!HabitacionesOcupadas.contains(room)) {
        pw.println(rooms.get(room));
    }
    node = node.getNext();
}
pw.close();


    } catch (IOException e) {
        e.printStackTrace();
    }*/
}
}
