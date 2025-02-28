import java.util.Random;
import java.util.Scanner;

public class adivinarnumero {
    public static void main(String[] args) {
        int max = 50;
        int min = 1;
        int num_alea;

        Random ale = new Random();
        Scanner scanner = new Scanner(System.in);

        num_alea = ale.nextInt((max - min + 1)) + min;

        System.out.println("He generado un numero aleatorio entre 1 y 50. ¡Intenta adivinarlo!");
        System.out.println();

        int intentos = 3;

        for (int i = 1; i <= intentos; i++) {
            System.out.println("Intento: " + i + "" +  "Ingrese un número");
            int int_us = scanner.nextInt();

            if (int_us == num_alea) {
                System.out.println("¡Felicidades, adivinaste el número!");
                break;
            } else if (int_us > num_alea) {
                System.out.println("El número es menor. Intenta otra vez.");
            } else {
                System.out.println("El número es mayor. Intenta otra vez.");
            }

            if (i == intentos) {
                System.out.println("Perdiste. El número era: " + num_alea);
            }
        }
    }
}
