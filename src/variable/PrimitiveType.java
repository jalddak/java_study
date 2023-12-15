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
        System.out.println("MAX_LENGTH = " + MAX_LENGTH); // MAX_LENGTH = 1000000

        /**
         * long, double, float 같은 타입은 리터럴 뒤에 l, d, f 를 붙여줘야한다.
         * double 타입은 실수형 기본형이라서 생략 가능하다.
         */
        long lNum = 10_000_000_000L;
        float fNum = 1.1f;
        double dNum = 1.1; // double 이 실수형 기본타입이라 d 생략가능

        /**
         * char 는 아스키코드로 사용해서 문자, 숫자 변환이 쉽게 가능하게 한다.
         */
        System.out.println("\n< char, int 자동 형변환 및 아스키코드 >");
        char A = 65;
        int charA = A;
        System.out.println("A = " + A);
        System.out.println("charA = " + charA);

        /**
         * 타입 캐스팅: 그냥 변수 앞에 (primitive type)변수 이렇게 해서 사용하면 해당 타입으로 변환이 가능하다.
         * 범위가 작은 타입으로 변환 시도시, 각 타입 byte수에 따라 오버플로우나면 숫자가 이상해질 수 있다.
         * 실수형 -> 정수형 변환은 그냥 소수점 다 버린다.
         * 근데 실수형의 정밀도 제한으로 정수형을 실수형으로 바꿀 때, 차이가 날 수 있다. (float -> int)
         */
        System.out.println("\n< 타입 캐스팅 >");
        double d = 1.623412;
        int dtoi = (int) d;
        final int MAX_INT = 2_147_483_647;
        long l = MAX_INT + 1L;
        int ltoi = (int) l;
        System.out.println("d = " + d + " -> dtoi = " + dtoi);
        System.out.println("l = " + l + " -> ltoi = " + ltoi);
        System.out.println(Double.valueOf(1.123123) + 1);

        /** 각 타입들은 자신들 타입보다 더 적은 범위를 가지는 타입은 저장 가능하다. (자동 형변환 해줘서)
         * byte < short, char < int < long < float < double
         * 소수점은 10의 제곱을 표현하는 E(e)로도 표현 가능하다. (ex e2: 10의 2승)
         * 계산 과정에서도 자동형변환이 발생 될 수 있다.
         */
        long lNum2 = 1;
        int iNum = 'a';
        float fNum2 = 10000000000L;
        double dNum2 = 1e9;
        double dNum3 = 1e-9;
    }
}