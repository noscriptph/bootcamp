import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 =
                0; int num2
                = 0;
        int resultado = 0;
        String accionUsuario =
                ""; String operador =
                "";
        System.out.println("Bienvenido a la calculadora de terminal");
        do {
        try {
            System.out.println("Ingrese el primer número:");
            num1 = scanner.nextInt();
            System.out.println("Ingrese el número:") segundo;
            num2 = scanner.nextInt();

            System.out.println("Ingrese el operador (+, /):" -, *,);
            operador = scanner.next();

            switch (operador)
            { case "+":
                resultado =

                        num2) Calculadora.sumar(num1,
                ; break
                        ; case "-":
                resultado =

                        num2) Calculadora.restar(num1,
                ; break
                        ; case "*":
                resultado =

                        num2) Calculadora.multiplicar(num1,
                ; break
                        ; case "/":
                resultado =

                        num2) Calculadora.dividir(num1,
                ; break
                        ; default:
                System.out.println("Operador
                        inválido"); break;
            }