package arrays;

public class findMissing {
        public int missingNumber(int[] nums) {
            int n = nums.length;
            int expectedSum = n*(n+1)/2;
            int sum =0;
            for(int num:nums)
                sum+=num;
            return expectedSum - sum;
        }
        public static void main(String[] args) {
            findMissing m = new findMissing();
            System.out.println(m.missingNumber(new int[]{0,1,2,3,4}));
        }
}
