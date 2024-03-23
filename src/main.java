
import Estructuras.ArbolHabitacion;
import Estructuras.ArbolReserva;
import Estructuras.FuncionesHotel;
import Estructuras.Habitacion;
import Estructuras.Registro;
import LectorXlsx.LectorXlsx;
import interfaz.Home;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 * @Description Main
 * @author Santiago
 * @version 23/03/24
 */

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        LectorXlsx lector = new LectorXlsx();
        lector.LeerCSV();
        FuncionesHotel fh = new FuncionesHotel(lector.a, lector.x, lector.y);

        Home ventana = new Home(lector.a, lector.x, lector.y, fh);
        ventana.setVisible(true);
    }

}
