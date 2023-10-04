package Entity;

public class EsercizioRettangolo {
    private double altezza;
    private double larghezza;

    public EsercizioRettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
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
