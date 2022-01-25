package project;

import java.awt.Container;
import java.util.Scanner;

import javax.swing.JFrame;

public class MainFram extends JFrame{
	public static PlusMinus pm;
	Container c;
	
	public MainFram() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("더하기 빼기");
		setSize(1024,768);
		c = getContentPane();
		
		pm = new PlusMinus();
		
		c.add(pm);
		setVisible(true);
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
			new MainFram();
	}
}
