package com.javassem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javassem.domain.BoardVO;
import com.javassem.service.BoardService;

@Controller
public class BoardController {
   
   @Autowired
   private BoardService boardService;
      
   @RequestMapping("getBoardList.do")
   public void getBoardList(Model m) {
      List<BoardVO> list=boardService.getBoardList();
      m.addAttribute("boardList", list);
   }

   @RequestMapping("insertBoard.do")
   public void insertBoard() {
	   
   }

   @RequestMapping("saveBoard.do")
   public String saveBoard(BoardVO boardVO) {
	  // System.out.println(boardVO.getContent());
	   boardService.insertBoard(boardVO);
	   return "redirect:getBoardList.do";
   }
   
   @RequestMapping("getBoard.do")
   public void getBoard(BoardVO boardVO, Model m) {
	  BoardVO resultVO = boardService.getBoard(boardVO);
	  m.addAttribute("board", resultVO);
   }
   
   //삭제
   @RequestMapping("deleteBoard.do")
   public String deleteBoard(BoardVO boardVO) {
	   boardService.deleteBoard(boardVO);
	   return "redirect:getBoardList.do"; 
   }
   
   //수정
   @RequestMapping("updateBoard.do")
   public String updateBoard(BoardVO boardVO) {
	   boardService.updateBoard(boardVO);
	   return "redirect:getBoardList.do";
   }
}