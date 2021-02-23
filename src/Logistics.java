//vert steals top col prblem here
//problem with button b24, b15

public class Logistics {
	public static void checkSteal(int row, int col)
	{
		//check corners
		//top right
		if(row <= 2 && col <= 2)
		{
			//hor
			if((GridTracker.grid[row][col + 1] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row][col + 2] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row][col + 3] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row][col + 1] = '+';
				GridTracker.grid[row][col + 2] = '+';
				GUI.findButton(row, col + 1).setBackground(null);
				GUI.findButton(row, col + 2).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			//vert
			if((GridTracker.grid[row + 1][col] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row + 2][col] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row + 3][col] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row + 1][col] = '+';
				GridTracker.grid[row + 2][col] = '+';
				GUI.findButton(row + 1, col).setBackground(null);
				GUI.findButton(row + 2, col).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			//diag
			if((GridTracker.grid[row + 1][col + 1] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row + 2][col + 2] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row + 3][col + 3] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row + 1][col + 1] = '+';
				GridTracker.grid[row + 2][col + 2] = '+';
				GUI.findButton(row + 1, col + 1).setBackground(null);
				GUI.findButton(row + 2, col + 2).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
		}
		//top left
		else if(row <= 2 && col >= 6)
		{
			//hor
			if((GridTracker.grid[row][col - 1] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row][col - 2] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row][col - 3] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row][col - 1] = '+';
				GridTracker.grid[row][col - 2] = '+';
				GUI.findButton(row, col - 1).setBackground(null);
				GUI.findButton(row, col - 2).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			//vert
			if((GridTracker.grid[row + 1][col] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row + 2][col] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row + 3][col] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row + 1][col] = '+';
				GridTracker.grid[row + 2][col] = '+';
				GUI.findButton(row + 1, col).setBackground(null);
				GUI.findButton(row + 2, col).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			//diag
			if((GridTracker.grid[row + 1][col - 1] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row + 2][col - 2] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row + 3][col - 3] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row + 1][col - 1] = '+';
				GridTracker.grid[row + 2][col - 2] = '+';
				GUI.findButton(row + 1, col - 1).setBackground(null);
				GUI.findButton(row + 2, col - 2).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
		}
		//bottom right
		else if(row >= 6 && col <= 2)
		{
			//hor
			if((GridTracker.grid[row][col + 1] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row][col + 2] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row][col + 3] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row][col + 1] = '+';
				GridTracker.grid[row][col + 2] = '+';
				GUI.findButton(row, col + 1).setBackground(null);
				GUI.findButton(row, col + 2).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			//vert
			if((GridTracker.grid[row - 1][col] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row - 2][col] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row - 3][col] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row - 1][col] = '+';
				GridTracker.grid[row - 2][col] = '+';
				GUI.findButton(row - 1, col).setBackground(null);
				GUI.findButton(row - 2, col).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			//diag
			if((GridTracker.grid[row - 1][col + 1] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row - 2][col + 2] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row - 3][col + 3] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row - 1][col + 1] = '+';
				GridTracker.grid[row - 2][col + 2] = '+';
				GUI.findButton(row - 1, col + 1).setBackground(null);
				GUI.findButton(row - 2, col + 2).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
		}
		//bottom left
		else if(row >= 6 && col >= 6)
		{
			//hor
			if((GridTracker.grid[row][col - 1] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row][col - 2] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row][col - 3] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row][col - 1] = '+';
				GridTracker.grid[row][col - 2] = '+';
				GUI.findButton(row, col - 1).setBackground(null);
				GUI.findButton(row, col - 2).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			//vert
			if((GridTracker.grid[row - 1][col] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row - 2][col] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row - 3][col] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row - 1][col] = '+';
				GridTracker.grid[row - 2][col] = '+';
				GUI.findButton(row - 1, col).setBackground(null);
				GUI.findButton(row - 2, col).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			//diag
			if((GridTracker.grid[row - 1][col - 1] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row - 2][col - 2] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row - 3][col - 3] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row - 1][col - 1] = '+';
				GridTracker.grid[row - 2][col - 2] = '+';
				GUI.findButton(row - 1, col - 1).setBackground(null);
				GUI.findButton(row - 2, col - 2).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
		}
		//check sides
		//top
		else if(row <= 2)
		{
			//hor
			if((GridTracker.grid[row][col + 1] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row][col + 2] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row][col + 3] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row][col + 1] = '+';
				GridTracker.grid[row][col + 2] = '+';
				GUI.findButton(row, col + 1).setBackground(null);
				GUI.findButton(row, col + 2).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			if((GridTracker.grid[row][col - 1] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row][col - 2] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row][col - 3] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row][col - 1] = '+';
				GridTracker.grid[row][col - 2] = '+';
				GUI.findButton(row, col - 1).setBackground(null);
				GUI.findButton(row, col - 2).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			//vert
			if((GridTracker.grid[row + 1][col] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row + 2][col] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row + 3][col] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row + 1][col] = '+';
				GridTracker.grid[row + 2][col] = '+';
				GUI.findButton(row + 1, col).setBackground(null);
				GUI.findButton(row + 2, col).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			//diag
			if((GridTracker.grid[row + 1][col - 1] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row + 2][col - 2] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row + 3][col - 3] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row + 1][col - 1] = '+';
				GridTracker.grid[row + 2][col - 2] = '+';
				GUI.findButton(row + 1, col - 1).setBackground(null);
				GUI.findButton(row + 2, col - 2).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			if((GridTracker.grid[row + 1][col + 1] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row + 2][col + 2] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row + 3][col + 3] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row + 1][col + 1] = '+';
				GridTracker.grid[row + 2][col + 2] = '+';
				GUI.findButton(row + 1, col + 1).setBackground(null);
				GUI.findButton(row + 2, col + 2).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			
		}
		//bottom
		else if(row >= 6)
		{
			//hor
			if((GridTracker.grid[row][col + 1] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row][col + 2] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row][col + 3] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row][col + 1] = '+';
				GridTracker.grid[row][col + 2] = '+';
				GUI.findButton(row, col + 1).setBackground(null);
				GUI.findButton(row, col + 2).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			if((GridTracker.grid[row][col - 1] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row][col - 2] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row][col - 3] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row][col - 1] = '+';
				GridTracker.grid[row][col - 2] = '+';
				GUI.findButton(row, col - 1).setBackground(null);
				GUI.findButton(row, col - 2).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			//vert
			if((GridTracker.grid[row - 1][col] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row - 2][col] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row - 3][col] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row - 1][col] = '+';
				GridTracker.grid[row - 2][col] = '+';
				GUI.findButton(row - 1, col).setBackground(null);
				GUI.findButton(row - 2, col).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			//diag
			if((GridTracker.grid[row - 1][col + 1] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row - 2][col + 2] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row - 3][col + 3] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row - 1][col + 1] = '+';
				GridTracker.grid[row - 2][col + 2] = '+';
				GUI.findButton(row - 1, col + 1).setBackground(null);
				GUI.findButton(row - 2, col + 2).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			if((GridTracker.grid[row - 1][col - 1] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row - 2][col - 2] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row - 3][col - 3] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row - 1][col - 1] = '+';
				GridTracker.grid[row - 2][col - 2] = '+';
				GUI.findButton(row - 1, col - 1).setBackground(null);
				GUI.findButton(row - 2, col - 2).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
		}
		//left
		else if(col <= 2)
		{
			//hor
			if((GridTracker.grid[row][col + 1] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row][col + 2] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row][col + 3] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row][col + 1] = '+';
				GridTracker.grid[row][col + 2] = '+';
				GUI.findButton(row, col + 1).setBackground(null);
				GUI.findButton(row, col + 2).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			//vert
			if((GridTracker.grid[row + 1][col] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row + 2][col] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row + 3][col] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row + 1][col] = '+';
				GridTracker.grid[row + 2][col] = '+';
				GUI.findButton(row + 1, col).setBackground(null);
				GUI.findButton(row + 2, col).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			if((GridTracker.grid[row - 1][col] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row - 2][col] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row - 3][col] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row - 1][col] = '+';
				GridTracker.grid[row - 2][col] = '+';
				GUI.findButton(row - 1, col).setBackground(null);
				GUI.findButton(row - 2, col).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			//diag
			if((GridTracker.grid[row - 1][col + 1] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row - 2][col + 2] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row - 3][col + 3] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row - 1][col + 1] = '+';
				GridTracker.grid[row - 2][col + 2] = '+';
				GUI.findButton(row - 1, col + 1).setBackground(null);
				GUI.findButton(row - 2, col + 2).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			if((GridTracker.grid[row + 1][col + 1] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row + 2][col + 2] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row + 3][col + 3] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row + 1][col + 1] = '+';
				GridTracker.grid[row + 2][col + 2] = '+';
				GUI.findButton(row + 1, col + 1).setBackground(null);
				GUI.findButton(row + 2, col + 2).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
		}
		//right
		else if(col >= 6)
		{
			//hor
			if((GridTracker.grid[row][col - 1] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row][col - 2] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row][col - 3] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row][col - 1] = '+';
				GridTracker.grid[row][col - 2] = '+';
				GUI.findButton(row, col - 1).setBackground(null);
				GUI.findButton(row, col - 2).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			//vert
			if((GridTracker.grid[row + 1][col] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row + 2][col] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row + 3][col] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row + 1][col] = '+';
				GridTracker.grid[row + 2][col] = '+';
				GUI.findButton(row + 1, col).setBackground(null);
				GUI.findButton(row + 2, col).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			if((GridTracker.grid[row - 1][col] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row - 2][col] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row - 3][col] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row - 1][col] = '+';
				GridTracker.grid[row - 2][col] = '+';
				GUI.findButton(row - 1, col).setBackground(null);
				GUI.findButton(row - 2, col).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			//diag
			if((GridTracker.grid[row + 1][col - 1] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row + 2][col - 2] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row + 3][col - 3] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row + 1][col - 1] = '+';
				GridTracker.grid[row + 2][col - 2] = '+';
				GUI.findButton(row + 1, col - 1).setBackground(null);
				GUI.findButton(row + 2, col - 2).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			if((GridTracker.grid[row - 1][col - 1] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row - 2][col - 2] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row - 3][col - 3] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row - 1][col - 1] = '+';
				GridTracker.grid[row - 2][col - 2] = '+';
				GUI.findButton(row - 1, col - 1).setBackground(null);
				GUI.findButton(row - 2, col - 2).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
		}
		//check middle
		else
		{
			//hor steal
			if((GridTracker.grid[row][col + 1] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row][col + 2] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row][col + 3] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row][col + 1] = '+';
				GridTracker.grid[row][col + 2] = '+';
				GUI.findButton(row, col + 1).setBackground(null);
				GUI.findButton(row, col + 2).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			if((GridTracker.grid[row][col - 1] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row][col - 2] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row][col - 3] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row][col - 1] = '+';
				GridTracker.grid[row][col - 2] = '+';
				GUI.findButton(row, col - 1).setBackground(null);
				GUI.findButton(row, col - 2).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			//vert steal
			if((GridTracker.grid[row + 1][col] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row + 2][col] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row + 3][col] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row + 1][col] = '+';
				GridTracker.grid[row + 2][col] = '+';
				GUI.findButton(row + 1, col).setBackground(null);
				GUI.findButton(row + 2, col).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			if((GridTracker.grid[row - 1][col] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row - 2][col] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row - 3][col] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row - 1][col] = '+';
				GridTracker.grid[row - 2][col] = '+';
				GUI.findButton(row - 1, col).setBackground(null);
				GUI.findButton(row - 2, col).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			//l->h diag steal
			if((GridTracker.grid[row - 1][col + 1] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row - 2][col + 2] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row - 3][col + 3] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row - 1][col + 1] = '+';
				GridTracker.grid[row - 2][col + 2] = '+';
				GUI.findButton(row - 1, col + 1).setBackground(null);
				GUI.findButton(row - 2, col + 2).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			if((GridTracker.grid[row + 1][col - 1] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row + 2][col - 2] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row + 3][col - 3] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row + 1][col - 1] = '+';
				GridTracker.grid[row + 2][col - 2] = '+';
				GUI.findButton(row + 1, col - 1).setBackground(null);
				GUI.findButton(row + 2, col - 2).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			//h->l diag steal
			if((GridTracker.grid[row + 1][col + 1] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row + 2][col + 2] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row + 3][col + 3] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row + 1][col + 1] = '+';
				GridTracker.grid[row + 2][col + 2] = '+';
				GUI.findButton(row + 1, col + 1).setBackground(null);
				GUI.findButton(row + 2, col + 2).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
			if((GridTracker.grid[row - 1][col - 1] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row - 2][col - 2] != GridTracker.grid[row][col] && GridTracker.grid[row][col] != '+') && (GridTracker.grid[row - 3][col - 3] == GridTracker.grid[row][col]))
			{
				GridTracker.grid[row - 1][col - 1] = '+';
				GridTracker.grid[row - 2][col - 2] = '+';
				GUI.findButton(row - 1, col - 1).setBackground(null);
				GUI.findButton(row - 2, col - 2).setBackground(null);
				if(!GUI.p1Turn)
				{
					GUI.pOneSteals ++;
					GUI.pOneStealsLabel.setText("Player One Steals: " + GUI.pOneSteals);
				}
				else
				{
					GUI.pTwoSteals ++;
					GUI.pTwoStealsLabel.setText("Player Two Steals: " + GUI.pTwoSteals);
				}		
			}
		}
	}
	static int resetCounter = 0;
	public static void checkWin(int row, int col)
	{
		//hor check- loop through row and check if matches input symbol 4+ consecutive times
		int horCount = 0;
		for(int i = 0; i <= 8; i++)
		{
			if(GridTracker.grid[row][i] == GridTracker.grid[row][col])
				horCount ++;
			else
				horCount = 0;
			
			if(horCount >= 5)
			{
				if(!GUI.p1Turn)
				{
					GUI.pOneWins ++;
					GUI.pOneWins -= resetCounter;
					//System.out.println("Increment p 1 hor rc: " + resetCounter);
					GUI.pOneScore.setText("Player One Score: " + GUI.pOneWins);
				}
				else
				{
					GUI.pTwoWins ++;
					//System.out.println("Increment p 2 hor");
					GUI.pTwoScore.setText("Player Two Score: " + GUI.pTwoWins);
				}
				GUI.endFrame.setVisible(true);
				i = 18;
			}
				
		}
		
		//vert check- loop through col and check if matches input symbol 4+ consecutive times
		int vertCount = 0;
		for(int j = 0; j <= 8; j++)
		{
			if(GridTracker.grid[j][col] == GridTracker.grid[row][col])
				vertCount ++;
			else
				vertCount = 0;
			
			if(vertCount >= 5)
			{
				if(!GUI.p1Turn)
				{
					GUI.pOneWins ++;
					//System.out.println("Increment p1 Vert");
					GUI.pOneScore.setText("Player One Score: " + GUI.pOneWins);
				}
				else
				{
					GUI.pTwoWins ++;
					//System.out.println("Increment p2 Vert");
					GUI.pTwoScore.setText("Player Two Score: " + GUI.pTwoWins);
				}
				GUI.endFrame.setVisible(true);
				j = 18;
			}
				
		}
		
		//diag l -> h check
		int diagHLCount = 0; 
		int startRow = row;
		int startCol = col;
		//find the starting diag
		for(int k = 0; k <= 8; k++)
		{
			if(startRow == 0 || startCol == 0)
			{
				k = 8;
			}
			else
			{
				startRow --;
				startCol --;
			}
		}
		//System.out.println("Row: " + startRow + " Col: " + startCol);
		//loop through l -> h diag and check if input symbol matches 4+ times
		int start;
		if(startRow > startCol)
			start = startRow;
		else
			start = startCol;
		for(int l = start; l <= 8; l++)
		{
			if(GridTracker.grid[row][col] == GridTracker.grid[startRow][startCol])
				diagHLCount ++;
			else
				diagHLCount = 0;
			if(diagHLCount >= 5)
			{
				if(!GUI.p1Turn)
				{
					GUI.pOneWins ++;
					//System.out.println("Increment p one diag HL");
					GUI.pOneScore.setText("Player One Score: " + GUI.pOneWins);
				}
				else
				{
					GUI.pTwoWins ++;
					//System.out.println("Increment p two diag HL");
					GUI.pTwoScore.setText("Player Two Score: " + GUI.pTwoWins);
				}
				GUI.endFrame.setVisible(true);
				l = 18;
			}
				
			startRow++;
			startCol++;
		}
		
		
		
		
		//diag h -> l check
		startRow = row;
		startCol = col;
		int diagLHCount = 0;
		//find starting row and col values
		if(!((startRow >= 6 && startCol >= 6) || (startRow < 2 && startCol < 2)))
		{
			for(int m = 0; m <= 8; m++)
			{
				if(startRow == 0)
				{
					m = 8;
				}
				else if(startCol == 8 || startRow == 8)
				{
					m = 8;
				}
				else
				{
					startRow --;
					startCol ++;
				}
			}
			
			//set limits so that it can't get out of bounds rows or cols
			if(startRow == 8)
			{
				start = startCol;
				for(int n = start; n < 9; n++)
				{
					if(startRow < 0 || startCol < 0)
					{
						n = 18;
					}
					else
					{
					if(GridTracker.grid[row][col] == GridTracker.grid[startRow][startCol])
						diagHLCount ++;
					else
						diagHLCount = 0;
					if(diagHLCount >= 5)
					{
						if(!GUI.p1Turn)
						{
							GUI.pOneWins ++;
							//System.out.println("Increment p 1 diag lh");
							GUI.pOneScore.setText("Player One Score: " + GUI.pOneWins);
						}
						else
						{
							GUI.pTwoWins ++;
							//System.out.println("Increment p 2 diag lh");
							GUI.pTwoScore.setText("Player Two Score: " + GUI.pTwoWins);
						}
						GUI.endFrame.setVisible(true);
						n = 18;
					}
					startRow--;
					startCol++;
					}
				}
			}
			else
			{
				if(startRow > startCol)
					start = startRow;
				else
					start = startRow;
				if(startCol == 8)
				{
					start = startRow;
				}
				for(int n = start; n < 9; n++)
				{
					if(startRow < 0 || startCol < 0)
					{
						n = 18;
					}
					else
					{
					if(GridTracker.grid[row][col] == GridTracker.grid[startRow][startCol])
						diagHLCount ++;
					else
						diagHLCount = 0;
					if(diagHLCount >= 5)
					{
						if(!GUI.p1Turn)
						{
							GUI.pOneWins ++;
							//System.out.println("Incrememnt p one bottom");
							GUI.pOneScore.setText("Player One Score: " + GUI.pOneWins);
						}
						else
						{
							GUI.pTwoWins ++;
							//System.out.println("Increment p two bottom");
							GUI.pTwoScore.setText("Player Two Score: " + GUI.pTwoWins);
						}
						GUI.endFrame.setVisible(true);
					}
					startRow++;
					startCol--;
					}
				}
			}
			
		}
		
		
	}
}
