package programs;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        longestCommonPrefix(strs);

    }

    public static String longestCommonPrefix(String[] strs) {
        //abcd, abcde , abcf - abc
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
        return "";

    }
}
