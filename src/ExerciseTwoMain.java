import Entity.SimCard;

import java.util.Arrays;

public class ExerciseTwoMain {
    public static void main(String[] args) {


        SimCard userOne = new SimCard(3453338871L);
        stampaDatiSim(userOne);

    }
    public static void stampaDatiSim(SimCard a) {
        System.out.println("Number: " + a.getTelephoneNumber() + " credit: " + a.getCredit() + " recent calls: " + Arrays.toString(a.getCallList()));
    }
}
