package Math;

public class Solution0007 {
	
	public int reverse(int x) {
        long y = 0;
        while(x != 0){
        	int temp = x % 10;
        	y = 10 * y + temp;
        	x = x / 10;
        }
        if(y>Integer.MAX_VALUE || y<Integer.MIN_VALUE){
        	return 0;
        }
        int result = (int) y;
        return result;
    }

	public static void main(String[] args) {
		Solution0007 solution = new Solution0007();
		System.out.println(solution.reverse(1534236469));
	}

}
