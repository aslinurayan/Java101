import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: " );
        int a = input.nextInt();
        System.out.print("Enter b: " );
        int b = input.nextInt();

        double hypotenuse = Math.sqrt((a*a)+(b*b));
        System.out.println("Hyppotenuse:" + hypotenuse );

    }
}