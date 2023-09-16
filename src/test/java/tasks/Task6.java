package tasks;

import static java.lang.Long.sum;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task6 {
    public static void main(String[] args) {
        expectedValue();
    }
    public static void expectedValue() {
        assertThat(5).isEqualTo(sum(2, 3));
    }
}
