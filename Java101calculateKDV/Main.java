package Java101calculateKDV;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter price: ");
        float price = input.nextFloat();
        float KDV = price*18/100;
        float withoutKDV = price-KDV;

        System.out.println("KDV amount:" + KDV);
        System.out.println("Price without KDV : " + withoutKDV );
        System.out.println("Price with KDV:" + price);



    }
}
