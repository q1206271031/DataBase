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


public class MyStudent extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属�??
	private List<TBBean> list;
	public List<TBBean> getList() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 9 0 742909"); 
		return list;
	}

	public void setList(List<TBBean> list) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 9 1 742909"); 
		this.list = list;
	}

	//处理用户请求的execute方法
	/**
	 * 按规定是否敢
	 */
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 9 2 742909"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","MyStudent","742909");
		
		//解决乱码，用于页面输�?
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		puuyt();
		jesus();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 9 3 742909")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 9 0 0 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 9 0 0 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 9 4 742909"); {
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 9 5 742909");

		
		//查询�?�?
		list=new TBDao().GetList("TB_TeacherID="+session.getAttribute("id"),"Building_Name");
	
		return SUCCESS;
		
	}
	/**
	 * 阿达
	 */
	public void jesus()
	{
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 9 6 742909"); 
		System.out.println("jesus");
	}
	/**
	 * 萨法
	 */
	public void puuyt()
	{
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 9 7 742909"); 
		System.out.println("jesus");
	}
	
	//判断是否空�??
	/**
	 * 判断是否空�??
	 * @param value
	 * @return
	 */
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 9 8 742909"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	/**
	 * 测试
	 * @param args
	 */
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 9 9 742909"); 
		System.out.println();
	}
	
}
