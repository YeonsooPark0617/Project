package jframe;

import java.awt.Container;

import javax.swing.JFrame;

import cardgame.CardGame;

public class MyJFrame_Card extends JFrame {
	
	Container contentPan;

	public MyJFrame_Card() {
		this.setTitle("CardGame");
		this.setLayout(null);
		this.setSize(1024, 768);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPan = getContentPane();
		
		contentPan.add(new CardGame());
	}

	public static void main(String[] args) {
		new MyJFrame_Card().setVisible(true);
	}
}