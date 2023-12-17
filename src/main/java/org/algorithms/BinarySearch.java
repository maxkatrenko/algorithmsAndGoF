package org.algorithms;

public class BinarySearch {

    //O(log2N)

    public static void main(String[] args) {
        System.out.println(binarySearch(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 6));
        System.out.println(binarySearch(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10));
    }

    private static String binarySearch(Integer[] array, int item) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = array[mid];
            if (guess == item) {
                return "An item: " + item + " has index: " + mid;
            }
            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return "Item was not found!";
    }

}