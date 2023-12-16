package variable;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerStudy {
    @Test
    @DisplayName("String->Integer")
    void String_to_Integer() {
        /**
         * String -> int 변환 방법
         * parseInt: int 형식으로 반환.
         * valueOf: Integer 형식으로 반환.
         * int 나 Integer나 어차피 오토 박싱, 언박싱 되어서 다 상관없다.
         */
        System.out.println("\n< String -> Integer >");
        String stringNum = "10";
        int useParseInt = Integer.parseInt(stringNum);
        Integer useValueOf = Integer.valueOf(stringNum);
        int autoUnboxing = Integer.valueOf(stringNum);
        Integer autoBoxing = Integer.parseInt(stringNum);

        System.out.println("stringNum = " + stringNum + " -> useParseInt = " + useParseInt);
        System.out.println("stringNum = " + stringNum + " -> useValueOf = " + useValueOf);

    }

    @Test
    @DisplayName("진법변환 ( 10진수 -> 2, 8, 16진수)")
    void from_decimal_to_binaray_octal_hex() {
        /**
         * 진법변환 ( 10진수 -> 2, 8, 16진수)
         */
        System.out.println("\n< 10진수 -> 2, 8, 16 진수 변환 >");
        String binaryString = Integer.toBinaryString(15);
        String octalString = Integer.toOctalString(15);
        String hexString = Integer.toHexString(15);

        System.out.println("15 -> binaryString = " + binaryString);
        System.out.println("15 -> octalString = " + octalString);
        System.out.println("15 -> hexString = " + hexString);
    }

    @Test
    @DisplayName("진법변환 (2, 8, 16진수 -> 10진수)")
    void from_binaray_octal_hex_to_decimal() {
        /**
         * 진법변환 (2, 8, 16진수 -> 10진수)
         * Integer.parseInt(string변수, 바꿀 진번의 숫자)
         * Integer.valueOf(string변수, 바꿀 진번의 숫자)
         */
        String binaryString = Integer.toBinaryString(15);
        String octalString = Integer.toOctalString(15);
        String hexString = Integer.toHexString(15);

        System.out.println("\n< 2, 8, 16 진수 변환 -> 10진수 >");
        int binaryUseParseInt = Integer.parseInt(binaryString, 2);
        Integer binaryUseValueOf = Integer.valueOf(binaryString, 2);
        System.out.println(binaryString + " -> binaryUseParseInt = " + binaryUseParseInt);
        System.out.println(binaryString + " -> binaryUseValueOf = " + binaryUseValueOf);

        int octalUseParseInt = Integer.parseInt(octalString, 8);
        Integer octalUseValueOf = Integer.valueOf(octalString, 8);
        System.out.println(octalString + " -> octalUseParseInt = " + octalUseParseInt);
        System.out.println(octalString + " -> octalUseValueOf = " + octalUseValueOf);

        int hexUseParseInt = Integer.parseInt(hexString, 16);
        Integer hexUseValueOf = Integer.valueOf(hexString, 16);
        System.out.println(hexString + " -> hexUseParseInt = " + hexUseParseInt);
        System.out.println(hexString + " -> hexUseValueOf = " + hexUseValueOf);
    }
}
