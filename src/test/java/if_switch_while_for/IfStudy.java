package if_switch_while_for;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IfStudy {
    /**
     * if (조건식) { } else if (조건식) { } else { }
     * 조건식은 true / false 의 boolean 값을 결과로 가짐
     */
    @Test
    @DisplayName("if 예제")
    void if_예제() {
        int test = (int) (Math.random() * 3) + 1;
        if (test == 1) {
            System.out.println(test + ": 가위");
        } else if (test == 2) {
            System.out.println(test + ": 바위");
        } else {
            System.out.println(test + ": 보");
        }
    }
}
