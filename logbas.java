import java.util.Scanner;

public class logbas {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("REGISTER FORM\n");
        System.out.print("Enter Your Nmae : ");
        String name = scan.nextLine();
        System.out.print("Enter Your Emali : ");
        String emali = scan.nextLine();
        System.out.print("Create Your Password : ");
        String pass = scan.nextLine();
        
        System.out.println("\nLOGIN FORM\n");
        System.out.print("Enter your Email : ");
        String logEmail = scan.nextLine();
        System.out.print("Enter Your Password : ");
        String logPass = scan.nextLine();

        if(name.isEmpty() || emali.isEmpty() || pass.isEmpty()){
            System.out.println("\nWARNING : Plaes fill all the reqested details\n");
        }
        else if (emali.equals(logEmail) && pass.equals(logPass)) {
            System.out.println("\nWARNING : Login Successful ");
            System.out.println("\n"+name + " Welcome to the Web Buddy....\n");     
        }
        else{
            System.out.println("\nLogin failed EMAIL OR PASSWORD IS INCORRECT\n");
         }
    }
}
