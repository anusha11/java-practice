import java.util.Scanner;
public class AreaOfRectangleUsingScanner {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double width = 0;
        double height = 0;
        double area = 0;

        System.out.print("Enter the width of a rectangle: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height of a rectangle: ");
        height = scanner.nextDouble();

        area = width*height;

        System.out.println("The area of a rectangle is " + area + "cm^2");

        scanner.close();
    }
}
