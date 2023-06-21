public class Lab_04_02_YearlyMaintenanceCost
{
    public static void main(String[] args)
    {
        double winterCost = 250.00;
        double springCost = 300.00;
        double summerCost = 275.00;
        double fallCost = 280.00;
        double totalCost = 0;
        totalCost = (winterCost + springCost + fallCost + summerCost);
            System.out.println("Winter Cost is $" + winterCost);
            System.out.println("Summer Cost is $" + summerCost);
            System.out.println("Fall Cost is $" + fallCost);
            System.out.println("Spring Cost is $" + springCost);
        System.out.println("Total Yearly Cost is $" + totalCost);
    }
}
