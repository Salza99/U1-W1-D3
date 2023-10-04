package Entity;

public class EsercizioRettangolo {
    private double altezza;
    private double larghezza;

    public EsercizioRettangolo(double altezza, double larghezza) {
        if (altezza > 0 && larghezza > 0 ) {
            this.altezza = altezza;
            this.larghezza = larghezza;}
        else {System.err.println("misure inaccettbili");}

    }
    public double calcoloPerimetro (double altezza, double larghezza) {
        return altezza * 2 + larghezza * 2;
    }

    public double calcoloArea(double altezza,double larghezza) {
        return  altezza* larghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }
}
