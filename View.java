import java.io.IOException;
import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);

    public void header() {
        System.out.println("Welcome to the program");
        System.out.println("Select an option:");
        System.out.println("1 - Input values\n2 - Random values");
    }

    public int menu() {
        int option = 0;
        System.out.println("Select an option:");
        System.out.println("1 - Media");
        System.out.println("2 - Mediana");
        System.out.println("3 - Moda");
        System.out.println("4 - Media geometrica");
        System.out.println("5 - Media harmonica");
        System.out.println("6 - Media cuadratica");
        System.out.println("7 - Cuartiles");
        System.out.println("8 - Frecuencia absoluta");
        option = scanner.nextInt();
        return option;
    }

}
