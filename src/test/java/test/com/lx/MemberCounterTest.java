package test.com.lx;

import com.lx.MemberCounter;
import org.junit.Test;

import java.util.Collections;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by L.x on 15-5-17.
 */
public class MemberCounterTest {
    @Test
    public void noMembers() throws Exception {
        MemberCounter counter = new MemberCounter(3);

        assertThat(counter.countOff(0), equalTo(Collections.<Integer>emptyList()));
    }
}
