package DepthChart;

import java.sql.SQLException;

public class Tester {

  
 public static void main(String args[]) throws SQLException {

	 
	 Player testPlayer = new Player("Name","QB",12,"FR");	
	 Database db = new Database("sa","riyth804");
	 
	 db.putInfo(testPlayer);
	 System.out.println(testPlayer);
 }
 
 
}
