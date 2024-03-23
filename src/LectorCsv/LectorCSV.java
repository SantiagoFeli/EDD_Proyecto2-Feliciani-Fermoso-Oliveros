/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LectorCsv;

import Estructuras.ArbolHabitacion;
import Estructuras.ArbolReserva;
import Estructuras.Registro;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author santi
 */
public class LectorCSV {

    public ArbolReserva x;
    public Registro y;
    public ArbolHabitacion a;

    public LectorCSV() {
        this.x = new ArbolReserva();
        this.y = new Registro(300);
        this.a = new ArbolHabitacion();
    }

    public void LeerCSV() {

        try {
            File parentDirectory = new File(System.getProperty("user.dir"));
            File inputFile = new File(parentDirectory, "Booking_Hotel.xlsx");
            System.out.println(inputFile);
            FileInputStream f = new FileInputStream(inputFile);
//            FileInputStream f = new FileInputStream("C:\\Users\\santi\\OneDrive\\Desktop\\Booking_Hotel.xlsx");
//            FileInputStream f = new FileInputStream("..\\..\\Booking_Hotel.xlsx");
//            FileInputStream f = new FileInputStream(ClassLoader.getSystemResources());
            XSSFWorkbook libro = new XSSFWorkbook(f);
            XSSFSheet hoja = libro.getSheetAt(0);
            Iterator<Row> filas = hoja.iterator();
            Iterator<Cell> celdas;
            int n = 1;
            int h = 0;
            Row fila;
            Cell celda;
            int cedula = 0;
            String nom = "";
            String ape = "";
            String mail = "";
            String gen = "";
            String t_hab = "";
            String cel = "";
            String lle = "";
            String sal = "";
            int nro = 0;
            String piso = "";
            String aux;
            double au;
            Date d;
            boolean vacio = false;
            fila = filas.next();
            while (h < 4) {
                hoja = libro.getSheetAt(h);
                filas = hoja.iterator();
                fila = filas.next();
                while (filas.hasNext()) {
                    fila = filas.next();
                    celdas = fila.cellIterator();
                    n = 1;
                    while (celdas.hasNext()) {
                        if (vacio) {
                            vacio = false;
                            break;
                        }
                        celda = celdas.next();
                        switch (h) {
                            case 0 -> {
                                switch (n) {
                                    case 1 -> {
                                        cedula = (int) celda.getNumericCellValue();
                                        aux = Integer.toString(cedula);
                                        aux.replace(".", "");
                                        cedula = Integer.parseInt(aux);
                                    }
                                    case 2 ->
                                        nom = celda.getStringCellValue();
                                    case 3 ->
                                        ape = celda.getStringCellValue();
                                    case 4 ->
                                        mail = celda.getStringCellValue();
                                    case 5 ->
                                        gen = celda.getStringCellValue();
                                    case 6 ->
                                        t_hab = celda.getStringCellValue();
                                    case 7 -> {
                                        cel = celda.getStringCellValue();
                                    }
                                    case 8 -> {
                                        d = celda.getDateCellValue();
                                        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                                        String fechaString = formato.format(d);
                                        lle = fechaString;
                                    }
                                    case 9 -> {
                                        d = celda.getDateCellValue();
                                        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                                        String fechaString = formato.format(d);
                                        sal = fechaString;
                                    }
                                    default -> {
                                    }
                                }
                            }
                            case 1 -> {
                                switch (n) {
                                    case 1 -> {
                                        nro = (int) celda.getNumericCellValue();
                                    }
                                    case 2 ->
                                        t_hab = celda.getStringCellValue();
                                    case 3 ->
                                        piso = String.valueOf(celda.getNumericCellValue());
                                    default -> {
                                    }
                                }
                            }
                            case 2 -> {
                                switch (n) {
                                    case 1 -> {
                                        try {
                                            nro = (int) celda.getNumericCellValue();
                                        } catch (Exception e) {
                                            vacio = true;
                                            break;
                                        }
                                    }
                                    case 2 -> {
                                        nom = celda.getStringCellValue();
                                    }
                                    case 3 ->
                                        ape = celda.getStringCellValue();
                                    case 4 ->
                                        mail = celda.getStringCellValue();
                                    case 5 ->
                                        gen = celda.getStringCellValue();
                                    case 6 ->
                                        cel = celda.getStringCellValue();
                                    case 7 -> {
                                        d = celda.getDateCellValue();
                                        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                                        String fechaString = formato.format(d);
                                        lle = fechaString;
                                    }
                                    default -> {
                                    }
                                }
                            }
                            case 3 -> {
                                switch (n) {
                                    case 1 -> {
                                        cedula = (int) celda.getNumericCellValue();
                                        aux = Integer.toString(cedula);
                                        aux.replace(".", "");
                                    }
                                    case 2 ->
                                        nom = celda.getStringCellValue();
                                    case 3 ->
                                        ape = celda.getStringCellValue();
                                    case 4 ->
                                        mail = celda.getStringCellValue();
                                    case 5 ->
                                        gen = celda.getStringCellValue();
                                    case 6 -> {
                                        d = celda.getDateCellValue();
                                        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                                        String fechaString = formato.format(d);
                                        lle = fechaString;
                                    }
                                    case 7 ->
                                        nro = (int) celda.getNumericCellValue();
                                    default -> {
                                    }
                                }
                            }
                            default -> {
                            }
                        }
                        switch (celda.getCellType()) {
                            case BLANK -> {
                                if (n == 1 && h == 2) {
                                    nro = 0;
                                }
                            }
                        }
                        n += 1;
                    }
                    switch (h) {
                        case 0 ->
                            x.IntertarReser(x.getRaiz(), cedula, nom, ape, mail, gen, t_hab, cel, lle, sal);

                        case 1 ->
                            a.IntertarHab(a.getRaiz(), nro, t_hab, piso);
                        case 2 ->
                            y.InsertarHash(nom, piso, nro);
                        case 3 ->
                            a.BuscarHab(a.getRaiz(), nro).getHistorial().InsertarLista(cedula, nom, ape, mail, gen, lle, nro);
                        default -> {
                        }
                    }
                }  
                h += 1;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
