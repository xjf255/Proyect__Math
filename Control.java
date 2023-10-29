import java.util.Formatter;
import java.util.Scanner;
import java.util.ArrayList;
// import javax.swing.JOptionPane;

public class Control {
    public void control() {
        Formatter archivo = null;
        try {
            archivo = new Formatter("Archivo.txt");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.toString());
        }
        Scanner scanner = new Scanner(System.in);
        Input inp = new Input();
        Output printList = new Output();
        ArrayList<Integer> values;
        ArrayList<Integer> disordenValues;
        View vw = new View();
        Operaciones op = new Operaciones();
        int option;

        vw.header();
        option = scanner.nextInt();
        // int option = Integer.parseInt(JOptionPane.showInputDialog("1 - Input
        // values\n2 - Random values"));
        if (option == 1)
            disordenValues = inp.inputInt();
        else if (option == 2)
            disordenValues = inp.randomValues();
        else {
            System.out.println("Invalid value");
            disordenValues = null;
        }
        // ordenar
        values = op.orden(disordenValues);
        // Ingresando la matriz a .txt
        StringBuilder sb = new StringBuilder();
        for (int value : values) {
            sb.append(value).append(", ");
        }
        archivo.format("Numeros: %s", sb.toString());

        do {
            System.out.println("\n");
            switch (vw.menu()) {
                case 0:
                    printList.output(values);
                    break;
                case 1:
                    // Int
                    System.out.println(op.media(values));
                    archivo.format("%nMedia: %d", op.media(values));
                    break;
                case 2:
                    // int
                    System.out.println(op.mediana(values));
                    archivo.format("%nMediana: %d", op.mediana(values));
                    break;
                case 3:
                    // int
                    System.out.println(op.moda(values));
                    archivo.format("%nModa: %d", op.moda(values));
                    break;
                case 4:
                    // double
                    System.out.println(op.mediaGeometrica(values));
                    archivo.format("%nMedia Geometrica: %f", op.mediaGeometrica(values));
                    break;
                case 5:
                    // double
                    System.out.println(op.mediaArmonica(values));
                    archivo.format("%nMedia Armonica: %f", op.mediaArmonica(values));
                    break;
                case 6:
                    // int
                    System.out.println(op.mediaCuadratica(values));
                    archivo.format("%nMedia Cuadratica: %d", op.mediaCuadratica(values));
                    break;
                case 7:
                    // string
                    System.out.println(op.cuartiles(values));
                    sb.setLength(0);
                    for (String txt : op.cuartiles(values)) {
                        sb.append(txt).append(", ");
                    }
                    archivo.format("%nCuartiles: %s", sb.toString());
                    break;
                case 8:
                    // int
                    // System.out.println(op.frecuenciaAbsoluta(values));
                    archivo.format("%nFrecuencia: %d", op.frecuenciaAbsoluta(values));
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (vw.continueProgram() != false);
        System.out.println("Bye");
        scanner.close();
        archivo.close();
    }
}