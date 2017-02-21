package org.nicsoft.main.system.web;

import java.util.List;

import org.nicsoft.main.system.entity.Product;
import org.nicsoft.main.system.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping("/")
public class TestController {
	
	@Autowired
	private ProductService productService;
	
	
	
	@ResponseBody
	@RequestMapping("findproduct")
	public String findProduct(){
		return JSON.toJSONString(this.productService.findAll());
	}
	
	@RequestMapping("login")
	public String thymeleafTest(ModelMap model){
		
		model.addAttribute("host", "http://blog.didispace.com");
		
		return "/login";
	}
	
	@RequestMapping("product")
	public String TestProduct(ModelMap model){
		List<Product> list = this.productService.findAll();
		model.addAttribute("products", list);
		model.addAttribute("qq", "测试");
		return "/login";
	}
	
	@RequestMapping("delete/{id}")
	public String TestProductDelete(@PathVariable int id){
		int result = this.productService.deleteOne(id);
		return "redirect:/product";
	}
	
	@RequestMapping("updateui/{id}")
	public String TestProductUpdateUI(@PathVariable int id,Model model){
		Product pro = this.productService.findone(id);
		model.addAttribute("product", pro);
		return "/update";
	}
	
	
	
	
	@RequestMapping("update")
	public String TestProductUpdate(Product product){
		this.productService.update(product);
		return "redirect:/product";
	}
	
	
	
	@RequestMapping("insert")
	public String TestProductInsert(Product product){
		this.productService.saveOne(product);
		return "redirect:/product";
	}
	
	@RequestMapping("insertpro")
	public String thymeleafTestInsertpro(){
		return "/insertpro";
	}
}
