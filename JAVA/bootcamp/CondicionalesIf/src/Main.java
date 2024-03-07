import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //habilitar Scanner
        Scanner scanner = new Scanner(System.in);
        //ventana bienvenida
        System.out.println("▒▒██████████████████████████████████████████████▓▓");
        System.out.println("▓▓  Comprobacion de numeros pares e impares     ▓▓");
        System.out.println("▒▒██████████████████████████████████████████████▓▓");


        //preguntar por el número al usuario
        System.out.println("Ingrese el numero a comprobar");
        System.out.print("►");
        //inicializar variable número y luego asignarle el valor scaneado
        Integer numero = scanner.nextInt();



        if (numero < 0) {//comprobar si el numero es negativo
            System.out.println("►►El numero " + numero + " es negativo");
            ComprobacionImpar(numero);//usa el metodo para verificar si es par o impar

        } else if (numero > 0) {//comprobar si el numero es positivo
            System.out.println("►►El numero " + numero + " es positivo");
            ComprobacionImpar(numero);//usa el metodo para verificar si es par o impar

        } else if (numero.equals(0)) {//comprobar si el numero es 0
            System.out.println("►►El numero " + numero + " es cero");

        } else {//mensaje por defecto en caso que no coincida con las 3 opciones anteriores
            System.out.println("El dato " + numero + " es incorrecto");

        }
    }
    //METODOS
    //metodo para comprobar si un numero es impar o par
    static void ComprobacionImpar(Integer numero){
        Integer resultado;
        resultado = numero%2;//divide en 2 pero el sobrante es el que se guarda en la variable resultado


        if(resultado.equals(0)){
            System.out.println("►►►El numero es par");
        } else if (numero.equals(0)) {
            System.out.println("Al ser cero el numero no es par ni impar");
        }else{
            System.out.println("►►►El numero es impar");
        }

    }


}