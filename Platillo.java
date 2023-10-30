
/*
 * Clase que representa Platillos.
 * @author A. Valeria Deloya Andrade
 */

public class Platillo{

    /* Nombre del platillo. */
    private String nombre;
    
    /* Precio del platillo. */
    private int precio; 
   
    /* Tiempo de coccion. */
    private int coccion;

    /*
     * Constructor de Platillo.
     * @param nombre El nombre del platillo
     * @param precio El precio del platillo
     * @param coccion El tiempo de coccion del platillo
     */
    public Platillo(String nombre, int precio, int coccion){
        this.nombre = nombre;
        this.precio = precio;
        this.coccion = coccion;
    }

    /*
     * Obtiene el nombre del platillo.
     */
    public String getNombre(){
        return this.nombre;
   }

   /*
     * Obtiene el precio del platillo.
     */
    public int getPrecio(){
        return this.precio;
   }

   /*
     * Obtiene el tiempo de coccion del platillo.
     */
    public int getCoccion(){
        return this.coccion;
    }

}