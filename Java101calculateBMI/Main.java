package Java101calculateBMI;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height, weight, BMI;
        System.out.print("Enter height as meter:");
        height = input.nextDouble();
        System.out.print("Enter weight:");
        weight = input.nextDouble();
        BMI = weight/(height*height);

        System.out.print("Body mass index: " + BMI);


    }
}
