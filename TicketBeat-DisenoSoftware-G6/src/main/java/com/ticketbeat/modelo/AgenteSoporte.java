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

public class AgenteSoporte extends Usuario implements IResolvedor {
    
    @Override
    public boolean resolver(Incidente incidente) {
        return aplicarAccionPrimerNivel();
    }

    @Override
    public boolean escalar(Incidente incidente) {
        return true; 
    }

    public boolean aplicarAccionPrimerNivel() {
        System.out.println("Agente de Soporte: Intentando resolver en primer nivel...");
        
        return false; 
    }
}
