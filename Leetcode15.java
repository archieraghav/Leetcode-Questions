import java.util.HashSet;

public class Leetcode15{

    //brute force approach
    // public static void threeSum(int [] arr, int x){
    //     int n = arr.length;
    //     int count = 0;
    //     for(int i = 0; i<n-2 ; i++){
    //         for(int j = i+1; j<n-1; j++){
    //             for(int k = j+1; k<n; k++){
    //                 if(arr[i] + arr[j] + arr[k] == x){
    //                     System.out.println(arr[i] + "," + arr[j] + "," + arr[k] );
    //                     count ++ ;
    //                 }
    //             }
    //         }
    //     }
    //     System.out.println("Total Triplets = " + count);
    // }

    //optimal approach
    public static void threeSum(int [] arr, int x){
        int n = arr.length;
        int count = 0;

        for(int i = 0; i< n-2 ; i++){
            HashSet<Integer> set = new HashSet<>();

            int target = x - arr[i];

            for(int j = i+1; j < n; j++){
                int needed = target - arr[j];

                if(set.contains(needed)){
                    count ++;
                    System.out.println("The triplets are : " + arr[i] + " " + arr[j] + " " + needed);
                }
                set.add(arr[j]);
            }
        }
        System.out.println(count );
    }
    public static void main(String[] args) {
        int [] arr = {3, 4, 1, 5, -1};
        int x = 5;
        threeSum(arr, x);
    }
}
