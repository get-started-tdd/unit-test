package test.com.lx;

import com.lx.MemberCounter;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by L.x on 15-5-17.
 */
public class MemberCounterTest {
    @Test
    @Ignore
    public void displaysNothingIfCountOffWithinNoMembers() throws Exception {
        MemberCounter counter = new MemberCounter(3);

        assertThat(counter.countOff(0), equalTo(Collections.<Integer>emptyList()));
    }

    @Test
    @Ignore
    public void displaysMemberIDIfCountOffWithinAMember() throws Exception {
        MemberCounter counter = new MemberCounter(3);

        assertThat(counter.countOff(1), equalTo(Arrays.asList(1)));
    }

    @Test
    @Ignore
    public void displaysMembersIDOneByOneIfCountIs1() throws Exception {
        MemberCounter counter = new MemberCounter(1);

        assertThat(counter.countOff(3), equalTo(Arrays.asList(1, 2, 3)));
    }

    @Test
    @Ignore
    public void dequeueMemberIfMemberCountUpToM() throws Exception {
        MemberCounter counter = new MemberCounter(3);

        assertThat(counter.countOff(3), equalTo(Arrays.asList(3, 1, 2)));
    }

}
