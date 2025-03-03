import java.util.Scanner;
import java.util.Random;

public class calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random ale = new Random();

        boolean continuar = true;

        while (continuar) {
            int max = 100;
            int min = 1;

            int num1 = ale.nextInt((max - min + 1)) + min;
            int num2 = ale.nextInt((max - min + 1)) + min;


            System.out.println("Operación: + (Suma), - (Resta), * (Multiplicación), / (División), ^ (Exponente), % (Módulo)");

            System.out.print("Ingresa un signo aritmético: ");
            char operacion = scanner.nextLine().charAt(0);
            System.out.println("Los números aleatorios generados son: " + num1 + " y " + num2);

            double resultado = 0;

            if (operacion == '+') {
                resultado = num1 + num2;
                System.out.println("Resultado de la suma: " + resultado);
            } else if (operacion == '-') {
                resultado = num1 - num2;
                System.out.println("Resultado de la resta: " + resultado);
            } else if (operacion == '*') {
                resultado = num1 * num2;
                System.out.println("Resultado de la multiplicación: " + resultado);
            } else if (operacion == '/') {
                if (num2 != 0) {
                    resultado = (double) num1 / num2;
                    System.out.println("Resultado de la división: " + resultado);
                } else {
                    System.out.println("No se puede dividir por cero.");
                }
            } else if (operacion == '^') {
                resultado = calcularPotencia(num1, num2);
                System.out.println("Resultado de la potencia: " + resultado);
            } else if (operacion == '%') {
                resultado = num1 % num2;
                System.out.println("Resultado del módulo: " + resultado);
            } else {
                System.out.println("Operación no válida.");
            }

            System.out.print("¿Deseas realizar otra operación? (1 para sí, 2 para no): ");
            int respuesta = scanner.nextInt();
            scanner.nextLine();
            if (respuesta == 2) {
                continuar = false;
            }
        }

        System.out.println("¡Gracias por usar la calculadora!");

    }

    public static double calcularPotencia(int base, int exponente) {
        double resultado = 1;

        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }

        return resultado;
    }
}
