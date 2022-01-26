package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PlusMinus extends JPanel {
	JLabel bgLabel;
	public PlusMinus() {
		
		GamePlayMain gp = new GamePlayMain();
		this.setLayout(null);

		ImageIcon bgicon = new ImageIcon("projectImages/backgroundImg.png");
		bgLabel = new JLabel(bgicon);
		bgLabel.setBounds(0, 0, 1024, 768);

		ImageIcon pmicon = new ImageIcon("projectImages/gamebackImg.png");
		JLabel pmbgLabel = new JLabel(pmicon);
		pmbgLabel.setBounds(210, 100, 600, 500);

		JLabel quizLabel = new JLabel(gp.question);
		quizLabel.setFont(new Font("Gothic", Font.BOLD, 115));
		quizLabel.setForeground(Color.ORANGE);
		quizLabel.setBounds(330, 150, 400, 200);

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

		ImageIcon checkIcon = new ImageIcon("projectImages/checked.png");
		JLabel checkLabel = new JLabel(checkIcon);
		ImageIcon xIcon = new ImageIcon("projectImages/x.png");
		JLabel xLabel = new JLabel(xIcon);
		
		choiceBtn[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choiceBtn[0].setBackground(Color.RED);
				if (gp.answer == Integer.parseInt(choiceBtn[0].getText())) {
					checkLabel.setVisible(true);
					revalidate();
					repaint();
//					System.exit(0);
					
				}else {
					xLabel.setVisible(true);
					revalidate();
					repaint();
//					System.exit(0);
				}
			}
		});
		choiceBtn[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choiceBtn[1].setBackground(Color.RED);
				if (gp.answer == Integer.parseInt(choiceBtn[1].getText())) {
					checkLabel.setVisible(true);
					revalidate();
					repaint();
//					System.exit(0);
				}else {
					xLabel.setVisible(true);
					revalidate();
					repaint();
//					System.exit(0);
				}
			}
		});
		choiceBtn[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choiceBtn[2].setBackground(Color.RED);
				if (gp.answer == Integer.parseInt(choiceBtn[2].getText())) {
					checkLabel.setVisible(true);
					revalidate();
					repaint();
//					System.exit(0);
				}else {
					xLabel.setVisible(true);
					revalidate();
					repaint();
//					System.exit(0);
				}
			}
		});
		choiceBtn[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choiceBtn[3].setBackground(Color.RED);
				if (gp.answer == Integer.parseInt(choiceBtn[3].getText())) {
					checkLabel.setVisible(true);
					revalidate();
					repaint();
//					System.exit(0);
				}else {
					xLabel.setVisible(true);
					revalidate();
					repaint();
//					System.exit(0);
				}
			}
		});
		
		checkLabel.setBounds(670, 65, 150, 150);
		this.add(checkLabel);
		checkLabel.setVisible(false);
		xLabel.setBounds(670, 65, 150, 150);
		this.add(xLabel);
		xLabel.setVisible(false);
		
		this.add(choiceBtn[0]);
		this.add(choiceBtn[1]);
		this.add(choiceBtn[2]);
		this.add(choiceBtn[3]);

		this.add(quizLabel);

		this.add(pmbgLabel);

		this.add(bgLabel);
	}
}
