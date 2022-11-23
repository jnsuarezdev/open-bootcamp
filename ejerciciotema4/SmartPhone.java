package poo.ejerciciotema4;

public class SmartPhone extends SmartDevice{
    protected String  cobertura;

    public SmartPhone(String cobertura) {
        this.cobertura = cobertura;
    }

    public SmartPhone(double pulgadasPantalla, String tipoConector, int amperaje, int tipoBluetooh, String cobertura) {
        super(pulgadasPantalla, tipoConector, amperaje, tipoBluetooh);
        this.cobertura = cobertura;
    }
}
