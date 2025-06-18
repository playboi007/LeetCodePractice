package arrays;

import java.util.*;

/*Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
 That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.
Example 1:
Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3] */
public class numberSmallerThanCurrent{
public int[] SmallerThanCurrent (int[] nums){
    //1st for me i had to clone the nums array and sort it
    int[] sorted = nums.clone();
    Arrays.sort(sorted);

    //then created a new hashmap to hold the values and indexes of array
    Map<Integer, Integer> holder = new HashMap<>(); 
    for(int i = 0; i < sorted.length; i++){
        holder.putIfAbsent(sorted[i], i);
    }


    int[] finalArray = new int[nums.length];
    //loop through and add map index to array
    for (int i = 0; i< sorted.length; i++){
        finalArray[i]= holder.get(nums[i]);
    }
    return finalArray;
    }
}
