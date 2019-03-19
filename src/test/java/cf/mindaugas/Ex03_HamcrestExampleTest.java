package cf.mindaugas;

import static org.junit.Assert.assertThat;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.AnyOf.anyOf;
import org.junit.Test;

public class Ex03_HamcrestExampleTest {
    @Test
    public void justForFun(){
        int out = Ex03_HamcrestExample.random();
        assertThat(out, anyOf(is(0), is(1), is(2)));
    }
}
