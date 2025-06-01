/*
 Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:
Input: nums = [1,1]
Output: [2]

 */
package arrays;

import java.util.*;

public class missingArrayElements {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        Set<Integer> missing = new HashSet<>();
        for (int num: nums){
                missing.add(num);
            
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1;i <= len; i++){
            if (!missing.contains(i)){
                result.add(i);
            }
        }
        return result;

    }
}
//accepted runtime :0ms