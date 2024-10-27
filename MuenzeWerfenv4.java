import java.util.Random;
import java.util.Scanner;

class MuenzeWerfenV4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int wurf;
        int kopf = 0;
        int zahl = 0;
        boolean zufrieden;


        do {


            do {
                System.out.println("Gib eine ungerade zahl zwischen 1 und 10 ein");
                wurf = sc.nextInt();
            } while (wurf > 10 || wurf < 1 || wurf % 2 == 0);


            for (int a = 1; a <= wurf; a++) {
                boolean coin = r.nextBoolean(); // zufälliger Wert von true oder false

                if (coin) {
                    System.out.println("Werfe Münze . . . Kopf!");
                    kopf++;

                } else {
                    System.out.println("Werfe Münze . . . Zahl!!");
                    zahl++;
                }
            }


            System.out.println();
            System.out.println("Summe Kopf:" + kopf);
            System.out.println("Summe Zahl:" + zahl);
            System.out.println();


            System.out.println("Bist du mit dem ergebnis zufrieden?");
            zufrieden = sc.nextBoolean();


            if (!zufrieden) {

                do {
                    System.out.println("Gib eine gerade zahl zwischen 1 und 10 ein");
                    wurf = sc.nextInt();
                } while (wurf > 10 || wurf < 1 || wurf % 2 == 1);


                for (int a = 1; a <= wurf; a++) {
                    boolean coin = r.nextBoolean(); // zufälliger Wert von true oder false

                    if (coin) {
                        System.out.println("Werfe Münze . . . Kopf!");
                        kopf++;

                    } else {
                        System.out.println("Werfe Münze . . . Zahl!!");
                        zahl++;
                    }
                }

                System.out.println();
                System.out.println("Summe Kopf:" + kopf);
                System.out.println("Summe Zahl:" + zahl);
                System.out.println();

                System.out.println("Bist du mit dem ergebnis zufrieden?");
                zufrieden = sc.nextBoolean();

            }

        } while (!zufrieden);

        if (kopf > zahl) {
            System.out.println("Ich bekomme das Ticket!");

        } else {
            System.out.println("Stefan bekommt das Ticket!");


        }
    }
}