/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ticketbeat.modelo;

/**
 *
 * @author Rafael Cosmo
 */
import com.ticketbeat.interfaces.ICanal;

public class Comprador extends Usuario {
    private ICanal canalPreferido;
    private int limiteCompra;

    public ICanal getCanalPreferido() { return canalPreferido; }
    public void setCanalPreferido(ICanal canalPreferido) { this.canalPreferido = canalPreferido; }
}
