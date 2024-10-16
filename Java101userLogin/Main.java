package Java101userLogin;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        System.out.print("Enter your user name:");
        userName = input.nextLine();
        System.out.print("Enter your password:");
        password = input.nextLine();
        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("You are logged in.");
        }
        else{
            System.out.println("Your information is wrong!");
            System.out.println("Do you want to change your password? 1-Y\n2-N");
            int choice = input.nextInt();
            input.nextLine(); //clear end of line character with empty nextLine()
            switch(choice){
                case 1:
                    System.out.print("Enter your new password:");
                    String newPassword = input.nextLine();
                    if(newPassword.equals("java123")){
                        System.out.println("The password could not be created, please enter another password");
                    }
                    else{
                        password = newPassword;
                        System.out.println("Password created");
                    }
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Invalid choice.");

            }



        }

    }
}
