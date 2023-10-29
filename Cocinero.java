import java.util.ArrayList;

/**
 * Representa un cocinero de Tia Aly.
 * @author A. Valeria Deloya Andrade
 */

public class Cocinero extends Thread{

    /* Nombre del cocinero */
    private String nombre;
    
    /* Cliente del cocinero*/
    private Cliente cliente; 

    /*Cuchillo del cocinero*/
    private Cuchillo cuchillo;

    /*
     * Constructor de Cocinero.
     * @param nombre El nombre del cocinero
     * @param cliente El cliente del cocinero
     * @param corte El corte de su cuchillo especial
     */
    public Cocinero(String nombre, Cliente cliente, String corte){
        nombre = this.nombre;
        cliente = this.cliente;
        cuchillo = new Cuchillo(corte);
    }

    /*
     * Constructor de Cocinero.
     * @param nombre El nombre del cocinero
     * @param cliente El cliente del cocinero
     */
    public Cocinero(String nombre, Cliente cliente){
        nombre = this.nombre;
        cliente = this.cliente;
        cuchillo = new Cuchillo();
    }

    /*
     * Obtiene el nombre del cocinero
     */
    public String getNombre(){
        return nombre;
    }

    /*
     * Obtiene el cliente del cocinero.
     */
    public Cliente getCliente(){
        return cliente;
    }

    /*
     * Obtiene el cuchillo del cocinero.
     */
    public Cuchillo getCuchilloCocinero(){
        return cuchillo;
    }
    
    public String cocinar(){

       System.out.println("El cliente " + cliente.getNombre() + " ordenó " + cliente.getPlatillos() + ". Cocinero asignado: " + 
                            getNombre());

       //Recorrera los platillos del cliente almacenados en la arraylist
       ArrayList<Platillo> platillos = cliente.getPlatillos();
       for (Platillo platillo : platillos) {

        System.out.println("El cocinero " + getNombre() + " cocina el platillo " + platillo + 
                            cuchillo.cortando());

        int coccion = platillo.getCoccion();

            try{ 
                Thread.sleep(coccion); //se simula el tiempo de coccion con sleep
            } catch (InterruptedException excepcion) {
                excepcion.printStackTrace();
            }

        System.out.println("El cocinero " + getNombre() + " ha cocinado el platillo " + platillo);

       }

       return "El cocinero " + getNombre() + " ha cocinado todos los platillos del cliente " + cliente.getNombre();
    }
}