// ZOA_CREATED! DO NOT EDIT IT! -- 
package com.db;
import com.process.ZoaExp;
import com.process.ZoaThreadLocal;


import java.sql.*;

public class DBHelper {	
	private String dbUrl="jdbc:mysql://localhost:3306/sushe";
	private String dbUser="root";
	private String dbPassword="root";
	private String jdbcName="com.mysql.jdbc.Driver";
	
	//连接数据�?
	public Connection getConn(){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 40 0 742909"); 
		Connection conn = null;
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 40 1 742909"); 
			Class.forName(jdbcName);
		}
		catch(Exception e){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 40 2 742909"); }
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 40 4 742909"); 
			conn=DriverManager.getConnection(dbUrl,dbUser,dbPassword);
		}
		catch(SQLException ex){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 40 5 742909"); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 40 6 742909");
		return conn;		
	}
	private void hello(){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 40 7 742909"); 
		System.out.println("hello");
	}
//    测试
	public static void main(String[] args)
	{
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 40 8 742909"); 
		System.out.println(new DBHelper().getConn());
		
	}
	
}
