import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String usuarioCorrecto = "user";
        String claveCorrecta = "admin";
        String usuario = "valor";
        String contrasena = "valor";


        System.out.println("ingrese usuario: ");
        Scanner scanner1 = new Scanner(System.in);
        usuario = scanner1.next();//guarda el password del usuario

        System.out.println("ingrese contraseña: ");
        Scanner scanner2 = new Scanner(System.in);
        contrasena = scanner2.next();//guarda el password del usuario


        if ((claveCorrecta.equals(contrasena)) && (usuarioCorrecto.equals(usuario)) ){
            System.out.print("Datos validos");

        } else {
            System.out.print("Datos invalidos");

        }

    }
}