public class Main {
    public static void main(String[] args) {

        System.out.println("Iterando");
        System.out.println("");
        System.out.println("se ejecutaran 3 ciclos los cuales iran de 1 a 10");
        System.out.println("");
        System.out.println("-bucle while");
        System.out.println("-bucle do-while");
        System.out.println("-bucle for");
        System.out.println("");
        System.out.println("");
        System.out.println("Resultados primer bucle:");
        //declarar variable i para ser usada en los 3 bucles
        int i = 0;
        int resultado = 0;
        int ciclos = 10;
        //bucle while
        while (i < ciclos) {
            resultado = resultado + 1;
            i++;
            System.out.println("-Bucle while " + i );
        }

        i = 0;
        resultado = 0;

        //bucle do-while
        System.out.println("");
        System.out.println("Resultados segundo bucle:");

        do {
            resultado = resultado + 1;
            i++;
            System.out.println("-Bucle do-while " + i );

        } while (i < ciclos);

        resultado = 0;

        //bucle for
        System.out.println("");
        System.out.println("Resultados tercer bucle:");
        for(i=1; i<(ciclos+1); i++){
            resultado = resultado + 1;

            System.out.println("-Bucle for " + i );

        }
    }
}