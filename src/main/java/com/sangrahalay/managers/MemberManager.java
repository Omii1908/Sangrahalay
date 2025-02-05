package com.sangrahalay.managers;

import com.sangrahalay.models.Member;
import java.util.ArrayList;
import java.util.List;

public class MemberManager {
    private static final List<Member> members = new ArrayList<>();

    public static boolean addMember(Member member) {
        return members.add(member);
    }
}
