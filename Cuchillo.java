import java.util.Random; 

/*
 * Representa un cuchillo.
 * @author A. Valeria Deloya Andrade
 */

public class Cuchillo{

    /* Tipo de corte del cuchillo, es lo que lo va a caracterizar de entre los otros cuchillos*/
    private String corte = tipoDeCorte(); //se inicializa con un tipo random

    /*Tipos de cortes.*/
    String[] tipos = {"Corte juliana", "Corte brunoise", "Corte torneado", "Corte Rondelle"};

    /*
     * Constructor
     */
    public Cuchillo(String corte){
        this.corte = corte; 
        //si tiene en tipo de corte en especial cambia lo inicializado por ese especial
    }

     /*
     * Constructor vacío, usado para cuando no se quiere un tipo de cuchillo en especial
     */
    public Cuchillo(){
        
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

    public String cortando(){
        return " usa su cuchillo " + this.corte +"\n";
    }
}