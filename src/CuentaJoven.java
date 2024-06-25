public class CuentaJoven extends Cuenta{
    public double bonificacion;

    public CuentaJoven(Persona titular, double cantidad, double bonificacion) {
        super(titular, cantidad +(cantidad * bonificacion/100));
        this.bonificacion = bonificacion;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public boolean esTitularValido(){
        return this.titular.getEdad() >= 18 || this.titular.getEdad() <= 25;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("\t'Cuenta Joven' con bonificación:  "+ this.bonificacion /100+ " %");
    }

    @Override
    public void retirar(double cantidad) {
        if (esTitularValido()){
            super.retirar(cantidad);
        }else {
            System.out.println("\t\t-El titular no es valido para la retirada de dinero.");
        }
    }
}
