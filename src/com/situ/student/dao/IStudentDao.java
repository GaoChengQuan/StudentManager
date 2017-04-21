package com.situ.student.dao;

import java.util.List;

import com.situ.student.entity.Student;
/**
 * 对StudentDao操作的接口
 * @author Gao
 *
 */
public interface IStudentDao {
	/**
	 * 添加学生
	 * @param student
	 * @return true:添加成功 false：添加失败
	 */
	public abstract boolean add(Student student);
	
	/**
	 * 根据id删除学生
	 * @param id
	 * @return true:删除成功 false：删除失败
	 */
	public abstract boolean delete(int id);
	
	/**
	 * 更新Student
	 * @param student
	 * @return true:更新成功 false：更新失败
	 */
	public abstract boolean update(Student student);
	
	/**
	 * 根据id查找指定的学生
	 * @param id
	 */
	public abstract Student findById(int id);
	
	/**
	 * 查询所有的学生信息
	 * @return
	 */
	public abstract List<Student> findAll();
}
