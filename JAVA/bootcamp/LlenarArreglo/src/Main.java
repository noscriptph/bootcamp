import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //inizializar variables
        int suma = 0 ;
        Scanner scanner = new Scanner(System.in);
        int N;
        
        //pedir y guardar tamaño de vector
        System.out.println("Indique tamaño de vector:");
        N = Integer.parseInt(scanner.nextLine());
        int[] vector= new int[N];

        for(int i = 0; i<N; i++){
            System.out.println("indique valor en posicion "+ (i+1));
            vector[i]= scanner.nextInt();
            System.out.println("valor variable suma: "+ suma);
            suma= vector[i]+suma;

        }
        System.out.println("vector completo: " );

        for(int i = 0; i<N; i++){
            System.out.print("coordenada:" + i + " [");
            System.out.print( vector[i]);
            System.out.print("],");
        }
        System.out.println("");
        System.out.println("valor final suma: "+ suma);
    }
}