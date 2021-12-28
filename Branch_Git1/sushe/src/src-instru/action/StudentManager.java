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


public class StudentManager extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属�??
	private List<StudentBean> list;
	public List<StudentBean> getList() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 45 0 742909"); 
		return list;
	}
	public void setList(List<StudentBean> list) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 45 1 742909"); 
		this.list = list;
	}
	private String SearchRow;
	private String SearchKey;
	private String State;
	public String getState() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 45 2 742909"); 
		return State;
	}
	public void setState(String state) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 45 3 742909"); 
		State = state;
	}
	public String getSearchRow() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 45 4 742909"); 
		return SearchRow;
	}
	public void setSearchRow(String searchRow) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 45 5 742909"); 
		SearchRow = searchRow;
	}
	public String getSearchKey() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 45 6 742909"); 
		return SearchKey;
	}
	public void setSearchKey(String searchKey) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 45 7 742909"); 
		SearchKey = searchKey;
	}
	
	public void printOO(){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 45 8 742909"); 
		System.out.println("OOO");
	}
	//处理用户请求的execute方法
	/**
	 * 处理用户请求的execute方法
	 */
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 45 9 742909"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","StudentManager","742909");
		
		//解决乱码，用于页面输�?
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 10 742909")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 0 0 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 0 0 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 11 742909"); {
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 12 742909");
		//查询条件
		String strWhere="1=1";
		
		printOO();
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 13 742909")|| true) && (!(isInvalid(SearchKey))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 1 1 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 1 1 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 14 742909"); 
		{
			strWhere+=" and "+SearchRow+"='"+SearchKey+"'";
		} }
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 16 742909")|| true) && (!(isInvalid(State))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 2 2 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 45 2 2 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 17 742909"); 
		{
			strWhere+=" and Student_State='"+State+"'";
			jesus();
		} }
		else{  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 18 742909"); 
		{
			strWhere+=" and Student_State='入住'";
			jesus();
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 45 19 742909");
		//查询�?�?
		list=new StudentDao().GetAllList(strWhere,"Student_Name");
	
		return SUCCESS;
		
	}
	/**
	 * 公共设施
	 */
	public void jesus()
	{
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 45 20 742909"); 
		System.out.println("jesus");
	}
	
	//判断是否空�??
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 45 21 742909"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	/**
	 * 测试
	 * @param args
	 */
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 45 22 742909"); 
		System.out.println();
	}
	
}
