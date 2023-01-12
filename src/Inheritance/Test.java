package Inheritance;

public class Test {
    public static void main(String[] args) {
        Maruti maruti = new Maruti();

        maruti.wheels();
        maruti.engine();
        maruti.speed();
        maruti.doors();
        maruti.vehicleType();

        System.out.println("************************");

        Maruti maruti1 = new Alto();
        maruti1.wheels();
        maruti1.engine();
        maruti1.speed();
        maruti1.doors();
        maruti1.vehicleType();

    }



}
