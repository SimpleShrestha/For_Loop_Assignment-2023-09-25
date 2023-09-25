import java.util.Scanner;

public class Result_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subject");
        int subject = sc.nextInt();
        float totalMarks = 0;
        for (int i = 1; i <= subject; i++) {
            System.out.println("Enter Marks : ");
            float indiviualMarks = sc.nextFloat();

            totalMarks = totalMarks + indiviualMarks;


        }
        float percentage = (totalMarks / subject);
        System.out.println(percentage + "%");

        if (percentage > 90) {
            System.out.println("A+");
        } else if (percentage > 85) {
            System.out.println("A");
        } else if (percentage > 70) {
            System.out.println("B+");
        } else if (percentage > 55) {
            System.out.println("B");
        } else if (percentage > 40) {
            System.out.println("C+");
        }
    }

}
