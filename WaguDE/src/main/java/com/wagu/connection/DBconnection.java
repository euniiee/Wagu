package com.wagu.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
		public static Connection getConnection() {
		Connection conn = null; 

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbID = "wagu";
		String dbPW = "1234";
		
		try {
			Class.forName(driver);
			//System.out.println("JDBC 드라이버 로딩 성공");
			conn = DriverManager.getConnection(url, dbID, dbPW);
			//System.out.println("Oracle 접속 성공");
		} catch(Exception e) {
			e.printStackTrace();
			//System.out.println("Oracle 접속 실패");
		}
		
		return conn;
	}
}

