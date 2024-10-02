package calculateTaximeter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter km ");
        int km = input.nextInt();
        int minPrice = 10;
        double totalPrice, perKm = 2.20;

        totalPrice = (km*perKm);
        totalPrice += minPrice;
        totalPrice = totalPrice >= 20 ? totalPrice : 20 ;
        System.out.println("You should pay " + totalPrice);











    }
}
