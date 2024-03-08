/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author santi
 */
public class Lista {

    Cliente primero;
    int tamano;

    public Lista() {
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
            if (aux.getPrimer_nombre().equals(nombre) && aux.getSegundo_nombre().equals(apellido)) {
                return this.primero;
            } else {
                while (aux != null && !aux.getPrimer_nombre().equals(nombre) && !aux.getSegundo_nombre().equals(apellido)) {
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



/*
andres ---> 3 ---> clientes[3] = andres, tomas,                 
0  
1
2       c2
3       c1  
4       


*/