package project;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PlusMinus extends JPanel {
	public PlusMinus() {
		GamePlayMain gp = new GamePlayMain();
		this.setLayout(null);

		ImageIcon bgicon = new ImageIcon("projectImages/backgroundImg.png");
		JLabel bgLabel = new JLabel(bgicon);
		bgLabel.setBounds(0, 0, 1024, 768);

		ImageIcon pmicon = new ImageIcon("projectImages/gamebackImg.png");
		JLabel pmbgLabel = new JLabel(pmicon);
		pmbgLabel.setBounds(210, 100, 600, 500);

		JLabel quizLabel = new JLabel(gp.question);
		quizLabel.setFont(new Font("Gothic", Font.BOLD, 115));
		quizLabel.setForeground(Color.ORANGE);
		quizLabel.setBounds(310, 150, 400, 200);

		JButton[] choiceBtn = new JButton[4];
		for (int i = 0; i < gp.answerArr.length; i++) {
			choiceBtn[i] = new RoundJButton();
			choiceBtn[i].setText(Integer.toString(gp.answerArr[i]));
			choiceBtn[i].setBackground(Color.orange);
			choiceBtn[i].setFont(new Font("Gothic", Font.BOLD, 70));
			choiceBtn[i].setForeground(Color.WHITE);
		}
		choiceBtn[0].setBounds(330, 350, 150, 70);
		choiceBtn[1].setBounds(550, 350, 150, 70);
		choiceBtn[2].setBounds(330, 450, 150, 70);
		choiceBtn[3].setBounds(550, 450, 150, 70);

		this.add(choiceBtn[0]);
		this.add(choiceBtn[1]);
		this.add(choiceBtn[2]);
		this.add(choiceBtn[3]);

//		JLabel[] choice = new JLabel[4];
//		for (int i = 0; i < gp.answerArr.length; i++) {
//			choice[i] = new JLabel();
//			choice[i].setText(Integer.toString(gp.answerArr[i]));
//		}
//
//		choice[0].setFont(new Font("Gothic", Font.BOLD, 70));
//		choice[1].setFont(new Font("Gothic", Font.BOLD, 70));
//		choice[2].setFont(new Font("Gothic", Font.BOLD, 70));
//		choice[3].setFont(new Font("Gothic", Font.BOLD, 70));
//
//		choice[0].setBounds(400, 340, 100, 100);
//		choice[1].setBounds(500, 340, 100, 100);
//		choice[2].setBounds(400, 420, 100, 100);
//		choice[3].setBounds(500, 420, 100, 100);
//				
//		this.add(choice[0]);
//		this.add(choice[1]);
//		this.add(choice[2]);
//		this.add(choice[3]);

		this.add(quizLabel);

		this.add(pmbgLabel);

		this.add(bgLabel);
	}
}
