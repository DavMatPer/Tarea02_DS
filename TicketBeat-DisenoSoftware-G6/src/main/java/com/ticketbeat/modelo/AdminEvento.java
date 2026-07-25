/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ticketbeat.modelo;

/**
 *
 * @author Rafael Cosmo
 */
import com.ticketbeat.interfaces.IResolvedor;

public class AdminEvento extends Usuario implements IResolvedor {

    @Override
    public boolean resolver(Incidente incidente) {
        return aplicarResolucionFinal();
    }

    @Override
    public boolean escalar(Incidente incidente) {
        System.out.println("El Admin del Evento es el nivel más alto. No se puede escalar mas.");
        return false; 
    }

    public boolean aplicarResolucionFinal() {
        System.out.println("Admin del Evento: Aplicando resolución final y cerrando incidente.");
        return true;
    }
}
