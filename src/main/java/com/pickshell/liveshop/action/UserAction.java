package com.pickshell.liveshop.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

@Controller("userAction")
public class UserAction {
	public String reg() {
		try {
			ServletActionContext.getContext().getSession()
					.put("msg", "注册成功了，可以去登陆了");
			return "success";

		} catch (Exception e) {
			e.printStackTrace();
			ServletActionContext.getContext().getSession().put("msg", "注册失败了");
			return "error";
		}
	}
}
