public class Main {
    public static void main(String[] args) {
        Persona juan = new Persona("Juan",30);
        Persona pepe = new Persona("Pepe",16);
        Persona maria = new Persona("Maria",20);
        Persona eddy = new Persona("Eddy",20);


            Cuenta cuenta1 = new Cuenta(juan);
                cuenta1.mostrar();
                cuenta1.ingresar(2000);
                cuenta1.retirar(3000);
                //cuenta1.transferencia("133576789",100); //No implemento el metodo transferecia en la clase Cuenta.
                cuenta1.mostrar();
        System.out.println("-------------------------------");

            CuentaExpansion cuentaExp1 = new CuentaExpansion(pepe,3000,1000);
                cuentaExp1.mostrar();
                cuentaExp1.ingresar(500);
                cuentaExp1.retirar(250);
                cuentaExp1.transferencia("123456789",300);
                cuentaExp1.mostrar();
        System.out.println("-------------------------------");

            CuentaPersonal cuentaPer1 = new CuentaPersonal(maria,1000);
                cuentaPer1.mostrar();
                cuentaPer1.ingresar(500);
                cuentaPer1.retirar(250);
                cuentaPer1.transferencia("987654321",250);
                cuentaPer1.mostrar();
        System.out.println("-------------------------------");

            CuentaJoven cuentaJoven1 = new CuentaJoven(eddy,1000,0.5);
                cuentaJoven1.mostrar();
                cuentaJoven1.retirar(100);
                //cuentaJoven1.transferencia("587852351",100); //No implemento el metodo transferecia en la clase CuentaJoven.
                cuentaJoven1.ingresar(-100);
                cuentaJoven1.mostrar();
        System.out.println("-------------------------------");
    }
}
