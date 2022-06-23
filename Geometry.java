package com.day_3;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Geometry {
    static int x1;
    static int y1;
    static int x2;
    static int y2;
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparision Computation");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a co-ordinates");
        x1=sc.nextInt();
        System.out.println("x1: "+x1);
        y1=sc.nextInt();
        System.out.println("y1: "+y1);
        x2=sc.nextInt();
        System.out.println("x2: "+x2);
        y2=sc.nextInt();
        System.out.println("y2: "+y2);
        double c=Math.pow((x2-x1),2);
        double d=Math.pow((y2-y1),2);
        int lengthOfLine=(int)sqrt(c+d);
        System.out.println("Length of a line: "+lengthOfLine);
    }
}
