package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> firstSet = new HashSet<>();
        for(int val : nums1){
            firstSet.add(val);
        }
        Set<Integer> uniqueSet = new HashSet<>();
        for(int val: nums2){
            if(firstSet.contains(val))
                uniqueSet.add(val);
        }
        int[] result = new int[uniqueSet.size()];
        int i = 0;
        for(int val : uniqueSet){
            result[i++] = val;
        }
        return result;
    }
    public static void main(String[] args) {
        Intersection intersection = new Intersection();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] result = intersection.intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}
