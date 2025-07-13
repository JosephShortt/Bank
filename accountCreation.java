import java.util.*;

public class accountCreation implements accountCreationService {

    private String firstName,surname,gender,address,areaCode,email,contactNum,accountType;
    private int accountNum,age;

    public void enterDetails() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("**Welcome to account creation**");

        System.out.println("Please enter your first name");
        firstName = scanner.nextLine();

        System.out.println("Please enter your surname");
        surname = scanner.nextLine();

        System.out.println("Please enter your age");
        age = scanner.nextInt();

        System.out.println("Please enter your gender");
        gender = scanner.nextLine();

        System.out.println("Please enter your address");
        address = scanner.nextLine();
        
        System.out.println("Please enter your area code");
        areaCode = scanner.nextLine();

        System.out.println("Please enter your email");
        email = scanner.nextLine();

        System.out.println("Please enter your contact number");
        contactNum = scanner.nextLine();

        System.out.println("Please enter your account type (Savings, Current)");
        surname = scanner.nextLine();

        System.out.println("Please enter your account number assigned to you");
        accountNum = scanner.nextInt();
    }
}