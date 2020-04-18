package Math;

public class Solution0042 {
	
	public int trap(int[] height) {
		int len = height.length;
		if(len<3){
			return 0;
		}
		
		int[] left_height = new int[len];
		int[] right_height = new int[len];
		int left_max = 0;
		int right_max = 0;
		int result = 0;
		
		for(int i=1; i<len; i++){
			if(left_max < height[i-1]){
				left_max = height[i-1];
			}
			left_height[i] = left_max;
		}
		
		for(int i=len-2; i>=0; i--){
			if(right_max < height[i+1]){
				right_max = height[i+1];
			}
			right_height[i] = right_max;
		}
		
		for(int i=1; i<len-1; i++){
			int temp = Math.min(right_height[i], left_height[i]) - height[i];
			if(temp>0){
				result = result + temp;
			}
		}
        return result;
    }

	public static void main(String[] args) {
		Solution0042 solution = new Solution0042();
		System.out.println(solution.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
	}

}
