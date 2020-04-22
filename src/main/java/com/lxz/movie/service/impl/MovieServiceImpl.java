package com.lxz.movie.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lxz.movie.dao.MovieMapper;
import com.lxz.movie.domain.Movie;
import com.lxz.movie.service.MovieService;
import com.lxz.movie.vo.MovieVO;
@Service
public class MovieServiceImpl implements MovieService{
	@Autowired
	private MovieMapper mapper;
	@Override
	public PageInfo<Movie> select(MovieVO movieVO, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Movie> list = mapper.select(movieVO);
		return new PageInfo<Movie>(list);
	}

}
