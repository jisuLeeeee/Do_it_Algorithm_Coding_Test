package Section1;

import java.util.Scanner;

public class Sol_2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int start_idx = 1;
        int end_idx = 1;
        int sum = 1;
        int cnt = 1;

        while(end_idx != n){
            if(sum == n){
                cnt++;
                end_idx++;
                sum += end_idx;
            }
            else if(sum > n){
                sum -= start_idx;
                start_idx++;
            }
            else{
                end_idx++;
                sum += end_idx;
            }
        }
        System.out.println(cnt);


/*        int cnt = 1;
        for(int i=1; i<=n/2; i++){
            int sum = i;
            for(int j=i+1; j<=(n/2)+1; j++){
                sum += j;
                if(sum > n)
                    break;
                else if(sum == n){
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
 */
    }
}
