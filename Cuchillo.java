/*
 * Representa un cuchillo
 * @author A. Valeria Deloya Andrade
 */
public class Cuchillo{

    /* Nombre del tipo de corte del cuchillo */
    private String corte;

    /*
     * Constructor
     */
    public Platillo(String corte){
        corte = this.corte;
    }

    /*
     * Obtiene el tipo de corte del cuchillo
     */
    public String getCorte(){
        return this.corte;
    }

    /*
     * toString para imprimir cuchillos
     */
    public String toString(){
        return "\nTipo de Corte: "+this.corte+"\n";
    }
}