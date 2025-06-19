package arrays;


public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,5,6,7,2,8,9};
        System.out.println(findElement(2,arr));
    }
    public static int findElement(int x, int[] arr) {
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}
