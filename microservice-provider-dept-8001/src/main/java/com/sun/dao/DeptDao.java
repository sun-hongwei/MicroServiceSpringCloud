package com.sun.dao;

import com.sun.entities.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptDao
{
	boolean addDept(Dept dept);

	@Select("select dept_no,d_name,db_source from dept where dept_no=#{deptno}")
	Dept findById(Long id);

	List<Dept> findAll();
}
