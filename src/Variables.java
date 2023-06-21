public class Variables
{
    public static void main(String[] args)
    {
        int intOperandA = 5;
        int intOperandB = 10;
        int intSum = 0;
        int intProduct = 4;
        int intDifference = 5;
        int intQuotient = 6;
        int intModulo = 7;
        double doubleOperandA = 3.50;
        double doubleOperandB = 4.50;
        double doubleSum = 5.50;
        double doubleProduct = 2.50;
        double doubleDifference = 1.50;
        double doubleQuotient = .50;
        double doubleModulo = 6.50;

        intSum = intOperandA + intOperandB; // Assignment that uses the Arithmetic operator +
            System.out.println("The sum using ints of " +intOperandA+ " " +intOperandB+ " is " +intSum); //Output Statement
        intProduct = intOperandA * intOperandB; // Assignment that uses the Arithmetic operator *
            System.out.println("The Product using ints of " +intOperandA+ " " +intOperandB+ " is " +intProduct); //Output Statement
        intDifference = intOperandA - intOperandB; // Assignment that uses the Arithmetic operator -
            System.out.println("The difference using ints of " +intOperandA+ " " +intOperandB+ " is " +intDifference); //Output Statement
        intQuotient = intOperandA / intOperandB; // Assignment that uses the Arithmetic operator /
            System.out.println("The quotient using ints of " +intOperandA+ " " +intOperandB+ " is " +intQuotient); //Output Statement
        intModulo = (intOperandA * intOperandB) / 100; // Assignment that uses the Arithmetic operator %
            System.out.println("The percentage using ints of " +intOperandA+ " " +intOperandB+ " is " +intModulo); //Output Statement
        doubleSum = doubleOperandA + doubleOperandB;
            System.out.println("The sum using ints of " +doubleOperandA+ " " + doubleOperandB + " is " +doubleSum); //Output Statement
        doubleProduct = doubleOperandA * doubleOperandB;
            System.out.println("The product using ints of " +doubleOperandA+ " " +doubleOperandB+ " is " +doubleProduct); //Output Statement
        doubleDifference = doubleOperandA - doubleOperandB;
            System.out.println("The difference using ints of " +doubleOperandA+ " " +doubleOperandB+ " is " +doubleDifference); //Output Statement
        doubleQuotient = doubleOperandA / doubleOperandB;
            System.out.println("The quotient using ints of " +doubleOperandA+ " " +doubleOperandB+ " is " +doubleQuotient); //Output Statement
        doubleModulo = (doubleOperandA * doubleOperandB) / 100;
        System.out.println("The percentage using ints of " +doubleOperandA+ " " +doubleOperandB+ " is " +doubleModulo); //Output Statement
    }

}