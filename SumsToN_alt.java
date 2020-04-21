/*
 Chris Johnson
 4/20/20
CS 4050-001
Project 1) sums to N
    - Program to print out all integer combinations of a number N.
*/

import java.util.*;
import java.lang.*;


public class SumsToN_alt {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number N.");
        //int n = in.nextInt();
        ArrayList<Integer> numsList = new ArrayList<Integer>();
        int n = 4; // just for testing

        numsList = build(n);
        printListValues(numsList);
    }

    //TODO increment base number method
    static addToList(int total, int next, ArrayList<Integer> nums){
        total += next;
        nums.add(next);
        return nums, total;
    }
    static removeLast(int total, ArrayList<Integer> nums) {
        int last = nums.get(nums.size() - 1);
        total -= last;
        nums.remove(nums.size() - 1);
        return nums, total;
    }

    //TODO decrement base number method

    //TODO get numbers
    static build (int n) {
        // n = 4
        int base = 1;
        int next = 1;
        int total = 0;
        ArrayList<Integer> nums = new ArrayList<Integer>;
        for (int i = 1; i <= n; i++) {
            nums.add(i);
            total += i;
            if (total < n) {
                nums, total = addToList(total, next, nums);
            }
            if (total > n) nums, total = removeLast(total, next, nums);

            }
            if (total.equals(n) && nums.size) printListValues(nums);
        }



        return  nums;
    }

    static void printListValues(ArrayList<Integer> nums) {
        System.out.print(nums.get(0));
        for(int i = 1; i < nums.size(); i++) {
            System.out.print(" + " + nums.get(i));
        }
    }
}