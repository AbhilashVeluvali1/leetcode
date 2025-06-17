package arrays;

public class secondLargest {
    public int secondLargestElement(int[] nums) {
        if (nums == null || nums.length < 2) return -1;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) max = num;
        }
        int sMax = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > sMax && num < max) {
                sMax = num;
            }
        }
        return sMax == Integer.MIN_VALUE ? -1 : sMax;
    }
    public static void main(String[] args) {
        secondLargest obj = new secondLargest();
        System.out.println(obj.secondLargestElement(new int[]{1,2,3,4,5}));
    }
}
