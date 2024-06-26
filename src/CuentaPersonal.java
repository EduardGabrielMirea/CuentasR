public class CuentaPersonal extends Cuenta{
    public CuentaPersonal(Persona titular, double cantidad) {
        super(titular, cantidad);
    }


    public void transferencia(String numeroCuenta, double cantidad) {
        double comision = 3.0;
        this.retirar(cantidad + comision);
        System.out.println("\t\t\t Se ingresó en "+numeroCuenta+" la cantidad: "+cantidad +" $ (Con comisión: " +comision+" $)");
    }

    /* public void transferencia(String numeroCuenta, double cantidad){
        //Necistamos que retire de esta cuenta.
        double comision = 3.0;
        this.retirar(cantidad + comision);
        System.out.println("-Se ingresó en "+numeroCuenta+" la cantidad: "+cantidad +" $." + "\n Con comisión: " +comision+" $.");
    }

    */
}
