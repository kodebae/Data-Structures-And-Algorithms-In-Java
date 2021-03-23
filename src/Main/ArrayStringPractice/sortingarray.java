package ArrayStringPractice;
import java.util.Scanner;

// This program sorts arrays and collects user input via the Scanner method. Arrays can also be sorted with the array.sort method.
// {25, 49, 120, 33, 36, 14, 57, 77, 65, 1229, 42}; // Here are 11 numbers to try passing in. If you pass in these
// numbers you should get {1129, 120, 77, 65, 57, 49, 42, 36, 33, 25, 14} returned in that order.

// creating a program to sort arrays in decending oprder.
public class Main { // Main class
    private stactic Scanner scanner = new Scanner(System.in); // Scanner method/library must be imported "System.in" allows user input

    public static void main(String[] args) { // The main Method needed to run the Java program
        int [] myIntegers = getIntegers(11); // creates int array variable to store Integers and set capacity to 11
        int sorted = sortIntegers(myIntegers);
        printArray(sorted);
    } // How to get integers
    public static int [] getIntegers(int capacity);

    { // creates getIntegers method return the getIntegers array
        int[] array = new int[capacity]; // defining the array and capacity
        System.out.println("Enter" + capacity + "Integer Values: \r"); // print to screen and ask for user data input
        for (int i = 0; i < array.length; i++) { // creates a for loop to loop over each number in the array of integers
            array[i] = scanner.nextInt(); // the input from our user
        }
        return array; // returns our array of numbers/int
    } // How to print the Array
    public static void printArray(int[] array)  { // creates method to print an array
        for (int i =0; i< array.length; i++) { // for loop to loop over each number
        System.out.println("Element" + i + "contents" + array[i]); // print our array content
        }
    } // How to sort the array
    public static int[] sortIntegers(int[] array) {
    int sortedArray = new int[array.length]; // creates an array that is the same size as the array being passed in
        for(int i=0; i < array.length; i++) { // grab each element out of array[i]
            sortedArray[i] = array[i]; //
        }
        boolean flag = true; //setting a flag for our while loop to continue until the flag returns false
        int temp; // a temporary variable
        while(flag) { // the while loop only continues until or while is set to true
           flag = flase; // sets flag to false once code is fininsed executing
            for(int i=0; i < sortedArray.length-1; i++) { // loop over the entire length of the array
                if (sortedArray[i] < sortedArray[i+1]){ // if array[i] is less than the next array[i] then swap [i]
                    temp = sortedArray[i]; // store the array value temporarialy
                    sortedArray[i] = sortedArray[i+1]; // takes entries and swaps them if needed
                    sortedArray[i+1] = temp; // takes entries and swaps them if needed
                    flag = true; // setting flag back to true only exits the loop after all numbers are sorted
                } // once our elements are listed from biggest to smallest the loop will stop running
            }
        }
        return sortedArray; // returns the final sorted array
    }
} // closes Main class