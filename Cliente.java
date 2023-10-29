import java.util.ArrayList;

/*
 * Representa un cliente de Tia Aly.
 *  @author A. Valeria Deloya Andrade 
 */

public class Cliente{

    private String nombre;

    private ArrayList<Platillo> platillos;

    private int gastos;

    public Cliente(String nombre) {
        this.nombre = nombre;
        platillos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Platillo> getPlatillos() {
        return platillos;
    }

    public int getGastos() {
        return gastos;
    }

    public void AgregaPlatillosyCobra(Platillo platillo){
        platillos.add(platillo);
        gastos += platillo.getPrecio(); //le cobramos desde antes
    }
}