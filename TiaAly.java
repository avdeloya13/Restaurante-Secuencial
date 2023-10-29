
/*
 * Clase principal.
 * @author A. Valeria Deloya Andrade
 */

public class TiaAly{

    /* Total del dinero ganado durante el dia. */
    public static int total;
 
    public static void main(String [] args){
        
        Platillo polloAsado = new Platillo("Pollo Asado", 50, 4000);
        Platillo pizza = new Platillo("Pizza", 30, 4000);
        Platillo carneEnchilada = new Platillo("Carne Enchilada", 40, 3000);
        Platillo barbacoa = new Platillo("Barbacoa", 40, 4000);
        Platillo pozole = new Platillo("Pozole", 20, 2000);
        Platillo pescadillas = new Platillo("Pescadillas", 30, 2000);
        Platillo chilaquiles = new Platillo("Chilaquiles", 20, 1000);
        Platillo enchiladas = new Platillo("Enchiladas", 30, 1000);

        //-----------------------------------------------------------------

        Cliente james = new Cliente("James");

        james.AgregaPlatillosyCobra(pizza);
        james.AgregaPlatillosyCobra(pozole);
        james.AgregaPlatillosyCobra(barbacoa);

        Cocinero dorothea = new Cocinero("Dorothea", james);

        total += james.getGastos();

        //-----------------------------------------------------------------

        Cliente inez = new Cliente("Inez");

        inez.AgregaPlatillosyCobra(pescadillas);
        inez.AgregaPlatillosyCobra(pizza);
        inez.AgregaPlatillosyCobra(enchiladas);

        Cocinero rebeca = new Cocinero("Rebeca", inez, "corte mirepoix"); //cuchillo especial

        total += inez.getGastos();

        //-----------------------------------------------------------------

        Cliente betty = new Cliente("Betty");

        betty.AgregaPlatillosyCobra(polloAsado);
        betty.AgregaPlatillosyCobra(enchiladas);

        Cocinero abigail = new Cocinero("Abigail", betty);

        total += betty.getGastos();

        //-----------------------------------------------------------------

        Cliente alison = new Cliente("Alison");

        alison.AgregaPlatillosyCobra(carneEnchilada);
        alison.AgregaPlatillosyCobra(chilaquiles);

        Cocinero joe = new Cocinero("Joe", alison);

        total += alison.getGastos();

        //-----------------------------------------------------------------

        System.out.println("Tia Aly ha cerrado por hoy.\n" + "Ingresos del día: " + total);

    }
}