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


public class LogAddSave extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属�??
	private String Log_Date ;
    private String Log_Remark ;

	public String getLog_Date() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 36 0 742909"); 
		return Log_Date;
	}

	public void setLog_Date(String logDate) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 36 1 742909"); 
		Log_Date = logDate;
	}

	public String getLog_Remark() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 36 2 742909"); 
		return Log_Remark;
	}

	public void setLog_Remark(String logRemark) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 36 3 742909"); 
		Log_Remark = logRemark;
	}

	private String Log_StudentID;
	public String getLog_StudentID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 36 4 742909"); 
		return Log_StudentID;
	}

	public void setLog_StudentID(String logStudentID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 36 5 742909"); 
		Log_StudentID = logStudentID;
	}

	//处理用户请求的execute方法
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 36 6 742909"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","LogAddSave","742909");
		
		//解决乱码，用于页面输�?
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 36 7 742909")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 36 0 0 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 36 0 0 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 36 8 742909"); {
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 36 9 742909");
		
		//添加
		LogBean cnbean=new LogBean();
		cnbean.setLog_StudentID(Integer.parseInt(Log_StudentID));
		cnbean.setLog_TeacherID(Integer.parseInt(session.getAttribute("id").toString()));
		cnbean.setLog_Date(Log_Date);
		cnbean.setLog_Remark(Log_Remark);

		new LogDao().Add(cnbean);
		    
		//跳转
		out.print("<script language='javascript'>alert('缺寝登记成功�?');window.location='Index.jsp';</script>");
		out.flush();out.close();return null;
		
	}
	
	//判断是否空�??
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 36 10 742909"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 36 11 742909"); 
		System.out.println();
	}
	
}
