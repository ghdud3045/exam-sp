package com.exam.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exam.sp.service.ExamService;
import com.exam.sp.vo.Exam;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ExamController {

	@Autowired
	private ExamService ese;
	
	@GetMapping(value="/exam")
	public @ResponseBody List<Exam> selectExamList() {
		return ese.selectExamList();
	}
	
	@GetMapping(value="/exam/{exnum}")
	public @ResponseBody Exam getExam(@PathVariable Integer exnum) {
		log.info("num=>{}",exnum);
		return ese.getExam(exnum);
	}
	@PostMapping(value="/exam/{exnum}")
	public @ResponseBody int insertExam(@RequestBody Exam ex,@PathVariable Integer exnum) {
		return ese.insertExam(ex);
	}
	@PutMapping(value="/exam/{exnum}")
	public @ResponseBody int updateExam(@RequestBody Exam ex,@PathVariable Integer exnum) {
		return ese.updateExam(ex);
	}
	@DeleteMapping(value="/exam/{exnum}")
	public @ResponseBody int deleteExam(@RequestBody Exam ex,@PathVariable Integer exnum) {
		return ese.deleteExam(exnum);
	}
	
	
	
}
