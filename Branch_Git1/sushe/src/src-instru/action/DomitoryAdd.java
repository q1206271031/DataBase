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


public class DomitoryAdd extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属�??
	private List<BuildingBean> list;
	public List<BuildingBean> getList() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 46 0 742909"); 
		return list;
	}
	public void setList(List<BuildingBean> list) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 46 1 742909"); 
		this.list = list;
	}
	//处理用户请求的execute方法
	/**
	 * 撒发大发
	 */
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 46 2 742909"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","DomitoryAdd","742909");
		
		//解决乱码，用于页面输�?
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 46 3 742909")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 46 0 0 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 46 0 0 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 46 4 742909"); {
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 46 5 742909");
		jesus();
		if(/* TRUE */true){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 46 7 742909"); {
			System.out.println("hdgfsf");
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 46 8 742909");

		//查询�?有楼�?
		list=new BuildingDao().GetList("","Building_Name");
		hello();
		return SUCCESS;
		
	}
	private void hello(){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 46 9 742909"); 
		System.out.println("hello");
	}
	/**
	 * 吉尔宿舍
	 */
	private void jesus(){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 46 10 742909"); 
		System.out.println("asfasfa");
	}
	
	//判断是否空�??
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 46 11 742909"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 46 12 742909"); 
		System.out.println();
	}
	
}
