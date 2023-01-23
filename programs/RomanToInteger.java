package programs;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(getInteger("MCMXCIV"));


    }

    static int getInteger(String roman){
        int number= 0;
        HashMap<String,Integer> map = getMap();
        for(int i = 0; i<roman.length();i++){
            String ch = String.valueOf(roman.charAt(i));
            number = number + map.get(ch);
        }
        return number;
    }

    static   HashMap<String,Integer> getMap(){
        HashMap<String,Integer> romanMap = new HashMap<String, Integer>();
        romanMap.put("I",1);
        romanMap.put("V",5);
        romanMap.put("X",10);
        romanMap.put("L",50);
        romanMap.put("C",100);
        romanMap.put("D",500);
        romanMap.put("M",1000);
        return romanMap;
    }


}
