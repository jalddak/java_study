package variable;

public class StringStudy {
    public static void main(String[] args) {
        /**
         * String은 문자열 리터럴이다.
         * String은 클래스라서 new를 사용해야하지만, 특별히 그냥 대입하는 것처럼 사용해도 된다.
         * 문자열은 덧셈 연산자(+)를 이용해서 결합할 수 있다.
         * 어떤 변수든 문자열과 덧셈 연산이 이루어지면 다른 한쪽도 문자열로 변환이 되어서 자동으로 문자열로 바뀐다.
         */

        System.out.println("\n< String의 + 연산 적용 법칙 >");
        int i = 100;
        // 단 순서대로 연산이 적용되기때문에, 문자열을 만나기 전의 연산은 각자의 연산방식이 사용된다.
        String iis = i + i + "";
        String isi = i + "" + i;
        System.out.println("iis = " + iis + ", isi = " + isi); // iis = 200, isi = 100100

        /**
         * String -> char 변환번 (char array 포함)
         * 1. charAt() 이용
         * 2. char array: toCharArray() 이용
         */
        System.out.println("\n< String -> char, char array >");
        System.out.println("\"java\".charAt(2) = " + "java".charAt(2));
        char[] charArray = "java".toCharArray();
        for (char c : charArray) {
            System.out.print(c);
        }
        System.out.println();

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
        i = 100;
        String is1 = i + "";
        String is2 = String.valueOf(i);
        String is3 = Integer.toString(i);
        System.out.println("is1 = " + is1 + ", is2 = " + is2 + ", is3 = " + is3); // is = 100, is2 = 100

        double d = 1000.001;
        String ds1 = d + "";
        String ds2 = String.valueOf(d);
        String ds3 = Double.toString(d);
        System.out.println("ds1 = " + ds1 + ", ds2 = " + ds2 + ", ds3 = " + ds3); // ds = 1000.001, ds2 = 1000.001

        char c = 'A';
        String cs1 = c + "";
        String cs2 = String.valueOf(c);
        String cs3 = Character.toString(c);
        System.out.println("cs1 = " + cs1 + ", cs2 = " + cs2 + ", cs3 = " + cs3);

        char[] chArr = {'j', 'a', 'v', 'a'};
        String chArrs2 = String.valueOf(chArr);
        System.out.println("chArrs2 = " + chArrs2);

    }


}
