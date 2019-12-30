package com.zy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/test")
public class TestController {

	@RequestMapping(value = "/testUI")
	public Object testUI(Model model) {
		model.addAttribute("msg","欢迎来到本界面！");
		return "test";
	}
}
