import java.util.ArrayList;

public class Operaciones {
    public int media(ArrayList<Integer> values) {
        int sum = 0;
        for (int i = 0; i < values.size(); i++) {
            sum += values.get(i);
        }
        return sum / values.size();
    }
}
