import java.util.ArrayList;

/*
 * Clase principal.
 * @author A. Valeria Deloya Andrade
 */

public class TiaAly{

    /* Total del dinero ganado durante el dia. */
    public int total;

    /* Menu de platillos de Tia Aly.  */
    public ArrayList<Platillo> menu = new ArrayList<>();

    /* 
     * Metodo para imprimir el menu 
     */
    public void imprimeMenu(){
        System.out.println("******************MENU******************");
        for (Platillo platillo: menu) {
            System.out.println(platillo.getNombre()+ ", " + "$"+ platillo.getPrecio());
        }
        System.out.println("****************************************" + "\n");
    }
 
    public static void main(String [] args){

        TiaAly tiaaly = new TiaAly();
        
        Platillo polloAsado = new Platillo("Pollo Asado", 50, 4000);
        Platillo pizza = new Platillo("Pizza", 30, 4000);
        Platillo carneEnchilada = new Platillo("Carne Enchilada", 40, 3000);
        Platillo barbacoa = new Platillo("Barbacoa", 40, 4000);
        Platillo pozole = new Platillo("Pozole", 50, 2000);
        Platillo pescadillas = new Platillo("Pescadillas", 30, 2000);
        Platillo chilaquiles = new Platillo("Chilaquiles", 20, 1000);
        Platillo enchiladas = new Platillo("Enchiladas", 30, 1000);

        tiaaly.menu.add(polloAsado);
        tiaaly.menu.add(pizza);
        tiaaly.menu.add(carneEnchilada);
        tiaaly.menu.add(barbacoa);
        tiaaly.menu.add(pozole);
        tiaaly.menu.add(pescadillas);
        tiaaly.menu.add(chilaquiles);
        tiaaly.menu.add(enchiladas);
        tiaaly.imprimeMenu();

        //-----------------------------------------------------------------

        Cliente james = new Cliente("James");

        james.AgregaPlatillosyCobra(pizza);
        james.AgregaPlatillosyCobra(pozole);
        james.AgregaPlatillosyCobra(barbacoa);

        Cocinero victor = new Cocinero("Victor", james);

        tiaaly.total += james.getGastos();
        victor.cocinar();

        //-----------------------------------------------------------------

        Cliente octavio = new Cliente("Octavio");

        octavio.AgregaPlatillosyCobra(pescadillas);
        octavio.AgregaPlatillosyCobra(pizza);
        octavio.AgregaPlatillosyCobra(enchiladas);

        Cocinero bernardo = new Cocinero("Bernardo", octavio, "corte mirepoix"); //cuchillo especial

        tiaaly.total += octavio.getGastos();
        bernardo.cocinar();

        //-----------------------------------------------------------------

        Cliente betty = new Cliente("Betty");

        betty.AgregaPlatillosyCobra(polloAsado);
        betty.AgregaPlatillosyCobra(enchiladas);

        Cocinero juan = new Cocinero("Juan", betty);

        tiaaly.total += betty.getGastos();
         juan.cocinar();

        //-----------------------------------------------------------------

        Cliente alison = new Cliente("Alison");

        alison.AgregaPlatillosyCobra(carneEnchilada);
        alison.AgregaPlatillosyCobra(chilaquiles);

        Cocinero joe = new Cocinero("Joe", alison);

        tiaaly.total += alison.getGastos();
        joe.cocinar();

        //-----------------------------------------------------------------

        System.out.println("Tia Aly cierra por hoy." + " Ingresos del día: $" + tiaaly.total);
    }
}