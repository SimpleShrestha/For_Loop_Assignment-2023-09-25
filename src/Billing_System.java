import java.util.Scanner;

public class Billing_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of goods to calculate: ");
        int items = sc.nextInt();

        float totalPrice = 0;

        for(int i = 1; i<=items; i++){
            System.out.println("Enter the price of the product: ");
            float SingleItemPrice = sc.nextInt();
            System.out.println("Enter the number of quantity " + i);
            float SingleItemQuantity = sc.nextFloat();

            totalPrice = totalPrice + (SingleItemPrice * SingleItemQuantity);
        }

        float discountedPrice = totalPrice - ( ((float) 10 /100) * totalPrice );

        float vatappliedPrice = discountedPrice - ( ((float) 13/100) * discountedPrice );

        System.out.println("Your final Price is Rs : " + vatappliedPrice);
    }
}