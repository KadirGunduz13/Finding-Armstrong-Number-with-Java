import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Armstrong Number*/

        int number, digit;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        number = input.nextInt();

        String str_number = Integer.toString(number);

        digit = str_number.length(); //We found the place value of the number.

        if (number < 0) {
            System.out.println("Number is negative. Armstrong numbers cannot be negative.");
        } else if (digit == 0 || digit == 1) {
            System.out.print("The number entered is an Armstrong number.");
        } else {

            switch (digit) {
                case 2:
                    int tens, ones;
                    double new_tens, new_ones, new_number;
                    tens = number / 10;
                    ones = number % 10;
                    new_tens = Math.pow(tens, 2);
                    new_ones = Math.pow(ones, 2);
                    new_number = new_tens + new_ones;
                    if (number == new_number) {
                        System.out.print("The number entered is an Armstrong number.");
                    } else {
                        System.out.print("The number entered is not an Armstrong number.");
                    }
                    break;

                case 3:
                    int hundreds_3, tens_3, ones_3;
                    double new_hundreds_3, new_tens_3, new_ones_3, new_number_3;
                    hundreds_3 = number / 100;
                    tens_3 = (number / 10) % 10;
                    ones_3 = number % 10;
                    new_hundreds_3 = Math.pow(hundreds_3, 3);
                    new_tens_3 = Math.pow(tens_3, 3);
                    new_ones_3 = Math.pow(ones_3, 3);
                    new_number_3 = new_hundreds_3 + new_tens_3 + new_ones_3;
                    if (number == new_number_3) {
                        System.out.print("The number entered is an Armstrong number.");
                    } else {
                        System.out.print("The number entered is not an Armstrong number.");
                    }
                    break;

                case 4:
                    int thousands_4, hundreds_4, tens_4, ones_4;
                    double new_thousands_4, new_hundreds_4, new_ones_4, new_tens_4, new_number_4;
                    thousands_4 = number / 1000;
                    hundreds_4 = (number / 100) % 10;
                    tens_4 = (number / 10) % 10;
                    ones_4 = number % 10;
                    new_thousands_4 = (Math.pow(thousands_4, 4));
                    new_hundreds_4 = (Math.pow(hundreds_4, 4));
                    new_tens_4 = (Math.pow(tens_4, 4));
                    new_ones_4 = Math.pow(new_thousands_4, 4);
                    new_number_4 = new_hundreds_4 + new_tens_4 + new_ones_4 + new_thousands_4;
                    if (number == new_number_4) {
                        System.out.print("The number entered is an Armstrong number.");
                    } else {
                        System.out.print("The number entered is not an Armstrong number.");
                    }
                    break;

                default:
                    System.out.println("Please enter a number of at most 4 digits");
                    break;
            }
        }
    }
}