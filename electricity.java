import java.util.Scanner;
class ElectricBill {
  public static void main(String[] args) {

    // create Scanner class object
    Scanner scan = new Scanner(System.in);

    // read input for unit
    System.out.print("Enter unit: ");
    int unit = scan.nextInt();

    // calculate electric bill
    double bill = calculateElectricBill(unit);

    // display result
    System.out.println("Bill amount = " + bill);
  }

  // Java method to calculate the electric bill amount
  public static double calculateElectricBill(int unit) {

    // tariff rates
    double fixed_price = 100;
    double rate0_100 = 6.30;
    double rate101_200 = 6.85;
    double rateMoreThan200 = 7.40;

    // calculate bill
    if(unit <= 100) {
      return fixed_price + (unit * rate0_100);
    }
    else if(unit <= 200) {
      return ( fixed_price + 
               (100 * rate0_100) + 
               (unit-100)*rate101_200 
             );
    }
    else {
      return ( fixed_price + 
              (100 * rate0_100) + 
               (100 * rate101_200) + 
               (unit-200)* rateMoreThan200 
             );
    }
  }
}