package variable;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class StringStudy {
    /**
     * String은 문자열 리터럴이다.
     * String은 클래스라서 new를 사용해야하지만, 특별히 그냥 대입하는 것처럼 사용해도 된다.
     * 문자열은 덧셈 연산자(+)를 이용해서 결합할 수 있다.
     * 어떤 변수든 문자열과 덧셈 연산이 이루어지면 다른 한쪽도 문자열로 변환이 되어서 자동으로 문자열로 바뀐다.
     */

    @Test
    @DisplayName("String '+' 연산 적용 법칙")
    void 덧셈_연산적용() {
        /**
         * String + 연산 적용 법칙
         */
        System.out.println("\n< String의 + 연산 적용 법칙 >");
        int i = 100;
        System.out.println("i = " + i);
        // 단 순서대로 연산이 적용되기때문에, 문자열을 만나기 전의 연산은 각자의 연산방식이 사용된다.
        String iis = i + i + "";
        String isi = i + "" + i;
        System.out.println("i + i + \"\" = " + iis + ", i + \"\" + i = " + isi); // iis = 200, isi = 100100
    }

    @Test
    @DisplayName("String -> char")
    void String_to_char() {
        /**
         * String -> char 변환법 (char array 포함)
         * 1. charAt() 이용
         * 2. char array: toCharArray() 이용
         */
        System.out.println("\n< String -> char, char array >");
        System.out.println("\"java\".charAt(2) = " + "java".charAt(2));
        char[] charArray = "java".toCharArray();
        System.out.print("\"java\".toCharArray()" + " 각 char 반복문으로 출력: ");
        for (char c : charArray) {
            System.out.print(c);
        }
        System.out.println();
    }

    @Test
    @DisplayName("문자열x -> 문자열(String)")
    void to_String() {
        /**
         * 문자열이 아닌 변수를 문자열로 바꾸는 방법
         * 1. 변수 + ""
         * 2. String.valueof(변수)
         * 3. 다른 형식의 레퍼런스 타입.toString(변수)
         */
        System.out.println("\n< 다른 형식 -> String >");
        System.out.println("1. 변수 + \"\"");
        System.out.println("2. String.valueOf(변수)");
        System.out.println("3. 다른 형식의 레퍼런스 타입.toString(변수)");
        int i = 100;
        String itos1 = i + "";
        String itos2 = String.valueOf(i);
        String itos3 = Integer.toString(i);
        System.out.println("\nint(100) -> String");
        System.out.println("i + \"\" = " + itos1 + ", String.valueOf(i) = " + itos2 + ", Integer.toString(i) = " + itos3);

        double d = 1000.001;
        String dtos1 = d + "";
        String dtos2 = String.valueOf(d);
        String dtos3 = Double.toString(d);
        System.out.println("\ndouble(1000.001) -> String");
        System.out.println("d + \"\" = " + dtos1 + ", String.valueOf(d) = " + dtos2 + ", Double.toString(d) = " + dtos3);

        char c = 'A';
        String ctos1 = c + "";
        String ctos2 = String.valueOf(c);
        String ctos3 = Character.toString(c);
        System.out.println("\nchar('A') -> String");
        System.out.println("c + \"\" = " + ctos1 + ", String.valueOf(c) = " + ctos2 + ", Character.toString(c) = " + ctos3);

        char[] chArr = {'j', 'a', 'v', 'a'};
        String chArrtos2 = String.valueOf(chArr);
        System.out.println("\nchar array(" + Arrays.toString(chArr) + ") -> String");
        System.out.println("String.valueOf(chArr) = " + chArrtos2);

    }

    @Test
    @DisplayName("문자열 비교 (equals)")
    void 문자열_비교() {
        /**
         * String 은 객체라서, 서로 다른 객체는 == 으로 비교가 불가능하다.
         * 따라서 equals() 메서드를 이용한다.
         */
        System.out.println("\n< 문자열 비교: equals >");
        System.out.println("(\"abc\" == \"abc\") = " + ("abc" == "abc"));
        String str1 = "abc";
        String str2 = new String("abc");
        System.out.println();
        System.out.println("str1 = " + str1 + ", str2 = " + str2);
        System.out.println("(str1 == \"abc\") = " + (str1 == "abc"));
        System.out.println("(str2 == \"abc\") = " + (str2 == "abc"));
        System.out.println("(str1 == str2) = " + (str1 == str2));
        System.out.println();
        System.out.println("str2.equals(\"abc\") = " + str2.equals("abc"));
        System.out.println("str2.equals(str1) = " + str2.equals(str1));
        System.out.println("str2.equalsIgnoreCase(\"ABc\") = " + str2.equalsIgnoreCase("ABc"));
    }

    @Test
    @DisplayName("문자열 자르기 (substring)")
    void 문자열_자르기() {
        /**
         * 1. String객체.substring(beginIndex): beginIndex ~
         * 2. String객체.substring(beginIndex, endIndex): beginIndex ~ endIndex-1 까지
         */
        String str = "hello, world";
        System.out.println("str = " + str);
        System.out.println("str.substring(7) = " + str.substring(7));
        System.out.println("str.substring(0, 5) = " + str.substring(0, 5));
//        System.out.println("str.substring(0, -1) = " + str.substring(0, -1)); python 처럼 -1같은거로 뒤 접근 불가능
    }
}
