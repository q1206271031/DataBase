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


public class PasswordUpdateSave extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属�??
	private String Password;
	private String Password2;
	private String Msg;
	public String getPassword() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 5 0 742909"); 
		return Password;
	}

	public void setPassword(String password) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 5 1 742909"); 
		Password = password;
	}

	public String getPassword2() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 5 2 742909"); 
		return Password2;
	}

	public void setPassword2(String password2) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 5 3 742909"); 
		Password2 = password2;
	}

	public String getMsg() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 5 4 742909"); 
		return Msg;
	}

	public void setMsg(String msg) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 5 5 742909"); 
		Msg = msg;
	}

	//处理用户请求的execute方法
	/**
	 * 处理用户请求的execute方法
	 */
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 5 6 742909"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","PasswordUpdateSave","742909");
		
		//解决乱码，用于页面输�?
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 7 742909")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 5 0 0 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 5 0 0 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 8 742909"); {
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 9 742909");
		String type=session.getAttribute("type").toString();
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 10 742909")|| true) && (type.equals("1")? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 5 1 1 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 5 1 1 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 11 742909"); //校园管理员身�?
		{
			//查询原密码是否正�?
			if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 12 742909")|| true) && (new AdminDao().CheckPassword(session.getAttribute("id").toString(), Password)? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 5 2 2 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 5 2 2 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 13 742909");  {
				//修改密码
				AdminBean cnbean=new AdminBean();
				cnbean=new AdminDao().GetBean(Integer.parseInt(session.getAttribute("id").toString()));
				cnbean.setAdmin_Password(Password2);
				new AdminDao().Update(cnbean);
				out.print("<script language='javascript'>alert('修改成功�?');window.location='PasswordUpdate.jsp';</script>");
				out.flush();out.close();return null;
			} }
			else{  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 14 742909"); 
			{
				Msg = "用户名或者密码错�?";
				return INPUT;
			} }
		} }
		else{  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 16 742909");  if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 17 742909")|| true) && (type.equals("2")? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 5 3 3 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 5 3 3 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 18 742909"); //楼宇管理员身�?
		{
			//查询原密码是否正�?
			if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 19 742909")|| true) && (new TeacherDao().CheckPassword(session.getAttribute("id").toString(), Password)? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 5 4 4 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 5 4 4 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 20 742909");  {
				//修改密码
				TeacherBean cnbean=new TeacherBean();
				cnbean=new TeacherDao().GetBean(Integer.parseInt(session.getAttribute("id").toString()));
				cnbean.setTeacher_Password(Password2);
				new TeacherDao().Update(cnbean);
				out.print("<script language='javascript'>alert('修改成功�?');window.location='PasswordUpdate.jsp';</script>");
				out.flush();out.close();return null;
			} }
			else{  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 21 742909"); 
			{
				Msg = "用户名或者密码错�?";
				return INPUT;
			} }
		} }
		else{  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 23 742909");  if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 24 742909")|| true) && (type.equals("3")? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 5 5 5 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 5 5 5 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 25 742909"); //学生身份
		{
			//查询原密码是否正�?
			if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 26 742909")|| true) && (new StudentDao().CheckPassword(session.getAttribute("id").toString(), Password)? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 5 6 6 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 5 6 6 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 27 742909");  {
				//修改密码
				StudentBean cnbean=new StudentBean();
				cnbean=new StudentDao().GetBean(Integer.parseInt(session.getAttribute("id").toString()));
				cnbean.setStudent_Password(Password2);
				new StudentDao().Update(cnbean);
				out.print("<script language='javascript'>alert('修改成功�?');window.location='PasswordUpdate.jsp';</script>");
				out.flush();out.close();return null;
			} }
			else{  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 28 742909"); 
			{
				Msg = "用户名或者密码错�?";
				return INPUT;
			} }
		} }
		else{  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 5 30 742909"); 
		{
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} } } }
		

	}
	
	//判断是否空�??
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 5 34 742909"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	/**
	 * 测试
	 * @param args
	 */
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 5 35 742909"); 
		System.out.println();
	}
	
}
