import java.util.ArrayList;

/**
 * Representa un cocinero de Tia Aly.
 * @author A. Valeria Deloya Andrade
 */

public class Cocinero extends Thread{

    /* Nombre del cocinero */
    private String nombre;
    
    /* Cliente del cocinero*/
    public Cliente cliente; 

    /*Cuchillo del cocinero*/
    public Cuchillo cuchillo;

    /*
     * Constructor de Cocinero.
     * @param nombre El nombre del cocinero
     * @param cliente El cliente del cocinero
     * @param corte El corte de su cuchillo especial
     */
    public Cocinero(String nombre, Cliente cliente, String corte){
        this.nombre = nombre;
        this.cliente = cliente;
        cuchillo = new Cuchillo(corte);
    }

    /*
     * Constructor de Cocinero.
     * @param nombre El nombre del cocinero
     * @param cliente El cliente del cocinero
     */
    public Cocinero(String nombre, Cliente cliente){
        this.nombre = nombre;
        this.cliente = cliente;
        cuchillo = new Cuchillo();
    }

    /*
     * Obtiene el nombre del cocinero
     */
    public String getNombreCocinero(){
        return this.nombre;
    }
    
    /*
     * Metodo en el que el cocinero hace los platillos de su cliente
     * @return un mensaje de que todos los platillos han sido preparados
     */
    public String cocinar(){

        System.out.println("El cliente " + cliente.getNombre() + " ha ordenado " + cliente.NombresPlatillos() + 
                        ". El cocinero que va a prepararlos: " + getNombreCocinero());

        //Va a recorrer los platillos del cliente almacenados en la arraylist
        ArrayList<Platillo> platillos = cliente.getPlatillos();
        for (Platillo platillo : platillos) {

        //Preparacion de un platillo
        System.out.println("El cocinero " + getNombreCocinero() + " cocina el platillo " + platillo + 
                            cuchillo.cortando()); 

        int coccion = platillo.getCoccion();

            try{ 
                Thread.sleep(coccion); //se simula el tiempo de coccion con sleep
            } catch (InterruptedException excepcion) {
                excepcion.printStackTrace();
            }

        System.out.println("El cocinero " + getNombreCocinero() + " ha cocinado el platillo " + platillo);
        }

        return "El cocinero " + getNombreCocinero() + " ha cocinado todos los platillos del cliente " + cliente.getNombre();
    }
}