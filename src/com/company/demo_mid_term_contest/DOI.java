package com.company.demo_mid_term_contest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DOI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            list.add(temp);
        }

        int min1 = 0, max1 = 0;
        int current = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                current--;
            } else if (list.get(i) < list.get(i + 1)) {
                current++;
            }
            min1 = Math.min(min1, current);
            max1 = Math.max(max1, current);
        }
        System.out.println(max1 + " " + min1);
    }
}
