// ZOA_CREATED! DO NOT EDIT IT! -- 
package com.action;
import com.process.ZoaExp;
import com.process.ZoaThreadLocal;


import java.io.PrintWriter;
import java.util.Calendar;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

import com.bean.*;
import com.dao.*;


public class StudentQCSave extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属�??
	private String Student_ID ;
	private String Out_Remark ;
	public String getOut_Remark() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 30 0 742909"); 
		return Out_Remark;
	}

	public void setOut_Remark(String outRemark) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 30 1 742909"); 
		Out_Remark = outRemark;
	}

	public String getStudent_ID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 30 2 742909"); 
		return Student_ID;
	}

	public void setStudent_ID(String studentID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 30 3 742909"); 
		Student_ID = studentID;
	}

	//处理用户请求的execute方法
	/**
	 * 处理用户请求的execute方法
	 */
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 30 4 742909"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","StudentQCSave","742909");
		
		//解决乱码，用于页面输�?
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 30 5 742909")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 30 0 0 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 30 0 0 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 30 6 742909"); {
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 30 7 742909");
		

		//修改学生状�??
		StudentBean cnbean=new StudentBean();
		cnbean=new StudentDao().GetBean(Integer.parseInt(Student_ID));
		cnbean.setStudent_State("迁出");
		new StudentDao().Update(cnbean);
		
		//添加迁出记录
		OutBean outbean=new OutBean();
		outbean.setOut_StudentID(Integer.parseInt(Student_ID));
		outbean.setOut_Date(getNowdate());
		outbean.setOut_Remark(Out_Remark);

		new OutDao().Add(outbean);
		    
		//跳转
		out.print("<script language='javascript'>alert('学生迁出操作成功�?');window.location='StudentTH.jsp';</script>");
		out.flush();out.close();return null;
		
	}
	//获取当前日期
	public String getNowdate(){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 30 8 742909"); 
		Calendar c=Calendar.getInstance();
		c.add(Calendar.MONTH, 1);
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH);
		int date=c.get(Calendar.DATE);
		return year+"-"+month+"-"+date;
	}
	//判断是否空�??
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 30 9 742909"); 
		return (value == null || value.length() == 0);
	}
	/**
	 * 发发�?
	 */
	public void priny(){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 30 10 742909"); 
		System.out.println("saddf");
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 30 11 742909"); 
		System.out.println();
	}
	
}
