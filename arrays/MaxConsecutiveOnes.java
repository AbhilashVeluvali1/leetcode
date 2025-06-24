package arrays;

public class MaxConsecutiveOnes {
    public int maxConsecutiveOnes(int[] nums) {
        int cCnt =0, cnt =0;
        for(int num:nums) {
            if(num==1){
                cCnt+=1;
                cnt = Math.max(cnt, cCnt);
            }
            else
                cCnt = 0;
        }
        return cnt;
    }
    public static void main(String[] args) {
        MaxConsecutiveOnes obj = new MaxConsecutiveOnes();
        System.out.println(obj.maxConsecutiveOnes(new int[]{1,0,1,1,0,1,1,1,1}));
    }
}
