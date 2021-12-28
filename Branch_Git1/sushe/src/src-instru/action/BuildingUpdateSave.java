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


public class BuildingUpdateSave extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属�??
	private String Building_ID ;
    private String Building_Name ;
    private String Building_Introduction ;
	public String getBuilding_ID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 22 0 742909"); 
		return Building_ID;
	}

	public void setBuilding_ID(String buildingID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 22 1 742909"); 
		Building_ID = buildingID;
	}

	public String getBuilding_Name() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 22 2 742909"); 
		return Building_Name;
	}

	public void setBuilding_Name(String buildingName) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 22 3 742909"); 
		Building_Name = buildingName;
	}

	public String getBuilding_Introduction() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 22 4 742909"); 
		return Building_Introduction;
	}

	public void setBuilding_Introduction(String buildingIntroduction) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 22 5 742909"); 
		Building_Introduction = buildingIntroduction;
	}

	//处理用户请求的execute方法
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 22 6 742909"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","BuildingUpdateSave","742909");
		
		//解决乱码，用于页面输�?
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		if(/* TRUE */true){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 22 8 742909"); {
			System.out.println("rasf");
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 22 9 742909");
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 22 10 742909")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 22 0 0 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 22 0 0 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 22 11 742909"); {
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 22 12 742909");
		
		//查询名称是否存在
		List<BuildingBean> list=new BuildingDao().GetList("Building_Name='"+Building_Name+"' and Building_ID!="+Building_ID, "");
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 22 13 742909")|| true) && (list.size()>0? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 22 1 1 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 22 1 1 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 22 14 742909"); 
		{
			out.print("<script language='javascript'>alert('名称已经存在�?');history.back(-1);</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 22 15 742909");
		//修改
		BuildingBean cnbean=new BuildingBean();
		cnbean=new BuildingDao().GetBean(Integer.parseInt(Building_ID));
		cnbean.setBuilding_Name(Building_Name);
		cnbean.setBuilding_Introduction(Building_Introduction);
		new BuildingDao().Update(cnbean); 
		//跳转
		out.print("<script language='javascript'>alert('修改成功�?');window.location='BuildingManager.action';</script>");
		out.flush();out.close();return null;
		
	}
	
	//判断是否空�??
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 22 16 742909"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 22 17 742909"); 
		System.out.println();
	}
	
}
