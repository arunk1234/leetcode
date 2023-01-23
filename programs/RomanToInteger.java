package programs;

import java.util.HashMap;

public class RomanToInteger {
    static int ttl = 0;

    static HashMap<Character, Integer> romanValues = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};
    public static void main(String[] args) {
      //  System.out.println(" MCMXCIV :"+ romanToInt("MCMXCIV"));
       // System.out.println("III :"+ romanToInt("II"));
      //  System.out.println("LVIII :"+romanToInt("LVIII"));
        long start = System.currentTimeMillis();
        System.out.println("MCMXCVI :"+romanToInt("MCMXCVI"));
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("time : " +timeElapsed);


    }
    static int checkNextChar(Character ch, Character nextChar) {

        switch (ch) {
            case 'I' :{
                if (nextChar.equals('V')) {
                    return 4;
                } else if (nextChar.equals('X')) {
                    return 9;
                }
            }

            case 'X' :{
                if (nextChar.equals('L')) {
                    return 40;
                } else if (nextChar.equals('C')) {
                    return 90;
                }
            }

            case 'C' :{
                if (nextChar.equals('D')) {
                    return 400;
                } else if (nextChar.equals('M')) {
                    return 900;
                }
            }
        }
        return 0;
    }

    static int romanToInt(String roman){
        int total= 0;
        int ttlFromNextChar = 0;

        for(int i = 0; i<roman.length();i++){
            String ch = String.valueOf(roman.charAt(i));
           // System.out.println(roman.charAt(i));
            if(i<roman.length()-1){
                if(ch.equals("I") || ch.equals("X") || ch.equals("C") &&!(i==roman.length())){
                    ttlFromNextChar=checkNextChar(roman.charAt(i),roman.charAt(i+1));
                    if(ttlFromNextChar>0){
                        i++;
                    }
                }
            }

          if(ttlFromNextChar>0){
              total = total + ttlFromNextChar ;
              ttlFromNextChar = 0;

          }else{
              total = total + romanValues.get(ch);
          }
        }
        return total;
    }

}
