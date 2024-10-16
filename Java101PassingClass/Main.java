package Java101PassingClass;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math, phy, trk, che, music, sum=0;
        System.out.print("Enter math grade: ");
        math = input.nextInt();
        if(math>= 0 && math<= 100){
            sum += math;
        }
        System.out.print("Enter phy grade: ");
        phy = input.nextInt();
        if(phy>= 0 && phy<=100){
            sum += phy;
        }
        System.out.print("Enter trk grade: ");
        trk = input.nextInt();
        if(trk>= 0 && trk<=100){
            sum += trk;
        }
        System.out.print("Enter che grade: ");
        che = input.nextInt();
        if(che>= 0 && che<=100){
            sum += che;
        }
        System.out.print("Enter music grade: ");
        music = input.nextInt();
        if(music>= 0 && music<=100){
            sum += music;
        }
        double average = sum / 5;
        if(average > 55){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }
        System.out.println("Your average:" + average);

    }
}
