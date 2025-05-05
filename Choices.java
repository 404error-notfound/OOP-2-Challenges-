//CHALLENGE 3
import java.util.Scanner;
public class Choices {
    void securityCheck(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome Home...what's your name again? ");
        String name = scanner.nextLine();

        System.out.print("What is the highest amount you have ever spent (in dollars)?");
        double amount = scanner.nextDouble();

        if (amount==1478695){
            System.out.print("Access Granted! Relax and Unwind");
        }
        else {
            System.out.print("Imposter!!!");
        }
    }
public 
static void main (String[]args){
    (new Choices()).securityCheck();
}
}
