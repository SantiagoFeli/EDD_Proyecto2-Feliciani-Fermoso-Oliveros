/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 * @Description Main
 * @author Santiago
 * @version 23/03/24
 * @retorna Todos los metodos utilizados para las habitaciones
 */
public class ArbolHabitacion {

    private Habitacion raiz;

    public ArbolHabitacion() {
        this.raiz = null;
    }

    public void IntertarHab(Habitacion actual, int num, String tipo, String piso) {
        if (this.getRaiz() == null) {
            setRaiz(new Habitacion(num, tipo, piso));
        } else {
            if (actual.getNum_hab() < num) {
                if (actual.getDerecha() != null) {
                    this.IntertarHab(actual.getDerecha(), num, tipo, piso);
                } else {
                    actual.setDerecha(new Habitacion(num, tipo, piso));
                }

            } else {
                if (actual.getIzquierda() != null) {
                    this.IntertarHab(actual.getIzquierda(), num, tipo, piso);
                } else {
                    actual.setIzquierda(new Habitacion(num, tipo, piso));
                }
            }
        }
    }

    public Habitacion BuscarHab(Habitacion actual, int num) {
        if (actual == null || actual.getNum_hab() == num) {
            return actual;
        } else {
            if (actual.getNum_hab() > num) {
                return BuscarHab(actual.getIzquierda(), num);
            } else {
                return BuscarHab(actual.getDerecha(), num);
            }
        }
    }

    public Habitacion BuscarHabOcup(Habitacion actual, String tipo) {
        if (actual == null) {
            return actual;
        } else {
            if (actual.isOcupado() || !actual.getTipo_hab().equals(tipo)) {
                Habitacion encontrada = BuscarHabOcup(actual.getIzquierda(), tipo);
                if (encontrada == null) {
                    encontrada = BuscarHabOcup(actual.getDerecha(), tipo);
                }
                return encontrada;
            } else {
                actual.setOcupado(true);
                return actual;
            }
        }
    }

    public String ImprimirHab(Habitacion actual, String print) {
        if (actual == null) {
            return print;
        } else {
            print = ImprimirHab(actual.getIzquierda(), print);
            print += String.valueOf(actual.getNum_hab()) + ", ";
            print = ImprimirHab(actual.getDerecha(), print);
            return print;

        }

    }

    /**
     * @return the raiz
     */
    public Habitacion getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(Habitacion raiz) {
        this.raiz = raiz;
    }
}
