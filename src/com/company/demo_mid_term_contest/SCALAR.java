package com.company.demo_mid_term_contest;

import java.util.*;

public class SCALAR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Long> result = new LinkedList<>();
        int T = scanner.nextInt();
        if (T < 1 || T > 1000) return;
        for (int i = 0; i < T; i ++) {
            int n = scanner.nextInt();
            if (n < 1 || n > 1000) return;
            List<Long> X = new ArrayList<>();
            List<Long> Y = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                long temp = scanner.nextLong();
                X.add(temp);
            }
            for (int j = 0; j < n; j++) {
                long temp = scanner.nextLong();
                Y.add(temp);
            }

            Collections.sort(X, Collections.reverseOrder());
            Collections.sort(Y);
            long result1 = 0;
            for (int j = 0; j < n; j++) {
                result1 += X.get(j) * Y.get(j);
            }
            result.add(result1);
        }
        int i = 0;
        for (long x : result) {
            i++;
            System.out.println("Case #" + i + ": " + x);
        }

    }
}
