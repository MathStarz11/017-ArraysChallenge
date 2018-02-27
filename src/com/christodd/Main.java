package com.christodd;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myArray = getIntegers(7);
        int[] sortedArray = sortIntegers(myArray);
        printArray(sortedArray);
    }

    //getIntegers function
    public static int[] getIntegers(int x) {

        int[] myIntegers = new int[x];
        for (int i = 0; i < x; i++) {
            myIntegers[i] = scanner.nextInt();
        }
        return myIntegers;
    }

    //printArray function
    public static void printArray(int[] myArray) {
        for(int i : myArray) {
            System.out.println(i);
        }
    }

    //sortIntegers function
    public static int[] sortIntegers(int[] myArray) {
        int[] thisArray = new int[myArray.length];
        Arrays.sort(myArray);
        int x = 0;
        for(int i = myArray.length-1; i > 0; i--) {
            thisArray[x] = myArray[i];
            x++;
        }
        return thisArray;
    }
}
