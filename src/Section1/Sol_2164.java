package Section1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Sol_2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int n = sc.nextInt();

        for(int i=1; i<n+1; i++){
            queue.add(i);
        }

        while(queue.size() > 1){
            queue.poll();
            // queue.add(queue.poll()); 아래 두 문장과 동일
            queue.add(queue.peek());
            queue.poll();
        }
        System.out.println(queue.peek());
    }
}
