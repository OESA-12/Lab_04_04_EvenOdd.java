public class Lab_04_01_SalesTax
{
    
    {
        double itemPrice = 500;
        double salesTax = 0.05;
        double totalCost = 0;
        double afterTax = 0;
        //System.out.println( "What is the Item Price ? " );
                totalCost = itemPrice * salesTax;
                afterTax = totalCost + itemPrice;
                    System.out.println("Item Price is " + itemPrice);
                    System.out.println("Sales Tax is " + salesTax);
                    System.out.println("Total Sales Tax Cost is " + totalCost);
                    System.out.println("Cost with Tax is " + afterTax);
    }
}
