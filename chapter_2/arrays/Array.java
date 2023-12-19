package chapter_2.arrays;

import java.util.Arrays;

/**
 * Array
 */
public class Array {

  public static void main(String[] args) {
    // Declare an int array with a length of 7
    int[] nums = new int[7]; // ! Here we will see 7 integers set as 0.

    System.out.println("numbers after reassigning array " + Arrays.toString(nums));

    // Give to each member of the array, an int value
    nums[0] = 0;
    nums[1] = 1;
    nums[2] = 2;
    nums[3] = 3;
    nums[4] = 4;
    nums[5] = 5;
    nums[6] = 6;

    System.out.println("numbers after values " + Arrays.toString(nums));
  }
}