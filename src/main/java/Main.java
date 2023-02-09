import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run(new Scanner(System.in));

    }

    public void run(Scanner scanner) {
        // napisz swój program tutaj. Do wczytywania danych użyj przekazanego w parametrze scannera
        List<Integer> numbers = new ArrayList<>();
        int number;

        do {
            System.out.println("Podaj liczbę większą od 0: ");
            number = scanner.nextInt();
            if (number >= 0) {
                numbers.add(number);
            }
        } while (number >= 0);

        printNumbers(numbers);
        calcSum(numbers);
        getMin(numbers);
        getMax(numbers);
        System.out.println("Koniec programu.");
        scanner.close();
    }

    public void printNumbers(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                System.out.printf("%d\n", numbers.get(numbers.size() - 1 - i));
            } else {
                System.out.printf("%d, ", numbers.get(numbers.size() - 1 - i));
            }
        }
    }

    public void calcSum(List<Integer> numbers) {
        int sum = 0;
        String operation = "";

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);

            if (i == numbers.size() - 1) {
                operation += numbers.get(i) + " = ";
            } else {
                operation += numbers.get(i) + " + ";
            }
        }
        operation += sum;
        System.out.println(operation);
    }

    public void getMin(List<Integer> numbers) {
        int minimum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (i == 0) {
                minimum = numbers.get(i);
            } else if (numbers.get(i) < minimum) {
                minimum = numbers.get(i);
            }
        }
        System.out.printf("Najmniejsza liczba w liście to %d\n", minimum);;
    }

    public void getMax(List<Integer> numbers) {
        int maximum = 0;

        for (Integer number : numbers) {
            if (number > maximum) {
                maximum = number;
            }
        }
        System.out.printf("Największa liczba w liście to %d\n", maximum);;
    }
}
