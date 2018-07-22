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

        for (int i = 0; i < tablica.length; i++) {


            int x;
            x = tablica[tablica.length - i - 1];

            if (i <tablica.length) {
                System.out.print(tablica[i]);
            }

            System.out.print(x);


        }

    }

}









