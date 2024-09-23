public class Main {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    private static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }



        int sum = 0;

        while (number > 0) {
            int lastdigit = number % 10;
            if (lastdigit % 2 == 0) {
                sum += lastdigit;

            }number /= 10;


            // while number is greater than 0.
            // get the last digit with mod store in variable.
            // check if its even.  % 2
            // if even add to sum.
            // number divide equals 10.

        } return sum;


    }
}