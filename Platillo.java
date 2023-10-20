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
        return this.nombre;
   }

   /*
     * Obtiene el precio del platillo
     */
    public String getPrecio(){
        return this.precio;
   }

   /*
     * Obtiene el tiempo de coccion del platillo
     */
    public String getCoccion(){
        return this.coccion;
   }

    /*
     * Modifica el nombre del platillo
     */
    public void setNombre(String nombre){
    this.nombre = nombre;
    }

    /*
     * Modifica el precio del platillo
     */
    public void setPrecio(int precio){
    this.precio = precio;
    }

    /*
     * Modifica el tiempo de coccion del platillo
     */
    public void setCoccion(int coccion){
    this.coccion = coccion;
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