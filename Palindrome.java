import java.util.Scanner;

public class Palindrome {
 public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    Read ob1 = new Read();
    System.out.print("Enter the words : ");
    String word =sc.nextLine();
    ob1.check(word);
 }   
}
class  Read {
  void check(String word){
    String cleand = word.replaceAll(" ","").toLowerCase();
    String revers ="";
    for(int i = cleand.length() - 1; i >= 0 ; i--){
      revers +=cleand.charAt(i);
    }
     if(cleand.equals(revers)){
       System.out.println("its correct \ninput : "+cleand+"\noutput : "+revers);
   }
   else {
     System.out.println("Its  not match bro\ninput : "+cleand+"\noutput : "+revers);
   }
  }
}
