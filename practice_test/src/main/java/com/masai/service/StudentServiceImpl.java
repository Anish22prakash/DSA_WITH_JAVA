package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.dao.StudentDao;
import com.masai.model.Student;


@Service
public class StudentServiceImpl implements StudentService{
	
	
	@Autowired
	private StudentDao studentDao;
	

	@Override
	public Student addStudent(Student student) {
		
		return studentDao.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> allstudent=studentDao.findAll();
		return allstudent;
	}
	

}
