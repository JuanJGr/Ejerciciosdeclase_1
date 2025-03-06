import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random ale = new Random();
        Scanner scanner = new Scanner(System.in);

        int max = 6;
        int min = 1;
        int vid = 5;
        int pun = 0;
        int rond = 0;

        System.out.println("Bienvenido a El Dado Del Destino");
        System.out.println("Menú:");
        System.out.println("Si sale 1 pierde 1 vida.");
        System.out.println("Si sale el 6 gana 3 puntos.");
        System.out.println("Si sale 2 o 4 gana un punto.");
        System.out.println("Si sale 3 o 5 sigue igual.");
        System.out.println("Si llega a más de 10 puntos gana.");
        System.out.println("Si las vidas llegan a 0 pierde el juego.");

        while (vid > 0 && pun <= 10) {
            rond = rond + 1;
            System.out.println("Usted está en la ronda " + rond);
            System.out.println("Vidas: " + vid + "  Puntos: " + pun);
            System.out.println("Presiona Enter para lanzar el dado:");
            scanner.nextLine();

            int dad = ale.nextInt(max - min + 1) + min;
            System.out.println("El número generado es: " + dad);

            switch (dad) {
                case 1:
                    vid = vid - 1;
                    System.out.println("¡Perdiste 1 vida!");
                    break;
                case 6:
                    pun = pun + 3;
                    System.out.println("¡Ganaste 3 puntos!");
                    break;
                case 2:
                    pun = pun + 1;
                    System.out.println("¡Ganaste 1 punto!");
                    break;
                case 4:
                    pun = pun + 1;
                    System.out.println("¡Ganaste 1 punto!");
                    break;
                case 3:
                    System.out.println("Tus vidas y puntos siguen igual");
                    break;
                case 5:
                    System.out.println("Tus vidas y puntos siguen igual");
                    break;
            }

            if (vid == 0) {
                System.out.println("¡Te quedaste sin vidas! Perdiste el juego.");
                break;
            } else if (pun > 10) {
                System.out.println("¡Felicidades, ganaste el juego!");
                break;
            }
        }
    }
}
