package myclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("review/")
public class RedirectController {

	@RequestMapping("insert.do")
	public String test() {
		//********************************
		//return "select";   -> 검색내용 출력
		//********************************
		// 리다이렉팅 			 -> 검색내용 출력 : 디비에서 넘어온 값 
		return "redirect:select.do";
	}
	
	@RequestMapping("select.do")
	public void test2(Model m) {
		m.addAttribute("info", "디비에서 넘어온 값");
	}
		
}
