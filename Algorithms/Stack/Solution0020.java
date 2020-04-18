package Stack;

import java.util.ArrayList;
import java.util.List;

public class Solution0020 {
	
	public boolean isValid(String s) {
		if(s==null){
			return false;
		}
		char[] charArray = {'(',')','[',']','{','}'};
		
		List<Character> list = new ArrayList<Character>();
		int len = s.length();
		int size = list.size();
		
		if(len == 0){
			return true;
		}
		
		for(int i=0;i<len;i++){
			char c = s.charAt(i);
			if(size>0){
				if(c==')' && list.get(size-1)=='('){
					list.remove(size-1);
					size--;
				} else if(c==']' && list.get(size-1)=='['){
					list.remove(size-1);
					size--;
				} else if(c=='}' && list.get(size-1)=='{'){
					list.remove(size-1);
					size--;
				} else {
					list.add(c);
					size++;
				}
			} else{
				if(c==')' || c=='}' || c==']'){
					return false;
				}
				list.add(c);
				size++;
			}
			
		}

		if(size != 0){	
			return false;
		}
		
        return true;
    }
	
	public static void main(String[] args) {
		Solution0020 solution = new Solution0020();
		System.out.println(solution.isValid("(]"));

	}

}
