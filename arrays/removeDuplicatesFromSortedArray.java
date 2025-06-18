package arrays;

public class removeDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i=0,j=1;
        while(j<nums.length){
            if(nums[i]!=nums[j])
                nums[++i]=nums[j];
            j++;
        }
        return i+1;
    }

    public static void main(String[] args) {
        removeDuplicatesFromSortedArray obj = new removeDuplicatesFromSortedArray();
        System.out.println(obj.removeDuplicates(new int[]{1,1,2,2,3,3,4}));
    }
}
