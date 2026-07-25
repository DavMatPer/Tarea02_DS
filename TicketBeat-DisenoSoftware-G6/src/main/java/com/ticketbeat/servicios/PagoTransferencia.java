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
public class PagoTransferencia implements IProveedorPago {
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("[BANCO] Validando transferencia bancaria por $" + monto);
        return true;
    }

    @Override
    public boolean revertirPago(double monto) {
        System.out.println("[BANCO] Extornando $" + monto + " a la cuenta de origen.");
        return true;
    }

}
