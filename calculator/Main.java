package calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, select;

        System.out.println("1-addition \n 2-extraction \n 3-multiplication \n 4-division");
        System.out.println("Enter your choice:");
        select = input.nextInt();
        System.out.println("Enter first number:");
        n1 = input.nextInt();
        System.out.println("Enter second number:");
        n2 = input.nextInt();

        switch(select){
            case 1:
                System.out.println("result:" + (n1 + n2));
                break;
            case 2:
                System.out.println("result:" + (n1 - n2));
                break;
            case 3:
                System.out.println("result:" + (n1 * n2));
                break;
            case 4:
                if(n2 == 0){
                    System.out.println("A number cannot be divide by 0");
                }
                else{
                    System.out.println("result:" + (n1/n2));
                }
                break;
            default:
                System.out.println("Wrong choice");
        }




    }
}
