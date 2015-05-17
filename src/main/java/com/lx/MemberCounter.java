package com.lx;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by L.x on 15-5-17.
 */
public class MemberCounter {
    public MemberCounter(int m) {

    }

    public List<Integer> countOff(int numberOfMembers) {
        ArrayList<Integer> results = new ArrayList<>();
        if (numberOfMembers > 0) {
            results.add(numberOfMembers);
        }
        return results;
    }
}
