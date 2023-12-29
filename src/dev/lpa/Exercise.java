package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {

        printArray(sortIntegers(getIntegers(5)));

    }

    public static int[] getIntegers(int arraySize){

        int[] myArray;
        myArray = new int[arraySize];

        int numberEntered;

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < arraySize; i++){
            numberEntered = Integer.parseInt(scanner.nextLine());
            myArray[i] = numberEntered;
        }

        return myArray;

    }

    public static void printArray(int[] array){
//        System.out.println("Element 0 contents " + array[0]);
//        System.out.println(Arrays.toString(array));

        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }

    }

    public static int[] sortIntegers(int[] unsortedArray){

            //Length of the array
            int n = unsortedArray.length;

            Arrays.sort(unsortedArray);

            //Swapping the first half elements with last half elements
            for (int i = 0; i < n /2; i++){
                //Storing the first half elements temporarily
                int temp = unsortedArray[i];

                //Assigning the first half to the last half
                unsortedArray[i] = unsortedArray[n - i - 1];

                //Assigning the last half to the first half

                unsortedArray[n - i - 1] = temp;

            }
            return unsortedArray;
    }

}
