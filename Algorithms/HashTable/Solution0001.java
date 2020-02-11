package HashTable;

import java.util.HashMap;
import java.util.Map;

public class Solution0001 {
	
	public int[] twoSum(int[] nums, int target){
		int[] result = new int[2];
		Map<Integer, Integer> numsMap = new HashMap<Integer,Integer>();
		numsMap.put(nums[0], 0);
		for(int i=1;i<nums.length;i++){
			if(numsMap.containsKey(target - nums[i])){
				result[0] = numsMap.get(target - nums[i]);
				result[1] = i;
				return result;
			}
			numsMap.put(nums[i], i);
		}
		return result;
	}
}