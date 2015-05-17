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
        //例子来自于http://jerval.iteye.com/blog/1068563，居然博主给出的结果是错误的:(
        List<Integer> expected = Arrays.asList(
                3, 6, 9, 12, 15, 18,
                1, 5, 10, 14, 19,
                4, 11, 17,
                7, 16, 8,
                2, 13, 20
        );
        assertThat(counter.countOff(20), equalTo(expected));
    }

}
