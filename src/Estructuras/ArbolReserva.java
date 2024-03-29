/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 * @Description Main
 * @author Santiago
 * @version 23/03/24
 * @retorna Todos los metodos utilizados para las reservas
 */
public class ArbolReserva {

    private Reservacion raiz;

    public ArbolReserva() {
        this.raiz = null;
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
    
    public Reservacion EliminarReser(Reservacion actual, int ci) {
        if (actual == null) {
            return null;
        }

        if (ci < actual.getCi()) {
            actual.setIzquierda(EliminarReser(actual.getIzquierda(), ci));
        } else if (ci > actual.getCi()) {
            actual.setDerecha(EliminarReser(actual.getDerecha(), ci));
        } else {
            if (actual.getIzquierda() == null && actual.getDerecha() == null) {
                actual = null;
            } else if (actual.getIzquierda() == null) {
                actual = actual.getDerecha();
            } else if (actual.getDerecha() == null) {
                actual = actual.getIzquierda();
            } else {
                Reservacion remplazo = BuscarMin(actual.getDerecha());
                actual.setCi(remplazo.getCi());
                actual.setDerecha(EliminarReser(actual.getDerecha(), remplazo.getCi()));
            }
        }
        return actual;
    }

    private Reservacion BuscarMin(Reservacion actual) {
        if (actual.getIzquierda() == null) {
            return actual;
        } else {
            return BuscarMin(actual.getIzquierda());
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

    public String ImprimirReser(Reservacion actual, String print) {
        if (actual == null) {
            return print;
        } else {
            print = ImprimirReser(actual.getIzquierda(), print);
            print += String.valueOf(actual.getCi()) + ", ";
            print = ImprimirReser(actual.getDerecha(), print);
            return print;
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
