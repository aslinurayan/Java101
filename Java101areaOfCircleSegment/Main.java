package Java101areaOfCircleSegment;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = input.nextDouble();
        System.out.print("Enter angle:");
        double angle = input.nextDouble();
        double areaOfSegment = (pi*(r*r)*angle)/360;

        System.out.println("Area of circle segment: " + areaOfSegment);




    }
}
