/**
 * Representa un cocinero.
 * @author A. Valeria Deloya Andrade
 */
public class Cocinero{

    /* Nombre del cocinero */
    private String nombre;
    
    /* Cliente del cocinero*/
    private Cliente cliente; 

    /*Cuchillo del cocinero*/
    private Cuchillo tipo;

    public Cocinero(String nombre, Cliente cliente, Cuchillo tipo){
        nombre = this.nombre;
        cliente = this.cliente;
        tipo = new Cuchillo();
    }

    


}