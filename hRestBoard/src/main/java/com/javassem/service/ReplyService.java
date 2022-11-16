package com.javassem.service;

import java.util.List;

import com.javassem.domain.ReplyVO;

public interface ReplyService {

      public int insertReply(ReplyVO vo);
      
      public List<ReplyVO> selectAllReply();
      
      public int deleteReply(Integer rno);
   
}