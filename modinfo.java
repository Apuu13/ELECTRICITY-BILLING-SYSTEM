package Electricity;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class modinfo extends JFrame implements ActionListener,FocusListener{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	JButton b1,b2,b3;
	Container c;
	JComboBox t;
	Font f;
	Connection conn;
	Statement stm;
	public modinfo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("icon\\sdata.png"));
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setTitle("Modify Detail");
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
		
		l9=new JLabel("Modify Bill Information");
		l9.setBackground(Color.WHITE);
		l9.setBounds(120,40,380,30);
		l9.setFont(new Font("MS UI Gothic", Font.BOLD, 30));
		l9.setForeground(SystemColor.desktop);
		c.add(l9);
		
		b1=new JButton("MODIFY");
		b1.setBackground(SystemColor.controlShadow);
		b1.setBounds(391,527,139,33);
		b1.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,20));
		b1.setForeground(new Color(0, 0, 0));
		b1.setMnemonic('M');
		c.add(b1);
		
		b2=new JButton("CLEAR");
		b2.setBackground(SystemColor.controlShadow);
		b2.setBounds(213,527,139,33);
		b2.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,20));
		b2.setForeground(Color.black);
		b2.setMnemonic('C');
		c.add(b2);
		
		b3=new JButton("EXIT");
		b3.setBackground(SystemColor.controlShadow);
		b3.setBounds(33,527,139,33);
		b3.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,20));
		b3.setForeground(new Color(0, 0, 0));
		b3.setMnemonic('E');
		c.add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		t2.addFocusListener(this);
		
		setSize(581,620);
		setLocation(350,90);
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
	public void focusLost(FocusEvent f)
	{	
	}
	public void focusGained(FocusEvent f2)
	{
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
				String q =("update customer__info set Miterno='"+s1+"',Serviceno='"+s2+"',FullName='"+s3+"',Address='"+s4+"',Month='"+s5+"',SubmitDate='"+s6+"',LastDate='"+s7+"',Amount='"+s8+"'where Miterno='"+s1+"'"); 
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
			JOptionPane.showMessageDialog(null, "Information Modified Succesfully");
			
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
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
				 Statement stm1=conn1.createStatement();
				String s11=t1.getText();
				
				String q =("select*from customer__info where Miterno='"+s11+"'");
				ResultSet r =stm1.executeQuery(q);
				while(r.next())
				{
					
					String s21=r.getString(2);
					String s31=r.getString(3);
					String s41=r.getString(4);
					String s51=r.getString(5);
					String s61=r.getString(6);
					String s71=r.getString(7);
					String s81=r.getString(8);
					
					if(ae.getSource()==b1)
					{
						s11=t1.getText();
						s21=t2.getText();
						s31=t3.getText();
						s41=t4.getText();
						s51=t5.getText();
						s61=t6.getText();
						s71=t7.getText();
						s81=t8.getText();
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
		modinfo md=new modinfo();
		md.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}		
}