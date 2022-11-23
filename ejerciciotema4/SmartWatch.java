package poo.ejerciciotema4;

public class SmartWatch extends SmartDevice {
    protected String requisitos;

    public SmartWatch(String requisitos) {
        this.requisitos = requisitos;
    }

    public SmartWatch(double pulgadasPantalla, String tipoConector, int amperaje, int tipoBluetooh, String requisitos) {
        super(pulgadasPantalla, tipoConector, amperaje, tipoBluetooh);
        this.requisitos = requisitos;
    }
}
