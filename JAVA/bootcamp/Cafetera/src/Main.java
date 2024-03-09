import cl.cafetera.clases.Cafetera;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String accionUsuario = "";
        String menu = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Indique con un numero que desea hacer");


        // Esto ya es un objeto
        Cafetera cafetera = new Cafetera(); //Cuenta es un constructor

        do {

            try {
                // Aca muestro por pantalla
                System.out.println("1) Poner agua y cafe en cafetera");

                System.out.println("2) Servir en una taza");

                System.out.println("3) Ver cantidad de agua dentro de la cafetera (1lt=1000ml)");

                System.out.println("4) Calentar el agua");

                System.out.println("5) Vaciar agua de la cafetera");

                System.out.println("6) Ver el estado de la cafetera");


                menu = scanner.next();


                switch (menu) {
                    case "1":
                        cafetera.llenarCafetera();
                        break;
                    case "2":
                        cafetera.servirTaza();
                        break;
                    case "3":
                        cafetera.verCantidadDeAgua();
                        break;
                    case "4":
                        cafetera.calentarAgua();
                        break;
                    case "5":
                        cafetera.vaciarCafetera();

                        break;
                    case "6":
                        cafetera.verEstadoDeLaCafetera();

                        break;

                    default:
                        System.out.println("Accion invalida, intentelo denuevo");
                        break;
                }


            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            } finally {
                System.out.println(" ");
                System.out.println("Escriba [salir] para cerrar la app , o solo [seguir] para continuar");
                accionUsuario = scanner.next();
            }

        } while (!accionUsuario.toLowerCase().equals("salir"));
        System.out.println("Gracias por usar la cafetera");
    }

}