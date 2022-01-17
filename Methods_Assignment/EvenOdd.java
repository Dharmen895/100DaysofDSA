// Q:Define a program to find out whether a given number is even or odd.

package Methods_Assignment;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        evenOdd();
    }
    static void evenOdd(){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();
        if (num%2==0){
            System.out.println(num+ "  is a even number.");
        }else{
            System.out.println(num + " is an odd number");
        }

       in.close();
    }
}
