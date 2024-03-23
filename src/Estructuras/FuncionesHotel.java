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

    public String CheckIn(int ci) {
        if (reservas.BuscarReser(reservas.getRaiz(), ci) == null) {
            return "No hay reservas con esa cedula";

        } else {
            Habitacion hab = habitaciones.BuscarHabOcup(habitaciones.getRaiz(), reservas.BuscarReser(reservas.getRaiz(), ci).getTipo_hab());
            if (hab != null) {
                this.clientes.InsertarHash(reservas.BuscarReser(reservas.getRaiz(), ci).getEr_nombre(), reservas.BuscarReser(reservas.getRaiz(), ci).getDo_nombre(), hab.getNum_hab());
                String mensaje = "El cliente: " + reservas.BuscarReser(reservas.getRaiz(), ci).getEr_nombre() + ", " + reservas.BuscarReser(reservas.getRaiz(), ci).getDo_nombre() + "\nDe cedula: " + reservas.BuscarReser(reservas.getRaiz(), ci).getCi() + "\nSe va a hospedar en la habitacion " + hab.getTipo_hab() + " numero: " + hab.getNum_hab();
                return mensaje;
            } else {
                return "No hay habitaciones disponibles";
            }
        }
    }

    public String CheckOut(int ci) {
        if (reservas.BuscarReser(reservas.getRaiz(), ci) == null) {
            return "No hay reservas con esa cedula";
        } else {
            Habitacion hab = habitaciones.BuscarHab(habitaciones.getRaiz(), this.clientes.BuscarHash(reservas.BuscarReser(reservas.getRaiz(), ci).getEr_nombre(), reservas.BuscarReser(reservas.getRaiz(), ci).getDo_nombre()).getNum_hab());
            hab.setOcupado(false);
            hab.getHistorial().InsertarLista(reservas.BuscarReser(reservas.getRaiz(), ci).getCi(), reservas.BuscarReser(reservas.getRaiz(), ci).getEr_nombre(), reservas.BuscarReser(reservas.getRaiz(), ci).getDo_nombre(), reservas.BuscarReser(reservas.getRaiz(), ci).getEmail(), reservas.BuscarReser(reservas.getRaiz(), ci).getGenero(), reservas.BuscarReser(reservas.getRaiz(), ci).getLlegada(), hab.getNum_hab());
            this.clientes.EliminarHash(reservas.BuscarReser(reservas.getRaiz(), ci).getEr_nombre(), reservas.BuscarReser(reservas.getRaiz(), ci).getDo_nombre());
            String mensaje = "El cliente: " + reservas.BuscarReser(reservas.getRaiz(), ci).getEr_nombre() + ", " + reservas.BuscarReser(reservas.getRaiz(), ci).getDo_nombre() + "\nDe cedula: " + reservas.BuscarReser(reservas.getRaiz(), ci).getCi() + "\nTermino su hospedaje" + "\n La habitacion " + hab.getNum_hab() + " esta desocupada ahora";
            this.reservas.EliminarReser(reservas.getRaiz(), reservas.BuscarReser(reservas.getRaiz(), ci).getCi());

            return mensaje;
        }
    }

}
