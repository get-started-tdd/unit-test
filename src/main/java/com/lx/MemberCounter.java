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
        int i = 1;
        while (!ids.isEmpty()) {
            //todo:此时想到了另一种更好的解决方案，可以通过直接出队第count-1的队员，就能去除内层循环
            for (int j = 0; j < ids.size(); j++) {
                if (i == count) {
                    result.add(ids.remove(j));
                    j--;
                    i=1;
                } else {
                    i++;
                }
            }
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
