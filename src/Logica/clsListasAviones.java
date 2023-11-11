
package Logica;

/**
 *
 * @author valer
 */
public class clsListasAviones {

    private clsListaEnlazada Central;
    private clsListaEnlazada avionesVuelo;
    private clsListaEnlazada avionesHangar;
    private clsListaEnlazada avionesDespegue;
    private clsListaEnlazada avionesAterrizaje;
    


    public clsListasAviones() {
        this.Central = new clsListaEnlazada();
        this.avionesVuelo = new clsListaEnlazada();
        this.avionesHangar = new clsListaEnlazada();
        this.avionesDespegue = new clsListaEnlazada();
        this.avionesAterrizaje = new clsListaEnlazada();
    }
    
    public void añadirCentral(clsAviones avion){
        
        this.Central.inserccionFinal(avion);
    }

    public boolean añadirAvionesEnVuelo(clsAviones avion) {
        this.avionesVuelo.inserccionFinal(avion);
        return true;
    }

    public boolean añadirAvionesEnHangar(clsAviones avion) {
        this.avionesHangar.inserccionFinal(avion);
        return true;
    }

    public boolean añadirAvionesPistaDespegue(clsAviones avion) {
        this.avionesDespegue.inserccionFinal(avion);
        return true;
    }

    public boolean añadirAvionesPistaAterrizaje(clsAviones avion) {
        this.avionesAterrizaje.inserccionFinal(avion);
        return true;
    }
}
