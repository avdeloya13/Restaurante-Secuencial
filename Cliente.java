import java.util.ArrayList;

/*
 * Representa un cliente 
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

    public String getGastos() {
        return gastos;
    }

    public void AgregaPlatillosyCobra(Platillo platillo){
        platillos.add(platillo);
        gastos += platillo.getPrecio();
    }
}