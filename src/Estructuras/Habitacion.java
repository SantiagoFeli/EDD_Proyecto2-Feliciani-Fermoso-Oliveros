/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 * @Description Main
 * @author Santiago
 * @version 23/03/24
 * @retorna Habitacion
 */
public class Habitacion {
    private int num_hab;
    private String tipo_hab;
    private String piso_hab;
    private ListaHistorial historial;
    private Habitacion derecha;
    private Habitacion izquierda;
    private boolean ocupado;
    
    public Habitacion(int hab, String tipo, String piso){
        this.num_hab = hab;
        this.tipo_hab = tipo;
        this.piso_hab = piso;
        this.historial = new ListaHistorial();
        this.derecha = null;
        this.izquierda = null;
    }

    /**
     * @return the num_hab
     */
    public int getNum_hab() {
        return num_hab;
    }

    /**
     * @param num_hab the num_hab to set
     */
    public void setNum_hab(int num_hab) {
        this.num_hab = num_hab;
    }

    /**
     * @return the tipo_hab
     */
    public String getTipo_hab() {
        return tipo_hab;
    }

    /**
     * @param tipo_hab the tipo_hab to set
     */
    public void setTipo_hab(String tipo_hab) {
        this.tipo_hab = tipo_hab;
    }

    /**
     * @return the piso_hab
     */
    public String getPiso_hab() {
        return piso_hab;
    }

    /**
     * @param piso_hab the piso_hab to set
     */
    public void setPiso_hab(String piso_hab) {
        this.piso_hab = piso_hab;
    }

    /**
     * @return the historial
     */
    public ListaHistorial getHistorial() {
        return historial;
    }

    /**
     * @param historial the historial to set
     */
    public void setHistorial(ListaHistorial historial) {
        this.historial = historial;
    }

    /**
     * @return the derecha
     */
    public Habitacion getDerecha() {
        return derecha;
    }

    /**
     * @param derecha the derecha to set
     */
    public void setDerecha(Habitacion derecha) {
        this.derecha = derecha;
    }

    /**
     * @return the izquierda
     */
    public Habitacion getIzquierda() {
        return izquierda;
    }

    /**
     * @param izquierda the izquierda to set
     */
    public void setIzquierda(Habitacion izquierda) {
        this.izquierda = izquierda;
    }

    /**
     * @return the ocupado
     */
    public boolean isOcupado() {
        return ocupado;
    }

    /**
     * @param ocupado the ocupado to set
     */
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

}
