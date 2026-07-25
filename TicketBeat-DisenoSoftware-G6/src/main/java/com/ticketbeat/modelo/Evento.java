/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ticketbeat.modelo;

/**
 *
 * @author Rafael Cosmo
 */
public class Evento {
    private String id;
    private String nombre;
    private String estado;
    private int boletosVendidos;
    private double montoRecaudado;


    public int getBoletosVendidos() { 
        return boletosVendidos; 
    }
    
    public double getMontoRecaudado() { 
        return montoRecaudado; 
    }
    
    public void setEstado(String estado) { 
        this.estado = estado; 
        System.out.println("El estado del evento ha cambiado a: " + estado);
    }
}
