package programs;

import java.util.Arrays;
import java.util.HashMap;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "floght"};
        System.out.println(longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix(String[] strs) {
        int index = 0;
        int min = 0;
        char[] arr = new char[4];
        for(int i =0; i<strs.length;i++){
            if(i ==1){
                min = strs[i].length();
            } else if (strs[i].length()<min) {
                min = strs[i].length();
            }
        }

        for (int i = 0; i < min; i++) {
            if(strs[index].charAt(i)==strs[index+i].charAt(i) && strs[index+1].charAt(i)==strs[2].charAt(i)){
                arr[i]=strs[index].charAt(i);
            }else{
                break;
            }
        }
        return Arrays.toString(arr);

    }
}
