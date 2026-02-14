/*1. Given a non-empty array of integers nums, every element appears twice
except for one.Find that single one.*/

import java.util.*;

class problem1 {

    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {               //if already exist? then remove.... so two of the same number can't exist...
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        return set.iterator().next();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);           // taking array input
        System.out.println("enter number of elements in array :");
        int num = sc.nextInt();
        if (num % 2 == 0) {  //
            System.out.println("invalid input");     // checking if valid input
            System.exit(1);
        }
        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter " + "element " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }

        problem1 obj = new problem1();                //object created 
        int answer = obj.singleNumber(arr);

        System.out.println("single element :" + answer);

    }
}
