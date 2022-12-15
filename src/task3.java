import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var mass = new ArrayList<Double>();
        while (true) {
            var nextLine = in.nextLine();
            if (Objects.equals(nextLine, "quit")) break;
            mass.add(Double.parseDouble(nextLine));
        }
        System.out.print("Исходный массив: ");
        for (var el: mass) System.out.print(el + " ");
        System.out.print("\nМассив после обработки: ");
        var obrobotMass = new ArrayList<Double>();
        obrobotMass.add(mass.get(0));
        for (int i = 1; i < mass.size(); i++)
            if (mass.get(i) > obrobotMass.get(obrobotMass.size() - 1))
                obrobotMass.add(mass.get(i));
        for (var el: obrobotMass) {
            System.out.print(el + " ");
        }
        in.close();
    }
}