# Do it! 알고리즘 코딩테스트 with JAVA

---

## Section0 - 시간 복잡도

### 🔓수 정렬하기

- Arrays.sort() 사용하여 풀이
- 주석 처리 부분으로 풀이해도 해결됨

```java
package Section0.section0_1;

import java.util.Scanner;
import java.util.Arrays;

public class Sol_2750 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length ;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

/*
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
 */

        for(int i : arr){
            System.out.println(i);
        }

    }
}
```

## Section1 - 배열과 리스트

### 🔓숫자의 합 구하기

- long형 범위 자릿수는 19개인데  n의 자릿수가 100개이므로 정수형 풀이 방식은 옳지 않음
- InputMismatchException이 발생한 코드

```java
package Section1;

import java.util.Scanner;
public class Sol_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long number = sc.nextLong();

        int sum = 0;
        while(number != 0){
            sum += (number % 10);
            number /= 10;
        }

        System.out.println(sum);
    }
}
```

- long → String형으로 숫자 입력 받고 charAt() 이용해서 합계 누적

```java
package Section1;

import java.util.Scanner;
public class Sol_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String number = sc.next();

        int sum = 0;

        for(int i=0; i<n; i++){
            sum += number.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
```

<aside>
💡 문자열을 숫자형으로 변경하기 위해 charAt() 사용할 때 문자와 숫자의 코드 값 차이가 48이기 때문에 **문자 그대로 사용하기 위해선 -’0’ 또는 -48**을 해주어야함. 본인은 계속 아스키코드 값으로 합계가 돼서 에러 발생함 ㅠ

</aside>