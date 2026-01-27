import java.util.*;

public class lab {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int totalCents = console.nextInt(137);
        int quarters = totalCents / 25;
        totalCents %= 25;
        int dimes = totalCents / 10;
        totalCents %= 10;
        int nickels = totalCents / 5;
        totalCents %= 5;
        int pennies = totalCents;

        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }
}