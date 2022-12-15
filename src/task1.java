import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var mass = new ArrayList<Double>();
        while (true) {
            String nextLine = in.nextLine();
            if (Objects.equals(nextLine, "quit")) break;
            double vremperem = Double.parseDouble(nextLine);
            mass.add(vremperem);
        }
        System.out.print("Исходный массив: ");
        for (var el : mass) System.out.print(el + " ");
        System.out.print("\nМассив после обработки: ");
        double summa = 0.0;
        for (int i = 0; i < mass.size(); i++) {
            summa += mass.get(i);
            double resultat = summa / (double) (i + 1);
            System.out.print(resultat + " ");
        }
        in.close();
    }
}