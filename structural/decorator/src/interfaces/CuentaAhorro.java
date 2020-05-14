package interfaces;

import models.Cuenta;

public class CuentaAhorro implements ICuentaBancaria {

    @Override
    public void abrirCuenta(Cuenta cuenta) {
        System.out.println("-------------------------");
        System.out.println("Se abrir una cuenta de Ahorros");
        System.out.println("Cliente: " + cuenta.getCliente());
    }

}