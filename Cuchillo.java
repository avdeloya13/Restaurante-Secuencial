import java.util.Random; 

/*
 * Representa un cuchillo.
 * @author A. Valeria Deloya Andrade
 */

public class Cuchillo{

    /*Tipos de cortes.*/
    String[] tipos = {"Corte juliana", "Corte brunoise", "Corte torneado", "Corte Rondelle"};

    /* Tipo de corte del cuchillo, es lo que lo va a caracterizar de entre los otros cuchillos. */
    private String corte = tipoDeCorte(); //se inicializa con un tipo random

    /*Para saber si se tiene o no un cuchillo especial */
    boolean especial = false;

    /*
     * Constructor de Cuchillo, con cuchillo especial.
     * @param corte Tipo de corte
     */
    public Cuchillo(String corte){
        this.corte = corte; 
        this.especial = true;
        //usado cuando SI tiene en tipo de corte en especial cambia lo inicializado por ese especial
        //es especial porque nadie mas va a usar este cuchillo
    }

     /*
     * Constructor de Cuchillo, usado para cuando NO se tiene un tipo de 
     * cuchillo especial.
     */
    public Cuchillo(){

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
        int i = random.nextInt(this.tipos.length);
        return tipos[i];
    }

    /*
     * Para cuando se esta cortando teniendo o no un cuchillo especial.
     * @return mensaje de corte dependiendo de si se tiene o no un cuchillo especial
     */
    public String cortando(){
        if(this.especial){
            return " con su cuchillo especial " + getCorte() +"\n";
        }
        return " con un cuchillo " + getCorte() +"\n";
    }
}