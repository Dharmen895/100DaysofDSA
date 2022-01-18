package Methods_Assignment;
import java.util.*;
public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter the prime number :");
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
        in.close();
    }

    static boolean isPrime(int n){
    if (n<=1){
        return false;
    }
     int c = 2;
     while(c*c<=n){
         if (n % c ==0){
             return false;
         }
         c++;
     }
     return c*c > n;

    }
   

}
