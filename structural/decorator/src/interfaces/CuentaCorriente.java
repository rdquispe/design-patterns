package interfaces;

import models.Cuenta;

public class CuentaCorriente implements ICuentaBancaria {

    @Override
    public void abrirCuenta(Cuenta cuenta) {
        System.out.println("-------------------------");
        System.out.println("Se abrir una cuenta Corriente");
        System.out.println("Cliente: " + cuenta.getCliente());
    }

}