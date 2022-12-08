package Electricity;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Help2 extends JFrame
{
	JLabel l1,l2,l3,l4,l5,l9;
	JLabel t1,t2,t3,t4,t5;
	Container c;
	Font f;
	
	public Help2()
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage("icon\\sdata.png"));
		setTitle("Shortcut Keys");
		c=getContentPane();
		c.setLayout(null);
		
		l1=new JLabel("FILE");
		l1.setBounds(50,100,173,30);
		l1.setFont(new Font("Arial",Font.BOLD,17));
		l1.setForeground(Color.blue);
		c.add(l1);
		
		t1=new JLabel("Alt+F");
		t1.setBounds(250,100,124,30);
		t1.setFont(new Font("Arial",Font.BOLD,15));
		c.add(t1);
		
		l2=new JLabel("SEARCH");
		l2.setBounds(50,150,173,30);
		l2.setFont(new Font("Arial",Font.BOLD,17));
		l2.setForeground(Color.blue);
		c.add(l2);
		
		t2=new JLabel("Alt+S");
		t2.setBounds(250,150,124,30);
		t2.setFont(new Font("Arial",Font.BOLD,15));
		c.add(t2);
	
		l3=new JLabel("BILL");
		l3.setBounds(50,200,173,30);
		l3.setFont(new Font("Arial",Font.BOLD,17));
		l3.setForeground(Color.blue);
		c.add(l3);
		
		t3=new JLabel("Alt+B");
		t3.setBounds(250,200,124,30);
		t3.setFont(new Font("Arial",Font.BOLD,15));
		c.add(t3);
		
		l4=new JLabel("DISPLAY");
		l4.setBounds(50,250,173,30);
		l4.setFont(new Font("Arial",Font.BOLD,17));
		l4.setForeground(Color.blue);
		c.add(l4);
		
		t4=new JLabel("Alt+D");
		t4.setBounds(250,250,124,30);
		t4.setFont(new Font("Arial",Font.BOLD,15));
		c.add(t4);
		
		l5=new JLabel("HELP");
		l5.setBounds(50,300,173,30);
		l5.setFont(new Font("Arial",Font.BOLD,17));
		l5.setForeground(Color.blue);
		c.add(l5);
		
		t5=new JLabel("Alt+H");
		t5.setBounds(250,300,124,30);
		t5.setFont(new Font("Arial",Font.BOLD,15));
		c.add(t5);
		

		l9=new JLabel("SHORTCUT KEYS");
		l9.setBounds(95,35,216,30);
		l9.setFont(new Font("Arial",Font.BOLD,20));
		l9.setForeground(Color.BLACK);
		c.add(l9);
		
		setSize(372,396);
		setLocation(450,150);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String args[])
	{
		Help2 he =new Help2();
		he.setVisible(true);
	}
}
