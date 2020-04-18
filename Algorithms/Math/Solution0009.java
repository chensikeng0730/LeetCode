package Math;

public class Solution0009 {
	
	public boolean isPalindrome(int x) {
		if(x < 0){
			return false;
		}
		boolean result = true;
		String s = Integer.valueOf(x).toString();
		for(int i = 0,j = s.length() -1;i<=j;i++,j--){
			if(s.charAt(i) != s.charAt(j)){
				result = false;
				break;
			}
		}
        return result;
    }

	public static void main(String[] args) {
		Solution0009 solution = new Solution0009();
		System.out.println(solution.isPalindrome(1331));

	}

}
