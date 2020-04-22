package com.lxz.movie.service;

import com.github.pagehelper.PageInfo;
import com.lxz.movie.domain.Movie;
import com.lxz.movie.vo.MovieVO;

public interface MovieService {
	/**
	 * 
	 * @Title: select 
	 * @Description: TODO
	 * @param movieVO
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @return: PageInfo<Movie>
	 */
	PageInfo<Movie> select(MovieVO movieVO,Integer pageNum,Integer pageSize);
}
