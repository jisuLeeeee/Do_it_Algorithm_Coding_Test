package Section1;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Stack;

public class Sol_1874{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] num_arr = new int[n];
        ArrayList<String> arrayList = new ArrayList<>();

        // 수열 값 입려
        for(int i=0; i<num_arr.length; i++){
            num_arr[i] = Integer.parseInt(bf.readLine());
        }
        Stack<Integer> stack = new Stack();

        // 오름차순을 비교할 수
        int num = 1;
        for(int i=0; i<num_arr.length; i++){
            if(num_arr[i] >= num){
                // 수열 값과 같아질때 까지 스택에 저장
                while(num_arr[i] >= num){
                    stack.push(num);
                    arrayList.add("+");
                    num++;
                }
                // 같다면 스택에서 제외
                stack.pop();
                arrayList.add("-");
            }
            else if(num_arr[i] <= num){
                if(stack.peek().equals(num_arr[i])){
                    stack.pop();
                    arrayList.add("-");
                }
                else{ // 스택의 값이 더 클 경우 오름차순이 될 수 없음
                    System.out.println("NO");
                    return;
                }
            }
        }
        for(String res : arrayList){
            System.out.println(res);
        }
    }
}
