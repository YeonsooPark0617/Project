package project;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PlusMinus extends JPanel{
	public PlusMinus() {
		this.setLayout(null);
		ImageIcon bgicon = new ImageIcon("projectImages/backgroundImg.png");
		JLabel bgLabel = new JLabel(bgicon);
		bgLabel.setBounds(0, 0, 1024, 768);
		
		ImageIcon pmicon = new ImageIcon("projectImages/gamebackImg.png");
		JLabel pmbgLabel = new JLabel(pmicon);
		pmbgLabel.setBounds(200, 100, 600, 500);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		this.add(pmbgLabel);
		this.add(bgLabel);
	}
}
