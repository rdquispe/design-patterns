import decorador.BlindajeDecorador;
import interfaces.CuentaAhorro;
import interfaces.ICuentaBancaria;
import models.Cuenta;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1, "Rodrigo");

        ICuentaBancaria cuentaAhorro = new CuentaAhorro();
        ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuentaAhorro);

        //cuenta.abrirCuenta(cuenta);
        cuentaBlindada.abrirCuenta(cuenta);
    }
}
