package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution0018 {
	
	public List<List<Integer>> fourSum(int[] nums, int target) {
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		//数组长度小于4就输出空集
		if(nums.length < 4){
			return result;
		}
		
		Arrays.sort(nums);	//从小到大排序

		int n = nums.length;
		for(int i = 0;i<n-3;i++) {
			//nums[i]与最大三个数的和小于目标就忽略这次循环
			if(nums[i] + nums[n-1]  + nums[n-2] + nums[n-3]< target){
				continue;
			}
			//nums[i]与最小三个数的和大于目标就结束循环
			if(nums[i] + nums[i+1] + nums[i+2] + nums[i+3] > target){
				break;
			}
			
			for(int j=i+1;j<n-2;j++){
				//nums[i]与nums[j]与最大两个数的和小于目标就忽略这次循环
				if(nums[i] + nums[j] + nums[n-1] + nums[n-2] < target){
					continue;
				}
				//nums[i]与nums[j]与最小两个数的和大于目标就结束循环
				if(nums[i] + nums[j] + nums[j+1] + nums[j+2] > target){
					break;
				}
				
				//当确定i和j时，问题转化为求2数和
				int targetTemp = target - nums[i] -nums[j];		//2数和的临时目标		
				for(int x=j+1,y=n-1;x<y;){	//x从剩下数的头取，y从尾取
					int temp = targetTemp - nums[x] - nums[y];
					if(temp == 0){
						List<Integer> resultItem = new ArrayList<>();
						resultItem.add(nums[i]);
						resultItem.add(nums[j]);
						resultItem.add(nums[x]);
						resultItem.add(nums[y]);
						result.add(resultItem);
						
						while(x+1<y && nums[x] == nums[x+1]){	//防止结果重复
							x++;
						}
						x++;
						while(x<y-1 && nums[y] == nums[y-1]){	//防止结果重复
							y--;
						}
						y--;
					} else if(temp > 0){
						while(x+1<y && nums[x] == nums[x+1]){	//防止结果重复
							x++;
						}
						x++;
					}else{
						while(x<y-1 && nums[y] == nums[y-1]){	//防止结果重复
							y--;
						}
						y--;
					}
				}
				while(j+1<n-2 && nums[j] == nums[j+1]){		//防止结果重复
					j++;
				}
			}
			while(i+1<n-3 && nums[i] == nums[i+1]){		//防止结果重复
				i++;
			}
		}
		return result;
    }

	public static void main(String[] args) {
		Solution0018 solution = new Solution0018();
		int[] nums = {-3,-2,-1,0,0,1,2,3};
		List<List<Integer>> result = solution.fourSum(nums, 0);
		System.out.println(result);
	}

}
