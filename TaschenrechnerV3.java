import java.util.Scanner;

public class TaschenrechnerV3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char operator = '#';

        while (operator != 'x') {


            System.out.println("Gib den Operator (+, -, *, /, %,x) ein:");
            operator = sc.next().charAt(0);

            System.out.println("Gib die erste Zahl ein:");
            int a = sc.nextInt();

            System.out.println("Gib die zweite Zahl ein:");
            int b = sc.nextInt();


            switch (operator) {
                case '+':
                    System.out.println(a + "+" + b + "=" + (a + b));
                    break;
                case '-':
                    System.out.println(a + "-" + b + "=" + (a - b));
                    break;
                case '*':
                    System.out.println(a + "*" + b + "=" + (a * b));
                    break;
                case '/':
                    System.out.println(a + "/" + b + "=" + ((double) a / b));
                    break;
                case '%':
                    System.out.println(a + "%" + b + "=" + (a % b));
                    break;
                case 'x':
                    break;
                default:
                    System.out.println("Falscher Operator!");

            }
        }
    }
}