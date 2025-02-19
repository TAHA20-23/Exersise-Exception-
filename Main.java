import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Q1: Arithmetic Operations
            System.out.print("Input first number: ");
            int num1 = getValidInt(scanner);

            System.out.print("Input second number: ");
            int num2 = getValidInt(scanner);

            int sum = num1 + num2;
            int difference = num1 - num2;
            int product = num1 * num2;
            int quotient = num1 / num2;
            int remainder = num1 % num2;

            System.out.println(num1 + " + " + num2 + " = " + sum);
            System.out.println(num1 + " - " + num2 + " = " + difference);
            System.out.println(num1 + " x " + num2 + " = " + product);
            System.out.println(num1 + " / " + num2 + " = " + quotient);
            System.out.println(num1 + " mod " + num2 + " = " + remainder);

            // Q2: Multiplication Table
            System.out.print("Enter a number for multiplication table: ");
            int number = getValidInt(scanner);
            System.out.println("Multiplication table of " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }

            // Q3: Circle Area and Perimeter
            System.out.print("Enter circle radius: ");
            double radius = getValidDouble(scanner);
            double perimeter = 2 * Math.PI * radius;
            double area = Math.PI * radius * radius;
            System.out.println("Perimeter: " + perimeter);
            System.out.println("Area: " + area);

            // Q4: Average Calculation
            System.out.print("Enter count of numbers: ");
            int count = getValidInt(scanner);
            if (count <= 0) throw new IllegalArgumentException("Invalid count! Must be positive.");

            int sum1 = 0;
            for (int i = 1; i <= count; i++) {
                System.out.print("Enter an integer: ");
                sum1 += getValidInt(scanner);
            }
            System.out.println("The average is: " + ((double) sum1 / count));

            // Q5: Sum Check
            System.out.print("Input first number: ");
            int Num1 = getValidInt(scanner);
            System.out.print("Input second number: ");
            int Num2 = getValidInt(scanner);
            System.out.print("Input third number: ");
            int Num3 = getValidInt(scanner);
            System.out.println("The result is: " + (Num1 + Num2 == Num3));

            // Q6: Reverse a Word
            scanner.nextLine(); // Consume newline
            System.out.print("Input a word: ");
            String word = scanner.nextLine();
            System.out.println("Reversed word: " + new StringBuilder(word).reverse());

            // Q7: Even or Odd
            System.out.print("Enter a number: ");
            int num = getValidInt(scanner);
            System.out.println("The number is " + (num % 2 == 0 ? "Even" : "Odd"));

            // Q8: Temperature Conversion
            System.out.print("Enter temperature in Celsius: ");
            double celsius = getValidDouble(scanner);
            System.out.println("Temperature in Fahrenheit: " + ((celsius * 9 / 5) + 32));

            // Q9: Character at Index
            scanner.nextLine();
            System.out.print("Input a string: ");
            String inputString = scanner.nextLine();
            System.out.print("Input an index: ");
            int index = getValidInt(scanner);
            if (index >= 0 && index < inputString.length()) {
                System.out.println("Character at index " + index + ": " + inputString.charAt(index));
            } else {
                throw new IndexOutOfBoundsException("Invalid index! Must be between 0 and " + (inputString.length() - 1));
            }

            // Q10: Rectangle Area and Perimeter
            double width = 5.6, height = 8.5;
            System.out.printf("Area: %.2f%nPerimeter: %.2f%n", width * height, 2 * (width + height));

            // Q11: Compare Two Numbers
            System.out.print("Input first integer: ");
            int nUm1 = getValidInt(scanner);
            System.out.print("Input second integer: ");
            int nUm2 = getValidInt(scanner);


            System.out.println(num1 + (nUm2 == nUm2 ? " == " : " != ") + nUm2);

            System.out.println(num1 + (nUm1 < nUm2 ? " < " : " >= ") + nUm2);
            System.out.println(num1 + (nUm1 <= nUm2 ? " <= " : " > ") + nUm2);

            // Q12: Convert Seconds to Time Format
            System.out.print("Input seconds: ");
            int totalSeconds = getValidInt(scanner);
            System.out.printf("%02d:%02d:%02d%n", totalSeconds / 3600, (totalSeconds % 3600) / 60, totalSeconds % 60);

            // Q13: Check if Four Numbers Are Equal
            System.out.print("Input four numbers: ");
            int first = getValidInt(scanner);
            int second = getValidInt(scanner);
            int third = getValidInt(scanner);
            int fourth = getValidInt(scanner);
            System.out.println((first == second && second == third && third == fourth) ? "Numbers are equal!" : "Numbers are not equal!");

            // Q14: Positive, Negative, or Zero
            System.out.print("Input a number: ");
            int numBer = getValidInt(scanner);
            System.out.println(numBer > 0 ? "Number is positive" : numBer < 0 ? "Number is negative" : "Number is zero");

            // Q15: Count Positive, Negative, and Zero
            int posCount = 0, negCount = 0, zeroCount = 0, inputValue;
            while (true) {
                System.out.print("Enter a number (-1 to stop): ");
                inputValue = getValidInt(scanner);
                if (inputValue == -1) break;
                if (inputValue > 0) posCount++;
                else if (inputValue < 0) negCount++;
                else zeroCount++;
            }
            System.out.println(posCount + " positives, " + zeroCount + " zero, " + negCount + " negatives");

            // Q16: Reverse Digits of a Number
            System.out.print("Enter an integer to reverse: ");
            int inputValueQ16 = getValidInt(scanner);
            int reversed = 0;
            while (inputValueQ16 != 0) {
                reversed = reversed * 10 + (inputValueQ16 % 10);
                inputValueQ16 /= 10;
            }
            System.out.println("Reversed number: " + reversed);

            // Q17: Find Maximum and Minimum of 3 Numbers
            System.out.print("Input the first number: ");
            int numA = getValidInt(scanner);
            System.out.print("Input the second number: ");
            int numB = getValidInt(scanner);
            System.out.print("Input the third number: ");
            int numC = getValidInt(scanner);
            System.out.println("Max: " + Math.max(numA, Math.max(numB, numC)) + ", Min: " + Math.min(numA, Math.min(numB, numC)));

            // Q18: Find the Largest Digit in a Number
            System.out.print("Enter a number: ");
            int numQ18 = getValidInt(scanner);
            int largestDigit = 0, temp = Math.abs(numQ18);
            while (temp > 0) {
                largestDigit = Math.max(largestDigit, temp % 10);
                temp /= 10;
            }
            System.out.println("Largest digit: " + largestDigit);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static int getValidInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input! Enter a valid integer: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static double getValidDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input! Enter a valid number: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}