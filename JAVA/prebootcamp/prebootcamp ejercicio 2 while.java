import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//variable i que se usara como contador

        System.out.println("indique el valor de repeticiones (n) entre 1 y 62");//muestra un mensaje en consola
        Scanner scan = new Scanner(System.in);
        double maxi = Double.parseDouble(scan.nextLine());

        long resultado = 0;
        int i = 0;
        if (maxi < 62) {
            while (maxi > i) {
                resultado = resultado + (resultado + 1);

                System.out.print("i=");
                System.out.print(i);
                System.out.print("     resultado=");
                System.out.println(resultado);
                i++;
            }
            System.out.println("🎖️el valor de i alcanzo a n =" + i + " ,por ende ya se realizaron " + i + " repeticiones");
        } else {
            System.out.println("valor mal ingresado😔, excede la memoria disponible para el resultado");
        }
    }
}