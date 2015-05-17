package com.lx;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by L.x on 15-5-17.
 */
public class MemberCounter {
    private int count;

    public MemberCounter(int count) {
        this.count = count;
    }

    public List<Integer> countOff(int numberOfMembers) {
        List<Integer> ids = createMemberIDs(numberOfMembers);
        List<Integer> result = new ArrayList<>();
        while (!ids.isEmpty()) {

        }
        return result;
    }

    private List<Integer> createMemberIDs(int numberOfMembers) {
        List<Integer> result = new ArrayList<>();
        for (int id = 1; id <= numberOfMembers; id++) {
            result.add(id);
        }
        return result;
    }
}
