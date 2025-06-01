//needed main

import arrays.*;          
public class Main {
    public static void main(String[] args) {
        // Create an instance of the Solution class
        missingElement solution = new missingElement();
        
        // Test case 1: From the problem description
        int[] nums1 = {3, 0, 1};
        int result1 = solution.missingNumber(nums1);
        System.out.println("Test case 1:");
        System.out.println("Input: [3, 0, 1]");
        System.out.println("Missing number: " + result1);
        System.out.println("Expected: 2");
        System.out.println();
        
        // Test case 2: From the inputs class
        int[] nums2 = {0, 1, 3, 4, 5};
        int result2 = solution.missingNumber(nums2);
        System.out.println("Test case 2:");
        System.out.println("Input: [0, 1, 3, 4, 5]");
        System.out.println("Missing number: " + result2);
        System.out.println("Expected: 2");
        System.out.println();
        
        // Test case 3: Missing first number
        int[] nums3 = {1, 2, 3, 4, 5};
        int result3 = solution.missingNumber(nums3);
        System.out.println("Test case 3:");
        System.out.println("Input: [1, 2, 3, 4, 5]");
        System.out.println("Missing number: " + result3);
        System.out.println("Expected: 0");
        System.out.println();
        
        // Test case 4: Missing last number
        int[] nums4 = {0, 1, 2, 3, 4};
        int result4 = solution.missingNumber(nums4);
        System.out.println("Test case 4:");
        System.out.println("Input: [0, 1, 2, 3, 4]");
        System.out.println("Missing number: " + result4);
        System.out.println("Expected: 5");
    }
}
