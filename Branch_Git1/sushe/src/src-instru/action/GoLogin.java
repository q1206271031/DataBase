// ZOA_CREATED! DO NOT EDIT IT! -- 
package com.action;
import com.process.ZoaExp;
import com.process.ZoaThreadLocal;


import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.dao.*;
import com.bean.*;

import com.opensymphony.xwork2.ActionSupport;

public class GoLogin extends ActionSupport {

	//下面是Action内用于封装用户请求参数的属�??
	private String Type;
	private String Username;
	private String Password;
	private String Msg;
	public String getType() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 43 0 742909"); 
		return Type;
	}
	public void setType(String type) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 43 1 742909"); 
		Type = type;
	}
	public String getUsername() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 43 2 742909"); 
		return Username;
	}
	public void setUsername(String username) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 43 3 742909"); 
		Username = username;
	}
	public String getPassword() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 43 4 742909"); 
		return Password;
	}
	public void setPassword(String password) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 43 5 742909"); 
		Password = password;
	}
	public String getMsg() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 43 6 742909"); 
		return Msg;
	}
	public void setMsg(String msg) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 43 7 742909"); 
		Msg = msg;
	}
	/**
	 * Jes萨达
	 */
	private void jesuss(){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 43 8 742909"); 
		System.out.println("jesuss");
	}
	//处理用户请求的execute方法
	
	public void printLine(){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 43 9 742909"); 
		
		if(/* TRUE */true){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 43 11 742909"); {
			System.out.println("2885");
			jesuss();
		} }else{  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 43 12 742909"); {
			System.out.println("20");
		} }
	}
	private void jyyu(){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 43 14 742909"); 
		System.out.println("jyyu");
	}
	
	/**
	 * 萨达啊发顺丰
	 */
	public String execute() throws Exception {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 43 15 742909"); 
ZoaExp.S(ZoaThreadLocal.G_Ins().G_CInf(),"ActionSupport","GoLogin","742909");
		
		if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 43 16 742909")|| true) && (Type.equals("系统管理�?")? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 43 0 0 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 43 0 0 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 43 17 742909"); 
		{
			System.out.println("111111111111");
			jyyu();
			if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 43 18 742909")|| true) && (null == new AdminDao().CheckLogin(Username, Password)? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 43 1 1 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 43 1 1 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 43 19 742909");  {
				System.out.println("22222222222");
				Msg = "用户名或者密码错�?";
				return INPUT;
			} }
			else{  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 43 20 742909"); 
			{
				
//登录死循�?				
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
			} }
		} }
		else{  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 43 22 742909");  if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 43 23 742909")|| true) && (Type.equals("楼宇管理�?")? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 43 2 2 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 43 2 2 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 43 24 742909"); 
		{
			if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 43 25 742909")|| true) && (null == new TeacherDao().CheckLogin(Username, Password)? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 43 3 3 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 43 3 3 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 43 26 742909");  {
				Msg = "用户名或者密码错�?";
				return INPUT;
			} }
			else{  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 43 27 742909"); 
			{
				//获取ID
				String Teacher_ID=new TeacherDao().CheckLogin(Username, Password);
				//创建session
				HttpSession session = ServletActionContext.getRequest().getSession();
				session.setAttribute("id", Teacher_ID);
				session.setAttribute("type", "2");
				
				return SUCCESS;
			} }
		} }
		else{  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 43 29 742909");  if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 43 30 742909")|| true) && (Type.equals("学生")? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 43 4 4 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 43 4 4 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 43 31 742909"); 
		{
			if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 43 32 742909")|| true) && (null == new StudentDao().CheckLogin(Username, Password)? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 43 5 5 1 0 ","742909",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 43 5 5 0 0 ","742909",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 43 33 742909");  {
				calFunc();
				
				Msg = "用户名或者密码错�?";
				return INPUT;
			} }
			else{  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 43 34 742909"); 
			{
				
				System.out.println("good");
				//获取ID
				String Student_ID=new StudentDao().CheckLogin(Username, Password);
				//创建session
				HttpSession session = ServletActionContext.getRequest().getSession();
				session.setAttribute("id", Student_ID);
				session.setAttribute("type", "3");
				return SUCCESS;
			} }
		} }
		else{  ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 43 36 742909"); 
		{
			Msg = "身份类型错误";
			return INPUT;
		} } } }
		
	}
	public void calFunc()
	{
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 43 40 742909"); 
		int a=1;String b="ccc";int c=1;
		int zoa_cond_n41_0 = 2;
int zoa_cond_n41_1 = 2;
//zoa_cond_n41_0#a == 1$zoa_cond_n41_1#b == "aaa"
if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 43 41 742909")|| true) && ((a==1?(zoa_cond_n41_0 != (zoa_cond_n41_0 = 1)):(zoa_cond_n41_0 == (zoa_cond_n41_0 = 0))) && (b=="aaa"?(zoa_cond_n41_1 != (zoa_cond_n41_1 = 1)):(zoa_cond_n41_1 == (zoa_cond_n41_1 = 0)))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 43 8 6 1 2 ","742909",true,zoa_cond_n41_0,zoa_cond_n41_1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 43 8 6 0 2 ","742909",false,zoa_cond_n41_0,zoa_cond_n41_1) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 43 42 742909"); 
		{
			System.out.println("000");
		} }
		int zoa_cond_n44_0 = 2;
int zoa_cond_n44_1 = 2;
//zoa_cond_n44_0#b == "aaa"$zoa_cond_n44_1#c == 1
if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 43 44 742909")|| true) && ((b=="aaa"?(zoa_cond_n44_0 != (zoa_cond_n44_0 = 1)):(zoa_cond_n44_0 == (zoa_cond_n44_0 = 0))) || (c==1?(zoa_cond_n44_1 != (zoa_cond_n44_1 = 1)):(zoa_cond_n44_1 == (zoa_cond_n44_1 = 0)))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 43 11 7 1 2 ","742909",true,zoa_cond_n44_0,zoa_cond_n44_1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 43 11 7 0 2 ","742909",false,zoa_cond_n44_0,zoa_cond_n44_1) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 43 45 742909"); 
		{
			System.out.println("111");
		} }
		int zoa_cond_n47_0 = 2;
int zoa_cond_n47_1 = 2;
//zoa_cond_n47_0#a == 2$zoa_cond_n47_1#b == "aaa"
if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 43 47 742909")|| true) && ((a==2?(zoa_cond_n47_0 != (zoa_cond_n47_0 = 1)):(zoa_cond_n47_0 == (zoa_cond_n47_0 = 0))) || (b=="aaa"?(zoa_cond_n47_1 != (zoa_cond_n47_1 = 1)):(zoa_cond_n47_1 == (zoa_cond_n47_1 = 0)))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 43 14 8 1 2 ","742909",true,zoa_cond_n47_0,zoa_cond_n47_1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 43 14 8 0 2 ","742909",false,zoa_cond_n47_0,zoa_cond_n47_1) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 43 48 742909"); 
		{
			System.out.println("222");
		} }
	}
}
