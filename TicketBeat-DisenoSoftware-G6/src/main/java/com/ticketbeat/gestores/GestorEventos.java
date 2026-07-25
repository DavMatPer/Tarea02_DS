package com.ticketbeat.gestores;

import com.ticketbeat.modelo.Evento;
import com.ticketbeat.modelo.PoliticaEvento;
import com.ticketbeat.modelo.Boleto;
import java.util.List;

public class GestorEventos {

    public void solicitarResumenEvento(String idEvento, Evento evento) {
        int boletos = evento.getBoletosVendidos();
        double monto = evento.getMontoRecaudado();
        System.out.println("Resumen: " + boletos + " boletos vendidos, Monto: $" + monto);
    }

    public void confirmarCancelacion(String motivo, Evento evento, PoliticaEvento politica, GestorNotificaciones notificador) {
        // 1. Cambia el estado
        evento.setEstado("CANCELADO");
        
        // 2. Aplica la política
        List<Boleto> listaBoletosAfectados = politica.aplicarPoliticaDevolucion(evento);
        
        // 3. Notifica a los compradores
        notificador.notificarCompradores(listaBoletosAfectados, "Evento cancelado: " + motivo);
    }
}
