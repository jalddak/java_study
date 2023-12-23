import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RoundStudy {
    /**
     * 반올림 하는 법
     */
    @Test
    @DisplayName("반올림")
    void 반올림() {
        System.out.println("\n< 파이를 소수점 넷째 자리에서 반올림 하는 방법 1: int 형변환 사용>");
        double pi = 3.141592;
        double result = (int) (pi * 1000 + 0.5) / 1000.0;
        System.out.println("(int) (pi * 1000 + 0.5) / 1000.0 = " + result);

        System.out.println("\n< 파이를 소수점 넷째 자리에서 반올림 하는 방법 2: Math 라이브러리 사용>");
        result = Math.round(pi * 1000) / 1000.0; // 소수점 첫째 자리에서 반올림
        System.out.println("Math.round(pi * 1000) / 1000.0; = " + result);

    }
}
