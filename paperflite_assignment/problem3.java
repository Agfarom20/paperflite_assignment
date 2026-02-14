/* 

Given string num representing a non-negative integer num, and an integer k,
return the smallest possible integer after removing k digits from  num.

Example 1:
Input: num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219
which is the smallest.

*/

    
import java.util.*;

class problem3 {

    public String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder();     //use stringbuilder as a stack to implement logic
        for (int i = 0; i < num.length(); i++) {

            char cur = num.charAt(i);

            while (sb.length() > 0 && k > 0 && sb.charAt(sb.length() - 1) > cur) // previous elements > than vur
            {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }

            sb.append(cur);
        }

        while (k > 0 && sb.length() > 0) //remove k if left over
        {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }

        while (sb.length() > 0 && sb.charAt(0) == '0') //cant have leading zero's in the problem hence remove
        {
            sb.deleteCharAt(0);
        }

        if (sb.length() == 0) //if empty return '0'
        {
            return "0";
        }

        return sb.toString();  //convert back to string to print...
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        String num = sc.nextLine();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        problem3 obj = new problem3();
        String ans = obj.removeKdigits(num, k);

        System.out.println("Smallest number: " + ans);
    }

}


