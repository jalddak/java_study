package input_output;

public class PrintStudy {
    public static void main(String[] args) {
        /**
         * printf 는 println 과 같은 출력문에서는 하지 못한, 변수의 값을 여러가지 형식으로 바꿀 수 있는 기능이 있다.
         * %n이나 \n 은 줄바꿈
         * %를 %로 사용하고 싶으면 %% 사용
         * "를 "로 사용하고 싶으면 \" 사용
         */
        System.out.println("\n< printf 예제 1 >");
        System.out.printf("%%b: boolean: -1, 0, null -> %b, %b, %b%n", -1, 0, null); // -1, 0, null -> true, true, false
        System.out.printf("%%d: 10진수: %d, %d, %d, %d%n", 2, 8, 10, 16);  // 10진수: 2, 8, 10, 16
        System.out.printf("%%o: 8진수: %o, %o, %o, %o%n", 2, 8, 10, 16);   // 8진수: 2, 10, 12, 20
        System.out.printf("%%x: 16진수: %x, %x, %x, %x%n", 2, 8, 10, 16);  // 16진수: 2, 8, a, 10
        System.out.printf("%%f: 소수점: %f, %f%n", 10.1234, 0.0012317); // %f를 기본적으로 소수점 6자리까지만 알려주고 그 후는 반올림함.
        System.out.printf("%%e: 지수형 표시: %e, %e%n", 10.1234, 0.0012317); // 지수 표현식
        System.out.printf("%%c: 캐릭터 표시: %c, %c%n", 'A', 'B');
        System.out.printf("%%s: 문자열 표시: %s, %s, %s%n", "java", "spring", "study");

        /**
         * 지시자 사이에 숫자를 넣으면 그만큼 공백이 생김. (실제 값보다 작은 범위면 그냥 실제 숫자만 나오고 공백같은거 없음. 글자 삭제 안됨.)
         * - 붙이면 뒤로 공백생김
         * 0 붙이면 0으로 공백생김
         *
         * %o, %x는 사이에 #붙이면 8진수는 0, 16진수는 0x 나타남
         *
         * 실수형 에서는 %14.10f 이런 식으로 작성하면, 14자리 까지 보여주고, 소수점을 10자리 보여준다.
         * 잘라주는 곳 바로 아래자리에서 반올림하여 계산한다.
         */
        System.out.println("\n< printf 예제 2 >");
        System.out.printf("%%d: 10진수: [%5d], [%-5d], [%05d], [%1d]%n", 2, 2, 2, 100000);  // 범위 더 작으면 그냥 꽉 채워 나옴
        System.out.printf("%%o: 8진수: %#o%n", 16);
        System.out.printf("%%x: 16진수: %#x, [%#5x], [%#-10x], [%#010x]%n", 2, 8, 10, 16);
        System.out.printf("%%f: 소수점: [%14.10f], [%-14.10f], [%014.15f]%n", 10.1234, 10.1234, 10.1234);
        System.out.printf("%%f: 소수점: [%.3f], [%.3f]%n", 99.99949, 99.99999);
    }
}
