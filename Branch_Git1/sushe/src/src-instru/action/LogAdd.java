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


public class LogAdd extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属�??
	
	private String Student_ID;
	public String getStudent_ID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 41 0 742909"); 
		return Student_ID;
	}
	public void setStudent_ID(String studentID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 41 1 742909"); 
		Student_ID = studentID;
	}
	private StudentBean cnbean;
	public StudentBean getCnbean() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 41 2 742909"); 
		return cnbean;
	}
	public void setCnbean(StudentBean cnbean) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 41 3 742909"); 
		this.cnbean = cnbean;
	}
	//处理用户请求的execute方法
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 41 4 742909"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","LogAdd","742909");
		
		//解决乱码，用于页面输�?
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 41 5 742909")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 41 0 0 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 41 0 0 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 41 6 742909"); {
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 41 7 742909");

		//查询
		cnbean=new StudentDao().GetBean(Integer.parseInt(Student_ID));
	
		return SUCCESS;
		
	}
	
	//判断是否空�??
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 41 8 742909"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 41 9 742909"); 
		System.out.println();
	}
	
}
