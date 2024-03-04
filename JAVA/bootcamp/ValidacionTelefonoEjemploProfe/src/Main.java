import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //quiero validar que los datos en el string num solo sean numeros y esa es la parte que me da problemas
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
        } else if (comprobarNumero(num) ==  false) {
            System.out.println("El numero contiene simbolos o letras");
        } else if (largoCelular.equals(num.length())) {
            System.out.println("El telefono es celular");
        } else if (largoFijo.equals(num.length())) {
            System.out.println("El telefono es fijo");
        } else {
            System.out.println("El numero ingresado no calza con los parametros");
        }



    }

    private static boolean comprobarNumero(String num) {

        boolean resultado;

        try {
            Integer.parseInt(num);
            resultado = true;
        } catch (NumberFormatException e) {
            resultado = false;
        }

        return resultado;
    }
}