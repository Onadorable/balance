import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        float oldBalance = 100;
        System.out.println("Thank you for using Pepe Bank, your current balance is : $" + oldBalance);

        Scanner myObj = new Scanner(System.in);
        System.out.println("How much money would you like to deposit?");
        float deposit = myObj.nextFloat();

        float newBalance = deposit + oldBalance; // Calculates the new balance
        System.out.println("Your new balance is: $" + newBalance);

    }
}