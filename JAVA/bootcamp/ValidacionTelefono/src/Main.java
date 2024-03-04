import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declarar variables
        String num;
        Integer largoFijo = 8;
        Integer largoCelular = 9;
        Integer maximoLargo = 9;

        //activar scanner
        Scanner scan = new Scanner(System.in);

        //solicitar numero
        System.out.println("Ingrese numero a comprobar: ");
        num = scan.next();


        if (maximoLargo<(num.length())) {
            System.out.println("El numero es mas largo de lo permitido");
        } else if (!num.matches(1 || 2 || 3 || 4 || 5 || 6 || 7 || 8 || 9 || 0)) {
            System.out.println("El contiene simbolos o letras");
        } else if (largoCelular.equals(num.length())) {
            System.out.println("El telefono es celular");
        } else if (largoFijo.equals(num.length())) {
            System.out.println("El telefono es fijo");
        } else {
            System.out.println("El numero ingresado no calza con los parametros");
        }


    }

}
