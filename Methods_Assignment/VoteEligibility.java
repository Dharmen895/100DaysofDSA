/* Q:A person is eligible to vote if his/her age is greater than or equal to 18. 
Define a method to find out if he/she is eligible to vote.*/

package Methods_Assignment;

import java.util.Scanner;

public class VoteEligibility {
    
    public static void main(String[] args) {
        isEligible();
    }
    static void isEligible( ){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the age :");
         int age = in.nextInt();
        if (age>=18){
           System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }
        in.close();
    }
}
