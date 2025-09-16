import java.util.Scanner;
public class Substring {

    public static void main(String[] args){

        String email;
        String username;
        String domain;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an email: ");
        email = scanner.nextLine();

        if (email.contains("@")){

            username = email.substring(0, email.indexOf("@"));
            System.out.println("\nUsername is: " + username);

            domain = email.substring(email.indexOf("@") + 1);
            System.out.println("Domain is: " + domain);

        }else{

            System.out.println("Please enter valid email address(containing '@')");

        }
        scanner.close();
    }
}
