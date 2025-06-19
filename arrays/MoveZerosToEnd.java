package arrays;

public class MoveZerosToEnd {
    public void moveZeros(int [] nums) {
        int zeroIndex =-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) {
                zeroIndex=i;
                break;
            }
        }
        if(zeroIndex==-1){
            return;
        }
        for(int i=zeroIndex+1;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i]=nums[zeroIndex];
                nums[zeroIndex]= temp;
                zeroIndex+=1;
            }
        }
        System.out.println(nums);
    }
    public static void main(String [] args) {
        MoveZerosToEnd m = new MoveZerosToEnd();
    }
}
