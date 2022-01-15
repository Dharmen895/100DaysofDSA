
// Q: Calculate Compound Interest

package Assignment_2;



public class CompoundInterest {
    public static void main(String[] args) {
        double principle=10000, rate=12.5, time=4;

        double CI= principle*(Math.pow((1+ rate/100), time));

        System.out.println("Compound Interest is :" + CI);

    }
}
