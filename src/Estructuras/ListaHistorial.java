/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author santi
 */
public class ListaHistorial {

    Historial primero;
    int tamano;

    public ListaHistorial() {
        this.primero = null;
        this.tamano = 0;
    }

    public void InsertarLista(int ci, String nom, String ape, String mail, String gen, String lle, int hab) {
        Historial nuevo = new Historial(ci, nom, ape, mail, gen, lle, hab);

        if (this.primero == null) {
            this.primero = nuevo;
            tamano++;
        } else {
            nuevo.setSiguiente(this.primero);
            this.primero = nuevo;
            tamano++;
        }
    }

    public void EliminarLista(String nom, String ape) {

        if (this.primero != null) {

            Historial aux = this.primero;
            if (aux.getEr_nombre().equals(nom) && aux.getApellido().equals(ape)) {
                this.primero = aux.getSiguiente();
                tamano--;
            } else {

                while (aux.getSiguiente() != null && !aux.getSiguiente().getEr_nombre().equals(nom) && !aux.getSiguiente().getApellido().equals(ape)) {
                    aux = aux.getSiguiente();
                }

                aux.setSiguiente(aux.getSiguiente().getSiguiente());
                tamano--;
            }

        }
    }

    public Historial BuscarLista(String nom, String ape) {
        if (this.primero != null) {
            Historial aux = this.primero;
            if (aux.getEr_nombre().equals(nom) && aux.getApellido().equals(ape)) {
                return this.primero;
            } else {
                while (aux != null && !aux.getGenero().equals(nom) && !aux.getApellido().equals(ape)) {
                    aux = aux.getSiguiente();
                }
                return aux;
            }

        } else {
            return null;
        }
    }

    public String ImprimirLista() {
        Historial aux = this.primero;
        String lista = "";
        while (aux != null) {
            lista += aux.getEr_nombre() + ", " + aux.getApellido() + ", " + aux.getNum_hab() + "; ";
            aux = aux.getSiguiente();
        }
        return lista;
    }
}
