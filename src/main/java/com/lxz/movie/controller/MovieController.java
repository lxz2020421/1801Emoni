package com.lxz.movie.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.lxz.movie.domain.Movie;
import com.lxz.movie.service.MovieService;
import com.lxz.movie.vo.MovieVO;

@Controller
public class MovieController {
	@Resource
	private MovieService service;
	@RequestMapping("select")
	public String select(Model model,MovieVO movieVO,@RequestParam(defaultValue = "1")Integer pageNum,@RequestParam(defaultValue = "2")Integer pageSize) {
		
		
		PageInfo<Movie> info = service.select(movieVO, pageNum, pageSize);
		model.addAttribute("info", info);
		model.addAttribute("movieVO", movieVO);
		return "list";
	}
}
