package com.simple.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.simple.command.BoardVO;

@Repository("boardDAOImpl")
public class BoardDAOImpl implements BoardDAO{
	
	private ArrayList<BoardVO> DB = new ArrayList<>();

	@Override
	public void boardRegist(BoardVO vo) {
		DB.add(vo); //세터
		System.out.println(DB.toString());
		
		
	}

	@Override
	public ArrayList<BoardVO> getList() {
		
		return DB; //게터
	}

	@Override
	public void boardDelete(int num) {
		DB.remove(num);
		
	}

	

}
