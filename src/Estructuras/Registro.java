/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author santi
 */
public class Registro {

    private int tamano;
    private Lista[] clientes;

    public Registro(int t) {
        this.tamano = t;
        this.clientes = new Lista[t];
        for (int i = 0; i < t; i++) {
            clientes[i] = new Lista();
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
    public int Hash(String nombre, String apellido) {
        int hash = 0;
        for (int i = 0; i < nombre.length(); i++) {
            hash += (int) nombre.charAt(i) * i;
        }
        for (int i = 0; i < apellido.length(); i++) {
            hash += (int) apellido.charAt(i) * i;
        }
        return hash % tamano;
    }

    public void InsertarHash(String nombre, String apellido, int n_hab) {
        int indice = this.Hash(nombre, apellido);
        this.clientes[indice].InsertarLista(nombre, apellido, n_hab);
    }

    public void EliminarHash(String nombre, String apellido) {
        int indice = this.Hash(nombre, apellido);
        this.clientes[indice].EliminarLista(nombre, apellido);
    }

    public Cliente BuscarHash(String nombre, String apellido) {
        int indice = this.Hash(nombre, apellido);
        Cliente habitacion = this.clientes[indice].BuscarLista(nombre, apellido);
        return habitacion;
    }

    public String ImprimirHash() {
        String info = "";
        for (int i = 0; i < tamano; i++) {
            info += this.clientes[i].ImprimirLista();
        }
        
        return info;
    }

    /**
     * @return the tamano
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * @param tamano the tamano to set
     */
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    /**
     * @return the clientes
     */
    public Lista[] getClientes() {
        return clientes;
    }

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(Lista[] clientes) {
        this.clientes = clientes;
    }

}
