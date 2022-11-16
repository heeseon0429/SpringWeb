package com.javassem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javassem.dao.ReplyDAO;
import com.javassem.domain.ReplyVO;

@Service("replyService")
public class ReplyServiceImpl implements ReplyService{

	@Autowired
	private ReplyDAO replyDAO;

	@Override
	public int insertReply(ReplyVO vo) {
		return replyDAO.insertReply(vo);
	} // end of insertReply()
	
	
	public List<ReplyVO> selectAllReply() {
		return replyDAO.selectAllReply();
	} // end of selectAll()


	@Override
	public int deleteReply(Integer rno) {
		
		return replyDAO.deleteReply(rno);
	}
	
}
