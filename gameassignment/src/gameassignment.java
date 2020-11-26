import java.awt.*;
import java.util.HashSet;
import java.util.Set;

class Board { 
	//This object stores state of the game
	char[][] mainBoard = new char[8][8];
	 void init() 
	 {
		 for(int x=0; x<8; x++) {
			 for(int y=0; y<8; y++) {
				 mainBoard[y][x] = '' ;
				 
			 }
		 }
		 mainBoard[3][3] = 'B';
		 mainBoard[3][4] = 'B';
		 mainBoard[3][4] = 'W';
		 mainBoard[4][3] = 'W';
		 
	 }
	 //Check if a move is valid, returns true if the move can be made boolean checkMove(int x, int y, char moveColor)
	 {
		 char oppoColor;
		 if (moveColor == 'B') {
			 oppoColor = 'W';
		 }
		 else
		 {
			 oppoColor = 'B'; 
		 }
		 int xMove, yMove;
		 //looks at the surrounding 3X3 square of the chosen place 
		 for ( int yVar = -1; yVar <=1; yVar++) {
			 for(int xVar= -1; xVar <=1; xVar++) {
				 xMove = x + xVar;
				 ymove = y + yVar;
				 if((xMove >=0 & xMove <= 7 & ymove >=0 & yMove <= 7)&& mainBoard[yMove][xMove]==oppoColor) {
					 //if it find something, continue in that direction 
					 while(true) {
						 xMove += xVar;
						 yMove += yVar;
						 if(xMove < 0 | xMove > 7 | yMove < 0 | yMove >7) {
							 break; }
	
						 else if (maibBoard[yMove][xMove] == ''){
							 break;
						 }
						 else if (mainBoard[yMove][xMove]==moveColor) {
							 return true;
						 }
						 
					 }
				 }
			 }
		 }
		 return false;
	 }
}