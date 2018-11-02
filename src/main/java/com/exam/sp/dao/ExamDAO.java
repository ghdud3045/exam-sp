package com.exam.sp.dao;

import java.util.List;

import com.exam.sp.vo.Exam;

public interface ExamDAO {

	public List<Exam> selectExamList();
	public Exam getExam(Integer exnum);
	public int insertExam(Exam ex);
	public int updateExam(Exam ex);
	public int deleteExam(int ex);
}
