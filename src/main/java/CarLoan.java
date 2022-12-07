import java.util.Scanner;

public class CarLoan {
    public static void main(String[] args) {

        Scanner carLoan1 = new Scanner(System.in);
            System.out.println("Enter an amount you wish to borrow: ");
            int amount_Borrow = Integer.parseInt(carLoan1.nextLine());

        Scanner carLoan2 = new Scanner(System.in);
        System.out.println("Enter number of years you wish to borrow: ");
        int loan_lengh = Integer.parseInt(carLoan1.nextLine());

        Scanner carLoan3 = new Scanner(System.in);
        System.out.println("Enter current interest rate: ");
        int interest_rate = Integer.parseInt(carLoan1.nextLine());

        Scanner carLoan4 = new Scanner(System.in);
        System.out.println("Enter your down payment: ");
        int down_payment = Integer.parseInt(carLoan1.nextLine());

        if(loan_lengh  <= 0 || interest_rate <= 0 ){
            System.out.println("Error! You must take out a valid car loan.");
        } else if(down_payment >= amount_Borrow){
            System.out.println("The car can be paid in full.");
        }
        else{
            int remainingBalance = amount_Borrow - down_payment;
            int months = loan_lengh * 12;
            int monthlyBalance = remainingBalance/months;
            int interest = (monthlyBalance * interest_rate)/100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println("Your monthly repayment are : "+monthlyPayment);
        }
    }
}
