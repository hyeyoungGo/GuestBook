package com.bit2017.guestbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit2017.guestbook.repository.GuestBookDao;
import com.bit2017.guestbook.vo.GuestBookVo;

@Controller
public class GuestBookController {
	
	@Autowired
	private GuestBookDao guestBookDao;
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<GuestBookVo> list = guestBookDao.getList();
		
		model.addAttribute("list", list);
		
		return "/WEB-INF/views/index.jsp";
	}
	
	@RequestMapping("/add")
	public String add(@ModelAttribute GuestBookVo vo) {
		
		guestBookDao.insert(vo);
		
		return "redirect:/list";
	}
	
	@RequestMapping("/deleteform/{no}")
	public String deleteform(
			Model model,
			@PathVariable("no") Long no) {
		
		model.addAttribute("no", no);
		
		return "/WEB-INF/views/deleteform.jsp";
	}
	
	@RequestMapping("/delete")
	public String delete(
			@ModelAttribute GuestBookVo vo) {
		
		guestBookDao.delete(vo);
		
		return "redirect:/list";
	}
	
	@RequestMapping("/modifyform/{no}")
	public String modifyform(
			Model model,
			@PathVariable("no") Long no) {
		
		model.addAttribute("no", no);
		
		return "/WEB-INF/views/modifyform.jsp";
	}
	
	@RequestMapping("/modify")
	public String modify(
			@ModelAttribute GuestBookVo vo) {
		
		guestBookDao.modify(vo);
		
		return "redirect:/list";
	}

}
