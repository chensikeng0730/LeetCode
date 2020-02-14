package HashTable;

import java.util.HashSet;
import java.util.Set;

public class Solution0036 {
	
	public boolean isValidSudoku(char[][] board) {
		int x;
		int y;
		//每次循环取第i行，第i列，第i个(按顺序从左到右、从上到下分成九个方块)集合是否有重复
        for(int i=0;i<9;i++){
        	Set<Character> row = new HashSet<Character>();
        	Set<Character> col = new HashSet<Character>();
        	Set<Character> cube = new HashSet<Character>();
        	for(int j=0;j<9;j++){
        		if('.' != board[i][j] && !row.add(board[i][j]))
        			return false;
        		if('.' != board[j][i] && !col.add(board[j][i]))
        			return false;
        		x = i/3*3 + j%3;
        		y = i%3*3 + j/3;
        		if('.' != board[x][y] && !cube.add(board[x][y]))
        			return false;
        	}
        }
        return true;
    }

}
