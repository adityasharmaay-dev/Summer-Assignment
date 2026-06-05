package Week1.Day5

import java.util.Arrays;

public class Longest_common_prefix{

    public static void main(String[] args){
        String[] strs = {"flower","flow","flight"};
        String result = longestCommonPrefix(strs);
        System.out.println(result);
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int len = Math.min(first.length(), last.length());
        String ans = "";
        for (int i = 0; i < len; i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans;
            }
            ans += first.charAt(i);
        }
        return ans;
    }
}