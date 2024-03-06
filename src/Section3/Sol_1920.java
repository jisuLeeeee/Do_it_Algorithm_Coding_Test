package Section3;

import java.util.Arrays;
import java.util.Scanner;

public class Sol_1920 {
    static int target;
    static int[] A;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        A = new int[N];
        for(int i=0; i<A.length; i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);

        int M = sc.nextInt();
        for(int i=0; i<M; i++) {
            target = sc.nextInt();
            int start = 0;
            int end = A.length - 1;
            // 이진 탐색 메소드
            int ans = binary_search(A, start, end, target);
            System.out.println(ans);
        }
    }
    private static int binary_search(int[] a, int start, int end, int t) {
        while(start <= end) {
            int mid_idx = (start + end) / 2;
            if(a[mid_idx] > t){
                end = mid_idx - 1;
            }
            else if(a[mid_idx] < t){
                start = mid_idx + 1;
            }
            else {
                return 1;
            }
        }
        return 0;
    }
}
