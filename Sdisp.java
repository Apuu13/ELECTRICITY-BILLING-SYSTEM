package Electricity;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Sdisp extends JFrame
{
	Connection con;
	Statement st;
	Container c;
	ResultSet rs;
	String q;
	public Sdisp(String tt)
	{
		String data[]=new String[8];
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
			q=("select*from customer__info where Miterno='"+tt+"'");
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
				c.add(new JScrollPane(tf));
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
	}
		catch(Exception e)
		{
			
		}
	}
	public static void main(String args[])
	{
		Sdisp td=new Sdisp("101");
		td.setSize(880,300);
		td.setLocation(350,150);
		td.setResizable(true);
		td.setVisible(true);
		
	}
}