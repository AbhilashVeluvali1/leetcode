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

    public int oneRun2Largest(int[] nums) {
        if (nums == null || nums.length < 2) return -1;
        int largest = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>largest){
                sLargest = largest;
                largest = nums[i];
            } else if(nums[i]<largest && nums[i]>sLargest){
                sLargest = nums[i];
            }
        }
        return sLargest == largest ? -1 : sLargest;
    }
    public static void main(String[] args) {
        secondLargest obj = new secondLargest();
        System.out.println(obj.secondLargestElement(new int[]{1,2,3,4,5}));
        System.out.println(obj.oneRun2Largest(new int[]{1,2,3,4,5}));
    }
}
