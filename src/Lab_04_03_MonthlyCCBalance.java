public class Lab_04_03_MonthlyCCBalance {
    public static void main(String[] args)
    {
        double creditCardBalance = 5000;
        double interestRate = 0.17;
        double firstMonth = 0;
        double secondMonth = 0;
        double totalCost = 0;
        firstMonth = interestRate * creditCardBalance;
            System.out.println("The interest rate for the first month is " +firstMonth );
        totalCost = creditCardBalance + firstMonth;
            System.out.println("The balance after the first month is " +totalCost);
        secondMonth = totalCost * interestRate;
            System.out.println("The interest rate for the second month is " +secondMonth);
        totalCost = totalCost + secondMonth;
            System.out.println("The balance for the second month is " +totalCost);
    }
}
