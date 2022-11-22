package middleProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import middleProject.domain.PayVO;
import middleProject.service.JudaService;

@Controller
public class JudaController {
	
	@Autowired
	private JudaService judaService; 

	@RequestMapping("{url}.do")
	public String userJoin(@PathVariable String url) {
		System.out.println("확인");
		return url;
	}
	
	@RequestMapping("payOrder.do")
	public void insertOrder(PayVO payVo) {
		payVo.setDelivery_tel(payVo.getP_num1()+"-"+payVo.getP_num2()+"-"+payVo.getP_num3());
		judaService.insertOrder(payVo);
	}
	
	/*
	 * @RequestMapping("index.do") public void index() {
	 * System.out.println("index.do 실행"); }
	 * 
	 * 
	 * @RequestMapping("intro.do") public void intro() {
	 * System.out.println("intro.do 실행"); }
	 * 
	 * 
	 * @RequestMapping("intro.do") public void goodsList() {
	 * System.out.println("goodsList.do 실행"); }
	 */
	
}
