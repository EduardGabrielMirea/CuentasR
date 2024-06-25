public class CuentaExpansion extends Cuenta{

    public double minimoIngresoMensual;

    public CuentaExpansion(Persona titular, double cantidad, double minimoIngresoMensual) {
        super(titular, cantidad);
        this.minimoIngresoMensual = minimoIngresoMensual;
    }


    public double getMinimoIngresoMensual() {
        return minimoIngresoMensual;
    }

    public void setMinimoIngresoMensual(double minimoIngresoMensual) {
        this.minimoIngresoMensual = minimoIngresoMensual;
    }

    @Override
    public void transferencia(String numeroCuenta, double cantidad) {
        super.transferencia(numeroCuenta, cantidad);
    }
}
