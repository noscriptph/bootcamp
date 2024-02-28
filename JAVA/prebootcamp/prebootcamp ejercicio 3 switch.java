import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("“¿Cómo es el clima de hoy?");//muestra un mensaje en consola
        Scanner scan = new Scanner(System.in);
        int selection = Integer.parseInt(scan.nextLine());


        switch (selection) {
            case 1:
                System.out.println("Soleado");
                break;
            case 2:
                System.out.println("Nublado");
                break;
            case 3:
                System.out.println("Lluvioso");
                break;
            case 4:
                System.out.println("Tormentoso");
                break;
            case 5:
                System.out.println("nevado");
                break;
            default:
                System.out.println("Pregúntale a Google");
                break;
        }


    }
}