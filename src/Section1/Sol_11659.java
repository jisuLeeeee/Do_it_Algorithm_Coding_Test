package Section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        // StringTokenizer에 token으로 문자열을 나눠 저장
        // 문자열로 저장되는 bufferdReader를 정수형으로 저장하기 위해 형변환
        int numNo = Integer.parseInt(stringTokenizer.nextToken());
        int resultNo = Integer.parseInt(stringTokenizer.nextToken());
        long[] result = new long[numNo+1];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i=1; i<result.length; i++){
            result[i] = result[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        for(int i=0; i<resultNo; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int start = Integer.parseInt(stringTokenizer.nextToken());
            int end = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(result[end] - result[start-1]);
        }
    }
}
