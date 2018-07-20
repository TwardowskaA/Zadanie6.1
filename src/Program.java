import java.util.Random;

public class Program {

    public static void main(String[] args) {

        int[] tablica = new int[20];
        Random rand = new Random();

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = rand.nextInt(10);

        }


        for (int i = 0; i < tablica.length; i++) {

            int x;
            x = tablica[tablica.length - i -1];

            System.out.print(tablica[i]);
            System.out.print(x);

        }

    }

}









