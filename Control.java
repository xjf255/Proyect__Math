
// import java.util.Scanner;
import java.util.ArrayList;
// import javax.swing.JOptionPane;
import java.util.Scanner;

public class Control {
    public void control() {
        Scanner scanner = new Scanner(System.in);
        Input inp = new Input();
        Output printList = new Output();
        ArrayList<Integer> values;
        View vw = new View();
        Operaciones op = new Operaciones();
        int option;

        vw.header();
        option = scanner.nextInt();
        // int option = Integer.parseInt(JOptionPane.showInputDialog("1 - Input values\n2 - Random values"));
        if (option == 1)
            values = inp.inputInt();
        else
            values = inp.randomValues();
        
        // printList.output(values);
        System.out.println("\n");
        switch (vw.menu()) {
            case 1:
                System.out.println(op.media(values));
                break;
        
            default:
                break;
        }
        scanner.close();
    }
}