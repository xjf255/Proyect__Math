import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Operaciones {
    Scanner scanner = new Scanner(System.in);

    public ArrayList<Integer> orden(ArrayList<Integer> values) {
        ArrayList<Integer> ordenValues = new ArrayList<>(values);
        Collections.sort(ordenValues);
        return ordenValues;
    }

    public int media(ArrayList<Integer> values) {
        int sum = 0;
        for (int i = 0; i < values.size(); i++) {
            sum += values.get(i);
        }
        return sum / values.size();
    }

    public int mediana(ArrayList<Integer> values) {
        int size = values.size();
        if (size % 2 == 0) {
            return (values.get(size / 2) + values.get(size / 2 - 1)) / 2;
        } else {
            return values.get(size / 2);
        }
    }

    public int moda(ArrayList<Integer> values) {
        int moda = 0;
        int max = 0;
        for (int i = 0; i < values.size(); i++) {
            int count = 0;
            for (int j = 0; j < values.size(); j++) {
                if (values.get(i) == values.get(j)) {
                    count++;
                }
            }
            if (count > max) {
                moda = values.get(i);
                max = count;
            }
        }
        return moda;
    }

    public double mediaGeometrica(ArrayList<Integer> values) {
        int product = 1;
        for (int i = 0; i < values.size(); i++) {
            product *= values.get(i);
        }
        return Math.pow(product, 1.0 / values.size());
    }

    public double mediaArmonica(ArrayList<Integer> values) {
        double sum = 0;
        for (int i = 0; i < values.size(); i++) {
            sum += 1.0 / values.get(i);
        }
        return (50.0 / sum);
    }

    public int mediaCuadratica(ArrayList<Integer> values) {
        int sum = 0;
        for (int i = 0; i < values.size(); i++) {
            sum += Math.pow(values.get(i), 2);
        }
        return (int) Math.sqrt(sum / values.size());
    }

    public ArrayList<String> cuartiles(ArrayList<Integer> values) {
        ArrayList<String> quartiles = new ArrayList<String>();
        int lg = values.size();
        int q1 = values.get(Math.round((lg * 25)/100));
        int q2 = values.get(Math.round((lg * 50)/100));
        int q3 = values.get(Math.round((lg *75)/100));
        int q4 = values.get(lg - 1);
        quartiles.add("\tQ1: " + q1);
        quartiles.add("\tQ2: " + q2);
        quartiles.add("\tQ3: " + q3);
        quartiles.add("\tQ4: " + q4);
        return quartiles;
    }

    public int frecuenciaAbsoluta(ArrayList<Integer> values) {
        System.out.println("Ingrese el valor a buscar");
        int valor = scanner.nextInt();
        int frecuencia = 0;
        for (int value : values) {
            if (value == valor) {
                frecuencia++;
            }
        }
        return frecuencia;
    }
}
