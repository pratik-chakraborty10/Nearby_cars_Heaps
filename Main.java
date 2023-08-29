package com.pallindrome;

import java.util.PriorityQueue;

public class Main {
    static class point implements Comparable<point> {
        int x;
        int y;
        int distanceSquare;
        int index;

        public point(int x,int y,int distanceSquare,int index){
            this.x=x;
            this.y=y;
            this.distanceSquare=distanceSquare;
            this.index=index;
        }
        @Override
        public int compareTo(point p2){
            return this.distanceSquare-p2.distanceSquare;
        }
    }

    public static void main(String[] args) {
        int pts[][]={{3,3},{5,-1},{-2,4}};
        int k=2;

        PriorityQueue<point>pq=new PriorityQueue<>();
        for (int i=0;i< pts.length;i++){
            int distanceSquare=pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new point(pts[i][0],pts[i][1],distanceSquare,i));
        }

        //nearest k cars
        for (int i=0;i<k;i++){
            System.out.println("C"+pq.remove().index);
        }

    }
}
