import java.util.Scanner;

public class Log_In {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter Your Username");
            String Username = sc.next();
            System.out.println("Enter Your Password");
            String Password = sc.next();

            if (Password.equals("Simple@12345") && Username.equals("Simple78")) {
                System.out.println("Correct");
                break;
            } else {
                System.out.println("Incorrect");
                System.out.println("Your Remaining Tries Are: " + (5 - i));
            }

        }
    }
}
