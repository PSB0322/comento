package com.subum.service;

import java.util.List;

import com.subum.vo.MovieVO;

public interface MovieService {

	public List<MovieVO> selectMovie() throws Exception;
	
}
