import java.util.Scanner;

public class Programming_Lab1_Question1 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int accountNum, numOfMin = 0, timeDuringDay = 0, timeDuringNight = 0;
        char serviceCode;
        double amountDue = 0, dayCost, nightCost;
        String typeOfService = null;
        boolean lp = false;

        System.out.print("Please Enter Your Account Number: ");
        accountNum = sc.nextInt();

        System.out.print("Please Enter Your Service Code ((A) for Regular Service or (B) for Premium): ");
        serviceCode = sc.next().charAt(0);


        while (lp == false) {
            if (serviceCode == 'A' || serviceCode == 'a') {
                System.out.print("Please Enter Number of Minutes The Service was Used: ");
                numOfMin = sc.nextInt();
                amountDue = 10 + ((numOfMin - 50) * 0.20);
                typeOfService = "Regular";
                lp = true;
            } else if (serviceCode == 'B' || serviceCode == 'b') {
                System.out.print("Please Enter the Amount of Minutes The Service was Used During the Day: ");
                timeDuringDay = sc.nextInt();

                System.out.print("Please Enter the Amount of Minutes The Service was Used During the Night: ");
                timeDuringNight = sc.nextInt();

                numOfMin = timeDuringDay + timeDuringNight;
                dayCost = ((timeDuringDay - 75) * 0.10);
                nightCost = ((timeDuringNight - 100) * 0.05);
                amountDue = 25 + dayCost + nightCost;
                typeOfService = "Premium";
                lp = true;
            } else {
                System.out.print("Please Enter (A) for Regular Service or (B) for Premium: ");
                serviceCode = sc.next().charAt(0);
                lp = false;
            }
        }
        System.out.print("Account Number: " + accountNum + "\nType of Service: " + typeOfService + "\nAmount of Time Used: " + numOfMin + "\nAmount Due: $" + amountDue);
    }
}
