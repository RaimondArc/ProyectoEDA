/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author valer
 */
public class clsAviones {
    private String modelo;
    private int cantidadPasajeros;
    private int cantidadSobrecargos;
    private String nombrePiloto;

    public clsAviones(String modelo, int cantidadPasajeros, int cantidadSobrecargos, String nombrePiloto) {
        this.modelo = modelo;
        this.cantidadPasajeros = cantidadPasajeros;
        this.cantidadSobrecargos = cantidadSobrecargos;
        this.nombrePiloto = nombrePiloto;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public int getCantidadSobrecargos() {
        return cantidadSobrecargos;
    }

    public String getNombrePiloto() {
        return nombrePiloto;
    }
    
    
    
    
    
    
    
}
