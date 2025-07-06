import java.util.Scanner;

public class logbas {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("REGISTER FORM");
        System.out.println("Enter Your Nmae :");
        String name = scan.nextLine();
        System.out.println("Enter Your Emali :");
        String emali = scan.nextLine();
        System.out.println("Enter Your Password :");
        String pass = scan.nextLine();
        
        System.out.println("LOGIN FORM");
        System.out.println("Enter your Email :");
        String logEmail = scan.nextLine();
        System.out.println("Enter Your Password :");
        String logPass = scan.nextLine();

        if(name.isEmpty() || emali.isEmpty() || pass.isEmpty()){
            System.out.println("WARNING : Plaes fill all the reqested details");
        }
        else if (emali.equals(logEmail) && pass.equals(logPass)) {
            System.out.println("Login Successful");
            System.out.println(name + " Welcome to the Web Buddy....");
            
        }
        else{
            System.out.println("Login failed");
         }
    }
}
