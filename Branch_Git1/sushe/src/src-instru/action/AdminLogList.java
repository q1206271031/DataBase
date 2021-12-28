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


public class AdminLogList extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属�??
	private List<LogBean> list;
	public List<LogBean> getList() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 52 0 742909"); 
		return list;
	}
	public void setList(List<LogBean> list) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 52 1 742909"); 
		this.list = list;
	}
	
	private String Building_ID;
	private String Domitory_ID;
	private String Student_Username;
	
	public String getBuilding_ID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 52 2 742909"); 
		return Building_ID;
	}
	public void setBuilding_ID(String buildingID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 52 3 742909"); 
		Building_ID = buildingID;
	}
	public String getDomitory_ID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 52 4 742909"); 
		return Domitory_ID;
	}
	public void setDomitory_ID(String domitoryID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 52 5 742909"); 
		Domitory_ID = domitoryID;
	}
	public String getStudent_Username() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 52 6 742909"); 
		return Student_Username;
	}
	public void setStudent_Username(String studentUsername) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 52 7 742909"); 
		Student_Username = studentUsername;
	}
	//处理用户请求的execute方法
	/**
	 * asdfas
	 */
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 52 8 742909"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","AdminLogList","742909");
		
		//解决乱码，用于页面输�?
		
		HttpServletResponse response=null;
		response  =		ServletActionContext.getResponse();
		response.	setContentType("text/html;charset=UTF-8");
		response.			setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = 	ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if	(   (ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 52 9 742909")|| true) && (session .  getAttribute("id")  ==       null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 52 0 0 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 52 0 0 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 52 10 742909"); {
			out.print	("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>"	);
			out.	flush();
			out.   close();
			return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 52 11 742909");

		//查询条件
		String strWhere="Student_State='入住'";
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 52 12 742909")|| true) && (!(	isInvalid(		Building_ID))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 52 1 1 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 52 1 1 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 52 13 742909"); 
		{
			strWhere+=" and Building_ID='"+Building_ID+"'";
		} }
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 52 15 742909")|| true) && (!(	isInvalid(		Domitory_ID))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 52 2 2 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 52 2 2 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 52 16 742909"); 
		{
			strWhere+=" and Domitory_ID='"+Domitory_ID+"'";
		} }
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 52 18 742909")|| true) && (!(	isInvalid(			Student_Username))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 52 3 3 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 52 3 3 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 52 19 742909"); 
		{
			strWhere+=" and Student_Username='"+Student_Username+"'";
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 52 20 742909");
		//查询�?�?
		list=new LogDao().GetList(strWhere,"Log_Date desc");
		
	
		return SUCCESS;
		
	}
	
	
	//判断是否空�??
	/**
	 * 判断是否空�??
	 * @param value
	 * @return
	 */
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 52 21 742909"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	/**
	 * 测试
	 * @param args
	 */
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 52 22 742909"); 
		System.out.println();
	}
	
}
