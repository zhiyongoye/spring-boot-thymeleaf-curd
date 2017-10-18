package com.neo.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neo.entity.User;
import com.neo.service.UserService;

@Controller
public class UserController {

	@Resource
	UserService userService;

	// 首页
	@RequestMapping("/")
	public String index() {
		return "redirect:/list";
	}

	// 查询所有
	@RequestMapping("/list")
	public String list(Model model) {
		List<User> users = userService.getUserList();
		model.addAttribute("users", users);
		return "user/list";
	}

	// 跳转到添加数据的页面
	@RequestMapping("/toAdd")
	public String toAdd() {
		return "user/userAdd";
	}

	// 页面添加数据
	@RequestMapping("add")
	public String add(User user) {
		userService.save(user);
		return "redirect:/list";
	}

	// 跳转到修改数据的页面
	@RequestMapping("toEdit")
	public String toEdit(Model model, long id) {
		User user = userService.findUserById(id);
		model.addAttribute("user", user);
		return "user/userEdit";
	}

	// 页面修改数据
	@RequestMapping("edit")
	public String edit(User user) {
		userService.edit(user);
		return "redirect:/list";
	}

	// 删除数据
	@RequestMapping("/delete")
	public String delete(long id) {
		userService.delete(id);
		return "redirect:/list";
	}

}
