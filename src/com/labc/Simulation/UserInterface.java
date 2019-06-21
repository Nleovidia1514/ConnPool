package com.labc.Simulation;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

public class UserInterface {

	private JFrame frame;
	public static JTextArea textArea;

	/**
	 * Launch the application.
	
	/**
	 * Create the application.
	 */
	public UserInterface() {
		initialize();
		this.frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton tenButton = new JButton("10");
		tenButton.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(tenButton);
		tenButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				for(int i = 0; i<10; i++)
					new Connections();
			}
		});
		
		JButton hundredButton = new JButton("100");
		hundredButton.setBounds(10, 62, 89, 23);
		frame.getContentPane().add(hundredButton);
		hundredButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				for(int i = 0; i<100; i++)
					new Connections();
			}
		});
		
		JButton thousandButton = new JButton("1000");
		thousandButton.setBounds(10, 117, 89, 23);
		frame.getContentPane().add(thousandButton);
		thousandButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				for(int i = 0; i<1000; i++)
					new Connections();
			}
		});
		
		JButton tenThousandButton = new JButton("10000");
		tenThousandButton.setBounds(10, 174, 89, 23);
		frame.getContentPane().add(tenThousandButton);
		tenThousandButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				for(int i = 0; i<10000; i++)
					new Connections();
			}
		});
		
		JButton hundredThousandButton = new JButton("100000");
		hundredThousandButton.setBounds(10, 228, 89, 23);
		frame.getContentPane().add(hundredThousandButton);
		hundredThousandButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				for(int i = 0; i<100000; i++)
					new Connections();
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBounds(139, 11, 285, 240);
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
