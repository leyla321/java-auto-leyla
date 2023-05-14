package section1;

public class SimpleCalculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // calling methods to calculate operations
        int sum = getSum(a, b);
        int diff = getDifference(a, b);
        int prod = getProduct(a, b);
        int div = getDivision(a, b);

        // output of results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Products: " + prod);
        System.out.println("Division: " + div);
    }

    // method for sum
    public static int getSum(int a, int b)
    {
        return a + b;
    }

    // method for difference
    public static int getDifference(int a, int b)
    {
        return a - b;
    }

    // method for product
    public static int getProduct(int a, int b)
    {
        return a * b;
    }

    // method for division
    public static int getDivision(int a, int b)
    {
        return a / b;
    }

}
