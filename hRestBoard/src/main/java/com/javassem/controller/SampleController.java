package com.javassem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javassem.domain.SampleVO;

// @Controller + @ResponseBody 같은 역할  =  @RestController
@RestController
public class SampleController {

	//@RequestMapping 보다 구체적으로 @GetMapping
	@GetMapping(value="getText",
			produces="text/plain;charset=utf-8")
	public String getText() {
		return "컨트롤러에서 보냄";
	}// end of getText()
	
	
	@GetMapping(value="getObject")
	public SampleVO getObject() {
		SampleVO vo = new SampleVO("윤희선", 25, "화이팅");
		return vo;
	}// end of getObject()

	@GetMapping("getList")
	public List<SampleVO> getList() {
		List<SampleVO> list = new ArrayList<SampleVO>();
		list.add(new SampleVO("윤희선", 23, "떡볶이먹고싶다"));
		list.add(new SampleVO("희선", 24, "집가고싶다"));
		list.add(new SampleVO("희선이", 25, "자고싶다"));
		return list;
	} //end of getList()
	
	
	@GetMapping("sample/{cate}/{cno}")
	public String[] sample(@PathVariable String cate,
					   @PathVariable String cno) { //경로 관련 파라미터
		return new String[] {"카테고리:" + cate,
							 "상품번호:" + cno};
	} // end of sample()

	@PostMapping("sample/data")
	public SampleVO post(SampleVO vo) {
		System.out.println("sample/data 요청");
		return vo;
	}


}
