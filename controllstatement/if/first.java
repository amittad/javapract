
import java.util.Scanner;

/**
 * 1st
 * Positive, Negative या Zero



Even या Odd



3 और 5 दोनों से divisible है या नहीं

100 से बड़ा है या नहीं
 */
public class first {    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0){
          System.out.println("positive");
        }
        else{
          System.out.println("negative");
        }
        if(a%2==0){
          System.out.println("even");
        }
        else{
          System.out.println("odd");
        }
        if(a%5==0&&a%3==0){
          System.out.println("divisabale");
        }
        else{
          System.out.println("not divisibale");
        }





    }

    
}