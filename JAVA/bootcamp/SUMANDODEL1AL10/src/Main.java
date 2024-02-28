import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//declaracion de variables

        int num = 0;
        int suma = 0;
        int limite = 0;
        Scanner scanner = new Scanner(System.in);

        //pregunta limite a sumar
        System.out.println("Ingrese limite hasta el que sumar: ");
        limite = scanner.nextInt();


        for (int i = 0; i < limite; i++) {
            System.out.println("Ingrese valor a sumar: ");
            num = scanner.nextInt();
            System.out.println("Ciclo actual: " + i);
            suma=num+suma;
            System.out.println("Resultado:  " + suma);


        }
        System.out.println("Se llego al limite de ciclos que es: " + limite);
        System.out.println("El resultado final es: " + suma);
    }
}
