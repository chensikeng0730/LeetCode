package HashTable;

import java.util.HashMap;
import java.util.Map;

public class Solution0003 {
	
	public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length() == 0){
        	return 0;
        }
        int result = 0,n=s.length();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int j=0,i=0;j<n;j++){
        	if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)), i);
        	}
        	map.put(s.charAt(j), j+1);
        	result = Math.max(j+1-i, result);
        }
        return result;
    }
	

	
	public static void main(String[] args) {
		Solution0003 a = new Solution0003();
		System.out.println(a.lengthOfLongestSubstring("dvdf"));
	}
}
