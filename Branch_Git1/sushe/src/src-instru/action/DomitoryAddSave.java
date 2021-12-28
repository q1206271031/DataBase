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


public class DomitoryAddSave extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属�??
	private String Domitory_BuildingID ;
    private String Domitory_Name ;
    private String Domitory_Type ;
    private String Domitory_Number ;
    private String Domitory_Tel ;


	public String getDomitory_BuildingID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 10 0 742909"); 
		return Domitory_BuildingID;
	}

	public void setDomitory_BuildingID(String domitoryBuildingID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 10 1 742909"); 
		Domitory_BuildingID = domitoryBuildingID;
	}

	public String getDomitory_Name() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 10 2 742909"); 
		return Domitory_Name;
	}

	public void setDomitory_Name(String domitoryName) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 10 3 742909"); 
		Domitory_Name = domitoryName;
	}

	public String getDomitory_Type() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 10 4 742909"); 
		return Domitory_Type;
	}

	public void setDomitory_Type(String domitoryType) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 10 5 742909"); 
		Domitory_Type = domitoryType;
	}

	public String getDomitory_Number() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 10 6 742909"); 
		return Domitory_Number;
	}

	public void setDomitory_Number(String domitoryNumber) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 10 7 742909"); 
		Domitory_Number = domitoryNumber;
	}

	public String getDomitory_Tel() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 10 8 742909"); 
		return Domitory_Tel;
	}

	public void setDomitory_Tel(String domitoryTel) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 10 9 742909"); 
		Domitory_Tel = domitoryTel;
	}

	//处理用户请求的execute方法
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 10 10 742909"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","DomitoryAddSave","742909");
		
		//解决乱码，用于页面输�?
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		
		if(/* TRUE */true){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 10 12 742909"); {
			System.out.println("tas");
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 10 13 742909");
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 10 14 742909")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 10 0 0 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 10 0 0 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 10 15 742909"); {
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 10 16 742909");
		
		//查询是否存在
		List<DomitoryBean> list=new DomitoryDao().GetList("Domitory_Name='"+Domitory_Name+"' and Domitory_BuildingID="+Domitory_BuildingID, "");
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 10 17 742909")|| true) && (list.size()>0? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 10 1 1 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 10 1 1 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 10 18 742909"); 
		{
			out.print("<script language='javascript'>alert('该楼宇中已经存在该寝室号�?');history.back(-1);</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 10 19 742909");
		//添加
		DomitoryBean cnbean=new DomitoryBean();
		cnbean.setDomitory_BuildingID(Integer.parseInt(Domitory_BuildingID));
		cnbean.setDomitory_Name(Domitory_Name);
		cnbean.setDomitory_Type(Domitory_Type);
		cnbean.setDomitory_Number(Domitory_Number);
		cnbean.setDomitory_Tel(Domitory_Tel);
		new DomitoryDao().Add(cnbean);
		    
		//跳转
		out.print("<script language='javascript'>alert('添加成功�?');window.location='DomitoryManager.action';</script>");
		out.flush();out.close();return null;
		
	}
	
	//判断是否空�??
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 10 20 742909"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 10 21 742909"); 
		System.out.println();
	}
	
}
