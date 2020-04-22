package com.lxz.movie.service.impl;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageInfo;
import com.lxz.movie.domain.Movie;
import com.lxz.movie.service.MovieService;
import com.lxz.movie.vo.MovieVO;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class MovieServiceImplTest {
	@Resource
	private MovieService service;
	@Test
	public void testSelect() {
		PageInfo<Movie> info = service.select(new MovieVO(), 1, 10);
		System.out.println(info);
	}

}
