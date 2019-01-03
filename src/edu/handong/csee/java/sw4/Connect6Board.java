package edu.handong.csee.java.sw4;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class Connect6Board extends JPanel{
	static final int EMPTY = 0;
	static final int BLACK = 1;
	static final int WHITE = 2;
	
	int[][] map;
	int turnPlayer;
	
	boolean ongoing;
	
	
	Connect6Board() {
		setBackground(Color.LIGHT_GRAY);
		ongoing = false;
		JButton resign = new JButton("Resign");
		resign.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(!ongoing) {
					JOptionPane.showMessageDialog(null, "The game is not on progress.");
				}
				else if(turnPlayer == WHITE) {
					if(JOptionPane.showConfirmDialog(null, "Resign?") == JOptionPane.YES_OPTION) {
						
					}
				}
				//TODO
				//doResign
			}
		});
		JButton newGame = new JButton("New Game");
		newGame.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(ongoing) {
					int confirmResult = JOptionPane.showConfirmDialog(null, "There is ongoing game. Finish though?");
					if(confirmResult==JOptionPane.YES_OPTION) {
						//TODO
						//doNewGame
					}
				}
			}
		});
		addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent arg0) {	}
			@Override
			public void mouseEntered(MouseEvent arg0) { }
			@Override
			public void mouseExited(MouseEvent arg0) { }
			@Override
			public void mousePressed(MouseEvent arg0) {
				if(!ongoing) {
					
				}
			}
			@Override
			public void mouseReleased(MouseEvent arg0) { }
		});
	}
	
}
