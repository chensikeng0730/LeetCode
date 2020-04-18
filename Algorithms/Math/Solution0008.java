package Math;

public class Solution0008 {
	
	public int myAtoi(String str) {
		if(str == null || str.equals("")){
			return 0;
		}
		
		str = str.trim();
		int len = str.length();
		if(len == 0){
			return 0;
		}
		StringBuffer sb = new StringBuffer();
		
		char c = str.charAt(0);
		if(c=='-' || c=='+'){
			sb.append(c);
			str = str.substring(1,len);
			len = str.length();
		}
		
		int start = 0;
		for(int i=0;i<len;i++){
			c = str.charAt(i);
			if(c==48){
				start++;
			}else{
				break;
			}
		}
		
		for(int i=start;i<len;i++){
			c = str.charAt(i);
			if(c>=48 && c<=57){
				sb.append(c);
			}else{
				break;
			}
		}
		
		String numStr = sb.toString();
		System.out.println(numStr);
		int numStrLen = numStr.length();
		if(numStrLen==0 || numStr.equals("+") || numStr.equals("-")){
			return 0;
		}
		if(numStrLen>11){
			if(numStr.charAt(0)=='-'){
				return Integer.MIN_VALUE;
			}
			return Integer.MAX_VALUE;
		}
		
		Long num = Long.valueOf(numStr);
		if(num>Integer.MAX_VALUE){
			return Integer.MAX_VALUE;
		} else if (num<Integer.MIN_VALUE){
			return Integer.MIN_VALUE;
		}
		return num.intValue();
    }

	public static void main(String[] args) {
		Solution0008 solution = new Solution0008();
		System.out.println(solution.myAtoi("       "));
	}

}
