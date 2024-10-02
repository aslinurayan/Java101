package Java101calculatePrice;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pear = 2.14, apple = 3.67, tomatoes = 1.11, banana = 0.95, aubergine = 5.00;
        double totalPrice;
        System.out.println("Enter kg for pear:");
        double pearKg = input.nextDouble();
        System.out.println("Enter kg for apple:");
        double appleKg = input.nextDouble();
        System.out.println("Enter kg for tomatoes:");
        double tomatoesKg = input.nextDouble();
        System.out.println("Enter kg for banana:");
        double bananaKg = input.nextDouble();
        System.out.println("Enter kg for aubergine:");
        double aubergineKg = input.nextDouble();
        totalPrice = (pearKg*pear) + (appleKg*apple) + (tomatoesKg*tomatoes) + (bananaKg*banana) + (aubergineKg*aubergine);
        System.out.print("Total price : " + totalPrice);
    }
}
