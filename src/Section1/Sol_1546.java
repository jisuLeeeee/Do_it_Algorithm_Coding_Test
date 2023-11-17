package Section1;

import java.util.Scanner;

public class Sol_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] grade = new int[n];

        int max = 0, sum = 0;
        double avg = 0;

        for(int i=0; i<grade.length; i++){
            grade[i] = sc.nextInt();
            max = Math.max(max, grade[i]);
            sum += grade[i];
        }


        avg = sum * 100.0 / max / n;
        System.out.println(avg);
    }
}
