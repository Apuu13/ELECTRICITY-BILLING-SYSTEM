
package Electricity;

import java.awt.*;
import java.awt.event.*;
import java.awt.print.PrinterException;

import javax.swing.*;
import java.sql.*;
import java.util.*;
import java.io.*;


public class print extends JFrame implements ActionListener,FocusListener{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	JButton b1,b2,b3;
	Container c;
	Font f;
	Connection conn;
	Statement stm;
	JTextArea area;
	JSeparator sep,sep2;
	
	public print() {
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setTitle("Print Detail");
		c=getContentPane();
		c.setLayout(null);
		
		l1=new JLabel("Miter no:");
		l1.setBounds(50,100,200,30);
		l1.setFont(new Font("MingLiU_HKSCS-ExtB", Font.BOLD, 20));
		l1.setForeground(Color.BLUE);
		c.add(l1);
		
		t1=new JTextField(30);
		t1.setToolTipText("insert Miter no.");
		t1.setBounds(250,100,250,30);
		t1.setFont(new Font("Arial",Font.BOLD,15));
		c.add(t1);
		
		l2=new JLabel("Service no:");
		l2.setBounds(50,150,200,30);
		l2.setFont(new Font("MingLiU_HKSCS-ExtB", Font.BOLD, 20));
		l2.setForeground(Color.blue);
		c.add(l2);
	
		t2=new JTextField(30);
		t2.setToolTipText("");
		t2.setBounds(250,150,250,30);
		t2.setFont(new Font("Arial",Font.BOLD,15));
		c.add(t2);
		
		l3=new JLabel("Full Name:");
		l3.setBounds(50,200,200,30);
		l3.setFont(new Font("MingLiU_HKSCS-ExtB", Font.BOLD, 20));
		l3.setForeground(Color.blue);
		c.add(l3);
		
		t3=new JTextField(30);
		t3.setToolTipText("");
		t3.setBounds(250,200,250,30);
		t3.setFont(new Font("Arial",Font.BOLD,15));
		c.add(t3);
		
		l4=new JLabel("Address:");
		l4.setBounds(50,250,200,30);
		l4.setFont(new Font("MingLiU_HKSCS-ExtB", Font.BOLD, 20));
		l4.setForeground(Color.blue);
		c.add(l4);
		
		t4=new JTextField(30);
		t4.setToolTipText("");
		t4.setBounds(250,250,250,30);
		t4.setFont(new Font("Arial",Font.BOLD,15));
		c.add(t4);
		
		l5=new JLabel("Month:");
		l5.setBounds(50,300,200,30);
		l5.setFont(new Font("MingLiU_HKSCS-ExtB", Font.BOLD, 20));
		l5.setForeground(Color.blue);
		c.add(l5);
		
		t5=new JTextField(30);
		t5.setToolTipText("");
		t5.setBounds(250,300,250,30);
		t5.setFont(new Font("Arial",Font.BOLD,15));
		c.add(t5);
		
		l6=new JLabel("Submit Date:");
		l6.setBounds(50,350,200,30);
		l6.setFont(new Font("MingLiU_HKSCS-ExtB", Font.BOLD, 20));
		l6.setForeground(Color.blue);
		c.add(l6);
		
		t6=new JTextField(30);
		t6.setToolTipText("");
		t6.setBounds(250,350,250,30);
		t6.setFont(new Font("Arial",Font.BOLD,15));
		c.add(t6);
		
		l7=new JLabel("Last Date:");
		l7.setBounds(50,400,200,30);
		l7.setFont(new Font("MingLiU_HKSCS-ExtB", Font.BOLD, 20));
		l7.setForeground(Color.blue);
		c.add(l7);
		
		t7=new JTextField(30);
		t7.setToolTipText("");
		t7.setBounds(250,400,250,30);
		t7.setFont(new Font("Arial",Font.BOLD,15));
		c.add(t7);
		
		l8=new JLabel("Amount:");
		l8.setBounds(50,450,200,30);
		l8.setFont(new Font("MingLiU_HKSCS-ExtB", Font.BOLD, 20));
		l8.setForeground(Color.blue);
		c.add(l8);
		
		t8=new JTextField(30);
		t8.setToolTipText("");
		t8.setBounds(250,450,250,30);
		t8.setFont(new Font("Arial",Font.BOLD,15));
		c.add(t8);
		
		l9=new JLabel("    RECEIPT BILL INFORMATION");
		l9.setBackground(Color.WHITE);
		l9.setBounds(250,36,514,36);
		l9.setFont(new Font("Microsoft Himalaya", Font.BOLD, 40));
		l9.setForeground(new Color(0, 0, 0));
		c.add(l9);
		
		b1=new JButton("PRINT");
		b1.setToolTipText("ctrl+P");
		b1.setBounds(367,524,133,33);
		b1.setBackground(SystemColor.controlShadow);
		b1.setFont(new Font("Arial",Font.BOLD,20));
		b1.setForeground(new Color(0, 0, 0));
		b1.setMnemonic('P');
		c.add(b1);
		
		area = new JTextArea();
		area.setFont(new Font("Monospaced", Font.BOLD, 15));
		area.setBounds(532, 100, 542, 460);
		c.add(area);
		
		sep = new JSeparator();
		sep.setBackground(Color.BLACK);
		sep.setBounds(142, 77, 735, 2);
		c.add(sep);
		
		sep2= new JSeparator();
		sep2.setBackground( Color.BLACK);
		sep2.setBounds(142, 25, 735,8);
		c.add(sep2);
		
		b2 = new JButton("RECEIPT");
		b2.setToolTipText("ctrl+B");
		b2.setMnemonic('B');
		b2.setBackground(SystemColor.controlShadow);
		b2.setForeground(new Color(0, 0, 0));
		b2.setFont(new Font("Arial",Font.BOLD,20));
		b2.setBounds(22, 524, 133, 33);
		c.add(b2);
		
		b3 = new JButton("RESET");
		b3.setToolTipText("ctrl+R");
		b3.setMnemonic('R');
		b3.setBackground(SystemColor.controlShadow);
		b3.setFont(new Font("Arial",Font.BOLD,20));
		b3.setBounds(191, 524, 133, 36);
		b3.setForeground(new Color(0, 0, 0));
		c.add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		setSize(1103,620);
		setLocation(250,90);
		setResizable(false);
		setVisible(true);
	
	}
	
	public void foucusGained(FocusEvent f)
	{
		Connection con;
		Statement st;
		ResultSet rs;
		String sq;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
			st=con.createStatement();
			String s1=t1.getText();
			sq=("select*from customer__info where Miterno='"+s1+"'");
			rs=st.executeQuery(sq);
			while(rs.next())
			{
				t2.setText(rs.getString(2));
				t3.setText(rs.getString(3));
				t4.setText(rs.getString(4));
				t5.setText(rs.getString(5));
				t6.setText(rs.getString(6));
				t7.setText(rs.getString(7));
				t8.setText(rs.getString(8));
				
				break;
			}
		}
		catch(Exception e)
		{ } 
	}
	
	@Override
	public void focusLost(FocusEvent e) {
	}
	@Override
	public void focusGained(FocusEvent e) {
		
	}
public void actionPerformed(ActionEvent ae)
	{
		String s1=(t1.getText());
		String s2=(t2.getText());
		String s3=(t3.getText());
		String s4=(t4.getText());
		String s5=(t5.getText());
		String s6=(t6.getText());
		String s7=(t7.getText());
		String s8=(t8.getText());
		
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
				stm=conn.createStatement();
				String s0=t1.getText();
				
				String q =("select*from customer__info where Miterno='"+s0+"'");
				ResultSet r =stm.executeQuery(q);
				while(r.next())
				{
					t2.setText(r.getString(2));
					t3.setText(r.getString(3));
					t4.setText(r.getString(4));
					t5.setText(r.getString(5));
					t6.setText(r.getString(6));
					t7.setText(r.getString(7));
					t8.setText(r.getString(8));
				
				
		if(ae.getSource()==b1)
		{
			area.print();
		}
		if(ae.getSource()==b2)
		{
			area.setText("   *****************************************************\n");
			area.setText(area.getText()+"            * *  Electricity Bill Receipt  * *\n");
			area.setText(area.getText()+"   *****************************************************\n");
			area.setText(area.getText()+"\n");
			area.setText(area.getText()+"    Miter No:           "+t1.getText()+"\n");
			area.setText(area.getText()+"\n");
			area.setText(area.getText()+"    Service No:         "+t2.getText()+"\n");
			area.setText(area.getText()+"\n");
			area.setText(area.getText()+"    Full Name:          "+t3.getText()+"\n");
			area.setText(area.getText()+"\n");
			area.setText(area.getText()+"    Address:            "+t4.getText()+"\n");
			area.setText(area.getText()+"\n");
			area.setText(area.getText()+"    Month:              "+t5.getText()+"\n");
			area.setText(area.getText()+"\n");
			area.setText(area.getText()+"    Submit Date:        "+t6.getText()+"\n");
			area.setText(area.getText()+"\n");
			area.setText(area.getText()+"    Last Date:          "+t7.getText()+"\n");
			area.setText(area.getText()+"\n");
			area.setText(area.getText()+"    Amount:            "+t8.getText()+"\n");
			area.setText(area.getText()+"\n");
			area.setText(area.getText()+"               Thanks for paying the bill !");
		}
		if(ae.getSource()==b3)
		{
			area.setText("");
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			t7.setText("");
			t8.setText("");
		}
		}
			}
		catch(Exception a) 
		{
			a.printStackTrace();
		}
}
	
	public static void main(String arge[])
	{
		print e= new print();
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}