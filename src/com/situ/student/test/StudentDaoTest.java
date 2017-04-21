package com.situ.student.test;

import java.util.List;

import org.junit.Test;

import com.situ.student.dao.IStudentDao;
import com.situ.student.dao.impl.StudentDaoMySqlImpl;
import com.situ.student.entity.Student;

public class StudentDaoTest {
	
	@Test
	public void testAdd() {
		IStudentDao studentDao = new StudentDaoMySqlImpl();
		Student student = new Student("wangwu", 20, "男");
		boolean result = studentDao.add(student);
		if (result) {
			System.out.println("添加成功");
		} else {
			System.out.println("添加失败");
		}
	}
	
	@Test
	public void testDelete() {
		IStudentDao studentDao = new StudentDaoMySqlImpl();
		boolean result = studentDao.delete(6);
		if (result) {
			System.out.println("删除成功");
		} else {
			System.out.println("删除失败");
		}
	}
	
	@Test
	public void testUpdate() {
		IStudentDao studentDao = new StudentDaoMySqlImpl();
		Student student = new Student(1, "zhangsan", 30, "女");
		boolean result = studentDao.update(student);
		if (result) {
			System.out.println("更新成功");
		} else {
			System.out.println("更新失败");
		}
	}
	
	@Test
	public void testFindById() {
		IStudentDao studentDao = new StudentDaoMySqlImpl();
		Student student = studentDao.findById(1);
		if (student != null) {
			System.out.println(student);
		}
	}
	
	@Test
	public void testFindAll() {
		IStudentDao studentDao = new StudentDaoMySqlImpl();
		List<Student> list = studentDao.findAll();
		if (list != null) {
			for (Student student : list) {
				System.out.println(student);
			}
		}
	}
}
