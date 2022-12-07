import java.util.Scanner;

public class CarDealership {

    public static void main(String[] args) {
        System.out.println("Car Dealership Application\n\r");

        Scanner userInput = new Scanner(System.in);    //System.in is a standard input stream
        int user = Integer.parseInt(userInput.next());
        switch (user) {
            case 1:
                break;
            default: System.out.println("Enter a valid int");
                break;
        }
    }
}
