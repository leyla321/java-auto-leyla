package section1;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int number = 1; number <= 30; number++) {

            // calling 5 & 3 first to check this condition first
            if (number % 5 == 0 && number % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (number % 5 == 0) {
                System.out.println("Fizz");
            } else if (number % 3 == 0) {
                System.out.println("Buzz");
            } else
                System.out.println(number);

        }
    }
}
