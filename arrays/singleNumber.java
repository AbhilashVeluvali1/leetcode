package arrays;

public class singleNumber {
    public int singleNumber(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            index=index^nums[i];
        }
        return index;
    }
    public static void main(String[] args) {
        singleNumber test = new singleNumber();
        System.out.println(test.singleNumber(new int[]{1,1,2}));
    }
}
