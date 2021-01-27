import java.util.Scanner;

public class JavaProgramming{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your quantity ");
        int quantity = sc.nextInt();

        if(quantity < 100){
            System.out.print("Discount = 0");
        }
        else if(quantity >= 100 && quantity <= 120){
            System.out.print("Discount = 10%");
        }
        else{
            System.out.print("Discount = 15%");
        }
    }

}
