package com.company.training.devide_conquer;

import java.awt.*;
import java.util.*;
import java.util.List;

public class CLOPAIR {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Point> pointList = new ArrayList<>();
        List<Result> resultList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int tempX = scanner.nextInt();
            int tempY = scanner.nextInt();
            pointList.add(new Point(tempX, tempY));
        }



    }

    public static class Result {
       int index1;
       int index2;
       double distance;

        public Result(int index1, int index2, double distance) {
            this.index1 = index1;
            this.index2 = index2;
            this.distance = distance;
        }

        public int getIndex1() {
            return index1;
        }

        public void setIndex1(int index1) {
            this.index1 = index1;
        }

        public int getIndex2() {
            return index2;
        }

        public void setIndex2(int index2) {
            this.index2 = index2;
        }

        public double getDistance() {
            return distance;
        }

        public void setDistance(double distance) {
            this.distance = distance;
        }
    }
}
