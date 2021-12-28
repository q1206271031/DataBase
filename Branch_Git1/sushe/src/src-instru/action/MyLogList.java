// ZOA_CREATED! DO NOT EDIT IT! -- 
package com.action;
import com.process.ZoaExp;
import com.process.ZoaThreadLocal;


import java.io.PrintWriter;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

import com.bean.*;
import com.dao.*;


public class MyLogList extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属�??
	private List<LogBean> list;
	public List<LogBean> getList() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 20 0 742909"); 
		return list;
	}
	public void setList(List<LogBean> list) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 20 1 742909"); 
		this.list = list;
	}
	
	
	private String Building_ID;
	public String getBuilding_ID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 20 2 742909"); 
		return Building_ID;
	}
	public void setBuilding_ID(String buildingID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 20 3 742909"); 
		Building_ID = buildingID;
	}
	private List<DomitoryBean> domitorylist;
	public List<DomitoryBean> getDomitorylist() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 20 4 742909"); 
		return domitorylist;
	}
	public void setDomitorylist(List<DomitoryBean> domitorylist) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 20 5 742909"); 
		this.domitorylist = domitorylist;
	}
	
	private String SearchRow;
	private String SearchKey;
	public String getSearchRow() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 20 6 742909"); 
		return SearchRow;
	}
	public void setSearchRow(String searchRow) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 20 7 742909"); 
		SearchRow = searchRow;
	}
	public String getSearchKey() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 20 8 742909"); 
		return SearchKey;
	}
	public void setSearchKey(String searchKey) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 20 9 742909"); 
		SearchKey = searchKey;
	}
	private String Domitory_ID;
	
	public String getDomitory_ID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 20 10 742909"); 
		return Domitory_ID;
	}
	public void setDomitory_ID(String domitoryID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 20 11 742909"); 
		Domitory_ID = domitoryID;
	}
	//处理用户请求的execute方法
	/**
	 * 撒富士达
	 */
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 20 12 742909"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","MyLogList","742909");
		
		//解决乱码，用于页面输�?
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 20 13 742909")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 20 0 0 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 20 0 0 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 20 14 742909"); {
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 20 15 742909");

		//查询条件
		String strWhere="Student_State='入住' and Building_ID="+Building_ID;
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 20 16 742909")|| true) && (!(isInvalid(SearchKey))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 20 1 1 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 20 1 1 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 20 17 742909"); 
		{
			strWhere+=" and "+SearchRow+"='"+SearchKey+"'";
		} }
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 20 19 742909")|| true) && (!(isInvalid(Domitory_ID))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 20 2 2 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 20 2 2 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 20 20 742909"); 
		{
			strWhere+=" and Domitory_ID='"+Domitory_ID+"'";
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 20 21 742909");
		//查询�?�?
		list=new LogDao().GetList(strWhere,"Log_Date desc");
		
		//查询�?有寝�?
		domitorylist=new DomitoryDao().GetList("Domitory_BuildingID="+Building_ID,"Domitory_Name");
	
		return SUCCESS;
		
	}
	
	//判断是否空�??
	/**
	 * 判断是否空�??
	 * @param value
	 * @return
	 */
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 20 22 742909"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	/**
	 * 测试
	 * @param args
	 */
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 20 23 742909"); 
		System.out.println();
	}
	
}
