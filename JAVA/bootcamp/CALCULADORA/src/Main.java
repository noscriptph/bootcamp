import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declaracion de variables
        int num1;
        int num2;
        int resultado;
        String operacion;

        //activa la lectura con Scanner
        Scanner scanner = new Scanner(System.in);

        //solicitud de operacion a realizar
        System.out.println("Ingrese que operacion desea realizar");
        System.out.println("Opciones disponibles:");
        System.out.println("Suma                Resta");
        System.out.println("Multiplicacion      Divicion");
        //lectura de operacion ingresado
        operacion = scanner.nextLine().toLowerCase();

        //solicitud de num1
        System.out.println("Ingrese el primer valor:");
        //lectura de valor ingresado
        Scanner valor = new Scanner(System.in);
        num1 = valor.nextInt();


        //solicitud de num2
        System.out.println("Ingrese el primer valor:");
        //lectura de valor ingresado
        valor = new Scanner(System.in);
        num2 = valor.nextInt();



        switch (operacion) {

            case "suma":
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;

            case "resta":
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;

            case "multiplicacion":
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicacion es: " + resultado);
                break;

            case "division":
                resultado = num1 / num2;
                System.out.println("El resultado de la divicion es: " + resultado);
                break;
                
            default:
                System.out.println("La operacion ingresada no es valida");
        }
    }
}