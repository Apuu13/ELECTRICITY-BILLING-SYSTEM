package Electricity;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Search extends JFrame implements ActionListener
{
	JLabel lb1,lb2,lb3;
	JButton btn1,btn2;
	JTextField t1;
	Container c;
	Font f;
	JSeparator sep1;
	
	public Search() {
		getContentPane().setBackground(Color.LIGHT_GRAY);
		c=getContentPane();
		setTitle("SEARCH DETAIL");
		c.setLayout(null);
		
		lb1=new JLabel(" Search Bill Information ");
		lb1.setBounds(37,20,367,30);
		lb1.setFont(new Font("Arial",Font.BOLD,30));
		lb1.setForeground(Color.BLACK);
		c.add(lb1);
		
		sep1=new JSeparator();
		sep1.setForeground(Color.BLACK);
		sep1.setBounds(22,10,388,55);
		c.add(sep1);
		sep1.setBorder(BorderFactory.createEtchedBorder());
		
		lb2=new JLabel("Enter Miter Number");
		lb2.setBounds(35,100,181,30);
		lb2.setFont(new Font("Arial", Font.PLAIN, 18));
		lb2.setForeground(Color.BLACK);
		c.add(lb2);
		
		t1=new JTextField(30);
		t1.setBounds(262,102,139,30);
		c.add(t1);
		
		lb3=new JLabel(new ImageIcon("icon/sr1.png"));
		lb3.setForeground(Color.WHITE);
		lb3.setBackground(Color.WHITE);
		lb3.setBounds(356,146,100,97);
		c.add(lb3);
		
		btn1=new JButton("Search");
		btn1.setBackground(SystemColor.controlShadow);
		btn1.setBounds(25,180,100,35);
		btn1.setFont(new Font("Arial", Font.BOLD, 20));
		btn1.setMnemonic('S');
		c.add(btn1);
		
		btn2=new JButton("Back");
		btn2.setBackground(SystemColor.controlShadow);
		btn2.setBounds(153,180,100,35);
		btn2.setFont(new Font("Arial", Font.BOLD, 20));
		btn2.setMnemonic('B');
		c.add(btn2);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		setSize(470,280);
		setVisible(true);
		setLocation(300,250);
		setResizable(false);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btn2)
		{
			setVisible(false);
		}
		if(ae.getSource()==btn1)
		{
			String s=t1.getText();
			setVisible(false);
			Sdisp t=new Sdisp(s);
			t.setSize(700,500);
			t.setLocation(190,90);
			t.setVisible(true);			
		}
	}
	
	public static void main(String arg[])
	{
		Search s=new Search();
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
