import java.util.Scanner;
public class vehicle_store {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    car c = new car();
    truck t = new truck();
    System.out.println("===> car press 1 || truck press 2 <===");
    int n = sc.nextInt();
    switch (n) {
        case 1:
            c.brand = "tsyon";
            c.year =1986;
            c.fuel_type = "petrol";
            System.out.println(c.brand+"\n"+c.year+"\n"+c.fuel_type);
            c.start_engine();
            c.drive();
            break;
        case 2:
        t.brand = "kavin";
        t.year = 2005;
        System.out.println(t.brand+"\n"+t.year);
        t.start_engine();
        t.haul();
        break; 
        default:
            break;
    }

 }   
}

class vehicle {
   String brand;
   int year;
   Scanner sc = new Scanner(System.in);
   char op ;
   void start_engine(){

   }
    
}
class car extends vehicle{
    String fuel_type;
    void start_engine(){
        System.out.println("engine was start ? y/n");
        op = sc.next().charAt(0);
        switch (op) {
        case 'y':
        System.out.println("car engins was started");
        break;
        case 'n':
        System.out.println("car engine was not start");
        default:
            break;
       }
    } 
    void drive (){
        switch (op){
        case 'y':
        System.out.println("car is driving");
        break;
        case 'n':
        System.out.println("car is not start");
        break;
        }
    }
}
class truck extends vehicle{
    void start_engine(){
        System.out.println("");System.out.println("engine was start ? y/n");
        op = sc.next().charAt(0);
        switch (op) {
        case 'y':
        System.out.println("truck engine was stsrted");
        break;
        case 'n':
        System.out.println("truck engine was not start");
        default:
            break;
       }
    }
    void haul(){
        switch (op){
        case 'y':
        System.out.println("truck was hauling");
        break;
        case 'n':
        System.out.println("truck was not hauling");
        break;
        }
        
    }
}
