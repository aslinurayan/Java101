package Java101calculateAverage;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int math, phy, chemistry, music, Turkce, history;
        System.out.print("Enter math:");
        math = input.nextInt();
        System.out.print("Enter phy:");
        phy = input.nextInt();
        System.out.print("Enter chemistry:");
        chemistry = input.nextInt();
        System.out.print("Enter music:");
        music = input.nextInt();
        System.out.print("Enter Turkce:");
        Turkce = input.nextInt();
        System.out.print("Enter history:");
        history = input.nextInt();

        int sum = math + phy + chemistry + music + Turkce + history;
        double average = sum/6;
        System.out.println(average);
        String result = average>=65 ? "Passed" : "Failed";
        System.out.println(result);



    }

}
