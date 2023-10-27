import java.util.ArrayList;

public class Output {
    public void output(ArrayList<Integer> values) {
        for(int i = 0; i < 5 ;i++){
            for(int j = 0; j < 10; j++){
                System.out.printf("%-5d ", values.get(i * 10 + j));
            }
            System.out.println();
        }
    }
}