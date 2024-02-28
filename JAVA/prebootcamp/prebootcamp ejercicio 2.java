import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//variable i que se usara como contador

        System.out.println("indique el valor de repeticiones entre 1 y 62");//muestra un mensaje en consola
        Scanner scan = new Scanner(System.in);
        double maxi = Double.parseDouble(scan.nextLine());
        long resultado = 0;
        if (maxi < 62) {

            for (int i = 0; i < maxi; i++) {
                resultado = resultado + (resultado + 1);
                System.out.print("i=");
                System.out.print(i);
                System.out.print("     resultado=");
                System.out.println(resultado);

            }

        } else {
            System.out.println("valor mal ingresado, excede la memoria disponible para el resultado");
        }
    }
}