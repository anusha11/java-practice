import java.util.Scanner;

public class AverageUsingVarargs {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int size;
        int[] numbers;

        System.out.print("Enter the length of numbers to be added: ");
        size = scanner.nextInt();
        numbers = new int[size];

        for (int i = 0; i < size; i++){
            System.out.print("Enter the number: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.printf("%.2f",average(numbers));
        scanner.close();
    }

    static double average(int... numbers){
        double sum = 0;
        for(int number: numbers){
            sum += number;
        }
        return sum/numbers.length;
    }
}
