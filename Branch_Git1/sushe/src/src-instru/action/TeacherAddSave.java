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


public class TeacherAddSave extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属�??
	private String Teacher_Username ;
    private String Teacher_Password ;
    private String Teacher_Name ;
    private String Teacher_Sex ;
    private String Teacher_Tel ;
	public String getTeacher_Username() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 6 0 742909"); 
		return Teacher_Username;
	}

	public void setTeacher_Username(String cookUsername) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 6 1 742909"); 
		Teacher_Username = cookUsername;
	}

	public String getTeacher_Password() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 6 2 742909"); 
		return Teacher_Password;
	}

	public void setTeacher_Password(String cookPassword) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 6 3 742909"); 
		Teacher_Password = cookPassword;
	}

	public String getTeacher_Name() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 6 4 742909"); 
		return Teacher_Name;
	}

	public void setTeacher_Name(String cookName) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 6 5 742909"); 
		Teacher_Name = cookName;
	}

	public String getTeacher_Sex() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 6 6 742909"); 
		return Teacher_Sex;
	}

	public void setTeacher_Sex(String cookSex) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 6 7 742909"); 
		Teacher_Sex = cookSex;
	}

	public String getTeacher_Tel() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 6 8 742909"); 
		return Teacher_Tel;
	}

	public void setTeacher_Tel(String cookTel) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 6 9 742909"); 
		Teacher_Tel = cookTel;
	}
	

	//处理用户请求的execute方法
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 6 10 742909"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","TeacherAddSave","742909");
		
		//解决乱码，用于页面输�?
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		
		jesuss();
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 6 11 742909")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 6 0 0 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 6 0 0 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 6 12 742909"); {
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 6 13 742909");
		
		//查询用户名是否存�?
		List<TeacherBean> list=new TeacherDao().GetList("Teacher_Username='"+Teacher_Username+"'", "");
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 6 14 742909")|| true) && (list.size()>0? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 6 1 1 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 6 1 1 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 6 15 742909"); 
		{
			out.print("<script language='javascript'>alert('用户名已经存在！');history.back(-1);</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 6 16 742909");
		//添加
		TeacherBean cnbean=new TeacherBean();
		cnbean.setTeacher_Username(Teacher_Username);
		cnbean.setTeacher_Password(Teacher_Password);
		cnbean.setTeacher_Name(Teacher_Name);
		cnbean.setTeacher_Sex(Teacher_Sex);
		cnbean.setTeacher_Tel(Teacher_Tel);
		new TeacherDao().Add(cnbean);
		    
		//跳转
		out.print("<script language='javascript'>alert('添加成功�?');window.location='TeacherManager.action';</script>");
		out.flush();out.close();return null;
		
	}
	
	private void jesuss(){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 6 17 742909"); 
		System.out.println("jesuss");
	}
	
	//判断是否空�??
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 6 18 742909"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 6 19 742909"); 
		System.out.println();
	}
	
}
