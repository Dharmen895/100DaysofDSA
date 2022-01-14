import java.util.Scanner;

public class Assignment_1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

    // Q: Write a program to print whether a number is even or odd, also take input.

        // int num;
        // System.out.print("Enter the given number : ");
        // num = input.nextInt();

        // if(num % 2 == 0)
        //     System.out.println("The entered number is even");
        // else
        //    System.out.println("The entered number is odd");
        // input.close();
 
    // Q: Take name as input and print a greeting message for that name.

        //    String name = input.next();
        //    System.out.println("Hello Mr./Mrs. "+name);

    // Q: Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

        // int simpleInterest;
        // int principal= input.nextInt();
        // int rate= input.nextInt();
        // int time= input.nextInt();
        // simpleInterest=principal*rate*time;
        // System.out.println(simpleInterest);

    // Q: Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if else conditions)
       
    //   System.out.println("Enter first number: ");
    //   int a = input.nextInt();
    //   System.out.println("Enter second number: ");
    //   int b = input.nextInt();
    //   System.out.println("Enter operator: ");
    //   char op = input.next().charAt(0);
    //   int r = 0;
      
    //   if(op=='+'){
    //     r = a + b;
    //     System.out.println(a + " + "+ b + " = " + r);
    //   }
    //   if(op=='-'){
    //     r = a - b;
    //     System.out.println(a + " - "+ b + " = " + r);
    //   } 
    //   if(op=='*'){
    //     r = a * b;
    //     System.out.println(a + " * "+ b + " = " + r);
    //   }
    //   if(op=='/'){
    //     r = a / b;
    //     System.out.println(a + " / "+ b + " = " + r);
    //   }

    // Q: Take 2 numbers as input and print the largest number.
    
    //    int a= input.nextInt();
    //    int b= input.nextInt();
    //    if (a>b){
    //        System.out.println(a+" is the largest number");
    //    }
    //    else{
    //        System.out.println(b+" is the largest number");
    //    }

    // Q: Input currency in rupees and output in USD.
        
        // System.out.println("Enter currency in IR: ");
        // int ir = input.nextInt();
        // double usd = ir * 74.13;
        // System.out.println("Conversion amount in UDS: $"+usd);
        
    // Q: To calculate Fibonacci Series up to n numbers.
        
       int n = input.nextInt();
       int i = 1, firstTerm = 0, secondTerm = 1;
       System.out.println("Fibonacci Series till " + n + " terms:");

       while (i <= n) {
       System.out.print(firstTerm + ", ");

       int nextTerm = firstTerm + secondTerm;
       firstTerm = secondTerm;
       secondTerm = nextTerm;
       i++;
       }

     input.close();
    }
    
}