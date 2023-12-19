package operator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OperatorStudy {
    /**
     * 연산자 우선순위: 자바의 정석 3판 91페이지
     */

    @Test
    @DisplayName("증감 연산자")
    void 증감_연산자() {
        System.out.println("\n< 증감 연산자 후위형, 전위형 체크 >");
        int i = 5, j = 0;
        j = i++;
        System.out.println("j = i++ (후위형): i = " + i + ", j = " + j);

        i = 5;
        j = 0;
        j = ++i;
        System.out.println("j = ++i (전위형): i = " + i + ", j = " + j);

        char c = 'a';
        System.out.println("c = " + c + ", ++c = " + ++c);
    }

    @Test
    @DisplayName("산술 연산자")
    void 산술_연산자() {
        /**
         * byte, char 는 산술연산자 사용못함. 따라서 산술연산자는 모두 기본형인 int형으로 사용된 것이라서 따로 형변환해줘야함
         */
        System.out.println("\n< byte, char 산술연산자 >");
        byte a = 10, b = 20;
        byte c = (byte) (a + b);
        System.out.println("c = " + c);

        char A = 'A', B = 'B';
        char APlusB = (char) (A + B);
        System.out.println("APlusB = " + APlusB + ", (int) APlustB = " + (int) APlusB);

        /**
         * 이미 계산을 마친 결과는 자동 형변환 되지 않는다.
         */
        System.out.println("\n< 형변환 순서 파악 >");
        int i1 = 1_000_000;
        int i2 = 2_000_000;
        long l1 = i1 * i2;  // 이미 i1 * i2 가 int형으로 계산된 결과가 비트로 저장되었으니 long으로 받는다고 달라지는게 없다.
        long l2 = (long) i1 * i2;
        System.out.println("long l1 = i1 * i2;: l1 = " + l1);
        System.out.println("long l2 = (long) i1 * i2;: l2 = " + l2);

        /**
         * char로 된 숫자들도 결국 순서대로 코드로 저장되어 있기 때문에, 산술연산 사용하면 int형으로 변환과 동시에
         * 해당 문자들을 가지고 있는 코드 넘버의 산술연산으로 바뀌어서
         * 뺄셈의 경우에는 문자로 표현된 숫자의 뺼셈은 일반적인 정수의 뺄셈과 같다.
         */
        System.out.println("\n< 문자의 연산 (정수) >");
        System.out.println("'2' - '0' = " + ('2' - '0'));

        System.out.println("\n< 리터럴 연산은 형변환 안해도 컴파일러가 알잘딱 한다 >");
        char c1 = 'a';
        char c2 = (char) (c1 + 1);
        char c3 = 'a' + 1;
        System.out.println("char c2 = (char) (c1 + 1); = " + c2);
        System.out.println("char c3 = 'a' + 1; = " + c3);
        System.out.println("'a' + 1; = " + ('a' + 1));

        System.out.println("\n< int / int 는 나눗셈 결과를 버린다.>");
        System.out.println("3 / 2 = " + (3 / 2));
        System.out.println("3 / 2.0 = " + (3 / 2.0));
    }

    @Test
    @DisplayName("비교 연산자")
    void 비교_연산자() {
        System.out.println("\n< float와 double은 정밀도에서 차이가 나기때문에 오차가 발생이 가능하다 >");
        float f = 0.1f;
        double d = 0.1;
        System.out.println("0.1f == 0.1 = " + (f == d));

        float f2 = 987654321.0f;
        double d2 = 987654321.0;
        System.out.println("987654321.0f == 987654321.0: " + (f2 == d2));   // float 는 정수부 7자리 이상부터 오차발생
        System.out.println("(int) f2 = " + (int) f2 + ", (int) d2 = " + (int) d2);

        System.out.println("\n< float와 double은 정수부분은 오차없이 저장 가능하면 같다 >");
        System.out.println("(10.0 == 10.0f) = " + (10.0 == 10.0f));
        System.out.println("(987654.0f == 987654.0) = " + (987654.0f == 987654.0));
    }

    @Test
    @DisplayName("논리 연산자")
    void 논리_연산자() {
        /**
         * 논리 연산자
         * or: ||, and: &&, not: !
         *
         * 효율적인 연산
         * or의 경우 왼쪽부터 확인하면서 하나라도 true면 그 이후의 피연산자와 관계없이 true 이다.
         * and의 경우 왼쪽부터 확인하면서 하나라도 false면 그 이후의 피연산자와 관계없이 false 이다.
         */
    }

    static String toBinaryString(int x) {
        String zero = "00000000000000000000000000000000";
        String temp = zero + Integer.toBinaryString(x);
        return temp.substring(temp.length() - 32);
    }

    @Test
    @DisplayName("비트 연산자")
    void 비트_연산자() {
        /**
         * 아래 순서대로 우선순위다 & > ^ > |
         * AND연산자: &: 피연산자들 모두 1이면 1, 그 외엔 0
         * XOR연산자: ^: 피연산자가 서로 값이 다르면 1, 같으면 0
         * OR연산자: |: 피연산자 중 한쪽의 값이 1이면 1, 그 외엔 0
         */
        System.out.println("\n< or, and, xor 비트 연산자 >");
        int x = 0xAB, y = 0xF;
        System.out.printf("x = %#X \t\t\t\t\s%s%n", x, toBinaryString(x));
        System.out.printf("y = %#X \t\t\t\t\s%s%n", y, toBinaryString(y));
        System.out.printf("%#X & %#X = %#X \t\t\s%s%n", x, y, x & y, toBinaryString(x & y));
        System.out.printf("%#X | %#X = %#X \t\t\s%s%n", x, y, x | y, toBinaryString(x | y));
        System.out.printf("%#X ^ %#X = %#X \t\t\s%s%n", x, y, x ^ y, toBinaryString(x ^ y));
        System.out.printf("%#X ^ %#X ^ %#X = %#X \s%s%n", x, y, y, x ^ y ^ y, toBinaryString(x ^ y ^ y));

        /**
         * 비트 전환 연산자: ~: 1의 보수
         * 2의 보수: 1의 보수 후에 +1 한 것 == 변수 앞에 -붙인거
         */
        System.out.println("\n< 비트 전환 연산자: ~ >");
        byte p = 10;
        byte n = -10;
        System.out.printf(" p =  %d \t%s%n", p, toBinaryString(p));
        System.out.printf("~p = %d \t%s%n", ~p, toBinaryString(~p));
        System.out.printf("~p+1 = %d \t%s%n", ~p + 1, toBinaryString(~p + 1));
        System.out.printf("~~p = %d \t%s%n", ~~p, toBinaryString(~~p));
        System.out.printf(" n = %d \t%s%n", n, toBinaryString(n));
        System.out.printf("~n+1 = %d \t%s%n", ~n + 1, toBinaryString(~n + 1));

        System.out.println("\n( 쉬프트 연산자: <<, >> )");
        /**
         * x << n == x * 2^n
         * x >> n == x / 2^n
         */
        int dec = 8;
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 1, dec >> 1, toBinaryString(dec >> 1));
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 2, dec >> 2, toBinaryString(dec >> 2));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 0, dec << 0, toBinaryString(dec << 0));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 1, dec << 1, toBinaryString(dec << 1));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 2, dec << 2, toBinaryString(dec << 2));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 20, dec << 20, toBinaryString(dec << 20));
        System.out.println();
        dec = -8;
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 1, dec >> 1, toBinaryString(dec >> 1));
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 2, dec >> 2, toBinaryString(dec >> 2));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 0, dec << 0, toBinaryString(dec << 0));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 1, dec << 1, toBinaryString(dec << 1));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 2, dec << 2, toBinaryString(dec << 2));
        System.out.println();
        /**
         * x << n 이나 x >> n 은 n이 x의 bit수 보다 크다면 x의 bit수 만큼 시프트한 것은 움직이지 않은 것과 같다.
         */
        dec = 8;
        System.out.printf("%d >> %2d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
        System.out.printf("%d >> %2d = %4d \t%s%n", dec, 4, dec >> 4, toBinaryString(dec >> 4));
        System.out.printf("%d >> %2d = %4d \t%s%n", dec, 31, dec >> 31, toBinaryString(dec >> 31));
        System.out.printf("%d >> %2d = %4d \t%s%n", dec, 32, dec >> 32, toBinaryString(dec >> 32));
    }

    @Test
    @DisplayName("조건 연산자")
    void 조건_연산자() {
        /**
         * ? : 연산자
         * 조건식 ? 식1 : 식2
         * 조건식이 참이면 식1, 거짓이면 식2
         */

        System.out.println("((true) ? true : false) = " + ((true) ? true : false));
        System.out.println("((false) ? true : false) = " + ((false) ? true : false));
    }

}
