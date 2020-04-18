package Math;

import java.util.regex.Pattern;

public class Solution0013 {
	
//	public int romanToInt(String s) {
//		int result=0;
//		int[] ns = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
//        String[] ss = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
//        
//        
//        for(int i=0;i<13;i++){
//        	String pattern = "^" + ss[i] + ".*";
//        	while(Pattern.matches(pattern, s)){
//        		result = result + ns[i];
//        		s = s.substring(ss[i].length(),s.length());
//        	}
//        }
//        return result;
//    }
	
//	public int romanToInt(String s) {
//		int result=0;
//		int[] ns = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
//        String[] ss = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
//        int[] ls = new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1};
//        int start = 0;
//        int end = s.length();
//        for(int i=0;i<13;i++){
//        	if(start >= end){
//        		break;
//        	}
//        	while(start + ls[i] <= end && ss[i].equals(s.substring(start,start + ls[i]))){
//        		result = result + ns[i];
//        		start = start + ls[i];
//        		if(start >= end){
//        			break;
//        		}
//        	}
//        }
//        return result;
//    }
	
//	public int romanToInt(String s) {
//        int[] roman = {0,0,100,500,0,0,0,0,1,0,0,50,1000,0,0,0,0,0,0,0,0,5,0,10};
//        int res = 0;
//        for (int i=0; i<s.length()-1; i++){
//            if (roman[s.charAt(i)-65]<roman[s.charAt(i+1)-65]){
//                res-=roman[s.charAt(i)-65];
//            }
//            else res+=roman[s.charAt(i)-65];
//        }
//        res+=roman[s.charAt(s.length()-1)-65];
//        return res;
//    }
	
	public int romanToInt(String s) {
		int result=0;
		int[] roman = {0,0,100,500,0,0,0,0,1,0,0,50,1000,0,0,0,0,0,0,0,0,5,0,10};
        int l = s.length();
        for(int i=0;i<l-1;i++){
        	if(roman[s.charAt(i)-65] >= roman[s.charAt(i+1)-65]){
        		result = result + roman[s.charAt(i)-65];
        	} else {
        		result = result - roman[s.charAt(i)-65];
			}
        }
        result = result + roman[s.charAt(l-1)-65];
        return result;
    }

	public static void main(String[] args) {
		Solution0013 solution = new Solution0013();
		System.out.println(solution.romanToInt("III"));	
	}

}
