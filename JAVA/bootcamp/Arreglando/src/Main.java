
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] memoria = new int[3];
        int largoMemoria = memoria.length;
        int valorMasAlto = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingreso de datos:");
//ingresar datos
        for (int i = 0; i < largoMemoria; i++) {
            System.out.println("Ingrese la casilla " + (i + 1) + " de " + largoMemoria);
            memoria[i] = scanner.nextInt();
            if (memoria[i] > valorMasAlto) {
                valorMasAlto = memoria[i];
            }
        }

        System.out.println("Datos correctamente ingresados");

//leer datos
        for (int i = 0; i < largoMemoria; i++) {

            System.out.print("Casilla " + (i + 1) + "= [");
            System.out.print(memoria[i]);
            System.out.println("]");


        }
        System.out.println("El valor mas alto es: "+ valorMasAlto);
    }
}