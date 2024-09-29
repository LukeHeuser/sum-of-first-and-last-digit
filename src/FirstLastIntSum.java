public class FirstLastIntSum {
    public static void main(String[] args) {

        sumFirstAndLastDigit(1235);
        sumFirstAndLastDigit(-45);
        sumFirstAndLastDigit(465);
        sumFirstAndLastDigit(Integer.MAX_VALUE);
        sumFirstAndLastDigit(Integer.MIN_VALUE);
        sumFirstAndLastDigit(9);
        sumFirstAndLastDigit(99);
        sumFirstAndLastDigit(109);
    }

    public static int sumFirstAndLastDigit(int number){

        if (number < 0) { // Tests the code to make sure there is a valid input
            System.out.println(number + " is an incorrect value. Number must be greater than 0.");
            return -1;
        }

        int lastNumber = number % 10;
        int firstNumber = number;

        while(firstNumber >= 10){

            firstNumber /= 10; // Dividing our number by 10 to get the first digit of a number.

        }
        int firstAndLastSum = lastNumber + firstNumber;

        System.out.println("The sum of the first and last digit of " + number + " is " + firstAndLastSum);
        return firstAndLastSum;

    }

}
