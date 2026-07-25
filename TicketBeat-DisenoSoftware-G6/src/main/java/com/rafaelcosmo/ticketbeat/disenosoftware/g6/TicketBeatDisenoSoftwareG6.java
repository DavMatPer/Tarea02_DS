/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.rafaelcosmo.ticketbeat.disenosoftware.g6;

/**
 *
 * @author Rafael Cosmo
 */
import com.ticketbeat.interfaces.*;
import com.ticketbeat.gestores.*;
import com.ticketbeat.modelo.*;
import com.ticketbeat.servicios.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicketBeatDisenoSoftwareG6 {

    public static void main(String[] args) {
        System.out.println("--INICIANDO SISTEMA TICKETBEAT---\n");

        // Datos globales
        Comprador comprador = new Comprador();
        comprador.setNombre("Juan Perez");
        comprador.setCanalPreferido(new CanalEmail());

        GestorNotificaciones gestorNotif = new GestorNotificaciones();
        Evento concierto = new Evento();


        // SIMULACION CASO DE USO 1: COMPRAR Y RESERVAR ENTRADAS CON STRATEGY
        System.out.println("--- EJECUTANDO UC-01: COMPRAR Y RESERVAR ENTRADAS (CON REFACTORIZACIÓN) ---");
        GestorReservas gestorReservas = new GestorReservas();

        gestorReservas.buscarEventos();
        gestorReservas.seleccionarEvento();
        gestorReservas.elegirCantidadYTipoDeEntrada();

        System.out.println("\nComprador selecciona método de pago: Tarjeta de Crédito");
        EstrategiaPago tarjetaStrategy = new PagoTarjetaStrategy("VISA");
        gestorReservas.setEstrategiaPago(tarjetaStrategy);

        Map<String, String> datosTarjeta = new HashMap<>();
        datosTarjeta.put("numeroTarjeta", "1234-5678-9012-3456");
        datosTarjeta.put("cvv", "123");
        gestorReservas.confirmarCompra(150.50, datosTarjeta);

        System.out.println("\nComprador cambia de opinión y selecciona: Pago Móvil");
        EstrategiaPago movilStrategy = new PagoMovilStrategy("PagoFlash");
        gestorReservas.setEstrategiaPago(movilStrategy);

        Map<String, String> datosMovil = new HashMap<>();
        datosMovil.put("numeroTelefono", "0412-1234567");
        gestorReservas.confirmarCompra(150.50, datosMovil);
        System.out.println("\n-------------------------------------------------\n");



        // SIMULACION CASO DE USO 2: NOTIFICAR A COMPRADORES
        System.out.println("--- EJECUTANDO UC-02: NOTIFICACION MASIVA ---");
        List<Comprador> afectados = new ArrayList<>();
        afectados.add(comprador);

        System.out.println("Organizador inicia proceso de notificacion por cambio de horario...");
        gestorNotif.iniciarProcesoDeNotificacion(afectados, "El evento se ha retrasado 1 hora.");
        System.out.println("\n-------------------------------------------------\n");



        // SIMULACION CASO DE USO 3: CANCELACION DE EVENTO
        System.out.println("--- EJECUTANDO UC-03: CANCELACION DE EVENTO ---");
        GestorEventos gestorEventos = new GestorEventos();
        PoliticaEvento politica = new PoliticaEvento();

        System.out.println("Organizador solicita resumen del evento...");
        gestorEventos.solicitarResumenEvento("EVT-001", concierto);

        System.out.println("Organizador confirma la cancelacion...");
        gestorEventos.confirmarCancelacion("Fuerza mayor (Clima)", concierto, politica, gestorNotif);
        System.out.println("\n-------------------------------------------------\n");



        // SIMULACION CASO DE USO 4: GESTION DE INCIDENTES
        System.out.println("--- EJECUTANDO UC-04: GESTION DE INCIDENTES ---");
        AgenteSoporte agente = new AgenteSoporte();
        AdminEvento admin = new AdminEvento();
        GestorIncidentes gestorIncidentes = new GestorIncidentes();

        System.out.println("Comprador reporta un problema con su boleto...");
        gestorIncidentes.reportarIncidente("El codigo QR del boleto no carga en la app", agente, admin, comprador, gestorNotif);

        System.out.println("\n---FIN DE LA SIMULACION---\n"
                + "GRUPO 6");
    }
}