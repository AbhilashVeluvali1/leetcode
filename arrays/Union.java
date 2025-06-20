package arrays;

import java.util.HashSet;
import java.util.Set;

public class Union {
    public int[] union(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        for(int i=0; i<arr1.length; i++) {
            set1.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++) {
            if(!set1.contains(arr2[i])) {
                set1.add(arr2[i]);
            }
        }
        int i=0;
        int[] result = new int[set1.size()];
        for(int val : set1){
            result[i++] = val;
        }
        return result;
    }
    public static void main(String[] args) {
        Union union = new Union();
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        int[] result = union.union(arr1, arr2);
        for(int i=0; i<result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
