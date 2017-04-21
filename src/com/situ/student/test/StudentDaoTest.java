package com.situ.student.test;

import org.junit.Test;

import com.situ.student.dao.IStudentDao;
import com.situ.student.dao.impl.StudentDaoImpl;
import com.situ.student.entity.Student;

public class StudentDaoTest {
	
	@Test
	public void testAdd() {
		IStudentDao studentDao = new StudentDaoImpl();
		Student student = new Student("wangwu", 20, "男");
		boolean result = studentDao.add(student);
		if (result) {
			System.out.println("添加成功");
		} else {
			System.out.println("添加失败");
		}
	}
}
