import java.sql.SQLOutput;

public class TaschenRechnerV1 {
    public static void main(String[] args) {


        int a =5;
        int b =3;
        //double d = (double) a/b;

        System.out.println(a + "+" + b + "=" + (a+b));
        System.out.println(a + "-" + b + "=" + (a-b));
        System.out.println(a + "*" + b + "=" + (a*b));
        System.out.println(a + "/" + b + "=" + ((double) a/b));
        System.out.println(a + "%" + b + "=" + a%b);

    }
}
