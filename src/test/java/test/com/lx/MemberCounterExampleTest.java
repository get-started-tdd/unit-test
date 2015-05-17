package test.com.lx;

import com.lx.MemberCounter;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by L.x on 15-5-17.
 */
public class MemberCounterExampleTest {
    private MemberCounter counter = new MemberCounter(3);

    @Test
    public void countOff() throws Exception {
        List<Integer> expected = Arrays.asList(3, 6, 9, 12, 15, 18, 1, 7, 13, 19, 5, 16, 8, 2, 4, 14, 17, 10, 11, 20);
        assertThat(counter.countOff(20), equalTo(expected));
    }

}
