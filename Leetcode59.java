import java.util.Scanner;

public class Leetcode59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n:");
        int n = sc.nextInt();

        int [][] arr = generateMatrix(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print( arr[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static int[][] generateMatrix(int n){

        int [][] arr = new int[n][n];
        int minr = 0;
        int maxr = (n-1);
        int minc = 0;
        int maxc = (n-1);
        int num = 1;

        while (minr<=maxr && minc<=maxc) {
            for (int j = minc; j <= maxc ; j++) {
                arr[minr][j] = num++ ;
            }
            minr++ ;

            for (int i = minr; i <= maxr; i++) {
                arr[i][maxc] = num++ ;
            }
            maxc--;

            if(minr<=maxr){
                for (int j = maxc; j >= minc; j--) {
                    arr[maxr][j] = num++;
                }
            }
            maxr--;

            if(minc<=maxc){
                for (int i = maxr; i >= minr ; i--) {
                    arr[i][minc] = num++;
                }
            }
            minc++;
        }
        return arr ;
    }
}
