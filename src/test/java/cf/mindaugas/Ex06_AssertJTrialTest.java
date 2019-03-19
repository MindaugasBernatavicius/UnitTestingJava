package cf.mindaugas;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Ex06_AssertJTrialTest {

    @Test
    public void testSimpleFluentAssertion(){
        String text = "abc";
        assertThat(text).isEqualTo("abc");
    }

    @Test
    public void testMultipleConditionsFluentAssertion(){
        String[] stringArray = {"abc", "cde", "efg"};
        assertThat(stringArray)
            .hasSize(3)
            .contains("cde")
            .doesNotContain("xyz");
    }

}