package gcd;
import java.util.Scanner;
/**
 * @author Merhawi Tesfay
 */
public class GCD {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
    
        while(true){
            
            System.out.print("Enter a: ");
            int a = scan.nextInt();
            
            if(a == 0)
                break;

            System.out.print("Enter b: ");
            int b = scan.nextInt();
            
            if(b == 0)
                break;

            long startTime1 = System.nanoTime();
            recursiveGCD(a, b);
            long endTime1 = System.nanoTime();
            long duration1 = (endTime1 - startTime1);

            long startTime2 = System.nanoTime();
            iterativeGCD(a, b);
            long endTime2 = System.nanoTime();
            long duration2 = (endTime2 - startTime2);

            System.out.println("recurive: " + recursiveGCD(a, b));
            System.out.println("recurive: " + iterativeGCD(a, b));

            System.out.println("recursion time: " + duration1);
            System.out.println("iteration time: " + duration2);
        }
    }
    
    public static int recursiveGCD(int a, int b) {
        
        if(b == 0)
            return a;
        
        else
            return recursiveGCD(b, (a % b));
    }
    
    public static int iterativeGCD(int a, int b) {
        
        while(a != b){
            
            if(a > b)
                a -= b;
            
            else
                b -= a;
        }       
        return a;
    }  
}
