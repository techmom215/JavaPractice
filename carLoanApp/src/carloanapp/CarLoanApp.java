/*
 * Angela Andrews
 * Codecademy Projects: Car Loan 
 * 1/26/17
 */
package carloanapp;

/**
 *
 * @author caramel_mom_98
 */
public class CarLoanApp {

    /*
  this program calculated the monthly payment on a car loan
  
     */
    public static void main(String[] args) {
        int carLoan = 9000; //amt of loan
        int loanLength = 3; //years to pay off loan
        int interestRate = 20; // interest rate
        int downPayment = 1500; //down payment

        if (loanLength <= 0 || interestRate <= 0) {
            System.out.println("Error! You must take out a valid car loan");

        } else if (downPayment >= carLoan) {
            System.out.println("No need for a loan, you can pay for your car in full.");
        } else {
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = monthlyBalance * interestRate / 100;
            int monthlyPayment = monthlyBalance + interest;

            System.out.println("The monthly payment is $" + monthlyPayment);

        }

    }

}
