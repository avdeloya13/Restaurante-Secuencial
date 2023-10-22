import java.util.Random; 

/*
 * Representa un cuchillo
 * @author A. Valeria Deloya Andrade
 */
public class Cuchillo{

    /* Nombre del tipo de corte del cuchillo */
    private String corte;

    /*Tipos de cortes.*/
    String[] tipos = {"Corte juliana", "Corte brunoise", "Corte torneado", "Corte Rondelle"};

    /*
     * Constructor
     */
    public Cuchillo(){
        this.corte = tipoDeCorte();
    }

    /*
     * Obtiene el tipo de corte del cuchillo
     */
    public String getCorte(){
        return this.corte;
    }

    public String tipoDeCorte(){
        Random random = new Random();
        int i = random.nextInt(tipos.length);
        return tipos[i];
    }

    /*
     * toString para imprimir cuchillos
     */
    public String toString(){
        return "\nTipo de Corte: "+this.corte+"\n";
    }
}