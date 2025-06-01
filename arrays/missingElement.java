package arrays;

public class missingElement {
        public int missingNumber(int[] A) {
        int len = A.length;
        int actualSum = (len * (len+1)) / 2;
        int sum = 0;
        
        for (int num :A) {
            sum += num;
        }
        int diff = actualSum - sum;
        return diff;
    }
}
