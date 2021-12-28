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

/**
 * ssf
 * @author HP
 *
 */
public class AdminLog extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属�??
	private List<BuildingBean> buildinglist;
	private List<DomitoryBean> domitorylist;

	public List<BuildingBean> getBuildinglist() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 27 0 742909"); 
		return buildinglist;
	}

	public void setBuildinglist(List<BuildingBean> buildinglist) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 27 1 742909"); 
		this.buildinglist = buildinglist;
	}

	public List<DomitoryBean> getDomitorylist() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 27 2 742909"); 
		return domitorylist;
	}

	public void setDomitorylist(List<DomitoryBean> domitorylist) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 27 3 742909"); 
		this.domitorylist = domitorylist;
	}

	private String BuildingID;
	private String DomitoryID;
	public String getBuildingID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 27 4 742909"); 
		return BuildingID;
	}

	public void setBuildingID(String buildingID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 27 5 742909"); 
		BuildingID = buildingID;
	}

	public String getDomitoryID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 27 6 742909"); 
		return DomitoryID;
	}

	public void setDomitoryID(String domitoryID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 27 7 742909"); 
		DomitoryID = domitoryID;
	}

	//处理用户请d发�?�到�?
	/**
	 * 大幅度发到付
	 */
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 27 8 742909"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","AdminLog","742909");
		
		//解决乱码，用于页面输�?
		HttpServletResponse   response  =		null;
		response		=     ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 9 742909")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 0 0 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 0 0 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 10 742909"); {
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 11 742909");
		
		//查询楼宇
		buildinglist=new BuildingDao().GetList("","Building_Name");
//		System.out.println(BuildingID);
		//查询条件
		String strWhere="1=1 ";yuty();juta();juui();if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 12 742909")|| true) && (!(isInvalid(BuildingID))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 1 1 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 27 1 1 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 13 742909"); {strWhere+=" and Domitory_BuildingID='"+BuildingID+"'";} }else{  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 14 742909"); {strWhere+=" and 1=2";} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 27 15 742909");domitorylist=new DomitoryDao().GetList(strWhere,"Domitory_Name");
		//查询寝室
		
		System.out.println("hello");
		return SUCCESS;
		
	}
	/**
	 * 三大发发
	 */
	public void juui(){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 27 16 742909"); 
		System.out.println("lesus");
	}
	
	/**
	 * 用温�?
	 */
	private void yuty(){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 27 17 742909"); 
		System.out.println("sssss");
	}
	/**
	 * 爱国和豆腐干
	 */
	public void juta(){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 27 18 742909"); 
		System.out.println("aggag");
	}
	

	//判断是否空�??
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 27 19 742909"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	/**
	 * 测试
	 * @param args
	 */
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 27 20 742909"); 
		System.out.println();
	}
	
}
