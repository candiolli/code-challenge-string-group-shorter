package com.candiolli.challenges;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static String shorter(String s, Integer k) {
        String input = new StringBuilder(s).reverse().toString();

        List<String> groupList = new ArrayList<>();
        StringBuilder group = new StringBuilder();
        for (char c : input.toCharArray()) {
            if ((group.length() < k || group.length() > k) && c != '-') {
                group.append(c);
            } else if (group.length() == k) {
                groupList.add(group.toString());
                group = new StringBuilder();
            }
        }

        if (!group.isEmpty())
            groupList.add(group.toString());

        group = new StringBuilder();
        for (String c : groupList) {
            if (!group.isEmpty()) {
                group.append("-");
            }
            group.append(c);
        }
        return group.reverse().toString().toUpperCase();
    }
}
