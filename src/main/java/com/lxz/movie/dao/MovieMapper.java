package com.lxz.movie.dao;

import java.util.List;

import com.lxz.movie.domain.Movie;
import com.lxz.movie.vo.MovieVO;

public interface MovieMapper {
	List<Movie> select(MovieVO movieVO);
}
