package Section2;

import java.util.Scanner;

public class Sol_1427 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr_str = String.valueOf(N).split("");
        int[] arr_int = new int[arr_str.length];

        for(int i=0; i<arr_int.length; i++){
            arr_int[i] = Integer.parseInt(arr_str[i]);
        }

        for(int i=0; i<arr_int.length; i++){
            int max = arr_int[i];
            int max_idx = i;
            int first = arr_int[i];
            for(int j=i; j<arr_int.length-1; j++){
                if(max < arr_int[j+1]){
                    max = arr_int[j+1];
                    max_idx = j+1;
                }
            }
            arr_int[i] = max;
            arr_int[max_idx] = first;
        }

        for(int i : arr_int){
            System.out.print(i);
        }
    }
}
