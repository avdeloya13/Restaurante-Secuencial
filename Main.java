
public class Main extends Thread{

    /* Total del dia */
    public int total;

    public static void main(String [] args){
        
        Platillo polloAsado = new Platillo("Pollo Asado", 50, 4000);
        Platillo pizza = new Platillo("Pizza", 30, 4000);
        Platillo carneEnchilada = new Platillo("Carne Enchilada", 40, 3000);
        Platillo barbacoa = new Platillo("Barbacoa", 40, 4000);
        Platillo pozole = new Platillo("Pozole", 20, 2000);
        Platillo pescadillas = new Platillo("Pescadillas", 30, 2000);
        Platillo chilaquiles = new Platillo("Chilaquiles", 20, 1000);
        Platillo enchiladas = new Platillo("Enchiladas", 30, 1000);

        Cliente james = new Cliente("James");
        Cliente inez = new Cliente("Inez");
        Cliente betty = new Cliente("Betty");
        Cliente alison = new Cliente("Alison");

        james.AgregaPlatillos(pizza);
        james.AgregaPlatillos(pozole);
        james.AgregaPlatillos(barbacoa);

        inez.AgregaPlatillos(pescadillas);
        inez.AgregaPlatillos(pizza);
        inez.AgregaPlatillos(enchiladas);

        betty.AgregaPlatillos(polloAsado);
        betty.AgregaPlatillos(enchiladas);

        alison.AgregaPlatillos(carneEnchilada);
        alison.AgregaPlatillos(chilaquiles);

        Cocinero dorothea = new Cocinero("Dorothea", james);
        Cocinero rebeca = new Cocinero("Rebeca", inez, "corte mirepoix");
        Cocinero abigail = new Cocinero("Abigail", betty);
        Cocinero joe = new Cocinero("Joe", alison);


    }
}