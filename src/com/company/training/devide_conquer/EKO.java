package com.company.training.devide_conquer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//36 points
public class EKO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int result = -9999;
        List<Integer> treeList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            treeList.add(scanner.nextInt());
        }
        Collections.sort(treeList);

        int maxHeight = treeList.get(treeList.size() - 1);

        find(treeList, 0, maxHeight, M);
    }

    private static int amountWoods(List<Integer> treeList, int height) {
        int result = 0;
        for (int x : treeList) {
            if (x > height) {
                result += x - height;
            }
        }
        return result;
    }

    private static int find(List<Integer> treeList, int left, int right, int M) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            int amountWoods = amountWoods(treeList, mid);
            if (amountWoods == M) {
                System.out.println(mid);
                return mid;
            } else if (amountWoods > M) {
                find(treeList, mid + 1, right, M);
            } else {
                find(treeList, left, mid - 1, M);
            }
        }
        return -1;
    }
}
