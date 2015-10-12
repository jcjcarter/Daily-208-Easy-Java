package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        TreeSet<Integer> nums = new TreeSet<>();

        while(in.hasNext())
            nums.add(in.nextInt());

        System.out.println(nums);
    }
}
