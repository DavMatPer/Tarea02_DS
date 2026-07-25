/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ticketbeat.modelo;

/**
 *
 * @author Rafael Cosmo
 */
import java.util.ArrayList;
import java.util.List;

public class PoliticaEvento {
    private String descripcion;
    private double porcentajeDevolucion;

    
    public List<Boleto> aplicarPoliticaDevolucion(Evento evento) {
        System.out.println("Aplicando políticas de devolución para el evento...");
        
        return new ArrayList<>(); 
    }
}
