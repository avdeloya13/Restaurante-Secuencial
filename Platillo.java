
/*
 * Clase que representa Platillos.
 * @author A. Valeria Deloya Andrade
 */

public class Platillo{

    /* Nombre del platillo */
    private String nombre;
    
    /* Precio del platillo */
    private int precio; 
   
    /* Tiempo de coccion */
    private int coccion;

    /*
     * Constructor
     */
    public Platillo(String nombre, int precio, int coccion){
        nombre = this.nombre;
        precio = this.precio;
        coccion = this.coccion;
    }

    /*
     * Obtiene el nombre del platillo
     */
    public String getNombre(){
        return nombre;
   }

   /*
     * Obtiene el precio del platillo
     */
    public int getPrecio(){
        return precio;
   }

   /*
     * Obtiene el tiempo de coccion del platillo
     */
    public int getCoccion(){
        return coccion;
    }

    /*
     * toString para imprimir platillos
     */
    public String toString(){
        return "\nNombre: "+this.nombre+
            "\nPrecio: "+this.precio+
            "\nTiempo de coccion: "+this.coccion+"\n";
    }

}