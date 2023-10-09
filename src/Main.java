import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        int userNum = 0;
        int randomNum = 0;
        boolean done = false;

        do{
            System.out.println("Enter a number 1-10: ");
            if(scan.hasNextInt()){
                userNum = scan.nextInt();
                if(userNum >= 1 && userNum <= 10){
                    randomNum = (int)(Math.random() * 10) + 1;
                    System.out.println("My number was " + randomNum + ".");
                    if(randomNum > userNum){
                        System.out.println("Your number was too low.");
                    }else if(randomNum < userNum){
                        System.out.println("Your number was too high.");
                    }else if(randomNum == userNum){
                        System.out.println("You got it!");
                    }
                    done = true;
                }else{
                    scan.nextLine();
                    System.out.println("Your input was invalid. Try Again.");
                }
            }else{
                scan.nextLine();
                System.out.println("Your input was invalid. Try Again.");
            }
        }while(!done);
    }
}