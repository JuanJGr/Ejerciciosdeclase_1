import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca su peso en Kg:");
        float peso = scanner.nextFloat();

        System.out.println("Introduzca su altura en Metros:");
        float altura = scanner.nextFloat();

        float imc = peso / (altura * altura);

        System.out.printf("Su IMC es de:" + imc);

        System.out.printf(" ");

        if (imc < 18.5) {
            System.out.println("Usted esta bajo de peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Su peso es normal");
        } else if (imc >= 25 && imc <= 26.9) {
            System.out.println("Sobre peso grado I");
        } else if (imc >= 27 && imc <= 29.9) {
            System.out.println("Sobre peso grado II");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidad Tipo I");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidad tipo II");
        } else if (imc >= 40 && imc <= 49.9) {
            System.out.println("Obseidad tipo III (mórbida)");
        } else {
                System.out.println("Obseidad de Tipo IV (extrema)");
        }
    }
}