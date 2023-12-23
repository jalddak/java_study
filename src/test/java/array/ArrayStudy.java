package array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayStudy {

    @Test
    @DisplayName("array 기본")
    void array_study() {
        // 생성
        int[] intArray1 = new int[]{1, 2, 3, 4};
        int[] intArray2 = {1, 2, 3, 4, 5}; // new int[] 생략가능

        int[] intInit = new int[5]; // 길이만 지정 가능

        System.out.println("\n< array 길이 : length >");
        System.out.println("intArray1.length = " + intArray1.length);
        System.out.println("intArray2.length = " + intArray2.length);
        System.out.println("intInit.length = " + intInit.length);

        System.out.println("\n< array 표시: Arrays.toString >");
        System.out.println("Arrays.toString(intArray1) = " + Arrays.toString(intArray1));
        System.out.println("Arrays.toString(new double[]{0.3, 1, 10}) = " + Arrays.toString(new double[]{0.3, 1, 10}));
        System.out.println("Arrays.toString(new String[]{\"java\", \"han\") = " + Arrays.toString(new String[]{"java", "han"}));

        System.out.println("\n< 초기화만 할땐 안에 값이 뭘까? >");
        System.out.println("Arrays.toString(new int[3]) = " + Arrays.toString(new int[3]));
        System.out.println("Arrays.toString(new double[3]) = " + Arrays.toString(new double[3]));
        System.out.println("Arrays.toString(new char[3]) = " + Arrays.toString(new char[3]));
        System.out.println("Arrays.toString(new String[3]) = " + Arrays.toString(new String[3]));
    }

    @Test
    @DisplayName("다차원 배열")
    void 다차원배열() {
        /**
         * 다차원 배열의 경우 미리 크기 일괄적으로 한번에 지정해도 되지만, 변칙적이게 적용해도된다.
         */
        int[][] int2dArray = new int[3][];
        int index = 0;

        for (int i = 0; i < int2dArray.length; i++) {
            int2dArray[i] = new int[i];
            System.out.println("int2dArray[" + i + "].length = " + int2dArray[i].length);
        }
    }
}
