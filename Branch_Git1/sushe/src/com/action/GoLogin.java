package com.action;

import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.dao.*;
import com.bean.*;

import com.opensymphony.xwork2.ActionSupport;

public class GoLogin extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属性
	private String Type;
	private String Username;
	private String Password;
	private String Msg;
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getMsg() {
		return Msg;
	}
	public void setMsg(String msg) {
		Msg = msg;
	}
	/**
	 * Jes萨达
	 */
	private void jesuss(){
		System.out.println("jesuss");
	}
	//处理用户请求的execute方法
	
	public void printLine(){
		
		if(true){
			System.out.println("2885");
			jesuss();
		}else{
			System.out.println("20");
		}
	}
	private void jyyu(){
		System.out.println("jyyu");
	}
	
	/**
	 * 萨达啊发顺丰
	 */
	public String execute() throws Exception {
		
		if(Type.equals("系统管理员"))
		{
			System.out.println("111111111111");
			jyyu();
			if (null == new AdminDao().CheckLogin(Username, Password)) {
				System.out.println("22222222222");
				Msg = "用户名或者密码错误";
				return INPUT;
			}
			else
			{
				
//登录死循环				
					/*for(long i = 1;i > 0;i++){
			if(i % 2 == 0){
				System.out.println("The number can be divisible");
			}else{
				System.out.println("The number cannot be divisible");
			}
		} */
				printLine();
				
				
				
				//获取ID
				String Admin_ID=new AdminDao().CheckLogin(Username, Password);
				//创建session
				HttpSession session = ServletActionContext.getRequest().getSession();
				session.setAttribute("id", Admin_ID);
				session.setAttribute("type", "1");
				return SUCCESS;
			}
		}
		else if(Type.equals("楼宇管理员"))
		{
			if (null == new TeacherDao().CheckLogin(Username, Password)) {
				Msg = "用户名或者密码错误";
				return INPUT;
			}
			else
			{
				//获取ID
				String Teacher_ID=new TeacherDao().CheckLogin(Username, Password);
				//创建session
				HttpSession session = ServletActionContext.getRequest().getSession();
				session.setAttribute("id", Teacher_ID);
				session.setAttribute("type", "2");
				
				return SUCCESS;
			}
		}
		else if(Type.equals("学生"))
		{
			if (null == new StudentDao().CheckLogin(Username, Password)) {
				calFunc();
				
				Msg = "用户名或者密码错误";
				return INPUT;
			}
			else
			{
				
				System.out.println("good");
				//获取ID
				String Student_ID=new StudentDao().CheckLogin(Username, Password);
				//创建session
				HttpSession session = ServletActionContext.getRequest().getSession();
				session.setAttribute("id", Student_ID);
				session.setAttribute("type", "3");
				return SUCCESS;
			}
		}
		else
		{
			Msg = "身份类型错误";
			return INPUT;
		}
		
	}
	public void calFunc()
	{
		int a=1;String b="ccc";int c=1;
		if(a==1 && b=="aaa")
		{
			System.out.println("000");
		}
		if(b=="aaa" || c==1)
		{
			System.out.println("111");
		}
		if(a==2 || b=="aaa")
		{
			System.out.println("222");
		}
	}
}
