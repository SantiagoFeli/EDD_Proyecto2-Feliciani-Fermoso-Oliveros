
import Estructuras.Registro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author santi
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Registro registroprueba = new Registro(7);
        registroprueba.InsertarHash("nombre","fvefvfev", 1);
        registroprueba.InsertarHash("erge","fveffdvdvfvfev", 2);
        registroprueba.InsertarHash("nodfvdfmbre","fveffvdfdvfev", 3);
        System.out.println(registroprueba.ImprimirHash());
        registroprueba.EliminarHash("nombre","fvefvfev");
        System.out.println(registroprueba.ImprimirHash());
        System.out.println(registroprueba.BuscarHash("erge","fveffdvdvfvfev").getPrimer_nombre());
        
        System.out.println("Hola");
    }
    
}
