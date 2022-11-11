package Sample.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Sample.service.SampleService;

@Controller
public class SampleController {

	@Autowired
	private SampleService service;
	
	@RequestMapping("sample.do")
	public String sample(Model m) {
		m.addAttribute("serverTime",service.sample());
		return "home";
	}
}
