package poo.ejerciciotema4;

public class Main {
    public static void main(String[] args) {


        SmartDevice smartDevice = new SmartDevice(4.7, "Tipo C", 2900, 5);
        SmartPhone smartPhone = new SmartPhone(5.1,"Tipo A", 3000, 4, "5G");
        SmartWatch smartWatch = new SmartWatch(1.7, "Lightning", 800, 5, "iPhone");

        System.out.println(smartWatch.pulgadasPantalla);
        System.out.println(smartWatch.tipoConector);
        System.out.println(smartWatch.amperaje);
        System.out.println(smartWatch.tipoBluetooh);
        System.out.println(smartWatch.requisitos);
    }
}
