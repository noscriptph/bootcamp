import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ingrese el numero de mes a consultar");
        System.out.println("1 Enero     2 Febrero       3 Marzo");
        System.out.println("4 Abril     5 Mayo          6 Junio");
        System.out.println("7 Julio     8 Agosto        9 Septiembre");
        System.out.println("10 Octubre  11 Noviembre    12 Diciembre");
        int mes = 0;
        Scanner scanner= new Scanner(System.in);
        mes = scanner.nextInt();


        switch(mes){
            case 1:
                System.out.println("Enero pertenece al verano");

                break;
            case 2:
                System.out.println("Febrero pertenece al verano");

                break;
            case 3:
                System.out.println("Marzo pertenece al verano");

                break;
            case 4:
                System.out.println("Abril pertenece al otoño");

                break;
            case 5:
                System.out.println("mayo pertenece al otoño");

                break;
            case 6:
                System.out.println("junio pertenece al otoño");

                break;
            case 7:
                System.out.println("julio pertenece al invierno");

                break;
            case 8:
                System.out.println("agosto pertenece al invierno");

                break;
            case 9:
                System.out.println("septiembre pertenece al invierno");

                break;
            case 10:
                System.out.println("octubre pertenece al primavera");

                break;
            case 11:
                System.out.println("noviembre pertenece al primavera");

                break;
            case 12:
                System.out.println("diciembre pertenece al primavera");

                break;

            default:
                System.out.println("El numero ingresado no corresponde");
        }

    }
}