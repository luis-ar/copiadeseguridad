import java.util.Scanner;

public class App11 {
    Scanner scan = new Scanner(System.in);
    String[] nombres_hom = { "Luis", "Marco", "Jose", "Joel", "Mauricio", "Pedro", "Dani", "David" };
    String[] nombres_fem = { "Maria", "Nayeli", "Shiani", "Nataly", "Angie", "Mariela", "Yessi", "Lucia" };
    String genero;

    public void datos() {
        int aleatorio;
        aleatorio = (int) (Math.random() * 8);

        if (genero == "M" || genero == "m") {
            System.out.println("Un nombre correspondiente para un varon es " +
                    nombres_hom[aleatorio]);

        } else if (genero == "F" || genero == "f") {
            System.out.println("Un nombre correspondiente para una mujer es " +
                    nombres_fem[aleatorio]);

        } else {
            System.out.println("Genero mal introducido");
        }

    }

}