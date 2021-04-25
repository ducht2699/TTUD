package com.company.demo_mid_term_contest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOUNDSUBSEQ {

    public static void main(String[] args) {
        long n, m, M;
        Scanner sc = new Scanner(System.in);

        n = sc.nextLong();
        m = sc.nextLong();
        M = sc.nextLong();

        if (m > M) {
            System.out.println("0");
            return;
        }

        List<Long> a = new ArrayList<>();
        long result = 0;
        for (int i = 0; i < n; i++) {
            long temp = sc.nextLong();
            a.add(temp);
            if (temp >= m && temp <= M)
                result++;
        }

        for (int i = 0; i < n - 1; i++) {
            long temp = a.get(i);
            for (int j = i + 1; j < n; j++) {
                temp += a.get(j);
                if (temp >= m && temp <= M) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
