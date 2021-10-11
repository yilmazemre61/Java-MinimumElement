package com.company;

import java.util.Scanner;

// Write a method called readIntegers() with a parameter called 'count' that represents how many integers the user needs to enter
// The method needs to read from the console until all the numbers are entered, and then 'return' an array containing the numbers entered
// Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array
// In the main() method read the count from the console and call the method readIntegers() with the count parameter
// Then call the findMin() method passing the array returned from the call to the readIntegers() method
// Finally print the minimum element in the array
//
// Tips:
// Assume that the user will only enter numbers, never letters
// For simplicity, create a 'Scanner' as a static field to help with the data input
// Create a new console project with the name 'MinElementChallenge'
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count: "); // We want from the user to enter a number that the ARRAY should have as an elements
        int count = scanner.nextInt(); // Getting the Integer number from the user
        // The 'count' will be used in the method 'readIntegers(int count)
        scanner.nextLine(); // Moving the next line/code

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);

        System.out.println("The Minimum Number : " + returnedMin);

    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count]; // Creating Array
        System.out.println("Please Enter " + count + " integers: \r");
        for (int i=0; i< array.length; i++) {
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
            // Another way to do it
            //array[i] = scanner.nextInt();
            // Will be enough
        }
        return array;
    }

    private static int findMin(int[] array) { // Using the --> int[] array -- we are passing the array that we get from the user's input 

        int min = Integer.MAX_VALUE; // We are going to start by setting a local variable called 'min'
        // to the highest number that an integer can hold
        // Because if we set the 'min' value to '0' and user inputs a minus number
        //The program will select the min=0 as a minimum value
        for (int i=0; i < array.length; i++) {

            int value = array[i];
            if (value < min) { // It is true ' value < min '
                // So here we assign the 'value' to the 'min'
                // 'min' was = Integer.MAX_VALUE
                // But now ' min = value ' and the 'value' is equal to first element 'array[i]'
                // So in the next iteration we will check if the next element 'array[i+1]' is less than 'min = value'
                // If it is
                // The new 'min' value will be 'min = value' (value = array[i+1])
                min = value;
            }
        }
        return min;
    }
}