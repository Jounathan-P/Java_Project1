import java.util.Scanner;
import java.util.Random;

public class Programming_Lab1_Question2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber, usersInput, playAgain = 0;

        System.out.println("Welcome to The Guessing Game ");
        while (playAgain != 2) {
            System.out.println("A Random Number Has Been Generated and You Have Five(5) Chances ");
            System.out.println("Press 1 to Start and Have Fun! ");
            usersInput = sc.nextInt();

            randomNumber = rand.nextInt(100);
            int limit = 0;
            boolean pE = false;

            System.out.print("Enter Your First Attempt: ");
            usersInput = sc.nextInt();

            while (pE == false) {
                if (usersInput == randomNumber) {
                    System.out.print("You Won!!");
                    pE = true;
                } else if (usersInput > randomNumber) {
                    System.out.print("The Random Number is lower ");
                    usersInput = sc.nextInt();
                    limit += 1;
                    if (limit == 4){
                        pE = true;
                    }
                } else if (usersInput < randomNumber) {
                    System.out.print("The Random Number is Higher ");
                    usersInput = sc.nextInt();
                    limit += 1;
                    if (limit == 4){
                        pE = true;
                    }
                }
            }
            if (limit == 4) {
                System.out.println("You Lose :(");
                System.out.println("The Random Number was" + randomNumber);
                System.out.println("Would You Like to Play Again? (1 = Yes, 2 = No): ");
                playAgain = sc.nextInt();
            } else {
                System.out.print("Would You Like to Play Again? (1 = Yes, 2 = No): ");
                playAgain = sc.nextInt();
            }
        }
    }
}
