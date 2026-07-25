package com.ticketbeat.gestores;


import com.ticketbeat.modelo.Incidente;
import com.ticketbeat.modelo.Comprador;
import com.ticketbeat.interfaces.IResolvedor;

public class GestorIncidentes {

    public void reportarIncidente(String descripcion, IResolvedor agente, IResolvedor admin, Comprador comprador, GestorNotificaciones notificador) {
        Incidente incidente = registrarYClasificar(descripcion);
        
        // Intento 1er nivel
        boolean resuelto = agente.resolver(incidente);
        
        // Fragmento ALT del diagrama
        if (!resuelto) {
            System.out.println("El Agente NO puede resolver.");
            admin.escalar(incidente);
            resuelto = true; // El admin aplica resolución final
        } else {
            System.out.println("El Agente SI puede resolver.");
        }

        // Notificación final
        if (resuelto) {
            notificador.notificarResolucion(comprador, "Su incidente ha sido cerrado exitosamente.");
        }
    }

    public Incidente registrarYClasificar(String descripcion) {
        System.out.println("Incidente registrado y clasificado.");
        return new Incidente(); // Retorna la entidad para ser procesada
    }
}
