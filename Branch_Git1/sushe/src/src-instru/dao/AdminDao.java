// ZOA_CREATED! DO NOT EDIT IT! -- 
package com.dao;
import com.process.ZoaExp;
import com.process.ZoaThreadLocal;


import com.db.DBHelper;
import com.bean.AdminBean;

import java.util.*;
import java.sql.*;

public class AdminDao {
	/**
	 * 验证登录
	 * @param username
	 * @param password
	 * @return
	 */
	//验证登录
	public String CheckLogin(String username, String password){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 51 0 742909"); 
		String id = null;
		String sql="select * from Admin where Admin_Username='"+username+"' and Admin_Password='"+password+"'";
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 1 742909"); 
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 2 742909")|| true) && (rs.next()? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 0 0 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 0 0 0 0 ","742909",false,0) && false))){ ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 3 742909");  {
				id = rs.getString("Admin_ID");
			}}
		}
		catch(SQLException ex){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 5 742909"); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 6 742909");
		hello();
		System.out.print(rs);
		return id;
	}
	private void hello(){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 51 7 742909"); 
		System.out.println("hello");
	}
	//验证密码
	/**
	 * 验证密码
	 * @param id
	 * @param password
	 * @return
	 */
	public boolean CheckPassword(String id, String password){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 51 8 742909"); 
		boolean ps = false;
		String sql="select * from Admin where Admin_ID='"+id+"' and Admin_Password='"+password+"'";
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 9 742909"); 
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 10 742909")|| true) && (rs.next()? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 1 1 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 1 1 0 0 ","742909",false,0) && false))){ ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 11 742909");  {
				ps=true;
			}}
		}
		catch(SQLException ex){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 13 742909"); }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 14 742909");
		return ps;
	}
	//获取列表
	/**
	 * 获取列表
	 * @param strwhere
	 * @param strorder
	 * @return
	 */
	public List<AdminBean> GetList(String strwhere,String strorder){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 51 15 742909"); 
		String sql="select * from Admin";
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 16 742909")|| true) && (!(isInvalid(strwhere))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 2 2 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 2 2 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 17 742909"); 
		{
			sql+=" where "+strwhere;
		} }
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 19 742909")|| true) && (!(isInvalid(strorder))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 3 3 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 3 3 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 20 742909"); 
		{
			sql+=" order by "+strorder;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 21 742909");
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		List<AdminBean> list=new ArrayList<AdminBean>();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 22 742909"); 
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 23 742909")|| true) && (rs.next()? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 4 4 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 4 4 0 0 ","742909",false,0) && false))){ ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 24 742909"); {
				AdminBean cnbean=new AdminBean();
				cnbean.setAdmin_ID(rs.getInt("Admin_ID"));
				cnbean.setAdmin_Username(rs.getString("Admin_Username"));
				cnbean.setAdmin_Password(rs.getString("Admin_Password"));
				cnbean.setAdmin_Name(rs.getString("Admin_Name"));
				cnbean.setAdmin_Sex(rs.getString("Admin_Sex"));
				cnbean.setAdmin_Tel(rs.getString("Admin_Tel"));
				list.add(cnbean);
				hello();
			}}
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 26 742909"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 27 742909"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 28 742909"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 29 742909")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 5 5 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 5 5 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 30 742909"); 
					conn.close(); }
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 32 742909")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 6 6 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 6 6 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 33 742909"); 
					stat.close(); }
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 35 742909")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 7 7 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 7 7 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 36 742909"); 
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 38 742909"); 
				e.printStackTrace();
			}
		}
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 40 742909");
		System.out.println();
		print();
		if(/* TRUE */true){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 42 742909"); {
			System.out.println("list0");
		} }
		if(/* TRUE */true){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 45 742909"); {
			System.out.println("list1");
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 46 742909");
		return list;
	}
	
	private void print(){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 51 47 742909"); 
		System.out.println("print");
	}
	
	//获取指定ID的实体Bean
	public AdminBean GetBean(int id){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 51 48 742909"); 
		String sql="select * from Admin where Admin_ID="+id;
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		AdminBean cnbean=new AdminBean();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 49 742909"); 
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 50 742909")|| true) && (rs.next()? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 8 8 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 8 8 0 0 ","742909",false,0) && false))){ ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 51 742909"); {
				cnbean.setAdmin_ID(rs.getInt("Admin_ID"));
				cnbean.setAdmin_Username(rs.getString("Admin_Username"));
				cnbean.setAdmin_Password(rs.getString("Admin_Password"));
				cnbean.setAdmin_Name(rs.getString("Admin_Name"));
				cnbean.setAdmin_Sex(rs.getString("Admin_Sex"));
				cnbean.setAdmin_Tel(rs.getString("Admin_Tel"));
				
			}}
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 53 742909"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 54 742909"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 55 742909"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 56 742909")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 9 9 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 9 9 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 57 742909"); 
					conn.close(); }
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 59 742909")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 10 10 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 10 10 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 60 742909"); 
					stat.close(); }
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 62 742909")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 11 11 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 11 11 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 63 742909"); 
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 65 742909"); 
				e.printStackTrace();
			}
		}
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 67 742909");
		return cnbean;
	}
	
	//添加
	public void Add(AdminBean cnbean){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 51 68 742909"); 
		String sql="insert into Admin (";
		sql+="Admin_Username,Admin_Password,Admin_Name,Admin_Sex,Admin_Tel";
		sql+=") values(";
		sql+="'"+cnbean.getAdmin_Username()+"','"+cnbean.getAdmin_Password()+"','"+cnbean.getAdmin_Name()+"','"+cnbean.getAdmin_Sex()+"','"+cnbean.getAdmin_Tel()+"'";
		sql+=")";
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 69 742909"); 
			stat = conn.createStatement();
			stat.executeUpdate(sql);
			hello();
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 70 742909"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 71 742909"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 72 742909"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 73 742909")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 12 12 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 12 12 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 74 742909"); 
					conn.close(); }
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 76 742909")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 13 13 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 13 13 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 77 742909"); 
					stat.close(); }
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 79 742909")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 14 14 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 14 14 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 80 742909"); 
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 82 742909"); 
				e.printStackTrace();
			}
		}
	}
	//修改
	public void Update(AdminBean cnbean){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 51 85 742909"); 
		String sql="update Admin set ";
		sql+="Admin_Username='"+cnbean.getAdmin_Username()+"',";
		sql+="Admin_Password='"+cnbean.getAdmin_Password()+"',";
		sql+="Admin_Name='"+cnbean.getAdmin_Name()+"',";
		sql+="Admin_Sex='"+cnbean.getAdmin_Sex()+"',";
		sql+="Admin_Tel='"+cnbean.getAdmin_Tel()+"'";
		
		sql+=" where Admin_ID='"+cnbean.getAdmin_ID()+"'";
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 86 742909"); 
			stat = conn.createStatement();
			stat.executeUpdate(sql);
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 87 742909"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 88 742909"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 89 742909"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 90 742909")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 15 15 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 15 15 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 91 742909"); 
					conn.close(); }
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 93 742909")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 16 16 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 16 16 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 94 742909"); 
					stat.close(); }
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 96 742909")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 17 17 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 17 17 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 97 742909"); 
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 99 742909"); 
				e.printStackTrace();
			}
		}
	}
	//删除
	public void Delete(String strwhere){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 51 102 742909"); 
		String sql="delete Admin where ";
		sql+=strwhere;
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 103 742909"); 
			stat = conn.createStatement();
			stat.executeUpdate(sql);
		} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 104 742909"); 
			e.printStackTrace();
		} finally {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 105 742909"); 
			try {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 106 742909"); 
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 107 742909")|| true) && (conn != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 18 18 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 18 18 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 108 742909"); 
					conn.close(); }
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 110 742909")|| true) && (stat != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 19 19 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 19 19 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 111 742909"); 
					stat.close(); }
				if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 113 742909")|| true) && (rs != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 20 20 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 51 20 20 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 114 742909"); 
					rs.close(); }
			} catch (SQLException e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 51 116 742909"); 
				e.printStackTrace();
			}
		}
	}

	
	//判断是否空�??
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 51 119 742909"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 51 120 742909"); 
		System.out.println("");
	}
	
}

