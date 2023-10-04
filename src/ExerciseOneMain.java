import Entity.EsercizioRettangolo;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ExerciseOneMain {
    public static void main(String[] args) {
        // Press Alt+Invio with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        EsercizioRettangolo firstRectangle= new EsercizioRettangolo(25.6,15.3);
        EsercizioRettangolo secondRectangle = new EsercizioRettangolo(12.5,32.8);
        System.out.println(firstRectangle.getLarghezza());
        stampaRettangolo(firstRectangle);
        stampaDueRettangoli(firstRectangle, secondRectangle);



    }
    public static void stampaRettangolo(EsercizioRettangolo a) {
        double perimetro = a.calcoloPerimetro(a.getAltezza(),a.getLarghezza());
        double area = a.calcoloArea(a.getAltezza(),a.getLarghezza());
        System.out.println("Perimetro: " + perimetro + " cm " + " Area: " + area + " cm");
    }
    public static void stampaDueRettangoli(EsercizioRettangolo a, EsercizioRettangolo b) {
        double perimetroA = a.calcoloPerimetro(a.getAltezza(),a.getLarghezza());
        double areaA = a.calcoloArea(a.getAltezza(),a.getLarghezza());
        double perimetroB = b.calcoloPerimetro(b.getAltezza(),b.getLarghezza());
        double areaB = b.calcoloArea(b.getAltezza(),b.getLarghezza());
        double perimetroC = perimetroA + perimetroB;
        double areaC = areaA + areaB;
        System.out.println("Perimetro primo rettangolo :" + perimetroA + " cm " + "area primo rettangolo: " + areaA + " cm " + "perimetro secondo rettangolo: " + perimetroB + " cm " + "area secondo rettangolo: " + areaB + " cm " + "somma due perimetri: " + perimetroC + " cm " + "somma due aree: " + areaC + " cm");
    }
}