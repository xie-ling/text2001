package com.ling.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Counter1 {
	public static void main(String[] args) {
			JFrame f = new JFrame("¼ÆËãÆ÷");
			JPanel panel = new JPanel();
			f.add(panel);
	
			panel.setLayout(new BorderLayout());
			
			JTextArea showText = new JTextArea(6,5);
			JPanel btnpane1  = new JPanel();
			JPanel btnpane2  = new JPanel();
			btnpane1.setLayout(new GridLayout(1,6));
			btnpane2.setLayout(new GridLayout(6,4));
			
			panel.add(BorderLayout.NORTH, showText);
			panel.add(BorderLayout.CENTER, btnpane1);
			panel.add(BorderLayout.SOUTH, btnpane2);
			
			JButton b1 = new JButton("MC");
			JButton b2 = new JButton("MR");
			JButton b3 = new JButton("M+");
			JButton b4 = new JButton("M-");
			JButton b5 = new JButton("MS");
			JButton b6 = new JButton("M^");
			
			btnpane1.add(b1);
			btnpane1.add(b2);
			btnpane1.add(b3);
			btnpane1.add(b4);
			btnpane1.add(b5);
			btnpane1.add(b6);
			
			JButton b7 = new JButton("%");
			JButton b8 = new JButton("CE");
			JButton b9 = new JButton("C");
			JButton b10 = new JButton("X");
			JButton b11 = new JButton("1/x");
			JButton b12 = new JButton("x^2");
			JButton b13 = new JButton("sqrt(x)");
			
			JButton b14 = new JButton("¡Â");
			JButton b15 = new JButton("7");
			JButton b16 = new JButton("8");
			JButton b17 = new JButton("9");
			JButton b18 = new JButton("*");
			JButton b19 = new JButton("4");
			JButton b20 = new JButton("5");
			JButton b21 = new JButton("6");
			JButton b22 = new JButton("-");
			JButton b23 = new JButton("1");
			JButton b24 = new JButton("2");
			JButton b25 = new JButton("3");
			JButton b26 = new JButton("+");
			JButton b27 = new JButton("+/-");
			JButton b28 = new JButton("0");
			JButton b29 = new JButton(".");
			JButton b30 = new JButton("=");
			
			btnpane2.add(b7);
			btnpane2.add(b8);
			btnpane2.add(b9);
			btnpane2.add(b10);
			btnpane2.add(b11);
			btnpane2.add(b12);
			btnpane2.add(b13);
			btnpane2.add(b14);
			btnpane2.add(b15);
			btnpane2.add(b16);
			btnpane2.add(b17);
			btnpane2.add(b18);
			btnpane2.add(b19);
			btnpane2.add(b20);
			btnpane2.add(b21);
			btnpane2.add(b22);
			btnpane2.add(b23);
			btnpane2.add(b24);
			btnpane2.add(b25);
			btnpane2.add(b26);
			btnpane2.add(b27);
			btnpane2.add(b28);
			btnpane2.add(b29);
			btnpane2.add(b30);
					
			f.setSize(350, 350);
			f.setVisible(true);
		
	}
}
