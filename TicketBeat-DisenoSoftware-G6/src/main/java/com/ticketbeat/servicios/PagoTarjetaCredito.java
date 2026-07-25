/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ticketbeat.servicios;

import com.ticketbeat.interfaces.IProveedorPago;

/**
 *
 * @author Rafael Cosmo
 */
public class PagoTarjetaCredito implements IProveedorPago {
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("[VISA/MASTERCARD] Procesando cobro por $" + monto);
        return true;
    }

    @Override
    public boolean revertirPago(double monto) {
        System.out.println("[VISA/MASTERCARD] Reembolsando $" + monto + " a la tarjeta.");
        return true;
    }

}
