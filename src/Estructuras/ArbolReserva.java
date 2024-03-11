/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author santi
 */
public class ArbolReserva {

    private Reservacion raiz;

    public ArbolReserva(Reservacion rz) {
        this.raiz = rz;
    }

    public void IntertarReser(Reservacion actual, int ci, String er_nomb, String do_nom, String mail, String gen, String t_hab, String cel, String lle, String sal) {
        if (this.raiz == null) {
            raiz = new Reservacion(ci, er_nomb, do_nom, mail, gen, t_hab, cel, lle, sal);
        } else {
            if (actual.getCi() < ci) {
                if (actual.getDerecha() != null) {
                    this.IntertarReser(actual.getDerecha(), ci, er_nomb, do_nom, mail, gen, t_hab, cel, lle, sal);
                } else {
                    actual.setDerecha(new Reservacion(ci, er_nomb, do_nom, mail, gen, t_hab, cel, lle, sal));
                }

            } else {
                if (actual.getIzquierda() != null) {
                    this.IntertarReser(actual.getIzquierda(), ci, er_nomb, do_nom, mail, gen, t_hab, cel, lle, sal);
                } else {
                    actual.setIzquierda(new Reservacion(ci, er_nomb, do_nom, mail, gen, t_hab, cel, lle, sal));
                }
            }
        }
    }

    public Reservacion BuscarReser(Reservacion actual, int ci) {
        if (actual == null || actual.getCi() == ci) {
            return actual;
        } else {
            if (actual.getCi() > ci) {
                return BuscarReser(actual.getIzquierda(), ci);
            } else {
                return BuscarReser(actual.getDerecha(), ci);
            }
        }
    }

    /**
     * @return the raiz
     */
    public Reservacion getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(Reservacion raiz) {
        this.raiz = raiz;
    }
}
