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


public class TeacherUpdateSave extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属�??
	private String Teacher_ID ;
    private String Teacher_Username ;
    private String Teacher_Password ;
    private String Teacher_Name ;
    private String Teacher_Sex ;
    private String Teacher_Tel ;
	public String getTeacher_ID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 33 0 742909"); 
		return Teacher_ID;
	}

	public void setTeacher_ID(String cookID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 33 1 742909"); 
		Teacher_ID = cookID;
	}

	public String getTeacher_Username() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 33 2 742909"); 
		return Teacher_Username;
	}

	public void setTeacher_Username(String cookUsername) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 33 3 742909"); 
		Teacher_Username = cookUsername;
	}

	public String getTeacher_Password() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 33 4 742909"); 
		return Teacher_Password;
	}

	public void setTeacher_Password(String cookPassword) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 33 5 742909"); 
		Teacher_Password = cookPassword;
	}

	public String getTeacher_Name() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 33 6 742909"); 
		return Teacher_Name;
	}

	public void setTeacher_Name(String cookName) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 33 7 742909"); 
		Teacher_Name = cookName;
	}

	public String getTeacher_Sex() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 33 8 742909"); 
		return Teacher_Sex;
	}

	public void setTeacher_Sex(String cookSex) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 33 9 742909"); 
		Teacher_Sex = cookSex;
	}

	public String getTeacher_Tel() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 33 10 742909"); 
		return Teacher_Tel;
	}

	public void setTeacher_Tel(String cookTel) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 33 11 742909"); 
		Teacher_Tel = cookTel;
	}

	//处理用户请求的execute方法
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 33 12 742909"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","TeacherUpdateSave","742909");
		
		//解决乱码，用于页面输�?
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 33 13 742909")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 33 0 0 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 33 0 0 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 33 14 742909"); {
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 33 15 742909");
		
		//查询用户名是否存�?
		List<TeacherBean> list=new TeacherDao().GetList("Teacher_Username='"+Teacher_Username+"' and Teacher_ID!="+Teacher_ID, "");
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 33 16 742909")|| true) && (list.size()>0? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 33 1 1 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 33 1 1 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 33 17 742909"); 
		{
			out.print("<script language='javascript'>alert('用户名已经存在！');history.back(-1);</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 33 18 742909");
		//修改
		
		TeacherBean cnbean=new TeacherBean();
		cnbean=new TeacherDao().GetBean(Integer.parseInt(Teacher_ID));
		cnbean.setTeacher_Username(Teacher_Username);
		cnbean.setTeacher_Name(Teacher_Name);
		cnbean.setTeacher_Sex(Teacher_Sex);
		cnbean.setTeacher_Tel(Teacher_Tel);
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 33 19 742909")|| true) && (!(isInvalid(Teacher_Password))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 33 2 2 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 33 2 2 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 33 20 742909"); 
		{
			cnbean.setTeacher_Password(Teacher_Password);
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 33 21 742909");
		new TeacherDao().Update(cnbean);
		    
		//跳转
		out.print("<script language='javascript'>alert('修改成功�?');window.location='TeacherManager.action';</script>");
		out.flush();out.close();return null;
		
	}
	
	//判断是否空�??
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 33 22 742909"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 33 23 742909"); 
		System.out.println();
	}
	
}
