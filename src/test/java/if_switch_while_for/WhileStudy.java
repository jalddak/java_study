package if_switch_while_for;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WhileStudy {
    /**
     * while(조건식)
     * 조건식 생략 불가능
     */
    @Test
    @DisplayName("while 예제")
    void while_예제() {
        System.out.println("\n< while 예제 >");
        int i = 10;
        while (i != 0) {
            System.out.printf("%d ", i);
            i--;
        }
        System.out.println();
    }

    @Test
    @DisplayName("while에 전위, 후위로 조건식 만들면?")
    void while_전위_후위() {
        /**
         * 전위식으로 조건문을 작성하면 계산먼저 되어서, 그 결과가 조건에 맞지않는다면 반복문은 실행되지 않는다.
         * 후위식은 기존변수가 조건문에 맞는지 확인한 뒤에 증감을 하므로, 기존 변수만 조건에 맞다면 반복문을 실행한다.
         */
        System.out.println("\n< 전위 >");
        int i = 1;
        while (--i != 0) {
            System.out.printf("%d ", i);
        }

        System.out.println("\n< 후위 >");
        i = 1;
        while (i-- != 0) {
            System.out.printf("%d ", i);
        }
    }

    @Test
    @DisplayName("do-while")
    void do_while() {
        /**
         * while 문과 다르게, 최소 한번은 무조건 수행한다.
         */
        System.out.println("\n< do-while >");
        int i = 3;
        int start = 1;
        do {
            if (start == 1) {
                System.out.println(i + ": 최소 한번은 실행");
                start--;
            } else System.out.println(i + ": 최초 한번 이후의 반복문");
        } while (i-- != 0);
    }
}
