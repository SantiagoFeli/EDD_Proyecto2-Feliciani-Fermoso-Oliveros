
import Estructuras.ArbolHabitacion;
import Estructuras.ArbolReserva;
import Estructuras.FuncionesHotel;
import Estructuras.Habitacion;
import Estructuras.Registro;
import interfaz.Home;

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
        registroprueba.InsertarHash("a", "b", 1);
        registroprueba.InsertarHash("c", "d", 2);
        registroprueba.InsertarHash("e", "f", 3);
        System.out.println(registroprueba.ImprimirHash());
        registroprueba.EliminarHash("nombre", "fvefvfev");
        System.out.println(registroprueba.ImprimirHash());
//        System.out.println(registroprueba.BuscarHash("erge", "fveffdvdvfvfev").getPrimer_nombre());

        System.out.println("Hola");
        System.out.println("ayudapapadio");
        System.out.println("prueba github");
        System.out.println("prueba github2");

        ArbolReserva arbol = new ArbolReserva();
        arbol.IntertarReser(arbol.getRaiz(), 30, "san", "feli", "g@gmail.com", "male", "2", "04242140509", "2/3/04", "2/3/03");
        arbol.IntertarReser(arbol.getRaiz(), 8, "sa", "fel", "g@gmail.co", "mal", "3", "0424214050", "2/3/4", "/3/03");
        arbol.IntertarReser(arbol.getRaiz(), 78, "s", "fe", "g@gmail.c", "ma", "4", "042421405", "2//04", "23/03");
        arbol.IntertarReser(arbol.getRaiz(), 7, "s", "fe", "g@gmail.c", "ma", "4", "042421405", "2//04", "23/03");
        arbol.IntertarReser(arbol.getRaiz(), 900, "s", "fe", "g@gmail.c", "ma", "4", "042421405", "2//04", "23/03");
        arbol.IntertarReser(arbol.getRaiz(), 888, "s", "fe", "g@gmail.c", "ma", "4", "042421405", "2//04", "23/03");
        arbol.IntertarReser(arbol.getRaiz(), 18, "s", "fe", "g@gmail.c", "ma", "4", "042421405", "2//04", "23/03");

        ArbolHabitacion arbol2 = new ArbolHabitacion();
        arbol2.IntertarHab(arbol2.getRaiz(), 1, "doueble", "1");
        arbol2.IntertarHab(arbol2.getRaiz(), 2, "3", "1");
        arbol2.IntertarHab(arbol2.getRaiz(), 3, "2", "1");
        arbol2.IntertarHab(arbol2.getRaiz(), 4, "4", "2");
        arbol2.IntertarHab(arbol2.getRaiz(), 5, "3", "2");
        arbol2.IntertarHab(arbol2.getRaiz(), 6, "4", "2");
        arbol2.IntertarHab(arbol2.getRaiz(), 7, "4", "3");
        arbol2.IntertarHab(arbol2.getRaiz(), 8, "3", "3");
        arbol2.IntertarHab(arbol2.getRaiz(), 9, "2", "3");

        Habitacion h = arbol2.BuscarHab(arbol2.getRaiz(), 1);
        h.getHistorial().InsertarLista(10, "nom", "ape", "mail", "gen", "lle", 1);
        h.getHistorial().InsertarLista(20, "nom1", "ape1", "mail1", "gen1", "lle1", 1);
        h.getHistorial().InsertarLista(30, "nom2", "ape2", "mail2", "gen2", "lle2", 1);
        h.getHistorial().InsertarLista(40, "nom3", "ape3", "mail3", "gen3", "lle3", 1);

        FuncionesHotel fh = new FuncionesHotel(arbol2, arbol, registroprueba);
        Home ventana = new Home(arbol2, arbol, registroprueba, fh);
        ventana.setVisible(true);
        System.out.println("hola");
        System.out.println("al dia");
    }

}
