/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author valer
 */
public class clsListaEnlazada {
    private Nodo Lista;
    
    public clsListaEnlazada() {
        this.Lista = null;
    }

    public boolean inserccionFinal(clsAviones avion) {
        Nodo nuevo = new Nodo();
        nuevo.avion = avion;
        nuevo.siguiente = null;

        try {
            if (this.Lista == null) {
                this.Lista = nuevo;
                return true;
            } else {
                Nodo aux = this.Lista;
                while (aux.siguiente != null) {
                    aux = aux.siguiente;
                }
                aux.siguiente = nuevo;
                return true;
            }
        } catch (Exception e) {
            System.err.println("Error");
            return false;
        }
    }

}
