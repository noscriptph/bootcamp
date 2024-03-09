package cl.cafetera.clases;

public class Cafetera {

 /*
    1)Atributos de una clase
     */
    /*modificadores de acceso, son parte de los polimorfismos
    public, private, protected y son palabras reservadas
    */
    //valores iniciales para cafetera
    /**
     * cantidad actual de agua
     */
    private int capacidadActualDeAgua = 0;
    /**
     * cantidad de agua para llenar
     */
    private int capacidadMaxDeAgua = 1000;
    /**
     * temperatura ambiente
     */
    private int temperatura = 21;
    /**
     * temperatura maxima para calentar el agua
     */
    private int temperaturaParaServir = 80;
    /**
     * cantidad actual de cafe en la cafetera
     */
    private int cantidadActual = 0;
    /**
     * maxima cantidad de gramos de cafe
     */
    private int capacidadMaxima = 30;


    /*
    2)Constructor
     */
    public Cafetera() {

    }




    /*
    3)Metodos de acceso
     */

    public int getCapacidadActualDeAgua() {
        return capacidadActualDeAgua;
    }

    public void setCapacidadActualDeAgua(int capacidadActualDeAgua) {
        this.capacidadActualDeAgua = capacidadActualDeAgua;
    }

    public int getCapacidadMaxDeAgua() {
        return capacidadMaxDeAgua;
    }

    public void setCapacidadMaxDeAgua(int capacidadMaxDeAgua) {
        this.capacidadMaxDeAgua = capacidadMaxDeAgua;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getTemperaturaParaServir() {
        return temperaturaParaServir;
    }

    public void setTemperaturaParaServir(int temperaturaParaServir) {
        this.temperaturaParaServir = temperaturaParaServir;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

/*
    4)Metodos de comportamiento
     */

    /**
     * opcion 1
     * muestra el estado de cafe antes y despues de llenar con agua y cafe
     */
    public void llenarCafetera() {
        System.out.println("Cantidad de agua actual= " + getCapacidadActualDeAgua() + " ml");
        System.out.println("Cantidad de cafe actual= " + getCantidadActual() + " g");
        setCapacidadActualDeAgua(getCapacidadMaxDeAgua());//llena con agua
        setCantidadActual(getCapacidadMaxima());//llena con cafe
        System.out.println("Capacidad actual despues de llenar cafe y agua");
        System.out.println("Cantidad de agua en cafetera= " + getCapacidadActualDeAgua() + " ml");
        System.out.println("Cantidad de cafe en cafetera= " + getCantidadActual() + " g");
    }

    /**
     * opcion 2
     * sirve una taza de cafe despues de
     * comprobar que el agua, cafe y temperatura esten bien para servir
     */
    public void servirTaza() {
        System.out.println("Tratando de servir una taza de 250ml de agua");
        System.out.println("Comprobando agua, temperatura y cafe");

        if ((getCapacidadActualDeAgua() >= 250) || ((getCantidadActual() >= 10)) || (getTemperatura() >= 80)) {
            System.out.println("Preparando una taza...");
            setCantidadActual((getCapacidadMaxima() - 10));//resta 10g de cafe
            setCapacidadActualDeAgua((getCapacidadActualDeAgua() - 250));//resta 250ml de agua a la cafetera
            setTemperatura(getTemperatura() - 10);//cada vez que se sirve una taza el agua se enfria 10 grados
            System.out.println("Taza servida! disfrute ;)");
        } else {
            System.out.println("Revise agua, cafe y temperatura");
        }

    }

    /**
     * opcion 3
     * muestra la cantidad de agua dentro de la cafetera
     */
    public void verCantidadDeAgua() {
        System.out.println("Actualmente quedan " + getCapacidadActualDeAgua() + "ml de agua");
    }

    /**
     * opcion 4
     * calienta el agua si su cantidad es mas de 250ml, pero si es menor se informa
     * para que el usuario ponga mas agua
     */
    public void calentarAgua() {
        if (getCapacidadActualDeAgua() < 250) {
            System.out.println("La cantidad de agua es insuficiente");
        } else if (getCapacidadActualDeAgua() > 250) {
            System.out.println("Calentando agua");
            setTemperatura(100);
            System.out.println("Agua hervida a 100 grados lista para usar");
        } else {
            System.out.println("Error inesperado, informar a servicio tecnico");
        }
    }

    /**
     * opcion 5
     * vacia el agua de la cafetera
     */
    public void vaciarCafetera() {
        System.out.println("Vaciando cafetera, espere un momento");
        setCapacidadActualDeAgua(0);
        System.out.println("Listo! cafetera sin agua");
    }

    /**
     * opcion 6
     * muesta cantidad de agua, cantidad de cafe y temperatura
     * la temperatura no puede ser menor a temperatura ambiente
     */
    public void verEstadoDeLaCafetera() {
        System.out.println("Entregando estado de la cafetera");
        System.out.println("Agua en cafetera: " + getCapacidadActualDeAgua() + "ml");
        System.out.println("Cafe en cafetera: " + getCantidadActual() + "g");
        if (getTemperatura() < 21) {
            System.out.println("El agua esta a 21 grados celcius");
        } else {
            System.out.println("El agua esta a " + getTemperatura() + " grados celcius");
        }
    }




    /*
    5)Metodos utilitarios o de logica
     */

}
