package if_switch_while_for;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class BreakContinueStudy {
    @DisplayName("이름으로 break, continue 구간 설정")
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 4})
    void 구간_설정(int breakPoint) {
        System.out.println("\n< 구간 설정 x break>");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j && i == breakPoint) {
                    System.out.print("       ");
                    break;
                }
                System.out.printf("[%d, %d] ", i, j);
            }
            System.out.println();
        }

        System.out.println("\n< 구간 설정 x continue>");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j && i == breakPoint) {
                    System.out.print("       ");
                    continue;
                }
                System.out.printf("[%d, %d] ", i, j);
            }
            System.out.println();
        }

        System.out.println("\n< 구간 설정 o break loop1>");
        loop1:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j && i == breakPoint) {
                    System.out.print("       ");
                    break loop1;
                }
                System.out.printf("[%d, %d] ", i, j);
            }
            System.out.println();
        }

        System.out.println("\n< 구간 설정 o continue loop1>");
        loop1:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j && i == breakPoint) {
                    System.out.println();
                    continue loop1;
                }
                System.out.printf("[%d, %d] ", i, j);
            }
            System.out.println();
        }
    }
}
