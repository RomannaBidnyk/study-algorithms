package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class FindTheDifference_389 {

    /**
     * v1 Set
     */
    public static char findTheDifference(String s, String t) {
        Set<Character> set = new HashSet<>();
        for(char letter : (s+t).toCharArray()){
            if(!set.add(letter)){
                set.remove(letter);
            }
        }
        return set.iterator().next();
    }

    //TODO diff approaches
}
