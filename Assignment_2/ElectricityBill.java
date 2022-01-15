
// Q: Calculate Electricity Bill

package Assignment_2;



public class ElectricityBill {
    public static void main(String[] args) {
        
  
    int units = 380;

    double billPay = 0;

    if (units<100){
        billPay = units*1.2;
    }
    else if (units< 300){
        billPay = 100*1.2 + (units-100)*2;
    }
    else if (units>300){
        billPay = 100*1.2 + 200*2 + (units-300)*3;
    }
    System.out.println("Total electricity bill is : "+ billPay);

}
}
