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
public class PagoMovil implements IProveedorPago {
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("[APP MÃ“VIL] Cobro rÃ¡pido procesado por $" + monto);
        return true;
    }

    @Override
    public boolean revertirPago(double monto) {
        System.out.println("[APP MÃ“VIL] Reembolso enviado a la billetera digital.");
        return true;
    } 
}
