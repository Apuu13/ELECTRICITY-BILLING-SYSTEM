package Electricity;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.sql.*;

public class Display1 extends JFrame {

	Connection con;
	Statement st;
	Container c;
	ResultSet rs;
	String q;
	
	public Display1()
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage("icon\\sdata.png"));
		setTitle("All Detail");
		setSize(850,600);
		setLocation(310,100);
		setResizable(true);
		setVisible(true);
		
		String data[]=new String[8];
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
			q="select*from customer__info";
			st=con.createStatement();
			rs=st.executeQuery(q);
			c=getContentPane();
			DefaultTableModel dm=new DefaultTableModel();
			JTable tf=new JTable(dm);
			
			for(int i=0;i<=8;i++)
			{
				if(i==0)
				{
					dm.addColumn("Miterno");
				}
				if(i==1)
				{
					dm.addColumn("Serviceno");
				}
				if(i==2)
				{
					dm.addColumn("Name");
				}
				if(i==3)
				{
					dm.addColumn("Address");
				}
				if(i==4)
				{
					dm.addColumn("Month");
				}
				if(i==5)
				{
					dm.addColumn("SubmitDate");
				}
				if(i==6)
				{
					dm.addColumn("LastDate");
				}
				if(i==7)
				{
					dm.addColumn("Amount");
				}	
			}
		
		while(rs.next()) 
		{
			String s1=rs.getString(1);
			String s2=rs.getString(2);
			String s3=rs.getString(3);
			String s4=rs.getString(4);
			String s5=rs.getString(5);
			String s6=rs.getString(6);
			String s7=rs.getString(7);
			String s8=rs.getString(8);
			
			data[0]=s1;
			data[1]=s2;
			data[2]=s3;
			data[3]=s4;
			data[4]=s5;
			data[5]=s6;
			data[6]=s7;
			data[7]=s8;
			dm.addRow(data);
		}
		c.add(new JScrollPane(tf));
	}
		catch(Exception e1)
		{
			
		}
	}

	public static void main(String args[])
	{
		Display1 t=new Display1();
		t.setVisible(true);
	}
}
