public class EinMalEinsV3 {

    public static void main(String[] args) {

        int x = 1;


        do {

            for (int z = 1; z <= 10; z++) {
                System.out.println(z + "x" + x + "=" + z * x);
            }

            x++;

        } while (x <= 10);

    }

}