import java.util.Arrays;
import java.util.Random;

public class Program {

    public static void main(String[] args) {

        int[] tablica = new int[5];
        Random rand = new Random();

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = rand.nextInt(10);

        }

        System.out.println(Arrays.toString(tablica));

        String x1 = new String();
        String x2 = new String();

        for (int i = 0; i < tablica.length; i++) {
            x1 = x1 + tablica[i];
            x2 = x2 + tablica[tablica.length - i - 1];
        }

        String x = x1 + x2;
        System.out.print(x);

    }

}












