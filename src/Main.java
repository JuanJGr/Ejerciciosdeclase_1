import java.util.Random;

public class Main {
    public static void main(String[] args) {


        int max = 10;
        int min = 1;
        int rondas, d1, d2;
        int contd1=0, contd2=0;

        Random ale = new Random();

        rondas = ale.nextInt((max - min + 1)) + min;
        System.out.println("cantidad de rondas: " + rondas);

        for (int i = 1; i<= rondas; i++) {
            d1 = ale.nextInt((6 - 1 + 1)) + 1;
            contd1 += d1;

            d2 = ale.nextInt((6 - 1 + 1)) + 1;
            contd2 += d2;

            System.out.println();
            System.out.println("D1: " + d1);
            System.out.println("D2: " + d2);

            System.out.println("Suma dado 1:" + contd1);
            System.out.println("Suma dado 3:" + contd2);
            if (contd2 <= contd1) {
                System.out.println("El ganador es: dado 1");
            }
            else
            {
                System.out.println("El ganador es: dado 2");
            }
        }
    }
}