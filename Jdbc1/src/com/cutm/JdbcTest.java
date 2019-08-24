package com.cutm;
import java.sql.*;
public class JdbcTest {
	public static void main(String[] args) 
	{
	try
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection(
	"jdbc:oracle:thin:@localhost:1522:orcl","system","30011");
	System.out.println("Connection Established");
	}
	catch(ClassNotFoundException e) {
		System.out.println("invalid driver class");
	}
	catch(SQLException a) {
		System.out.println("unable to establish connection");
	}

}
}