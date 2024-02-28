import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Indique su edad: ");
        Scanner scanner = new Scanner(System.in);
        int edad = scanner.nextInt();//guarda la edad del usuario en edad

        int edadMayoriaDeEdad = 18;//esta variable depende del pais
        if (edad >= (edadMayoriaDeEdad)) {
            System.out.print("Es mayor");


        } else {
            System.out.print("Es menor");

        }
        
    }
}