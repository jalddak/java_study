package input_output;

import java.util.Scanner;

public class ScannerStudy {
    public static void main(String[] args) {
        /**
         * next나 nextInt 뒤에 nextLine을 사용할 시 주의점
         * next, nextInt 같은 것들은 개행문자를 포함안시키기 때문에 이를 유의해서 입력해야한다.
         * next 다음에 바로 nextLine으로 코딩하면, next 이후의 공백부터 개행문자까지 nextLine이 읽어서
         * 예를 들어 java 치고 엔터치면 nextLine은 개행문자만 읽게되는 것이다.
         */
        Scanner input = new Scanner(System.in);
        String next = input.next();
        String nextLine = input.nextLine();
        System.out.println("next =" + next);
        System.out.println("nextLine =" + nextLine);
        for (int i = 0; i < 10; i++) {
            next = input.next();
            System.out.println(i + ": next = " + next);
        }
    }

}
