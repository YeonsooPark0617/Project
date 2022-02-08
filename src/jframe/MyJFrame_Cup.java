package jframe;

import java.awt.Container;

import javax.swing.JFrame;

import cupgame.CupGame;

public class MyJFrame_Cup extends JFrame {
	
	Container contentPan;

	public MyJFrame_Cup() {
		this.setTitle("CupGame");
		this.setLayout(null);
		this.setSize(1024, 768);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPan = getContentPane();
		
		contentPan.add(new CupGame());
	}

	public static void main(String[] args) {
		new MyJFrame_Cup().setVisible(true);
	}
}