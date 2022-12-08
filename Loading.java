package Electricity;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class Loading extends JFrame{

	JProgressBar jb;
	Container c;
	JLabel lb1,lb2,lb3,img;
	int i=0,num=0;
	Loading()
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage("icon\\sdata.png"));
		setFont(new Font("Dialog", Font.BOLD, 20));
		setBackground(new Color(25, 25, 112));
		setForeground(Color.GRAY);
		setTitle(" Loading");
		getContentPane().setBackground(new Color(175, 238, 238));
		c=getContentPane();
		c.setLayout(null);
		
		jb= new JProgressBar(0,2000);
		jb.setFont(new Font("Tahoma", Font.BOLD, 15));
		jb.setForeground(new Color(0, 204, 51));
		jb.setBackground(new Color(192, 192, 192));
		jb.setBounds(20,205,543,33);
		jb.setValue(0);
		jb.setStringPainted(true);
		c.add(jb);
		setSize(688,383);
		
		
		lb1=new JLabel(new ImageIcon("icon/Electricity.png"));
		lb1.setBounds(130, 10, 295, 150);
		lb1.setToolTipText("SAVE ELECTRICITY DON'T WASTE IT");
		c.add(lb1);
		
		lb2 = new JLabel("Loading...");
		lb2.setForeground(Color.WHITE);
		lb2.setFont(new Font("Poor Richard", Font.BOLD | Font.ITALIC, 30));
		lb2.setBackground(new Color(51, 204, 204));
		lb2.setBounds(20, 171, 153, 33);
		c.add(lb2);
		
		lb3 = new JLabel(" Please wait...");
		lb3.setForeground(Color.WHITE);
		lb3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 29));
		lb3.setBackground(Color.white);
		lb3.setBounds(208, 248, 200, 33);
		c.add(lb3);
		
	    img = new JLabel("");
		img.setIcon(new ImageIcon("icon\\wap4.jpg"));
		img.setBounds(0, 0, 584, 291);
		getContentPane().add(img);
		
		setSize(600,330);
		setVisible(true);
		setLocation(450,200);
		setResizable(false);
		
	}
public void iterate()
{
	while(i<=2000)
	{
		jb.setValue(i);
		i=i+20;
		try{
			Thread.sleep(150);}
		catch(Exception e)
			{}
		}
	}

public static void main(String[] args) {
	
	Loading m =new Loading();
	m.iterate();
	//m.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	Login we=new Login();
	we.setVisible(true);
	m.setVisible(false);
}
}


