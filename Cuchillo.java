import java.util.Random; 

/*
 * Representa un cuchillo.
 * @author A. Valeria Deloya Andrade
 */

public class Cuchillo{

    /* Tipo de corte del cuchillo, es lo que lo va a caracterizar de entre los otros cuchillos. */
    private String corte = tipoDeCorte(); //se inicializa con un tipo random

    /*Tipos de cortes.*/
    String[] tipos = {"Corte juliana", "Corte brunoise", "Corte torneado", "Corte Rondelle"};

    boolean especial;

    /*
     * Constructor de Cuchillo.
     * @param corte Tipo de corte
     */
    public Cuchillo(String corte){
        this.corte = corte; 
        especial = true;
        //usado cuando SI tiene en tipo de corte en especial cambia lo inicializado por ese especial
    }

     /*
     * Constructor de Cuchillo, usado para cuando NO se quiere un tipo de cuchillo en especial.
     */
    public Cuchillo(){
        especial = false;
    }

    /*
     * Obtiene el tipo de corte del cuchillo.
     */
    public String getCorte(){
        return this.corte;
    }

    /*
     * Da un tipo de corte random.
     */
    public String tipoDeCorte(){
        Random random = new Random();
        int i = random.nextInt(tipos.length);
        return tipos[i];
    }

    public String cortando(){
        if(especial){
            return " con su cuchillo especial " + this.corte +"\n";
        }
        return " con un cuchillo " + this.corte +"\n";
    }
}