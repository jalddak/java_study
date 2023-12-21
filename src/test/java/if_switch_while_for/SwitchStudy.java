package if_switch_while_for;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SwitchStudy {
    /**
     * if 는 true / false 경우만 판별해서 어떤 값으로 판별하고 싶을때 switch 문 쓴다.
     */
    @Test
    @DisplayName("switch")
    void switch_예제() {
        int month = 1;

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                System.out.println("case 한줄로 break 없이 나열하면 나열한 조건들중 아무거나 맞으면임");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                System.out.println("cass 일렬로 나열 가능");
                /**
                 * 일렬로 나열 가능한데, 저장하면 자동으로 컨벤션 대로 코드 수정되게 설정해놔서 저절로 바뀜
                 */
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을");
                break;
            default:
//            case 12: case 1: case 2:
                System.out.println("겨울");
        }
    }

    @Test
    @DisplayName("switch 제약조건")
    void switch_제약조건() {
        /**
         * switch 제약조건
         * 1. switch문의 조건식 결과는 정수 또는 문자열이어야한다. (char도 결국 정수)
         * 2. case문의 값은 정수 상수만 가능하며, 중복되지 않아야 한다.
         */
        int n = 0;
        int result = 0;
        final int FINAL = 0;

        switch (result) {
            case '1':
//            case n: // 변수는 컴파일 에러
            case FINAL:
            case 100:
//            case 0.0: // 실수도 컴파일 에러
        }

        switch ("java") {
            case "java":
        }
    }
}
