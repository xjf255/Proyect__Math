import java.util.Scanner;
import java.util.ArrayList;

public class Input {

    ArrayList<Integer> values = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public ArrayList<Integer> inputInt() {
        int value = 0, index = 1;
        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter in position %d: ", index);
            value = input.nextInt();
            values.add(value);
            index++;
        }
        input.close();
        return values;
    }

    public void clearInput() {
        values.clear();
    }

    public ArrayList<Integer> randomValues() {
        int value = 0;
        for (int i = 0; i < 50; i++) {
            value = (int) (Math.random() * 100);
            values.add(value);
        }
        return values;
    }
}
