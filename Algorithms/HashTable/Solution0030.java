package HashTable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Solution0030 {
	
	public List<Integer> findSubstring(String s, String[] words) {
		List<Integer> list = new ArrayList<Integer>();
	
		if(s == null || s.length() == 0 || words == null || words.length == 0 || s.length() < words[0].length() * words.length){
			return list;
		}
		
		int sLen = s.length(), wLen = words[0].length(), wsLen = words.length;
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String word : words){
			if(map.containsKey(word)){
				map.put(word, map.get(word) + 1);
			} else{
				map.put(word, 1);
			}
		}
		HashMap<String, Integer> tempMap;
		for(int i=0;i<wLen;i++){
			int left = i,right = i,window = 0;
			tempMap = new HashMap<>(map);
			while(right + (wsLen-window) * wLen <= sLen){
				String sub = s.substring(right,right+wLen);
				if(tempMap.containsKey(sub)){
					int n = tempMap.get(sub);
					
					if(n>0){
						tempMap.put(sub, n-1);
						window = window + 1;
					} else{
						String subTemp = s.substring(left,left+wLen);
						while(!subTemp.equals(sub)){
							tempMap.put(subTemp, tempMap.get(subTemp) + 1);
							window = window - 1;
							left = left + wLen;
							subTemp = s.substring(left,left+wLen);
						}
						left = left + wLen;
					}
					if(window == wsLen){
						list.add(left);
						tempMap.put(s.substring(left,left+wLen), 1);
						window = wsLen - 1;
						left = left + wLen;
					}
				} else{
					tempMap = new HashMap<>(map);
					window = 0;
					left = right + wLen;
				}
				right = right + wLen;
			}
		}
		Collections.sort(list);
        return list;
    }

	public static void main(String[] args) {
		Solution0030 solution = new Solution0030();
		System.out.println(solution.findSubstring("barfoothefoobarman",new String[]{"foo","bar"}));
//		System.out.println(solution.findSubstring("wordgoodgoodgoodbestword",new String[]{"word","good","best","good"}));	

	}

}
