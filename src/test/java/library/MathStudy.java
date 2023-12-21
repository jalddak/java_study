package library;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MathStudy {
    @Test
    @DisplayName("random")
    void random() {
        /**
         * 0.0 <= Math.random() < 1.0
         * 범위 조절은 Math.random() 에 곱셈, 시작지점 설정은 덧셈
         */

        // 1 ~ 45
        int r = (int) (Math.random() * 45) + 1;
        System.out.println("r = " + r);

        int i = 1;
        while (i-- != 0) {
            System.out.println("i = " + i);
        }
    }
}
