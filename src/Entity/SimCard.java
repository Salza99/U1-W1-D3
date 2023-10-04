package Entity;

public class SimCard {
    private long telephoneNumber;
    private double credit;
    private String[] callList;

    public SimCard(long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        this.credit = 0.0;
    }

    public long getTelephoneNumber() {
        return telephoneNumber;
    }

    public double getCredit() {
        return credit;
    }

    public String[] getCallList() {
        return callList;
    }
}
