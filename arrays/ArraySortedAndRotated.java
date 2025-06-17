package arrays;

public class ArraySortedAndRotated {
    public boolean check(int[] nums) {
        int cnt =1;
        int l = nums.length;
        for(int i=1;i<2*nums.length;i++){
            if(nums[(i-1)%l]<=nums[i%l])
                cnt+=1;
            else
                cnt =1;
            if(cnt==l)
                return true;
        }
        return l ==1;
    }
    public static void main(String[] args) {
        ArraySortedAndRotated arraySortedAndRotated = new ArraySortedAndRotated();
        System.out.println(arraySortedAndRotated.check(new int[]{1,2,3,4,5}));
        System.out.println(arraySortedAndRotated.check(new int[]{1,1,1,1,1}));
        System.out.println(arraySortedAndRotated.check(new int[]{2,1,3,4}));
    }
}

