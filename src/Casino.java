import java.util.Random;
import java.util.Scanner;

public class Casino {
    public static void main(String[] args) {
        Random ale = new Random();
        Scanner scanner = new Scanner(System.in);

        int max = 3;
        int min = 1;
        int num;
        int din;

        System.out.println("Ingrese el monto inicial para apostar:");
        din = scanner.nextInt();

        do {
            num = ale.nextInt(max - min + 1) + min;
            System.out.println("El número generado es: " + num);

            if (num == 1) {
                din = din * 2;
                System.out.println("¡Felicidades, duplicaste tu apuesta! Tu monto ahora es: " + din);
            } else if (num == 2) {
                din = din / 2;
                System.out.println("Perdiste; tu monto se redujo a: " + din);
            } else if (num == 3) {
                din = 0;
                System.out.println("¡PERDISTE TODA TU APUESTA! Tu monto ahora es: " + din);
                break;
            }

            System.out.println("¿Quieres seguir jugando? (1 = Sí, 2 = No):");
            int respuesta = scanner.nextInt();

            if (respuesta == 2) {
                System.out.println("Te retiras con un monto de: " + din);
                break;
            }

        } while (din > 0);

    }
}
