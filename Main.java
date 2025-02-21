import java.util.Scanner;
import java.util.InputMismatchException;


// I used
// InputMismatchException
// ArithmeticException
// IllegalArgumentException
// StringIndexOutOfBoundsException
// Exception



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    //Q1/  Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of

                int num1 = 0, num2 = 0;

                try {
                    System.out.print("Input first number: ");
                    num1 = scanner.nextInt();

                    System.out.print("Input second number: ");
                    num2 = scanner.nextInt();


                    if (num2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero.");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter valid numbers.");
                    return; // Terminate the program if the input is invalid
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    return; // Terminate the program if there's a division by zero
                }

                // Perform the arithmetic operations
                int sum = num1 + num2;
                int difference = num1 - num2;
                int product = num1 * num2;
                int quotient = num1 / num2;
                int remainder = num1 % num2;

                // Display the results
                System.out.println(num1 + " + " + num2 + " = " + sum);
                System.out.println(num1 + " - " + num2 + " = " + difference);
                System.out.println(num1 + " x " + num2 + " = " + product);
                System.out.println(num1 + " / " + num2 + " = " + quotient);
                System.out.println(num1 + " mod " + num2 + " = " + remainder);




    //Q2/Write a Java program that takes a number as input and
    // prints its multiplication table up to 10.

        int number = 0;

        // Try-catch block to handle invalid input (non-numeric input)
        try {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            // Check if the number is zero
            if (number == 0) {
                throw new ArithmeticException("Cannot generate multiplication table for zero.");
            }

            // Print the multiplication table for the given number up to 10
            System.out.println("Multiplication table of " + number + ":");
            for (int i = 1; i <= 10; i++) {
                // Print each multiplication result
                System.out.println(number + " x " + i + " = " + (number * i));
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }




        // Q3/ Write a Java program to print the area and perimeter of a circle.

       try {
           System.out.print("Enter Radius= ");

        double radius = scanner.nextDouble();

        if (radius == 0) {
            throw new ArithmeticException("Cannot generate multiplication table for zero.");
        }
        // Calculating perimeter circumference and area
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;


        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

       } catch (InputMismatchException e) {
           System.out.println("Invalid input. Please enter a valid number.");
       } catch (ArithmeticException e) {
           System.out.println(e.getMessage());
       }


    //Q4 java program to find out the average of a set of integers

        int count = 0;

        // Try-catch block to handle invalid input for the count
        try {
            System.out.print("Enter the count of numbers: ");
            count = scanner.nextInt();

            // Checking if the count is valid
            if (count <= 0) {

                throw new ArithmeticException("Invalid count! Please enter a positive number.");
            }


            int sum1 = 0;


            for (int i = 1; i <= count; i++) {
                System.out.print("Enter an integer: ");
                int num = scanner.nextInt();
                sum1 += num;
            }

            // Calculate the average
            double average = (double) sum1 / count;


            System.out.println("The average is: " + average);


        } catch (InputMismatchException e) {
            // Handle case where the input is not a valid integer
            System.out.println("Invalid input. Please enter only numbers.");
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    //Q5/ Q5/Write a Java program that accepts three integers as input, adds the first two integer
    // together, and then determines whether the sum is equal to the third integer.

try {


        System.out.print("Input the first number: ");
        int Num1 = scanner.nextInt();

        System.out.print("Input the second number: ");
        int Num2 = scanner.nextInt();

        System.out.print("Input the third number: ");
        int Num3 = scanner.nextInt();

        // Checking if the sum of the first two numbers equals the third
        boolean result = (Num1 + Num2 == Num3);


        System.out.println("The result is: " + result);
} catch (InputMismatchException e) {
    // Handle case where the input is not a valid integer
    System.out.println("Invalid input. Please enter only numbers.");
}



// Q6/ Write a Java program to reverse a word.
        try {
            // Attempting to read the input
            scanner.nextLine();  // To avoid issues with reading previous lines
            System.out.print("Input a word: ");
            String word = scanner.nextLine();

            // Check if the word contains numbers using regular expression
            if (word.matches(".*\\d.*")) {
                // If it contains numbers, an exception will be thrown
                throw new IllegalArgumentException("Input contains numbers! Please enter a word without numbers.");
            }

            // Reversing the word using StringBuilder
            String reversedWord = new StringBuilder(word).reverse().toString();

            System.out.println("Reversed word: " + reversedWord);
        } catch (IllegalArgumentException e) {
            // Handling the exception if the input contains numbers
            System.out.println("Error: " + e.getMessage());
        }




        // Q7/ Java program to check whether the given number is even or odd

        try {


            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            // Checking if the number is even or odd
            if (num % 2 == 0) {
                System.out.println("The number is Even");

            } else {  // if the number is odd
                System.out.println("The number is Odd");
            }
        }catch (InputMismatchException e) {
            // Handle case where the input is not a valid integer
            System.out.println("Invalid input. Please enter only numbers.");
        }



    //Q8/ Java program to convert the temperature in Centigrade to Fahrenheit
        try {

            System.out.print("Enter temperature in Centigrade: ");
            double celsius = scanner.nextDouble();

            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit is: " + fahrenheit);

        } catch (Exception e) {
            System.out.println("Error in temperature input: " + e.getMessage());
        }

    //Q9/ Java program to convert the temperature in Centigrade to Fahrenheit

    try {

        scanner.nextLine();
        System.out.print("Input a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Input a number: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < inputString.length()) {
            char character = inputString.charAt(index);
            System.out.println("Character at index " + index + ": " + character);
        } else {
            throw new StringIndexOutOfBoundsException("Invalid index! Please enter a number between 0 and " + (inputString.length() - 1));
        }

    } catch (StringIndexOutOfBoundsException e) {
        System.out.println("Error: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("Error in input for string index: " + e.getMessage());
    }


    //Q10/ Write a Java program to print the area and perimeter of a rectangle.

        double width = 5.6;
        double height = 8.5;

        // Calculating area and perimeter
        double Area = width * height;
        double Perimeter = 2 * (width + height);

        // printf: for Formatting Texts and Decimal Numbers
        System.out.printf("Area is %.1f * %.1f = %.2f%n", width, height, Area);
        System.out.printf("Perimeter is 2 * (%.1f + %.1f) = %.2f%n", width, height, Perimeter);

//Q11/  Write a Java program to compare two numbers.

        try {
            System.out.print("Input first integer: ");
            int num3 = scanner.nextInt();

            System.out.print("Input second integer: ");
            int num4 = scanner.nextInt();

            if (num3 == num4) {
                System.out.println(num3 + " == " + num4);
            }
            if (num3 != num4) {
                System.out.println(num3 + " != " + num4);
            }
            if (num3 > num4) {
                System.out.println(num3 + " > " + num4);
            }
            if (num3 < num4) {
                System.out.println(num3 + " < " + num4);
            }

        } catch (Exception e) {
            System.out.println("Error in comparison input: " + e.getMessage());
        }



    //Q12/ Write a Java program to convert seconds to hours, minutes and seconds.
        try {

            System.out.print("Input seconds: ");
            int totalSeconds = scanner.nextInt();

            int hours = totalSeconds / 3600;
            int minutes = (totalSeconds % 3600) / 60;
            int seconds = totalSeconds % 60;

            System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);

        } catch (Exception e) {
            System.out.println("Error in seconds input 'Only numbers': " + e.getMessage());
        }





        //Q13/ Write a Java program that accepts four integers from the user and prints equal if all
        //four are equal, and not equal otherwise.

        try {

            System.out.print("Input first number: ");
            int firstNum = scanner.nextInt();

            System.out.print("Input second number: ");
            int secondNum = scanner.nextInt();

            System.out.print("Input third number: ");
            int thirdNum = scanner.nextInt();

            System.out.print("Input fourth number: ");
            int fourthNum = scanner.nextInt();

            if (firstNum == secondNum && secondNum == thirdNum && thirdNum == fourthNum) {
                System.out.println("Numbers are equal!");
            } else {
                System.out.println("Numbers are not equal!");
            }

        } catch (Exception e) {
            System.out.println("Error in equal numbers input: " + e.getMessage());
        }


    //Q14/ Write a Java program that reads an integer
    // and check whether it is negative, zero, or positive.

        try {

            System.out.print("Input a number: ");
            int numBer = scanner.nextInt();

            if (numBer > 0) {
                System.out.println("Number is positive");
            } else if (numBer < 0) {
                System.out.println("Number is negative");
            } else {
                System.out.println("Number is zero");
            }

        } catch (Exception e) {
            System.out.println("Only numbers pleas: " + e.getMessage());
        }



        //Q 15/ .Write a program to enter the numbers till the user wants and at the end it
        //should display the count of positive, negative and zeros entered  (End loop use -1 ,
        //Don’t count -1).

        try {
            int positiveCount = 0;
            int negativeCount = 0;
            int zeroCount = 0;
            int inputValue;

            while (true) {
                System.out.print("Enter a number (-1 to stop): ");
                inputValue = scanner.nextInt();

                if (inputValue == -1) {
                    break;
                }

                if (inputValue > 0) {
                    positiveCount++;
                } else if (inputValue < 0) {
                    negativeCount++;
                } else {
                    zeroCount++;
                }
            }

            System.out.println(positiveCount + " positives");
            System.out.println(zeroCount + " zero");
            System.out.println(negativeCount + " negatives");

        } catch (Exception e) {
            System.out.println("Error in input for positive/negative/zero count: " + e.getMessage());
        }


        // Q16
        try {
            System.out.print("Enter an integer: ");
            int input_value = scanner.nextInt();

            int reversed = 0;
            while (input_value != 0) {
                int digit = input_value % 10;
                reversed = reversed * 10 + digit;
                input_value = input_value / 10;
            }
            System.out.println("Reversed number: " + reversed);

        } catch (Exception e) {
            System.out.println("Error in input for reversing number: " + e.getMessage());
        }

        //Q17/ Write a program to enter the numbers till the user wants and at the end the program
        //should display the largest and smallest numbers entered.
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int userInput;

        // Loop to enter numbers until user enters -1
        while (true) {
            try {
                System.out.print("Enter a number (-1 to stop): ");
                userInput = scanner.nextInt();

                // If user enters -1, break the loop
                if (userInput == -1) {
                    break;
                }

                // Check if the entered number is larger or smaller
                if (userInput > largest) {
                    largest = userInput;
                }
                if (userInput < smallest) {
                    smallest = userInput;
                }
            } catch (Exception e) {
                // Handle non-integer input and print an error message
                System.out.println("Error: Please enter a valid integer.");
                scanner.nextLine();  // Clear the buffer
            }
        }

        // Output the largest and smallest numbers
        if (largest != Integer.MIN_VALUE && smallest != Integer.MAX_VALUE) {
            System.out.println("The largest number entered: " + largest);
            System.out.println("The smallest number entered: " + smallest);
        } else {
            System.out.println("No valid numbers were entered.");
        }




    //Q18/ Determine and print the number of times the character ‘a’ appears in the input
    //entered by the user.

        try {

            scanner.nextLine();  // to read any remaining newline character
            System.out.print("Enter String: ");
            String input = scanner.nextLine();

            // Check if the input is empty
            if (input.isEmpty()) {
                throw new Exception("Input cannot be empty!"); // Throwing custom exception if input is empty
            }

            // Check if the input contains numbers
            if (input.matches(".*\\d.*")) {
                throw new Exception("Input cannot contain numbers!"); // Throwing custom exception if input contains numbers
            }

            // Convert the string to lowercase to count both 'a' and 'A'
            input = input.toLowerCase();

            // Count occurrences of the character 'a'
            int count1 = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'a') {
                    count1++;
                }
            }

            // Output the result
            System.out.println("Number of a's: " + count1);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());  // Catching and displaying the exception message
        }

    }
        }

