import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //1. Write a Java program that accept three numbers from the user and print the largest number .
        System.out.println("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = input.nextInt();
        System.out.println("Enter the third number: ");
        int number3 = input.nextInt();

        int max = 0;
        if (number1 > number2 && number1 > number3) {
            max = number1;
        } else if (number2 > number1 && number2 > number3) {
            max = number2;
        } else max = number3;

        System.out.println("The largest number is: " + max);


        //2. Write a Java program that accept a String and a number from the user,
        // then print the character in the given index .
        System.out.println("--------------------\n");

        System.out.println("Please enter a string: ");
        String str = input.next();
        System.out.println("Please enter index: ");
        int index = input.nextInt();

        char ch = ' ';
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(index);
        }

        System.out.println("The charcter at index " + index + " is: " + ch);


        //3. Write a program to enter the numbers till the user wants
        // and at the end it should display the sum entered .
        System.out.println("--------------------\n");

        int num;
        int sum = 0;
        do {
            System.out.println("Enter a number or 0 to quit");
            num = input.nextInt();
            sum += num;

        } while (num != 0);

        System.out.println("The sum of the input numbers = " + sum);

//       4. Write a Java program to find positive and negative numbers of a given array:
//
//        -  Original Array:
//      [10, -21 , 30, 31, -25]
//        -  Expected Output:
//        10  is a positive number
//        -21 is a negative number
//        30 is a positive number
//        31 is a positive number
//        -25 is a negative number
        System.out.println("--------------------\n");

        int [] arr = {10, -21 , 30, 31, -25};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.println(arr[i] + " is zero");
            } else if (arr[i] > 0) {
                System.out.println(arr[i] + " is a positive number");
            } else System.out.println(arr[i] + " is a negative number");
        }


//        Write a Java program to find a shortest word of a given array:
//        - Original Array:
//          [“Tuwaiq”, “Bootcamp” , “Student”,”JAVA”]
//        - Expected Output:
//          JAVA
        System.out.println("--------------------\n");

        String [] words = {"Tuwaiq", "Bootcamp", "Student", "JAVA",};

        String shortest = "";
        int length = words[0].length();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() <= length) {
                shortest = words[i];
                length = words[i].length();
            }
        }
        System.out.println("The shortest word: " + shortest);

    }
}