package Math;

public class Solution0012 {
	
//	public String intToRoman(int num) {
//        String result1 = "";
//        String result2 = "";
//        String result3 = "";
//        String result4 = "";
//        int temp = num%5;
//        if(temp<=3){
//        	for(int i=0;i<temp;i++){
//        		result1 = result1 + "I";
//        	}
//        } else if(temp==4){
//        	result1 = result1 + "I";
//        }
//        temp = num%10;
//        if(temp == 4){
//        	result1 = result1 + "V";
//        } else if(temp == 9){
//        	result1 = result1 + "X";
//        } else if(temp > 4){
//        	result1 = "V" + result1;
//        }
//        if(num >= 10){
//        	num = num/10;
//            temp = num%5;
//            if(temp<=3){
//            	for(int i=0;i<temp;i++){
//            		result2 = "X" + result2;
//            	}
//            } else if(temp==4){
//            	result2 = "X" + result2;
//            }
//            temp = num%10;
//            if(temp == 4){
//            	result2 = result2 + "L";
//            } else if(temp == 9){
//            	result2 = result2 + "C";
//            } else if(temp > 4){
//            	result2 = "L" + result2;
//            }
//            if(num >= 10){
//            	num = num/10;
//                temp = num%5;
//                if(temp<=3){
//                	for(int i=0;i<temp;i++){
//                		result3 = "C" + result3;
//                	}
//                } else if(temp==4){
//                	result3 = "C" + result3;
//                }
//                temp = num%10;
//                if(temp == 4){
//                	result3 = result3 + "D";
//                } else if(temp == 9){
//                	result3 = result3 + "M";
//                } else if(temp > 4){
//                	result3 = "D" + result3;
//                }
//                if(num >= 10){
//                	num = num/10;
//                	for(int i=0;i<num;i++){
//                		result4 = "M" + result4;
//                	}
//                }
//            }
//        }
//        return result4 + result3 + result2 + result1;
//    }
	public String intToRoman(int num) {
		int[] ns = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] ss = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuffer result = new StringBuffer();
        for(int i=0;i<13;i++){
        	while(num-ns[i] >= 0){
        		result.append(ss[i]);
        		num = num-ns[i];
        	}
        }
		return result.toString();
	}

	public static void main(String[] args) {
		
		Solution0012 solution = new Solution0012();
		System.out.println(solution.intToRoman(1994));
	}

}
