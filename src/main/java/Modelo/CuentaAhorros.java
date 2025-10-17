/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Jonatan
 */
public class CuentaAhorros extends Cuenta{
    
    public CuentaAhorros(String numeroCuenta, double saldo, Cliente cliente) {
        super(numeroCuenta, saldo, cliente);
    }
    
    @Override
    public boolean retirar(double valor) {
        if (valor > saldo) {
            System.out.println("fondos insuficientes. retiro fallido.");
            return false;
        } else {
            saldo -= valor;
            System.out.println("retiro exitoso. nuevo saldo: $" + saldo);
            return true;
        }
    }

    public boolean consignar(double valor, String motivo) {
        System.out.println("motivo de la consignación: " + motivo);
        return consignar(valor);
    }

    public void realizarReembolso(double valor) {
        saldo += valor;
        System.out.println("reembolso realizado. su suevo saldo es de: $" + saldo);
    }
    
}
