import java.util.Arrays;

import arrays.*;
import arrays.missingArrayElements;

interface TestCase {
    void runTests();
}

class MissingElementTest implements TestCase {
    public void runTests() {
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

class MissingArrayElementsTest implements TestCase {
    public void runTests() {
        missingArrayElements solution = new missingArrayElements();

        // Test case 1
        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("Test case 1:");
        System.out.println("Input: [4, 3, 2, 7, 8, 2, 3, 1]");
        System.out.println("Missing numbers: " + solution.findDisappearedNumbers(nums1));
        System.out.println("Expected: [5, 6]");
        System.out.println();

        // Test case 2
        int[] nums2 = {1, 1};
        System.out.println("Test case 2:");
        System.out.println("Input: [1, 1]");
        System.out.println("Missing numbers: " + solution.findDisappearedNumbers(nums2));
        System.out.println("Expected: [2]");
        System.out.println();
    }
}

class numberSmallerThanCurrentTest implements TestCase {
    public void runTests() {
        numberSmallerThanCurrent solution = new numberSmallerThanCurrent();

        // Test case 1
        int[] nums1 = {8, 1, 2, 2, 3};
        int[] result1 = solution.SmallerThanCurrent(nums1);
        System.out.println("Test case 1:");
        System.out.println("Input: [8, 1, 2, 2, 3]");
        System.out.println("Output: " + Arrays.toString(result1));
        System.out.println("Expected: [4, 0, 1, 1, 3]");
        System.out.println();

        // Test case 2
        int[] nums2 = {6, 5, 4, 8};
        int[] result2 = solution.SmallerThanCurrent(nums2);
        System.out.println("Test case 2:");
        System.out.println("Input: [6, 5, 4, 8]");
        System.out.println("Output: " + Arrays.toString(result2));
        System.out.println("Expected: [2, 1, 0, 3]");
        System.out.println();

        // Test case 3
        int[] nums3 = {7, 7, 7, 7};
        int[] result3 = solution.SmallerThanCurrent(nums3);
        System.out.println("Test case 3:");
        System.out.println("Input: [7, 7, 7, 7]");
        System.out.println("Output: " + Arrays.toString(result3));
        System.out.println("Expected: [0, 0, 0, 0]");
        System.out.println();
    }
}

class TestRunner {
    public static void runTest(String testName) {
        TestCase test = null;
        
        // Register test classes here
        switch (testName.toLowerCase()) {
            case "missingelement":
                test = new MissingElementTest();
                break;
            case "missingarrayelements":
                test = new MissingArrayElementsTest();
                break;
            case "numbersmallerthancurrent":
                test = new numberSmallerThanCurrentTest();
                break;
            default:
                System.out.println("Test class '" + testName + "' not found!");
                System.out.println("Available tests: missingelement, missingarrayelements, numbersmallerthancurrent");
                return;
        }
        
        System.out.println("Running tests for: " + testName);
        System.out.println("=========================");
        test.runTests();
    }
}

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            // Default to running all tests
            System.out.println("Running all available tests...\n");
            TestRunner.runTest("missingelement");
            TestRunner.runTest("missingarrayelements");
            TestRunner.runTest("numbersmallerthancurrent");
        } else {
            // Run specific test based on argument
            TestRunner.runTest(args[0]);
        }
    }
}
