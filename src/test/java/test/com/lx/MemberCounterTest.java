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
    public void displaysNothingIfNoMembersInTeam() throws Exception {
        MemberCounter counter = new MemberCounter(3);

        assertThat(counter.countOff(0), equalTo(Collections.<Integer>emptyList()));
    }

    @Test
    public void displaysMemberIDIf1MemberInTeam() throws Exception {
        MemberCounter counter = new MemberCounter(3);

        assertThat(counter.countOff(1), equalTo(Arrays.asList(1)));
    }

    @Test
    public void displaysMembersIDOneByOneIfCountIs1() throws Exception {
        MemberCounter counter = new MemberCounter(1);

        assertThat(counter.countOff(3), equalTo(Arrays.asList(1, 2, 3)));
    }

    @Test
    public void displaysDequeuedMembersInOrderIfMemberCountUpToCount() throws Exception {
        MemberCounter counter = new MemberCounter(2);

        assertThat(counter.countOff(3), equalTo(Arrays.asList(2, 1, 3)));
    }

}
