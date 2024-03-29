/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 * @Description Main
 * @author Santiago
 * @version 23/03/24
 * @retorna Los metodos que complementan los metodos del Hash
 */
public class ListaReserva {

    Cliente primero;
    int tamano;

    public ListaReserva() {
        this.primero = null;
        this.tamano = 0;
    }

    public void InsertarLista(String nombre, String apellido, int n_hab) {
        Cliente nuevo = new Cliente(nombre, apellido, n_hab);

        if (this.primero == null) {
            this.primero = nuevo;
            tamano++;
        } else {
            nuevo.setSiguiente(this.primero);
            this.primero = nuevo;
            tamano++;
        }
    }

    public void EliminarLista(String nombre, String apellido) {

        if (this.primero != null) {

            Cliente aux = this.primero;
            if (aux.getPrimer_nombre().equals(nombre) && aux.getSegundo_nombre().equals(apellido)) {
                this.primero = aux.getSiguiente();
                tamano--;
            } else {

                while (aux.getSiguiente() != null && !aux.getSiguiente().getPrimer_nombre().equals(nombre) && !aux.getSiguiente().getSegundo_nombre().equals(apellido)) {
                    aux = aux.getSiguiente();
                }

                aux.setSiguiente(aux.getSiguiente().getSiguiente());
                tamano--;
            }

        }
    }

    public Cliente BuscarLista(String nombre, String apellido) {
        if (this.primero != null) {
            Cliente aux = this.primero;
            if (aux.getPrimer_nombre().toLowerCase().equals(nombre.toLowerCase()) && aux.getSegundo_nombre().toLowerCase().equals(apellido.toLowerCase())) {
                return this.primero;
            } else {
                while (aux != null && (!aux.getPrimer_nombre().toLowerCase().equals(nombre.toLowerCase()) || !aux.getSegundo_nombre().toLowerCase().equals(apellido.toLowerCase()))) {
                    aux = aux.getSiguiente();
                }
                return aux;
            }

        } else {
            return null;
        }
    }

    public String ImprimirLista() {
        Cliente aux = this.primero;
        String lista = "";
        while (aux != null) {
            lista += aux.getPrimer_nombre() + ", " + aux.getSegundo_nombre() + ", " + aux.getNum_hab() + "; ";
            aux = aux.getSiguiente();
        }
        return lista;
    }
}


