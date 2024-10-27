import java.util.Scanner;

public class BetrunkenV2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Alter?");
        int Age = sc.nextInt();

        System.out.println("Führerschein?");
        boolean license = sc.nextBoolean();

        System.out.println("Bier?");
        int a = sc.nextInt();
        System.out.println("Shots?");
        int b = sc.nextInt();
        int c = a+b;

        if (c == 0 && Age == 17  && license ) {
            System.out.println("Du darfst Fahren!");

        }
        else if (c == 0 && Age == 18  && license ) {
            System.out.println("Du darfst Fahren!");

        }
        else if (c > 0 && c < 3 && Age >18  && license ) {
            System.out.println("Du darfst Fahren!");

        }
        else {
            System.out.println("Du darfst nicht fahren!");
            
        }


    }
}