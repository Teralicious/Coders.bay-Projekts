import java.util.Random;
import java.util.Scanner;

public class MuenzeWerfenV2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Gib die erste Zahl ein:");
        int wurf = sc.nextInt();
        int kopf = 0;
        int zahl = 0;




        for (int a = 1; a <= wurf; a++ ) {
            boolean coin = r.nextBoolean(); // zufälliger Wert von true oder false

            if (coin == true){
                System.out.println("Werfe Münze . . . Kopf!");
                kopf++;

            }
            else {
                System.out.println("Werfe Münze . . . Zahl!!");
                zahl++;
            }
        }
        System.out.println();
        System.out.println("Summe Kopf:" + kopf);
        System.out.println("Summe Zahl:" + zahl);
        System.out.println();

        if (kopf > zahl){
            System.out.println("Ich bekomme das Ticket!");
        }
        else if (kopf == zahl) {
            System.out.println("Unentschieden!");

        }
        else {
            System.out.println("Stefan bekommt das Ticket!");
        }
    }
}