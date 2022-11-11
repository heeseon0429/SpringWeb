package myclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/*
 * ��(������)�� ���������� ����
 * 
 * 1. ModelAndView ����
 * 			- addObject()
 * 2. Model ( ȣ���Լ��� ���ڿ� ���� �ϱ� )
 * 			- setAttribute()
 */
@Controller
@RequestMapping("review/")
public class ReviewController {

	@RequestMapping("modelandview.do")
	public ModelAndView test() {
		//1. ModelAndView �������� ����
		ModelAndView mv = new ModelAndView();
		mv.setViewName("review/void");
		mv.addObject("greeting", "�����ູ");
		mv.addObject("test", "�׽�Ʈ");
		return mv;
	}
	
	@RequestMapping("string.do")
	//***********************************
	// Model : ������� �����͸� ���� ��ü
	//			-> ���ڿ� ����
	public String test2(Model m) {	
		//2. ���ڿ� ���� �������� ����
		m.addAttribute("greeting", "�����ູ");
		m.addAttribute("test", "�׽�Ʈ");
		return "review/void";
	}
	
	@RequestMapping("void.do")
	public void test3() {
		//3. void ���� �������� ����
		//   : ��û��� ������ ���������� �ڵ� ����
	}
}
