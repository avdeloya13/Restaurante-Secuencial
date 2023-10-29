
/**
 * Representa un cocinero de Tia Aly.
 * @author A. Valeria Deloya Andrade
 */

public class Cocinero{

    /* Nombre del cocinero */
    private String nombre;
    
    /* Cliente del cocinero*/
    private Cliente cliente; 

    /*Cuchillo del cocinero*/
    private Cuchillo tipo;

    /*
     * Constructor de Cocinero
     * @param nombre El nombre del cocinero
     * @param cliente El cliente del cocinero
     * @param corte El corte de su cuchillo especial
     */
    public Cocinero(String nombre, Cliente cliente, String corte){
        nombre = this.nombre;
        cliente = this.cliente;
        tipo = new Cuchillo(corte);
    }

    /*
     * Constructor de Cocinero
     * @param nombre El nombre del cocinero
     * @param cliente El cliente del cocinero
     */
    public Cocinero(String nombre, Cliente cliente){
        nombre = this.nombre;
        cliente = this.cliente;
        tipo = new Cuchillo();
    }

    public String getNombre() {
        return nombre;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Cuchillo getTipo() {
        return tipo;
    }
    
    public String cocinar(){
        

        return null;
    }


}