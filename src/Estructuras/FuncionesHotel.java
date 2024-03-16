/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author santi
 */
public class FuncionesHotel {

    ArbolHabitacion habitaciones;
    ArbolReserva reservas;
    Registro clientes;

    public FuncionesHotel(ArbolHabitacion habitaciones, ArbolReserva reservas, Registro clientes) {
        this.clientes = clientes;
        this.habitaciones = habitaciones;
        this.reservas = reservas;
    }

    public void CheckIn(int ci) {
        if (reservas.BuscarReser(reservas.getRaiz(), ci) == null) {
            System.out.println("No hay reservas con esa cedula");
        } else {
            Habitacion hab = habitaciones.BuscarHabOcup(habitaciones.getRaiz(), reservas.BuscarReser(reservas.getRaiz(), ci).getTipo_hab());
            this.clientes.InsertarHash(reservas.BuscarReser(reservas.getRaiz(), ci).getEr_nombre(), reservas.BuscarReser(reservas.getRaiz(), ci).getDo_nombre(), hab.getNum_hab());
        }
    }

}
