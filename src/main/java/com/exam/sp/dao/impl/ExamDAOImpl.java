package com.exam.sp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exam.sp.dao.ExamDAO;
import com.exam.sp.vo.Exam;

@Repository
public class ExamDAOImpl implements ExamDAO{

	@Autowired
	private SqlSession ss;
	@Override
	public List<Exam> selectExamList() {
		return ss.selectList("com.exam.sp.EXAM.selectExamList");
	}

	@Override
	public Exam getExam(Integer exnum) {
		return ss.selectOne("com.exam.sp.EXAM.selectExam",exnum);
	}

	@Override
	public int insertExam(Exam ex) {
		return ss.insert("com.exam.sp.EXAM.insertExam",ex);
	}

	@Override
	public int updateExam(Exam ex) {
		return ss.update("com.exam.sp.EXAM.updateExam",ex);
	}

	@Override
	public int deleteExam(int ex) {
		return ss.delete("com.exam.sp.EXAM.deleteExam",ex);
	}

}
