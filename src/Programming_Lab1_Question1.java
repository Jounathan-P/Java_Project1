import java.util.Scanner;

public class Programming_Lab1_Question1 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int accountNum, numOfMin, timeDuringDay, timeDuringNight;
        char serviceCode;
        double amountDue, dayCost, nightCost;

        System.out.print("Please Enter Your Account Number: ");
        accountNum = sc.nextInt();

        System.out.print("Please Enter Your Service Code ((A) for Regular Service or (B) for Premium: ");
        serviceCode = sc.next().charAt(0);


        do {
            if (serviceCode == 'A' || serviceCode == 'a') {
                System.out.print("Please Enter Number of Minutes The Service was Used: ");
                numOfMin = sc.nextInt();
                amountDue = 10 + ((numOfMin - 50) * 0.20);
            } else if (serviceCode == 'B' || serviceCode == 'b') {
                System.out.print("Please Enter the Amount of Minutes The Service was Used During the Day: ");
                timeDuringDay = sc.nextInt();

                System.out.print("Please Enter the Amount of Minutes The Service was Used During the Night: ");
                timeDuringNight = sc.nextInt();

                dayCost = ((timeDuringDay - 75) * 0.10);
                nightCost = ((timeDuringNight - 100) * 0.05);
                amountDue = 25 + dayCost + nightCost;
            } else {
                System.out.print("Please Enter (A) for Regular Service or (B) for Premium: ");
                serviceCode = sc.next().charAt(0);
            }
        }
        while(serviceCode != 'A' || serviceCode != 'a' || serviceCode != 'B' || serviceCode != 'b');
    }
}
