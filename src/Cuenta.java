import java.util.UUID;
public class Cuenta {
    public Persona titular;
    public double cantidad;


    public Cuenta(Persona titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(Persona titular) {
        this.titular = titular;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void mostrar(){
        System.out.println("\nDatos de la cuenta: \n" + "\t Nombre: "+this.titular+"\n\t Cantidad de $ en la cuenta: "+ this.cantidad+ " $");
    }

    public void ingresar(double cantidad){
        if (cantidad >= 0.0){
            this.cantidad += cantidad;
            System.out.println("\t\t-Se ingresan "+cantidad+" $ en la cuenta.\n");
        }else {
            System.out.println("\t\t(La cantidad no puede ser negativa. Porfavor introduzca una cantidad positiva.)\n");
        }
    }

    public void retirar(double cantidad){
        if (cantidad > 0.0){
            this.cantidad -= cantidad;
            System.out.println("\t\t-Se han retirado "+cantidad+" $ de la cuenta.");
                if (this.cantidad < 0){
                    System.out.println("\t\tEstas en numeros rojos: "+this.cantidad+ " $.\n");
                }
        }else {
            System.out.println("\t\t-No se puede retirar numeros negativos. Introduzca una cantidad positiva.\n");
        }
    }
    public void transferencia(String numeroCuenta, double cantidad){
        //Necistamos que retire de esta cuenta.
        this.retirar(cantidad);
        System.out.println("\t\t\t Se ingresó en "+numeroCuenta+" la cantidad: "+cantidad +" $.");
    }
}
