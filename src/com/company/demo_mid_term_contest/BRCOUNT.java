package com.company.demo_mid_term_contest;

import java.util.Scanner;
import java.util.Stack;

public class BRCOUNT {
    public static boolean check(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        int result = 0;
        if (a.length() % 2 != 0) {
            result = 0;
        } else {
            for (int i = 0; i < a.length(); i++) {

            }
        }

        System.out.println(result);
    }
}
