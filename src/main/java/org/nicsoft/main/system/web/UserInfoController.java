/**
 * 
 */
package org.nicsoft.main.system.web;

import org.nicsoft.main.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;

/**
 * @author gengyiding
 *
 */
@Controller
public class UserInfoController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * 查询用户
	 * @return
	 */
	@ResponseBody
	@RequestMapping("finduser")
	public String findUser() {
		return JSON.toJSONString(userService.findAll());
	}
	
	/**
	 * findById
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping("user/{id}")
	public String findById(@PathVariable int id) {
		return JSON.toJSONString(userService.findOne(id));
	}
	
	
	
	@RequestMapping("/index")
	public String toHome() {
		//ModelAndView mv = new ModelAndView("login");
		//mv.addObject("olddai", "第一个Springboot案例");
		
		return "login";
	}
}
