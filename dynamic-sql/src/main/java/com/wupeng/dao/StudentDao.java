package com.wupeng.dao;

import com.wupeng.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    List<Student> selectStudentIf(Student student);
    List<Student> selectStudentWhere(Student student);
    List<Student> selectStudentForEach(List<Integer> list);
    List<Student> selectAll();
}
