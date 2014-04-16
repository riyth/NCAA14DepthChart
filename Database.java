package DepthChart;

import java.lang.System;
import java.util.Properties;
import java.sql.*;


public class Database {
	
	
		
		Connection conn = null;
		PreparedStatement stmt = null;
		PreparedStatement stmt2 = null;
		PreparedStatement stmt3 = null;
		PreparedStatement stmt4 = null;
        
		
        static final String clearQuery = "delete from player";
        
        
    /**
	 * Database Main
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		String userName = args[0];	// Input User Name for creating connection to Database Schema
		String passWord = args[1];	// Input Password for creating connection to Database Schema
	
		try
		{
			// Invoke the Database constructor, passing in User Name and Password.
			Database players = new Database(userName, passWord);
				
			
			//players.cleanup();
		}
		catch (SQLException exSQL)
		{
		    System.out.println("main SQLException: " + exSQL.getMessage());
		    System.out.println("main SQLState: " + exSQL.getSQLState());
		    System.out.println("main VendorError: " + exSQL.getErrorCode());
		    exSQL.printStackTrace();
		}
	} 
	
	/**
	 * Constructor for Class Database
	 * @param String userName for connecting to Database schema
	 * @param String passWord for connecting to Database schema
	 */
	public Database(String userName, String passWord) throws SQLException
	{		
		// Go create a connection to my "players" database.
		// "conn" is a data member of JDBC type Connection.
		// See Database::getConnection method below.
		conn = getConnection(userName, passWord);
		if (conn == null)
		{
			System.out.println("getConnection failed.");
			return;
		}
		
		
		
		stmt2 = conn.prepareStatement(clearQuery, ResultSet.FETCH_FORWARD);
		
		
		
	}	// End of Database Constructor.
	
	/**
	 * Method: cleanup()
	 * Function: To close the various JDBC objects.
	 */
	public void cleanup()
	{
		try {
						stmt.close();
                        stmt2.close();
                        stmt3.close();
                        conn.close();
			
		}
		catch  (SQLException exSQL) {;}
	}
	
	public Connection getConnection(String userName, String passWord)
	{
		Connection conn = null;
		
		// Location of the MySQL-based "players" database.
		String players_url = "jdbc:mysql://127.0.0.1:3306/players";
			
		
		try { Class.forName("com.mysql.jdbc.Driver").newInstance(); }
		catch (Exception ex) { 
		    System.out.println("Class.forName Exception: " + ex.getMessage());
		    ex.printStackTrace();
		    return null;
		}
		
		
		try {
			Properties connectionProps = new Properties();
			connectionProps.put("user", userName);
			connectionProps.put("password", passWord);
			conn = DriverManager.getConnection (players_url, connectionProps);
			if (conn == null)
			{
				System.out.println("getConnection:getConnection failed.");
				return null;
			}
		}
		catch (SQLException exSQL)
		{
		    System.out.println("getConnection SQLException: " + exSQL.getMessage());
		    System.out.println("getConnection SQLState: " + exSQL.getSQLState());
		    System.out.println("getConnection VendorError: " + exSQL.getErrorCode());
		    exSQL.printStackTrace();
		}
		
		return conn;
	}	// End of getConnection()
	
	
	
	
	public void getInfo(DepthChartGUI2 chart) throws SQLException {
		
		String getQuery = "select * from player order by rating desc";
		stmt = conn.prepareStatement(getQuery, ResultSet.FETCH_FORWARD);
		
		ResultSet rs = stmt.executeQuery();
		
		String name = null;
		String position = null;
		int rating = 0;
		String year = null;
		
		rs.beforeFirst();
		chart.resetNums();
		while (rs.next()){
			name = rs.getString(1);
			position = rs.getString(2);
			rating = rs.getInt(3);
			year = rs.getString(4);
			Player newPlayer = new Player(name, position, rating, year);
		
			
		    chart.changeChart(newPlayer);
						
		}
		
	}
	
	
	public void putInfo(Player x) throws SQLException{
		
		String addQuery = "insert into player values (?, ?, ?, ?)";
		stmt3 = conn.prepareStatement(addQuery, ResultSet.FETCH_FORWARD);
		
		
		stmt3.setString(1, x.name);
		stmt3.setString(2, x.position);
		stmt3.setInt(3, x.rating);
		stmt3.setString(4, x.year);
		
		stmt3.execute();
		
				
	}
	
	public void removePlayer(String name, DepthChartGUI2 chart) throws SQLException{
		
		String removeQuery = "delete from player where name = '" + name + "'";
		stmt4 = conn.prepareStatement(removeQuery);
		stmt4.execute();
							
		
	}
	
	public void clearDatabase(DepthChartGUI2 chart) throws SQLException {
		
		chart.resetNums();
		stmt2.execute();
		
	}
		
	}
	
	

	
