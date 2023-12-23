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

        System.out.println("\n< Math.random() >");
        // 1 ~ 45
        int r = (int) (Math.random() * 45) + 1;
        System.out.println("(int) (Math.random() * 45) + 1 = " + r);
    }

    @Test
    @DisplayName("round 반올림")
    void round() {
        System.out.println("\n< Math.round(double) >");
        double[] dArray = {1.0, 1.234, 1.499, 1.5, 2.5, 3.5};
        for (double d : dArray) {
            System.out.println("d = " + d + ", Math.round(d) = " + Math.round(d));
        }

    }
}
