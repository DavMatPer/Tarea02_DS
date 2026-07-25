package com.ticketbeat.gestores;

import com.ticketbeat.interfaces.IProveedorPago;

public class GestorReservas {

    public void buscarEventos() {
        System.out.println("Mostrando eventos disponibles...");
    }

    public void seleccionarEvento() {
        System.out.println("Mostrando tipos de entradas...");
    }

    public void elegirCantidadYTipoDeEntrada() {
        if (verificarDisponibilidad()) {
            reservarEntradas();
            iniciarTemporizadorDeReserva();
        } else {
            System.out.println("Informar entradas insuficientes");
        }
    }

    private boolean verificarDisponibilidad() { return true; }
    private void reservarEntradas() { }
    private void iniciarTemporizadorDeReserva() { }

    public void seleccionDeMetodoDePago(IProveedorPago proveedor, double monto) {
        procesarCobro(proveedor, monto);
    }

    private void procesarCobro(IProveedorPago proveedor, double monto) {
        // Fragmento ALT: Pago aprobado o rechazado
        boolean aprobado = proveedor.procesarPago(monto);
        
        if (aprobado) {
            System.out.println("Confirmación de pago");
            marcarEntradasComoVendidas();
            generarBoletosDigitales();
            System.out.println("Confirmación de compra y boletos");
        } else {
            System.out.println("Pago rechazado");
            System.out.println("Informar error y permitir reintento");
        }
    }

    private void marcarEntradasComoVendidas() { }
    private void generarBoletosDigitales() { }

    public void tiempoDeReservaExpirado() {
        liberarEntradasReservadas();
        System.out.println("Informar expiración de reserva");
    }

    private void liberarEntradasReservadas() { }
}