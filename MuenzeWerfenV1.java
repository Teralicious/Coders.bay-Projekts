import java.util.Random;

public class MuenzeWerfenV1 {

    public static void main(String[] args) {

        Random r = new Random();

        boolean kopf = r.nextBoolean(); // zufälliger Wert von true oder false

        if (kopf) {
            System.out.println("ich habe gewonnen!");
        }
        else {
            System.out.println("Stefan hat gewonnen!");
        }
    }
}
