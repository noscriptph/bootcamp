import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String cad = ("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam sapien mauris, semper in purus sed, ullamcorper luctus lorem. Fusce non hendrerit tortor. Morbi felis tellus, finibus sed commodo sit amet, tincidunt vitae nunc. Sed iaculis, augue in faucibus pretium, libero elit viverra elit, eu pellentesque libero ante at justo. Fusce convallis ultricies libero, at tincidunt magna finibus at. Nullam in arcu libero. In vulputate, turpis et tincidunt sollicitudin, lorem augue placerat mauris, vitae placerat felis ligula et est. Pellentesque et porta ipsum, et ultrices erat. Integer blandit ornare nunc id accumsan. Morbi et dui suscipit, semper felis sit amet, fringilla neque. Nulla ac dapibus orci, euismod blandit magna. Aliquam felis justo, tempus iaculis ornare vel, consequat sit amet nisi. ");
        String cad2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Desea ocupar el texto por defecto?");
        System.out.println("Responda si o no");
        String respuesta = scanner.next();
        String terminoDeBusqueda = null;
        String terminoDeBusqueda2 = null;
        int largoCad;
        int cantidadDeTerminoBuscado = 0;
        //variables para buscar en la posicion especificada
        int posicion1=4;
        int posicion2=5;
        String txt1 = null;
        String txt2 = null;
        int temp;


        if (respuesta.equals("si")) {
            //preguntar que se quiere buscar en el texto
            System.out.println("Ingrese el caracter a buscar");
            terminoDeBusqueda = scanner.next();

            //convertir el caracter de busqueda a minuscula
            terminoDeBusqueda2=terminoDeBusqueda.toLowerCase();

            //convertir el texto original en cad a minusculas y guardarlo en cad2
            cad2 = cad.toLowerCase(Locale.ROOT);



            //identificar el largo del texto guardado
            largoCad= cad.length();
            System.out.println("El largo de la cadena es: "+ largoCad);

            //buscar que letras se encuentran en las dos posiciones indicadas y asignarlas
            txt1 = cad2.substring(posicion1);
            txt2 = cad2.substring(posicion2);

          /*  for(int i=0; i<largoCad; i++) {
            }*/

        } else if (respuesta.equals("no")) {
            System.out.println("Ingrese el texto que quiere revisar:");
            cad=scanner.next();
            //preguntar que se quiere buscar en el texto
            System.out.println("Ingrese el caracter a buscar");
            terminoDeBusqueda = scanner.next();

            //convertir el caracter de busqueda a minuscula
            terminoDeBusqueda2=terminoDeBusqueda.toLowerCase();

            //convertir el texto original en cad a minusculas y guardarlo en cad2
            cad2 = cad.toLowerCase(Locale.ROOT);



            //identificar el largo del texto guardado
            largoCad= cad.length();
            System.out.println("El largo de la cadena es: "+ largoCad);

            //buscar que letras se encuentran en las dos posiciones indicadas y asignarlas
            txt1 = cad2.substring(posicion1);
            txt2 = cad2.substring(posicion2);

        } else {
            System.out.println("La respuesta es incorrecta");

        }
        System.out.println("El termino ["+ terminoDeBusqueda + "] se repite un total de "+ cantidadDeTerminoBuscado+ " veces.");
        System.out.print("El contenido en las posiciones: "+ posicion1+" y "+posicion2+" son: ");
        System.out.println(txt1+" y "+txt2+" respectivamente");
    }
}



