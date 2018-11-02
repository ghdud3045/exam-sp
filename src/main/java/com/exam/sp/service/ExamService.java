package com.exam.sp.service;

import java.util.List;

import com.exam.sp.vo.Exam;

public interface ExamService {
	public List<Exam> selectExamList();
	public Exam getExam(Integer exnum);
	public int insertExam(Exam ex);
	public int updateExam(Exam ex);
	public int deleteExam(int ex);
}
