/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author santi
 */
public class Reservacion {

    private int ci;
    private String er_nombre;
    private String do_nombre;
    private String email;
    private String genero;
    private String tipo_hab;
    private String celular;
    private String llegada;
    private String salida;
    private Reservacion izquierda;
    private Reservacion derecha;

    public Reservacion(int ci, String er_nomb, String do_nom, String mail, String gen, String t_hab, String cel, String lle, String sal) {
        this.ci = 0;
        this.er_nombre = er_nomb;
        this.do_nombre = do_nom;
        this.email = mail;
        this.genero = gen;
        this.tipo_hab = t_hab;
        this.celular = cel;
        this.llegada = lle;
        this.salida = sal;
        this.izquierda = null;
        this.derecha = null;

    }

    /**
     * @return the ci
     */
    public int getCi() {
        return ci;
    }

    /**
     * @param ci the ci to set
     */
    public void setCi(int ci) {
        this.ci = ci;
    }

    /**
     * @return the er_nombre
     */
    public String getEr_nombre() {
        return er_nombre;
    }

    /**
     * @param er_nombre the er_nombre to set
     */
    public void setEr_nombre(String er_nombre) {
        this.er_nombre = er_nombre;
    }

    /**
     * @return the do_nombre
     */
    public String getDo_nombre() {
        return do_nombre;
    }

    /**
     * @param do_nombre the do_nombre to set
     */
    public void setDo_nombre(String do_nombre) {
        this.do_nombre = do_nombre;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
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
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the llegada
     */
    public String getLlegada() {
        return llegada;
    }

    /**
     * @param llegada the llegada to set
     */
    public void setLlegada(String llegada) {
        this.llegada = llegada;
    }

    /**
     * @return the salida
     */
    public String getSalida() {
        return salida;
    }

    /**
     * @param salida the salida to set
     */
    public void setSalida(String salida) {
        this.salida = salida;
    }

    /**
     * @return the izquierda
     */
    public Reservacion getIzquierda() {
        return izquierda;
    }

    /**
     * @param izquierda the izquierda to set
     */
    public void setIzquierda(Reservacion izquierda) {
        this.izquierda = izquierda;
    }

    /**
     * @return the derecha
     */
    public Reservacion getDerecha() {
        return derecha;
    }

    /**
     * @param derecha the derecha to set
     */
    public void setDerecha(Reservacion derecha) {
        this.derecha = derecha;
    }
}
