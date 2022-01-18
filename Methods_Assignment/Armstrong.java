package Methods_Assignment;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner in= new Scanner (System.in);
        int n = in.nextInt();
        System.out.println(isArmstrong(n));
        in.close();

    // Print all three digit Armstrong number
        for(int i=100; i<1000; i++){
            if (isArmstrong(i)){
                System.out.print(i + " ");
            }
        }

    }
    static boolean isArmstrong(int n){
        int original=n;
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            sum += rem*rem*rem;
            n/=10;
        }
        return original == sum;
    }
}
