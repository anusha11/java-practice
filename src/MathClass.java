import java.util.Scanner;
public class MathClass {

    public static void main(String[] args){

        double radius;
        double Circumference;
        double Area;
        double Volume;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        Circumference = 2 * Math.PI*radius;
        Area = Math.PI * Math.pow(radius, 2);
        Volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("\nThe circumference is: %.1fcm\n", Circumference);
        System.out.printf("The area is: %.1fcm²\n", Area);
        System.out.printf("The volume is: %.1fcm³", Volume);
        scanner.close();
    }
}
