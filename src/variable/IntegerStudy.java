package variable;

public class IntegerStudy {
    public static void main(String[] args) {
        /**
         * String -> int 변환 방법
         * parseInt: int 형식으로 반환.
         * valueOf: Integer 형식으로 반환.
         * int 나 Integer나 어차피 오토 박싱, 언박싱 되어서 다 상관없다.
         */
        System.out.println("\n< String -> Integer >");
        String snum = "10";
        int stoiParseInt = Integer.parseInt(snum);
        Integer stoiValueOf = Integer.valueOf(snum);
        int autoUnboxing = Integer.valueOf(snum);
        Integer autoBoxing = Integer.parseInt(snum);
        System.out.println("stoiParseInt = " + stoiParseInt);
        System.out.println("stoiValueOf = " + stoiValueOf);


        /**
         * 진법변환 ( 10진수 -> 2, 8, 16진수)
         */
        System.out.println("\n< 10진수 -> 2, 8, 16 진수 변환 >");
        String binaryString = Integer.toBinaryString(15);
        String octalString = Integer.toOctalString(15);
        String hexString = Integer.toHexString(15);
        System.out.println("binaryString = " + binaryString);
        System.out.println("octalString = " + octalString);
        System.out.println("hexString = " + hexString);

        /**
         * 진법변환 (2, 8, 16진수 -> 10진수)
         */
        System.out.println("\n< 2, 8, 16 진수 변환 -> 10진수 >");
        int btoiParseInt = Integer.parseInt(binaryString, 2);
        Integer btoiValueOf = Integer.valueOf(binaryString, 2);
        System.out.println("btoiParseInt = " + btoiParseInt);
        System.out.println("btoiValueOf = " + btoiValueOf);
        int otoiParseInt = Integer.parseInt(octalString, 8);
        Integer otoiValueOf = Integer.valueOf(octalString, 8);
        System.out.println("otoiParseInt = " + otoiParseInt);
        System.out.println("otoiValueOf = " + otoiValueOf);
        int htoiParseInt = Integer.parseInt(hexString, 16);
        Integer htoiValueOf = Integer.valueOf(hexString, 16);
        System.out.println("htoiParseInt = " + htoiParseInt);
        System.out.println("htoiValueOf = " + htoiValueOf);
    }
}
