package com.subum.dao;

import java.util.List;

import com.subum.vo.MovieVO;

public interface MovieDAO {

	public List<MovieVO> selectMovie() throws Exception;
}
