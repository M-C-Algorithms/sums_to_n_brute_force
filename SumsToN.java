/*
 Chris Johnson
 4/20/20
CS 4050-001
Project 1) sums to N
    - Program to print out all integer combinations of a number N.
*/

import java.util.Scanner;
import java.util.*;

public class SumsToN {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number N.");
        //int n = in.nextInt();
        ArrayList<Integer> numsList = new ArrayList<Integer>();

        // these are just for testing
        int exInt = 3;
        numsList.add(1);
        numsList.add(2);
        numsList.add(3);
        numsList.add(4);
        listTotal(numsList);




    }

    public static void listTotal(ArrayList<Integer> nums) {
        System.out.print(nums.get(0));
        for(int i = 1; i < nums.size(); i++) {
            System.out.print(" + " + nums.get(i));
        }
    }




}