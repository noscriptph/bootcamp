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


        //llamada de metodos



    }


    //METODOS

    //pide el primer numero
    public static int primerNumero(int num1){//definicion
        //solicitud de num1
        System.out.println("Ingrese el primer valor:");
        //lectura de valor ingresado
        Scanner valor = new Scanner(System.in);
        num1 = valor.nextInt();
        return num1;
    }
    //pide el segundo numero
    public static int segundoNumero(int num2){//definicion
        //solicitud de num2
        System.out.println("Ingrese el primer valor:");
        //lectura de valor ingresado
        Scanner valor = new Scanner(System.in);
        num2 = valor.nextInt();
        return num2;
    }

}