import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese el numero que quiere ocupar para calcular");
        System.out.println("Su doble, su triple, raiz cuadrada y elevarlo a 7:");
        Scanner scanner = new Scanner(System.in);
        double num =  scanner.nextDouble();
        System.out.println("El doble de "+ num+" es: " +(num*2));
        System.out.println("El triple de "+ num+" es: " +(num*3));
        System.out.println("El raiz cuadrada de "+ num+" es: " +(Math.sqrt(num)));
        System.out.println(""+ num+" elevado a 7 es: " +Math.pow(num, 7));
    }
}