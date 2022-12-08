package Electricity;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class adinfo extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	JButton b1,b2,b3;
	Container c;
	JComboBox t;
	Font f;
	Connection conn;
	Statement stm;
	public adinfo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("icon\\sdata.png"));
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setTitle("Add Detail");
		c=getContentPane();
		c.setLayout(null);
		
		l1=new JLabel("Miter no:");
		l1.setBounds(50,100,200,30);
		l1.setFont(new Font("MingLiU_HKSCS-ExtB", Font.BOLD, 20));
		l1.setForeground(Color.BLUE);
		c.add(l1);
		
		t1=new JTextField(30);
		t1.setToolTipText("Add Miter Number");
		t1.setBounds(250,100,250,30);
		t1.setFont(new Font("Arial",Font.BOLD,15));
		c.add(t1);
		
		l2=new JLabel("Service no:");
		l2.setBounds(50,150,200,30);
		l2.setFont(new Font("MingLiU_HKSCS-ExtB", Font.BOLD, 20));
		l2.setForeground(Color.blue);
		c.add(l2);
	
		t2=new JTextField(30);
		t2.setToolTipText("Add Service Number");
		t2.setBounds(250,150,250,30);
		t2.setFont(new Font("Arial",Font.BOLD,15));
		c.add(t2);
		
		l3=new JLabel("Full Name:");
		l3.setBounds(50,200,200,30);
		l3.setFont(new Font("MingLiU_HKSCS-ExtB", Font.BOLD, 20));
		l3.setForeground(Color.blue);
		c.add(l3);
		
		t3=new JTextField(30);
		t3.setToolTipText("Add Full Name");
		t3.setBounds(250,200,250,30);
		t3.setFont(new Font("Arial",Font.BOLD,15));
		c.add(t3);
		
		l4=new JLabel("Address:");
		l4.setBounds(50,250,200,30);
		l4.setFont(new Font("MingLiU_HKSCS-ExtB", Font.BOLD, 20));
		l4.setForeground(Color.blue);
		c.add(l4);
		
		t4=new JTextField(30);
		t4.setToolTipText("Add Address");
		t4.setBounds(250,250,250,30);
		t4.setFont(new Font("Arial",Font.BOLD,15));
		c.add(t4);
		
		l5=new JLabel("Month:");
		l5.setBounds(50,300,200,30);
		l5.setFont(new Font("MingLiU_HKSCS-ExtB", Font.BOLD, 20));
		l5.setForeground(Color.blue);
		c.add(l5);
		
		t5=new JTextField(30);
		t5.setToolTipText("Add Month");
		t5.setBounds(250,300,250,30);
		t5.setFont(new Font("Arial",Font.BOLD,15));
		c.add(t5);
		
		l6=new JLabel("Submit Date:");
		l6.setBounds(50,350,200,30);
		l6.setFont(new Font("MingLiU_HKSCS-ExtB", Font.BOLD, 20));
		l6.setForeground(Color.blue);
		c.add(l6);
		
		t6=new JTextField(30);
		t6.setToolTipText("Add Submit Date");
		t6.setBounds(250,350,250,30);
		t6.setFont(new Font("Arial",Font.BOLD,15));
		c.add(t6);
		
		l7=new JLabel("Last Date:");
		l7.setBounds(50,400,200,30);
		l7.setFont(new Font("MingLiU_HKSCS-ExtB", Font.BOLD, 20));
		l7.setForeground(Color.blue);
		c.add(l7);
		
		t7=new JTextField(30);
		t7.setToolTipText("Add Last Date");
		t7.setBounds(250,400,250,30);
		t7.setFont(new Font("Arial",Font.BOLD,15));
		c.add(t7);
		
		l8=new JLabel("Amount:");
		l8.setBounds(50,450,200,30);
		l8.setFont(new Font("MingLiU_HKSCS-ExtB", Font.BOLD, 20));
		l8.setForeground(Color.blue);
		c.add(l8);
		
		t8=new JTextField(30);
		t8.setToolTipText("Add Amount");
		t8.setBounds(250,450,250,30);
		t8.setFont(new Font("Arial",Font.BOLD,15));
		c.add(t8);
		
		l9=new JLabel("Add Bill Information");
		l9.setBackground(Color.WHITE);
		l9.setBounds(120,40,380,30);
		l9.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 30));
		l9.setForeground(SystemColor.desktop);
		c.add(l9);
		
		b1=new JButton("ADD");
		b1.setBackground(SystemColor.controlShadow);
		b1.setBounds(421,527,139,33);
		b1.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,20));
		b1.setForeground(new Color(0, 0, 0));
		b1.setMnemonic('A');
		c.add(b1);
		
		b2=new JButton("CLEAR");
		b2.setBackground(SystemColor.controlShadow);
		b2.setBounds(222,527,139,33);
		b2.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,20));
		b2.setForeground(Color.black);
		b2.setMnemonic('C');
		c.add(b2);
		
		b3=new JButton("EXIT");
		b3.setBackground(SystemColor.controlShadow);
		b3.setBounds(28,527,139,33);
		b3.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,20));
		b3.setForeground(new Color(0, 0, 0));
		b3.setMnemonic('E');
		c.add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		setSize(600,620);
		setLocation(350,90);
		setResizable(false);
		setVisible(true);
	
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
		
		if(ae.getSource()==b1)
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
				String q ="insert into customer__info values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"') ";
				stm=conn.createStatement();
				stm.executeUpdate(q);
				
				stm.close();
				conn.close();
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");
				t7.setText("");
				t8.setText("");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "Information Added Succesfully");
			
		}
		if(ae.getSource()==b2)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			t7.setText("");
			t8.setText("");
		}
		if(ae.getSource()==b3)
		{
			setVisible(false);
		}
	}
	public static void main(String arge[])
	{
		adinfo ad=new adinfo();
		ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}