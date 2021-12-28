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


public class StudentUpdateSave extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属�??
	private String Student_ID ;
    private String Student_Username ;
    private String Student_Password ;
    private String Student_Name ;
    private String Student_Sex ;
    private String Student_Class ;
	public String getStudent_ID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 50 0 742909"); 
		return Student_ID;
	}

	public void setStudent_ID(String studentID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 50 1 742909"); 
		Student_ID = studentID;
	}

	public String getStudent_Username() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 50 2 742909"); 
		return Student_Username;
	}

	public void setStudent_Username(String studentUsername) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 50 3 742909"); 
		Student_Username = studentUsername;
	}

	public String getStudent_Password() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 50 4 742909"); 
		return Student_Password;
	}

	public void setStudent_Password(String studentPassword) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 50 5 742909"); 
		Student_Password = studentPassword;
	}

	public String getStudent_Name() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 50 6 742909"); 
		return Student_Name;
	}

	public void setStudent_Name(String studentName) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 50 7 742909"); 
		Student_Name = studentName;
	}

	public String getStudent_Sex() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 50 8 742909"); 
		return Student_Sex;
	}

	public void setStudent_Sex(String studentSex) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 50 9 742909"); 
		Student_Sex = studentSex;
	}

	public String getStudent_Class() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 50 10 742909"); 
		return Student_Class;
	}

	public void setStudent_Class(String studentClass) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 50 11 742909"); 
		Student_Class = studentClass;
	}

	//处理用户请求的execute方法
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 50 12 742909"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","StudentUpdateSave","742909");
		
		//解决乱码，用于页面输�?
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 50 13 742909")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 50 0 0 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 50 0 0 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 50 14 742909"); {
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 50 15 742909");
		
		//查询用户名是否存�?
		List<StudentBean> list=new StudentDao().GetList("Student_Username='"+Student_Username+"' and Student_ID!="+Student_ID, "");
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 50 16 742909")|| true) && (list.size()>0? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 50 1 1 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 50 1 1 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 50 17 742909"); 
		{
			out.print("<script language='javascript'>alert('用户名已经存在！');history.back(-1);</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 50 18 742909");
		//修改
		
		StudentBean cnbean=new StudentBean();
		cnbean=new StudentDao().GetAllBean(Integer.parseInt(Student_ID));
		cnbean.setStudent_Username(Student_Username);
		cnbean.setStudent_Name(Student_Name);
		cnbean.setStudent_Sex(Student_Sex);
		cnbean.setStudent_Class(Student_Class);
		jesuys();
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 50 19 742909")|| true) && (!(isInvalid(Student_Password))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 50 2 2 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 50 2 2 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 50 20 742909"); 
		{
			cnbean.setStudent_Password(Student_Password);
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 50 21 742909");
		new StudentDao().Update(cnbean);
		    
		//跳转
		out.print("<script language='javascript'>alert('修改成功�?');window.location='StudentManager.action';</script>");
		out.flush();out.close();return null;
		
	}
	public void jesuys(){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 50 22 742909"); 
		System.out.println();
	}
	
	//判断是否空�??
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 50 23 742909"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 50 24 742909"); 
		System.out.println();
	}
	
}
