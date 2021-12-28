package com.action;

import java.io.PrintWriter;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

import com.bean.*;
import com.dao.*;


public class StudentManager extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属性
	private List<StudentBean> list;
	public List<StudentBean> getList() {
		return list;
	}
	public void setList(List<StudentBean> list) {
		this.list = list;
	}
	private String SearchRow;
	private String SearchKey;
	private String State;
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getSearchRow() {
		return SearchRow;
	}
	public void setSearchRow(String searchRow) {
		SearchRow = searchRow;
	}
	public String getSearchKey() {
		return SearchKey;
	}
	public void setSearchKey(String searchKey) {
		SearchKey = searchKey;
	}
	
	public void printOO(){
		System.out.println("OOO");
	}
	//处理用户请求的execute方法
	/**
	 * 处理用户请求的execute方法
	 */
	public String execute() throws Exception {
		
		//解决乱码，用于页面输出
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//创建session对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//验证是否正常登录
		if(session.getAttribute("id")==null){
			out.print("<script language='javascript'>alert('请重新登录！');window.location='Login.jsp';</script>");
			out.flush();out.close();return null;
		}
		//查询条件
		String strWhere="1=1";
		
		printOO();
		if(!(isInvalid(SearchKey)))
		{
			strWhere+=" and "+SearchRow+"='"+SearchKey+"'";
		}
		if(!(isInvalid(State)))
		{
			strWhere+=" and Student_State='"+State+"'";
			jesus();
		}
		else
		{
			strWhere+=" and Student_State='入住'";
			jesus();
		}
		//查询所有
		list=new StudentDao().GetAllList(strWhere,"Student_Name");
	
		return SUCCESS;
		
	}
	/**
	 * 公共设施
	 */
	public void jesus()
	{
		System.out.println("jesus");
	}
	
	//判断是否空值
	private boolean isInvalid(String value) {
		return (value == null || value.length() == 0);
	}
	
	//测试
	/**
	 * 测试
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println();
	}
	
}
