import java.util.Scanner;
public class CleanThis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Alter: ");
        int age = sc.nextInt();
        System.out.print("Mit Erwachsenem (true/false): ");
        boolean withAdult = sc.nextBoolean();
        System.out.print("VIP (true/false): ");
        boolean VIP = sc.nextBoolean();

        if (age >= 18) System.out.println("Grünes Band");
        else if (age >= 16) System.out.println("Gelbes Band");
        else if (age >= 4 && withAdult) System.out.println("Rotes Band");
        else System.out.println("Kein Zutritt");

        if (age >= 4 && VIP) System.out.println("Goldenes Band dazu!");
        else if (age >= 4) System.out.println("Kein goldenes Band dazu!");
    }
}