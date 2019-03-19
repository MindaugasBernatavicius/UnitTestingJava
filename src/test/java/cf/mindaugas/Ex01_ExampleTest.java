package cf.mindaugas;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class Ex01_ExampleTest {
    @Test
    public void appendStringTest() {
        // calling static method
        // given (or arrage)
        String initStr = "A1";
        String appendage = "B1";

        // when (or act)
        String output = Ex01_Example
                .appendString(initStr, appendage);

        // then (or assert)
        assert output.equals("A1:B1");

        // teardown
        initStr = null;
        appendage = null;
        output = null;
    }

    @Test
    public void appendStrigsTest(){
        // given
        String base = "BASE_STRING";
        String appendage1 = "APPENDAGE1";
        String appendage2 = "APPENDAGE2";

        // when
        String output = Ex01_Example.appendStrings(base, appendage1, appendage2);

        // then
        assertThat(output).startsWith("BASE_STRING")
            .endsWith("APPENDAGE2")
            .isEqualToIgnoringCase("BASE_STRING:APPENDAGE1:APPENDAGE2");
    }
}