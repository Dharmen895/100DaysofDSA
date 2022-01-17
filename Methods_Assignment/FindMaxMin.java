// Q:Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

package Methods_Assignment;

import java.util.Scanner;

public class FindMaxMin {
    public static void main(String[] args) {
        max_min();
      
     
    }
    static void max_min(){
           Scanner input = new Scanner (System.in);
           System.out.println("Enter the first number: ");
           int a= input.nextInt();
           System.out.println("Enter the first number: ");
           int b= input.nextInt();
           System.out.println("Enter the first number: ");
           int c= input.nextInt();
           int l = Math.max(a, b);
           l= Math.max(l, c);
           System.out.println("Largest number is : "+l);

           int s = Math.min(a, b);
           s= Math.min(s, c);
           System.out.println("Smallest number is : "+s);


           input.close();
    }
    
    
}
