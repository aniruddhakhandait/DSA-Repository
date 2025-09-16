
import java.util.*;
import java.util.HashMap;
import java.util.Map;


public class LongestSubstring {
         public int lenghtOfLongestSubstring(String s){
            
            Map<Character,Integer> map = new HashMap<>();
            int left = 0 , maxlenght = 0;

            for (int right =0 ; right < s.length(); right ++){
                   char c = s.charAt(right);
               

            // If you found duplicate move the left pointer
            if(map.containsKey(c)&& map.get(c) >= left){
                   left= map.get(c) + 1;
            } 
             map.put (c, right);
             maxlenght = Math.max (maxlenght,right-left + 1);
         
            }
             return maxlenght;
   

         }

        
        public static void main (String[] args){
              LongestSubstring solver = new LongestSubstring();
              String s = "pwwkew";
              System.out.println(solver.lengthOfLongestSubstring(s));
        }
}