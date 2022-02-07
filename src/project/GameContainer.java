package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public abstract class GameContainer extends JPanel implements ActionListener{
	   public abstract void gamePlay();
	   
	   @Override
	   public abstract void actionPerformed(ActionEvent e);
	  
	}