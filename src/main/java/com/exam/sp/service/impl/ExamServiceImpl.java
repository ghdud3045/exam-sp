package com.exam.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.sp.dao.ExamDAO;
import com.exam.sp.service.ExamService;
import com.exam.sp.vo.Exam;

@Service
public class ExamServiceImpl implements ExamService {

	@Autowired
	private ExamDAO exdao;
	
	@Override
	public List<Exam> selectExamList() {
		return exdao.selectExamList();
	}

	@Override
	public Exam getExam(Integer exnum) {
		return exdao.getExam(exnum);
	}

	@Override
	public int insertExam(Exam ex) {
		return exdao.insertExam(ex);
	}

	@Override
	public int updateExam(Exam ex) {
		return exdao.updateExam(ex);
	}

	@Override
	public int deleteExam(int ex) {
		return exdao.deleteExam(ex);
	}

}
