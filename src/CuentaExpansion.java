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

    public void transferencia(String numeroCuenta, double cantidad) {
        this.retirar(cantidad);
        System.out.println("\t\t\t Se ingresó en "+numeroCuenta+" la cantidad: "+cantidad +" $.");
    }
}
