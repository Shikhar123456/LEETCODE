package Leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * RomanToInt
 */
public class RomanToInt {


    public static void main(String[] args) {
        RomanToInt rtt = new RomanToInt();
        int ans = rtt.romanTOInt("III");
        System.out.println(ans);
    }

    public int romanTOInt(String S) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = map.get(S.charAt(S.length() - 1));
        for (int i = S.length() - 2; i >= 0; i--) {
            if (map.get(S.charAt(i)) >= map.get(S.charAt(i + 1))) {
                result += map.get(S.charAt(i));
            } else {
                result -= map.get(S.charAt(i));
            }
        }



        return result;

    }
}
