// Q: Check a number is palindrome or not

package Assignment_2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter the number to check Palindrome:");
        int num = input.nextInt();
        int  reversedNum = 0, remainder;
        
        int originalNum= num;

        while(num!=0){
            remainder= num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /=10;
        }
        if(originalNum == reversedNum){
            System.out.println(originalNum + " is palindrome");
        }
        else{
            System.out.println(originalNum + " is not palindrome");
        }
      input.close();
    }
}
