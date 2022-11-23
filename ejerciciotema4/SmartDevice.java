package poo.ejerciciotema4;

public class SmartDevice  {
    // 1 - Atributos
    protected double pulgadasPantalla;
    protected String tipoConector;
    protected int amperaje;
    protected int tipoBluetooh;

    //2 - Constructores
    public SmartDevice(){

    }

    public SmartDevice(double pulgadasPantalla, String tipoConector, int amperaje, int tipoBluetooh) {
        this.pulgadasPantalla = pulgadasPantalla;
        this.tipoConector = tipoConector;
        this.amperaje = amperaje;
        this.tipoBluetooh = tipoBluetooh;
    }
}
