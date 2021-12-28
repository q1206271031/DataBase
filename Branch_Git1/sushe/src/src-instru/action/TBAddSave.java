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


public class TBAddSave extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属�??
	private String TB_TeacherID ;
    private String TB_BuildingID ;
	public String getTB_TeacherID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 14 0 742909"); 
		return TB_TeacherID;
	}

	public void setTB_TeacherID(String tBTeacherID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 14 1 742909"); 
		TB_TeacherID = tBTeacherID;
	}

	public String getTB_BuildingID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 14 2 742909"); 
		return TB_BuildingID;
	}

	public void setTB_BuildingID(String tBBuildingID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 14 3 742909"); 
		TB_BuildingID = tBBuildingID;
	}

	//处理用户请求的execute方法
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 14 4 742909"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","TBAddSave","742909");
		
		//解决乱码，用于页面输�?
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 14 5 742909")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 14 0 0 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 14 0 0 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 14 6 742909"); {
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 14 7 742909");
		
		//查询是否存在
		List<TBBean> list=new TBDao().GetList("TB_TeacherID='"+TB_TeacherID+"' and TB_BuildingID="+TB_BuildingID, "");
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 14 8 742909")|| true) && (list.size()>0? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 14 1 1 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 14 1 1 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 14 9 742909"); 
		{
			out.print("<script language='javascript'>alert('该管理员已经在管理本楼宇了，不要重复添加�?');history.back(-1);</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 14 10 742909");
		
		//添加
		TBBean cnbean=new TBBean();
		cnbean.setTB_TeacherID(Integer.parseInt(TB_TeacherID));
		cnbean.setTB_BuildingID(Integer.parseInt(TB_BuildingID));

		new TBDao().Add(cnbean);
		    
		//跳转
		out.print("<script language='javascript'>alert('添加成功�?');window.location='TBManager.action?Building_ID="+TB_BuildingID+"';</script>");
		out.flush();out.close();return null;
		
	}
	
	//判断是否空�??
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 14 11 742909"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 14 12 742909"); 
		System.out.println();
	}
	
}
