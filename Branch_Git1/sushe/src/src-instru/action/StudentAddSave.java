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


public class StudentAddSave extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属�??
	/**
	 * 下面是Action内用于封装用户请求参数的属�??
	 */
	private String Student_Username ;
    private String Student_Password ;
    private String Student_Name ;
    private String Student_Sex ;
    private String Student_Class ;
	public String getStudent_Username() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 15 0 742909"); 
		return Student_Username;
	}

	public void setStudent_Username(String studentUsername) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 15 1 742909"); 
		Student_Username = studentUsername;
	}

	public String getStudent_Password() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 15 2 742909"); 
		return Student_Password;
	}

	public void setStudent_Password(String studentPassword) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 15 3 742909"); 
		Student_Password = studentPassword;
	}

	public String getStudent_Name() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 15 4 742909"); 
		return Student_Name;
	}

	public void setStudent_Name(String studentName) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 15 5 742909"); 
		Student_Name = studentName;
	}

	public String getStudent_Sex() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 15 6 742909"); 
		return Student_Sex;
	}

	public void setStudent_Sex(String studentSex) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 15 7 742909"); 
		Student_Sex = studentSex;
	}

	public String getStudent_Class() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 15 8 742909"); 
		return Student_Class;
	}

	public void setStudent_Class(String studentClass) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 15 9 742909"); 
		Student_Class = studentClass;
	}

	private void hello(){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 15 10 742909"); 
		System.out.println("hello");
	}
	//处理用户请求的execute方法
	/**
	 * 银行符合
	 */
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 15 11 742909"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","StudentAddSave","742909");
		hello();
		//解决乱码，用于页面输�?
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 15 12 742909")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 15 0 0 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 15 0 0 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 15 13 742909"); {
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 15 14 742909");
		
		//查询用户名是否存�?
		List<StudentBean> list=new StudentDao().GetList("Student_Username='"+Student_Username+"'", "");
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 15 15 742909")|| true) && (list.size()>0? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 15 1 1 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 15 1 1 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 15 16 742909"); 
		{
			out.print("<script language='javascript'>alert('用户名已经存在！');history.back(-1);</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 15 17 742909");
		//添加
		StudentBean cnbean=new StudentBean();
		cnbean.setStudent_Username(Student_Username);
		cnbean.setStudent_Password(Student_Password);
		cnbean.setStudent_Name(Student_Name);
		cnbean.setStudent_Sex(Student_Sex);
		cnbean.setStudent_Class(Student_Class);
		cnbean.setStudent_State("未入�?");
		cnbean.setStudent_DomitoryID(0);
		new StudentDao().Add(cnbean);
		    
		//跳转
		out.print("<script language='javascript'>alert('添加成功�?');window.location='StudentManager.action';</script>");
		hello();
		out.flush();out.close();return null;
		
	}
	/**
	 * 对方是个公共
	 */
	private void uyoti(){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 15 18 742909"); 
		System.out.println("afafa");
	}
	
	//判断是否空�??
	/**
	 * 判断是否空�??
	 * @param value
	 * @return
	 */
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 15 19 742909"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 15 20 742909"); 
		System.out.println();
	}
	
}
