package if_switch_while_for;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ForStudy {
    /**
     * for (초기화; 조건식; 증감식){
     * }
     * 조건식이 거짓이면 빠져나옴
     */
    @Test
    @DisplayName("for 예제")
    void for_예제() {
        System.out.println("\n < 기본 예제 >");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        System.out.println("\n < 생략가능 >");
        int loop = 1;
        for (; ; ) {
            System.out.printf("무한루프: %d%n", loop);
            loop++;
            if (loop == 10) {
                break;
            }
        }
    }

    @Test
    @DisplayName("향상된 for문")
    void enhanced_for() {
        /**
         * for ( 타입 변수명 : 배열 or 컬렉션 )
         */
        System.out.println("\n< 향상된 for문 >");
        String[] strArr = {"java", "string", "job", "hard", "study"};
        for (String str : strArr) {
            System.out.println(str);
        }
    }
}
