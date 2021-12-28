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


public class StudentTH extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属�??
	private List<BuildingBean> buildinglist;
	private List<DomitoryBean> domitorylist;

	public List<BuildingBean> getBuildinglist() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 23 0 742909"); 
		return buildinglist;
	}

	public void setBuildinglist(List<BuildingBean> buildinglist) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 23 1 742909"); 
		this.buildinglist = buildinglist;
	}

	public List<DomitoryBean> getDomitorylist() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 23 2 742909"); 
		return domitorylist;
	}

	public void setDomitorylist(List<DomitoryBean> domitorylist) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 23 3 742909"); 
		this.domitorylist = domitorylist;
	}

	private String BuildingID;
	private String DomitoryID;
	public String getBuildingID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 23 4 742909"); 
		return BuildingID;
	}

	public void setBuildingID(String buildingID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 23 5 742909"); 
		BuildingID = buildingID;
	}

	public String getDomitoryID() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 23 6 742909"); 
		return DomitoryID;
	}

	public void setDomitoryID(String domitoryID) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 23 7 742909"); 
		DomitoryID = domitoryID;
	}

	private String Student_Username;
	
	public String getStudent_Username() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 23 8 742909"); 
		return Student_Username;
	}

	public void setStudent_Username(String studentUsername) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 23 9 742909"); 
		Student_Username = studentUsername;
	}
	private StudentBean cnbean;
	public StudentBean getCnbean() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 23 10 742909"); 
		return cnbean;
	}

	public void setCnbean(StudentBean cnbean) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 23 11 742909"); 
		this.cnbean = cnbean;
	}

	//处理用户请求的execute方法
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 23 12 742909"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","StudentTH","742909");
		
		//解决乱码，用于页面输�?
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 23 13 742909")|| true) && (session.getAttribute("id")==null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 23 0 0 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 23 0 0 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 23 14 742909"); {
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 23 15 742909");
		
		//查询是否存在
		List<StudentBean> list=new StudentDao().GetList("Student_Username='"+Student_Username+"'", "");
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 23 16 742909")|| true) && (list.size()<1? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 23 1 1 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 23 1 1 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 23 17 742909"); 
		{
			out.print("<script language='javascript'>alert('学号不存在，或学生未处于入住状�?�！');history.back(-1);</script>");
			out.flush();out.close();return null;
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 23 18 742909");
		
		
		//查询楼宇
		buildinglist=new BuildingDao().GetList("","Building_Name");
//		System.out.println(BuildingID);
		//查询条件
		String strWhere="1=1 ";
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 23 19 742909")|| true) && (!(isInvalid(BuildingID))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 23 2 2 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 23 2 2 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 23 20 742909"); 
		{
			strWhere+=" and Domitory_BuildingID='"+BuildingID+"'";
		} }
		else{  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 23 21 742909"); {
			strWhere+=" and 1=2";
		} }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 23 22 742909");
		arre();
		//查询寝室
		domitorylist=new DomitoryDao().GetList(strWhere,"Domitory_Name");
		
		//查询学生信息
		cnbean=new StudentDao().GetFirstBean("Student_Username='"+Student_Username+"'");
		
		return SUCCESS;
		
	}
	public void arre(){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 23 23 742909"); 
		System.out.println("arre");
	}
	
	//判断是否空�??
	private boolean isInvalid(String value) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 23 24 742909"); 
		return (value == null || value.length() == 0);
	}
	
	//测试
	public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 23 25 742909"); 
		System.out.println();
	}
	
}
