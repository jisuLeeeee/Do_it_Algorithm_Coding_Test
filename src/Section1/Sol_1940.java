package Section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Sol_1940 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ingredient_num = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] ingredient = new int[ingredient_num];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<ingredient_num; i++){
            ingredient[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(ingredient);

        int cnt = 0;
        int start = 0;
        int end = ingredient_num - 1;

        while(start < end){
            if(ingredient[start] + ingredient[end] < m){
                start++;
            }
            else if(ingredient[start] + ingredient[end] == m){
                cnt++;
                start++;
                end--;
            }
            else{
                end--;
            }
        }
        System.out.println(cnt);
    }
}
