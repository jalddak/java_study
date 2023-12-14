package variable;

public class StringStudy {
    public static void main(String[] args) {
        /**
         * String은 문자열 리터럴이다.
         * String은 클래스라서 new를 사용해야하지만, 특별히 그냥 대입하는 것처럼 사용해도 된다.
         * 문자열은 덧셈 연산자(+)를 이용해서 결합할 수 있다.
         * 어떤 변수든 문자열과 덧셈 연산이 이루어지면 다른 한쪽도 문자열로 변환이 되어서 자동으로 문자열로 바뀐다.
         */

        int i = 100;
        // 단 순서대로 연산이 적용되기때문에, 문자열을 만나기 전의 연산은 각자의 연산방식이 사용된다.
        String iis = i + i + "";
        String isi = i + "" + i;
        System.out.println("iis = " + iis + ", isi = " + isi);

        /**
         * 문자열이 아닌 변수를 문자열로 바꾸는 방법
         * 1. 변수 + ""
         * 2. String.valueof(변수)
         */
        i = 100;
        String is = i + "";
        String is2 = String.valueOf(i);
        System.out.println("is = " + is + ", is2 = " + is2);

        double d = 1000.001;
        String ds = d + "";
        String ds2 = String.valueOf(d);
        System.out.println("ds = " + ds + ", ds2 = " + ds2);

    }


}
