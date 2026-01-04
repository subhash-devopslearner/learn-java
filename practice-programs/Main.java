/* 1. Sum of Array Elements
Create an integer array with at least 5 numbers.
Write a program that calculates and prints the sum of all elements in the array.
*/

// class Main {
//     public static void main(String[] args) {
//         int myNums[]={1,2,3,4,5};
//         int sum=0;
//         for (int num : myNums) {
//             sum += num;
//         }
//         System.out.println("Sum is " + sum);
//     }
// }

/*
2. Find the Largest Number
Given an integer array, write a program to find and print the largest value in the array.
*/

// class Main {
//     public static void main(String[] args) {
//         int[] myNums = {4,7,2,8,3};
//         int largestNum = -1;

//         for (int i = 0; i < myNums.length; i++) {
//             if( largestNum < myNums[i]) {
//                 largestNum = myNums[i];
//             }
//         }

//         System.out.println("Largest Number is: " + largestNum);
//     }
// }

/*
3. Count Even Numbers
Create an array of integers.
Count how many numbers in the array are even, and print the count.
*/

// public class Main {
//     public static void main(String[] args) {
//         int[] myNums = {27,44,56,33,67,22};

//         for (int i = 0; i < myNums.length; i++) {
//             if (myNums[i]%2 == 0)
//                 System.out.println("Even No: " + myNums[i]);
//         }
//     }
// }

/*
5. Average of Numbers
Create an array of integers.
Calculate and print the average of the numbers in the array.
*/

// public  class Main {
//     public static void main(String[] args) {
//         int myNums[] = {24,87,23,76,80,11};
//         int totalNums = myNums.length;
//         int sum = 0;

//         for (int i=0; i<totalNums; i++) {
//             sum +=myNums[i];
//         }
//         System.out.println("Average is: " + sum/totalNums);
//     }   
// }

/*
6. Search for a Number
Create an array and a number to search for.
Check whether the number exists in the array and print
"Found" if it exists
"Not Found" if it does not
*/

public class Main {
    public static void main(String[] args) {
        int[] myNums = {26,45,32,89,76};
        int numberToFind = 33;
        boolean numberFound = false;

        for (int i=0; i < myNums.length; i++) {
            if (myNums[i] == numberToFind) {
                numberFound = true;
                break;
            }
            else
                numberFound = false;
        }

        System.out.println(((numberFound) ? "Found" : "Not Found"));
    }
}