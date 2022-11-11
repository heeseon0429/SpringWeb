package myclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("review/")
public class RedirectController {

	@RequestMapping("insert.do")
	public String test() {
		//********************************
		//return "select";   -> �˻����� ���
		//********************************
		// �����̷��� 			 -> �˻����� ��� : ��񿡼� �Ѿ�� �� 
		return "redirect:select.do";
	}
	
	@RequestMapping("select.do")
	public void test2(Model m) {
		m.addAttribute("info", "��񿡼� �Ѿ�� ��");
	}
		
}
