import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener
{
	static boolean p1Turn = true;
	static int pOneSteals = 0;
	static int pTwoSteals = 0; 
	static int pOneWins = 0;
	static int pTwoWins = 0;
	private JFrame frame = new JFrame();
	static JFrame endFrame = new JFrame();
	private JPanel panel = new JPanel();
	private JPanel gameOverScreen = new JPanel();
	static JButton resetButton = new JButton("Play Again");
	private JLabel gameOverMessage = new JLabel("     Game Over");
	static JLabel pOneScore = new JLabel("Player One Score: " + pOneWins);
	static JLabel pTwoScore = new JLabel("Player Two Score: " + pTwoWins);
	static JLabel pOneStealsLabel = new JLabel("Player One Steals: " + pOneSteals);
	static JLabel pTwoStealsLabel = new JLabel("Player Two Steals: " + pTwoSteals);
	private JPanel scoreboard = new JPanel();
	static ArrayList<JButton> buttons = new ArrayList<JButton>();
	

			static JButton b00 = new JButton("+");
			static JButton b01 = new JButton("+");
			static JButton b02 = new JButton("+");
			static JButton b03 = new JButton("+");
			static JButton b04 = new JButton("+");
			static JButton b05 = new JButton("+");
			static JButton b06 = new JButton("+");
			static JButton b07 = new JButton("+");
			static JButton b08 = new JButton("+");
			
			static JButton b10 = new JButton("+");
			static JButton b11 = new JButton("+");
			static JButton b12 = new JButton("+");
			static JButton b13 = new JButton("+");
			static JButton b14 = new JButton("+");
			static JButton b15 = new JButton("+");
			static JButton b16 = new JButton("+");
			static JButton b17 = new JButton("+");
			static JButton b18 = new JButton("+");
			
			static JButton b20 = new JButton("+");
			static JButton b21 = new JButton("+");
			static JButton b22 = new JButton("+");
			static JButton b23 = new JButton("+");
			static JButton b24 = new JButton("+");
			static JButton b25 = new JButton("+");
			static JButton b26 = new JButton("+");
			static JButton b27 = new JButton("+");
			static JButton b28 = new JButton("+");
			
			static JButton b30 = new JButton("+");
			static JButton b31 = new JButton("+");
			static JButton b32 = new JButton("+");
			static JButton b33 = new JButton("+");
			static JButton b34 = new JButton("+");
			static JButton b35 = new JButton("+");
			static JButton b36 = new JButton("+");
			static JButton b37 = new JButton("+");
			static JButton b38 = new JButton("+");
			
			static JButton b40 = new JButton("+");
			static JButton b41 = new JButton("+");
			static JButton b42 = new JButton("+");
			static JButton b43 = new JButton("+");
			static JButton b44 = new JButton("+");
			static JButton b45 = new JButton("+");
			static JButton b46 = new JButton("+");
			static JButton b47 = new JButton("+");
			static JButton b48 = new JButton("+");
			
			static JButton b50 = new JButton("+");
			static JButton b51 = new JButton("+");
			static JButton b52 = new JButton("+");
			static JButton b53 = new JButton("+");
			static JButton b54 = new JButton("+");
			static JButton b55 = new JButton("+");
			static JButton b56 = new JButton("+");
			static JButton b57 = new JButton("+");
			static JButton b58 = new JButton("+");
			
			static JButton b60 = new JButton("+");
			static JButton b61 = new JButton("+");
			static JButton b62 = new JButton("+");
			static JButton b63 = new JButton("+");
			static JButton b64 = new JButton("+");
			static JButton b65 = new JButton("+");
			static JButton b66 = new JButton("+");
			static JButton b67 = new JButton("+");
			static JButton b68 = new JButton("+");
			
			static JButton b70 = new JButton("+");
			static JButton b71 = new JButton("+");
			static JButton b72 = new JButton("+");
			static JButton b73 = new JButton("+");
			static JButton b74 = new JButton("+");
			static JButton b75 = new JButton("+");
			static JButton b76 = new JButton("+");
			static JButton b77 = new JButton("+");
			static JButton b78 = new JButton("+");
			
			static JButton b80 = new JButton("+");
			static JButton b81 = new JButton("+");
			static JButton b82 = new JButton("+");
			static JButton b83 = new JButton("+");
			static JButton b84 = new JButton("+");
			static JButton b85 = new JButton("+");
			static JButton b86 = new JButton("+");
			static JButton b87 = new JButton("+");
			static JButton b88 = new JButton("+");
			

	
	public static JButton findButton(int row, int col)
	{
		switch(row)
		{
		case 0: 
			switch(col)
			{
			case 0:
				return b00;
			case 1:
				return b01;
			case 2:
				return b02;
			case 3: 
				return b03;
			case 4:
				return b04;
			case 5:
				return b05;
			case 6:
				return b06;
			case 7:
				return b07;
			case 8:
				return b08;
			}
			break;
		case 1:
			switch(col)
			{
			case 0:
				return b10;
			case 1:
				return b11;
			case 2:
				return b12;
			case 3: 
				return b13;
			case 4:
				return b14;
			case 5:
				return b15;
			case 6:
				return b16;
			case 7:
				return b17;
			case 8:
				return b18;
			}
			break;
		case 2: 
			switch(col)
			{
			case 0:
				return b20;
			case 1:
				return b21;
			case 2:
				return b22;
			case 3: 
				return b23;
			case 4:
				return b24;
			case 5:
				return b25;
			case 6:
				return b26;
			case 7:
				return b27;
			case 8:
				return b28;
			}
			break;
		case 3:
			switch(col)
			{
			case 0:
				return b30;
			case 1:
				return b31;
			case 2:
				return b32;
			case 3: 
				return b33;
			case 4:
				return b34;
			case 5:
				return b35;
			case 6:
				return b36;
			case 7:
				return b37;
			case 8:
				return b38;
			}
			break;
		case 4: 
			switch(col)
			{
			case 0:
				return b40;
			case 1:
				return b41;
			case 2:
				return b42;
			case 3: 
				return b43;
			case 4:
				return b44;
			case 5:
				return b45;
			case 6:
				return b46;
			case 7:
				return b47;
			case 8:
				return b48;
			}
			break;
		case 5:
			switch(col)
			{
			case 0:
				return b50;
			case 1:
				return b51;
			case 2:
				return b52;
			case 3: 
				return b53;
			case 4:
				return b54;
			case 5:
				return b55;
			case 6:
				return b56;
			case 7:
				return b57;
			case 8:
				return b58;
			}
			break;
		case 6:
			switch(col)
			{
			case 0:
				return b60;
			case 1:
				return b61;
			case 2:
				return b62;
			case 3: 
				return b63;
			case 4:
				return b64;
			case 5:
				return b65;
			case 6:
				return b66;
			case 7:
				return b67;
			case 8:
				return b68;
			}
			break;
		case 7:
			switch(col)
			{
			case 0:
				return b70;
			case 1:
				return b71;
			case 2:
				return b72;
			case 3: 
				return b73;
			case 4:
				return b74;
			case 5:
				return b75;
			case 6:
				return b76;
			case 7:
				return b77;
			case 8:
				return b78;
			}
			break;
		case 8:
			switch(col)
			{
			case 0:
				return b80;
			case 1:
				return b81;
			case 2:
				return b82;
			case 3: 
				return b83;
			case 4:
				return b84;
			case 5:
				return b85;
			case 6:
				return b86;
			case 7:
				return b87;
			case 8:
				return b88;
			}
			break;
		}
		return null;
	}
	public static void ifPressed(JButton b, int row, int col)
	{
		if(p1Turn && GridTracker.grid[row][col] == '+')
		{
			b.setBackground(Color.YELLOW);
			GridTracker.grid[row][col] = '1';
			p1Turn = false;
		}
		else if(GridTracker.grid[row][col] == '+')
		{
			b.setBackground(Color.RED);
			GridTracker.grid[row][col] = '2';
			p1Turn = true;
		}
		else
		{
			//display error message- probably through setText with instructions label
		}
			
	Logistics.checkWin(row, col);
	Logistics.checkSteal(row, col);
//	if(Logistics.gameOver)
//	{
//		panel.close();
//	}
	}
	public GUI()
	{
		buttons.add(b00);
		buttons.add(b01);
		buttons.add(b02);
		buttons.add(b03);
		buttons.add(b04);
		buttons.add(b05);
		buttons.add(b06);
		buttons.add(b07);
		buttons.add(b08);
		
		buttons.add(b10);
		buttons.add(b11);
		buttons.add(b12);
		buttons.add(b13);
		buttons.add(b14);
		buttons.add(b15);
		buttons.add(b16);
		buttons.add(b17);
		buttons.add(b18);
		
		buttons.add(b20);
		buttons.add(b21);
		buttons.add(b22);
		buttons.add(b23);
		buttons.add(b24);
		buttons.add(b25);
		buttons.add(b26);
		buttons.add(b27);
		buttons.add(b28);
		
		buttons.add(b30);
		buttons.add(b31);
		buttons.add(b32);
		buttons.add(b33);
		buttons.add(b34);
		buttons.add(b35);
		buttons.add(b36);
		buttons.add(b37);
		buttons.add(b38);
		
		buttons.add(b40);
		buttons.add(b41);
		buttons.add(b42);
		buttons.add(b43);
		buttons.add(b44);
		buttons.add(b45);
		buttons.add(b46);
		buttons.add(b47);
		buttons.add(b48);
		
		buttons.add(b50);
		buttons.add(b51);
		buttons.add(b52);
		buttons.add(b53);
		buttons.add(b54);
		buttons.add(b55);
		buttons.add(b56);
		buttons.add(b57);
		buttons.add(b58);
		
		buttons.add(b60);
		buttons.add(b61);
		buttons.add(b62);
		buttons.add(b63);
		buttons.add(b64);
		buttons.add(b65);
		buttons.add(b66);
		buttons.add(b67);
		buttons.add(b68);
		
		buttons.add(b70);
		buttons.add(b71);
		buttons.add(b72);
		buttons.add(b73);
		buttons.add(b74);
		buttons.add(b75);
		buttons.add(b76);
		buttons.add(b77);
		buttons.add(b78);
		
		buttons.add(b80);
		buttons.add(b81);
		buttons.add(b82);
		buttons.add(b83);
		buttons.add(b84);
		buttons.add(b85);
		buttons.add(b86);
		buttons.add(b87);
		buttons.add(b88);
		
		
		resetButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
			panel.setVisible(false);
			frame.dispose();
			//endFrame.dispose();
			for(int i = 0; i < GridTracker.grid.length; i++)
				for(int j = 0; j < GridTracker.grid[0].length; j++)
					GridTracker.grid[i][j] = '+';
			for(JButton b : buttons)
			{
				b.setBackground(null);
			}
			Logistics.resetCounter ++;
			new GUI();}});
		
		b00.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b00, 0, 0);}});
		b01.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b01, 0, 1);}});
		b02.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b02, 0, 2);}});
		b03.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b03, 0, 3);}});
		b04.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b04, 0, 4);}});
		b05.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b05, 0, 5);}});
		b06.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b06, 0, 6);}});
		b07.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b07, 0, 7);}});
		b08.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b08, 0, 8);}});
		
		b10.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b10, 1, 0);}});
		b11.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b11, 1, 1);}});
		b12.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b12, 1, 2);}});
		b13.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b13, 1, 3);}});
		b14.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b14, 1, 4);}});
		b15.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b15, 1, 5);}});
		b16.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b16, 1, 6);}});
		b17.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b17, 1, 7);}});
		b18.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b18, 1, 8);}});
		
		b20.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b20, 2, 0);}});
		b21.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b21, 2, 1);}});
		b22.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b22, 2, 2);}});
		b23.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b23, 2, 3);}});
		b24.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b24, 2, 4);}});
		b25.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b25, 2, 5);}});
		b26.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b26, 2, 6);}});
		b27.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b27, 2, 7);}});
		b28.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b28, 2, 8);}});
		
		b30.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b30, 3, 0);}});
		b31.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b31, 3, 1);}});
		b32.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b32, 3, 2);}});
		b33.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b33, 3, 3);}});
		b34.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b34, 3, 4);}});
		b35.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b35, 3, 5);}});
		b36.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b36, 3, 6);}});
		b37.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b37, 3, 7);}});
		b38.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b38, 3, 8);}});
		
		b40.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b40, 4, 0);}});
		b41.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b41, 4, 1);}});
		b42.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b42, 4, 2);}});
		b43.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b43, 4, 3);}});
		b44.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b44, 4, 4);}});
		b45.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b45, 4, 5);}});
		b46.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b46, 4, 6);}});
		b47.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b47, 4, 7);}});
		b48.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b48, 4, 8);}});
		
		b50.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b50, 5, 0);}});
		b51.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b51, 5, 1);}});
		b52.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b52, 5, 2);}});
		b53.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b53, 5, 3);}});
		b54.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b54, 5, 4);}});
		b55.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b55, 5, 5);}});
		b56.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b56, 5, 6);}});
		b57.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b57, 5, 7);}});
		b58.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b58, 5, 8);}});
		
		b60.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b60, 6, 0);}});
		b61.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b61, 6, 1);}});
		b62.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b62, 6, 2);}});
		b63.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b63, 6, 3);}});
		b64.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b64, 6, 4);}});
		b65.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b65, 6, 5);}});
		b66.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b66, 6, 6);}});
		b67.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b67, 6, 7);}});
		b68.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b68, 6, 8);}});
		
		b70.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b70, 7, 0);}});
		b71.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b71, 7, 1);}});
		b72.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b72, 7, 2);}});
		b73.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b73, 7, 3);}});
		b74.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b74, 7, 4);}});
		b75.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b75, 7, 5);}});
		b76.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b76, 7, 6);}});
		b77.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b77, 7, 7);}});
		b78.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b78, 7, 8);}});
	
		b80.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b80, 8, 0);}});
		b81.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b81, 8, 1);}});
		b82.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b82, 8, 2);}});
		b83.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b83, 8, 3);}});
		b84.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b84, 8, 4);}});
		b85.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b85, 8, 5);}});
		b86.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b86, 8, 6);}});
		b87.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b87, 8, 7);}});
		b88.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {ifPressed(b88, 8, 8);}});
		
		gameOverScreen.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
		panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
		gameOverScreen.setLayout(new GridLayout(2, 3));
		panel.setLayout(new GridLayout(9, 9, 2, 10));
		scoreboard.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
		scoreboard.setLayout(new GridLayout(3, 3));
		
		
		panel.add(b00);
		panel.add(b01);
		panel.add(b02);
		panel.add(b03);
		panel.add(b04);
		panel.add(b05);
		panel.add(b06);
		panel.add(b07);
		panel.add(b08);
		
		panel.add(b10);
		panel.add(b11);
		panel.add(b12);
		panel.add(b13);
		panel.add(b14);
		panel.add(b15);
		panel.add(b16);
		panel.add(b17);
		panel.add(b18);
		
		panel.add(b20);
		panel.add(b21);
		panel.add(b22);
		panel.add(b23);
		panel.add(b24);
		panel.add(b25);
		panel.add(b26);
		panel.add(b27);
		panel.add(b28);
		
		panel.add(b30);
		panel.add(b31);
		panel.add(b32);
		panel.add(b33);
		panel.add(b34);
		panel.add(b35);
		panel.add(b36);
		panel.add(b37);
		panel.add(b38);
		
		panel.add(b40);
		panel.add(b41);
		panel.add(b42);
		panel.add(b43);
		panel.add(b44);
		panel.add(b45);
		panel.add(b46);
		panel.add(b47);
		panel.add(b48);
		
		panel.add(b50);
		panel.add(b51);
		panel.add(b52);
		panel.add(b53);
		panel.add(b54);
		panel.add(b55);
		panel.add(b56);
		panel.add(b57);
		panel.add(b58);
		
		panel.add(b60);
		panel.add(b61);
		panel.add(b62);
		panel.add(b63);
		panel.add(b64);
		panel.add(b65);
		panel.add(b66);
		panel.add(b67);
		panel.add(b68);
		
		panel.add(b70);
		panel.add(b71);
		panel.add(b72);
		panel.add(b73);
		panel.add(b74);
		panel.add(b75);
		panel.add(b76);
		panel.add(b77);
		panel.add(b78);
		
		panel.add(b80);
		panel.add(b81);
		panel.add(b82);
		panel.add(b83);
		panel.add(b84);
		panel.add(b85);
		panel.add(b86);
		panel.add(b87);
		panel.add(b88);
		
		
		gameOverScreen.add(gameOverMessage);
		gameOverScreen.add(resetButton);
		
		scoreboard.add(pOneStealsLabel);
		scoreboard.add(pTwoStealsLabel);
		scoreboard.add(pOneScore);
		scoreboard.add(pTwoScore);
		scoreboard.add(pTwoScore);
		
		frame.add(panel, BorderLayout.CENTER);
		//frame.add(scoreboard, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("PENTE");
		frame.pack();
		frame.setVisible(true);
		
		endFrame.add(gameOverScreen, (BorderLayout.CENTER));
		endFrame.setTitle("GAME OVER");
		endFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		endFrame.pack();
		endFrame.setVisible(false);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		//empty override 
	}
}
