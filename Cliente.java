import java.util.ArrayList;

/*
 * Representa un cliente de Tia Aly.
 *  @author A. Valeria Deloya Andrade 
 */

public class Cliente{

    /* Nombre del cliente. */
    private String nombre;

    /* Lista de platillos del cliente. */
    private ArrayList<Platillo> platillos;

    /* Lo que va a gastar en total por sus platillos. */
    private int gastos;

    /* 
     * Constructor de Cliente.
     * @param nombre El nombre del cliente
     */
    public Cliente(String nombre) {
        this.nombre = nombre;
        platillos = new ArrayList<>();
    }

    /*
     * Obtiene el nombre del cliente.
     */
    public String getNombre() {
        return this.nombre;
    }

    /*
     * Obtiene los gastos en platillos del cliente.
     */
    public int getGastos(){
        return this.gastos;
    }

    /*
     * Obtiene los platillos que quiere el cliente.
     */
    public ArrayList<Platillo> getPlatillos(){
        return this.platillos;
    }

    /*
     * Obtiene los nombres de los platillos del cliente.
     */
    public String NombresPlatillos(){
        String nombres = "";

        for (Platillo platillo : this.platillos){
            nombres += "| " + platillo.getNombre() + " | ";
        }
        return nombres;
    }

    /*
     * Agrega platillos a su arraylist de platillos y le va cobrando por estos.
     */
    public void AgregaPlatillosyCobra(Platillo platillo){
        platillos.add(platillo); //agregamos los platillos que a va comer
        gastos += platillo.getPrecio(); //le cobramos desde antes
    }
}