package variable;

public class PrimitiveType {
    public static void main(String[] args) {
        /**
         * primitive 타입 변수엔 총 8가지 변수가 존재한다.
         *
         * 1byte = 8bit
         * 논리형 : boolen (1byte)
         * 문자형 : char (2byte)
         * 정수형 : byte, short, int, long (1, 2, 4, 8byte)
         * 실수형 : float, double (4, 8 bute)
         */

        /**
         * 상수, 리터럴 (constant, literal)
         *
         * 상수: 고정된 값을 담는 공간의 이름 (final 로 표시)
         * 리터럴: 값 그 자체
         *
         * final (상수) 규칙: 이름을 모두 대문자로 한다. 띄어쓰기 필요할 땐 _ 사용
         */

        final int MAX_LENGTH = 1_000_000;
        System.out.println("MAX_LENGTH = " + MAX_LENGTH);

        /**
         * long, double, float 같은 타입은 리터럴 뒤에 l, d, f 를 붙여줘야한다.
         * double 타입은 실수형 기본형이라서 생략 가능하다.
         */

        long lNum = 10_000_000_000L;
        float fNum = 1.1f;
        double dNum = 1.1; // double 이 실수형 기본타입이라 d 생략가능

        /** 각 타입들은 자신들 타입보다 더 적은 범위를 가지는 타입은 저장 가능하다. (자동 타입 변환)
         * byte < short, char < int < long < float < double
         */

        long lNum2 = 1;
        int iNum = 'a';
        float fNum2 = 10000000000L;

        /** 범위가 더 작은 타입으로 형변환 하려면 타입캐스팅 해줘야한다.
         *
         * 소수점은 10의 제곱을 표현하는 E(e)로도 표현 가능하다. (ex e2: 10의 2승)
         */

        double dNum2 = 1e9;
        double dNum3 = 1e-9;

        /**
         * printf 는 println 과 같은 출력문에서는 하지 못한, 변수의 값을 여러가지 형식으로 바꿀 수 있는 기능이 있다.
         */

        System.out.printf("%b, %b, %b%n", -1, 0, null);   // Java 에서는 0이 false 가 아니다.
        System.out.printf("%d, %d, %d, %d%n", 2, 8, 10, 16);    // 10진수
        System.out.printf("%o, %o, %o, %o%n", 2, 8, 10, 16);    // 8진수
        System.out.printf("%x, %x, %x, %x%n", 2, 8, 10, 16);    // 16진수
        System.out.printf("%n");
        System.out.printf("%n");

    }
}