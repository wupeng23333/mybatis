package com.wupeng.dao;

import com.wupeng.domain.Student;

import java.util.List;

public interface StudentDao {
    List<Student> selectStudents();
}
