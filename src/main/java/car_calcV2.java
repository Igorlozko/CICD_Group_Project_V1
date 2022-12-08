import java.util.Scanner;

public class car_calcV2 {
    private int amount_Borrow;
    private int loan_lenght;
    private int interest_rate;
    private int down_payment;

    public car_calcV2(int amount_Borrow, int loan_lenght, int interest_rate, int down_payment) {
        setamount_Borrow(amount_Borrow);
        setloan_lenght(loan_lenght);
        setinterest_rate(interest_rate);
        setdown_payment(down_payment);
    }

    public int getamount_Borrow() {
        return amount_Borrow;
    }

    private void setamount_Borrow(int amount_Borrow) {
        if (amount_Borrow > 0) {
            this.amount_Borrow = amount_Borrow;
        } else {
            throw new IllegalArgumentException("You must enter more than 0.");
        }
    }

    public int getloan_lenght() {
        return loan_lenght;
    }

    private void setloan_lenght(int loan_lenght) {
        if (loan_lenght >= 0 && loan_lenght <= 5) {
            this.loan_lenght = loan_lenght;
        } else {
            throw new IllegalArgumentException("Lenght must be between 1 and 5");
        }
    }

    public int getinterest_rate() {
        return interest_rate;
    }

    private void setinterest_rate(int interest_rate) {
        if (interest_rate >= 0 && interest_rate <= 23) {
            this.interest_rate = interest_rate;
        } else {
            throw new IllegalArgumentException("Interest rate is between 0 and 23 %.");
        }
    }

    public int getdown_payement() {
        return down_payment;
    }

    private void setdown_payment(int down_payment) {
        if (down_payment >= amount_Borrow) {
            System.out.println("The car can be paid in full.");
            if (down_payment > 0) {
                this.down_payment = down_payment;
            } else {
                throw new IllegalArgumentException("Must be more than 0");
            }
        }
    }
}
