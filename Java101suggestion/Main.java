package Java101suggestion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heat;
        System.out.print("Enter heat:");
        heat = input.nextInt();
        if(heat<=25){
            if(heat>=15){
                System.out.println("Picnic");
            }
            else if(heat>=5){
                System.out.println("Cinema");
            }
            else{
                System.out.println("ski");
            }
        }
        else{
            System.out.println("Swimming");
        }

    }
}
