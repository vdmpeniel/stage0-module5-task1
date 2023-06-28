package com.epam.mjc.stage0;




/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        return new String[]{"winter", "spring", "summer", "autumn"};
    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] numbers = new int[length];
        for (int i = 1; i <= length; i++){
            numbers[i - 1] = i;
        }
        return numbers;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == number) return i;
        }
        return -1;
    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] reverse = new String[arr.length];
        for (int i = 0; i < arr.length; i++){
            reverse[i] = arr[arr.length - i - 1];
        }
        return reverse;
    }



    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int[] newArray = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0) {
                newArray[index++] = arr[i];
            }
        }
        int[] result = new int[index];
        System.arraycopy(newArray, 0, result,0, index);
        return result;
    }


    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        //System.out.println("...................");
        for (int i = 0; i < arr.length; i++){
            selectionSort(arr[i]);
        }
        bubbleSort(arr);
        //printArray(arr);
        return arr;
    }

    public void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    int c = arr[i];
                    arr[i] = arr[j];
                    arr[j] = c;
                }
            }
        }
    }
    public void bubbleSort(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - 1; j++){
                if (arr[j].length > arr[j+1].length){
                    int[] c = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = c;
                }
            }
        }
    }


    public static void main(String[] args) {
        ArrayTasks at = new ArrayTasks();

        int[][] arr = {
                {2,5,8},
                {56,34,5,2,5,0},
                {45,3,6,1,7}
        };
        at.printArray(at.sortRaggedArray(arr));
    }


    public void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + ",");
            }
            System.out.println();
        }
    }
}
