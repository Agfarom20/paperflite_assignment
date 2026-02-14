// Given a pattern and a string s, find if s follows the same pattern.

import java.util.*;

class problem2 {

    public boolean bijection(String pattern, String[] arr) {
        if (pattern.length() != arr.length) {  // if length is unequal it is false anyways 
            return false;
        }

        Map<Character, String> map = new HashMap<>();
        Set<String> existmap = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {

            char ch = pattern.charAt(i);
            String word = arr[i];
            if (map.containsKey(ch)) {                                                //check if the map contains key
                if (!map.get(ch).equals(word)) // check mapping not equal to word return false
                {
                    return false;
                }
            } else {
                if (existmap.contains(word)) //check if the word already mapped
                {
                    return false;
                }
                map.put(ch, word);            //else map character and word...
                existmap.add(word);
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pattern:");
        String pat = sc.nextLine();
        System.out.println("Enter the word string");
        String s[] = sc.nextLine().split(" ");           //split the string an send as array...
        problem2 obj = new problem2();
        boolean ans = obj.bijection(pat, s);
        System.out.println(ans);

    }
}
