import java.util.*;
import java.lang.*;


public class SumsToN {

    static void build (int[] numbers, int n, int position, ArrayList<Integer> combinations) {
        if (n == 0) {
            print(combinations);
            return;
        }
        for (int i = position; i < numbers.length; i++){
            int newN = n - numbers[i];
            if (newN >= 0) {
                combinations.add(numbers[i]);
                build(numbers, newN, i, combinations);
                combinations.remove(combinations.size() - 1);
            }
        }
    }

    static void print (ArrayList<Integer> combinations) {
        System.out.print(combinations.get(0));
        for(int i = 1; i < combinations.size(); i++) {
            System.out.print(" + " + combinations.get(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number N.");
        int n = in.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i< n; i++) numbers[i] = i + 1;
        int position = 0;
        ArrayList<Integer> possibilities = new ArrayList<Integer>();
        build(numbers, n, position, possibilities);
        System.exit(0);
    }
}