
import java.util.Scanner;


/**400 से divisible है → Leap year।

100 से divisible है → Not leap year।

4 से divisible है → Leap yea

Otherwise → Not leap year। */
public class leap {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a year");
        int a=sc.nextInt();
        if (a%400==0&&a%40==0 &&a%100!=0) {
            System.out.println("leap year");
            
        }
        else{
            System.out.println("not leap year");
        }

        
    }
}
