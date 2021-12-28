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


public class DomitoryManager extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属�??
	private List<DomitoryBean> list;
	public List<DomitoryBean> getList() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 19 0 742909"); 
		return list;
	}
	public void setList(List<DomitoryBean> list) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 19 1 742909"); 
		this.list = list;
	}
	private String SearchRow;
	private String SearchKey;
	public String getSearchRow() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 19 2 742909"); 
		return SearchRow;
	}
	public void setSearchRow(String searchRow) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 19 3 742909"); 
		SearchRow = searchRow;
	}
	public String getSearchKey() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 19 4 742909"); 
		return SearchKey;
	}
	public void setSearchKey(String searchKey) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 19 5 742909"); 
		SearchKey = searchKey;
	}
	private List<BuildingBean> buildinglist;
	public List<BuildingBean> getBuildinglist() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 19 6 742909"); 
		return buildinglist;
	}
	public void setBuildinglist(List<BuildingBean> buildinglist) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 19 7 742909"); 
		this.buildinglist = buildinglist;
	}
	private String Domitory_BuildingID;
	public String getDomitory_BuildingID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 19 8 742909"); 
		return Domitory_BuildingID;
	}
	public void setDomitory_BuildingID(String domitoryBuildingID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 19 9 742909"); 
		Domitory_BuildingID = domitoryBuildingID;
	}
	//处理用户请求的execute方法
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 19 10 742909"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","DomitoryManager","742909");
		
		//解决乱码，用于页面输�?
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 19 11 742909")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 19 0 0 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 19 0 0 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 19 12 742909"); {
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
		if(/* TRUE */true){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 19 15 742909"); {
			System.out.println("sadasd");
		} }else{  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 19 16 742909"); {
			System.out.println("traffa");
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 19 17 742909");
		//查询条件
		String strWhere="1=1";
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 19 18 742909")|| true) && (!(isInvalid(SearchKey))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 19 1 1 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 19 1 1 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 19 19 742909"); 
		{
			strWhere+=" and "+SearchRow+"='"+SearchKey+"'";
		} }
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 19 21 742909")|| true) && (!(isInvalid(Domitory_BuildingID))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 19 2 2 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 19 2 2 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 19 22 742909"); 
		{
			strWhere+=" and Domitory_BuildingID='"+Domitory_BuildingID+"'";
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 19 23 742909");
		
		//查询�?有楼�?
		buildinglist=new BuildingDao().GetList("","Building_Name");
		
		//查询�?�?
		list=new DomitoryDao().GetList(strWhere,"Domitory_Name");
		ssss();
	
		return SUCCESS;
		
	}
	private void ssss(){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 19 24 742909"); 
		System.out.println("ssss");
	}
	
	//判断是否空�??
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 19 25 742909"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 19 26 742909"); 
		System.out.println();
	}
	
}
