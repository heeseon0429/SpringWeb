package myclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
		@RequestMapping("start.do")
		public ModelAndView test() {
			System.out.println("��û����");
			ModelAndView mv = new ModelAndView();
			mv.addObject("message", "����ſ��Ϸ�");
			mv.addObject("object", "�߿��ѵ�����");
			mv.setViewName("secret");
				// "WEB-INF/views/ + secret + .jsp"
			return mv;
		}
		
	
}
