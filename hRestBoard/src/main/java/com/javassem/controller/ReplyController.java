package com.javassem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javassem.domain.ReplyVO;
import com.javassem.service.ReplyService;

@RestController
public class ReplyController {
   
      @Autowired
      private ReplyService replyService;
      
      
      @PostMapping("replies/new")
      public int insert(ReplyVO vo) {
         System.out.println("입력 요청: " + vo);
         return replyService.insertReply(vo);
      }
      
      @GetMapping("replies")
      public List<ReplyVO> selectAllReply(){
            return replyService.selectAllReply();
      }
      
      
      @DeleteMapping("replies/{rno}")
      public void delete(@PathVariable Integer rno) {
            System.out.println(rno + "번 삭제");
            replyService.deleteReply(rno);
      }
      
      
}