package com.wupeng.dao;

import com.wupeng.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    public Student selectStudentById(@Param("sid") Integer id);
}
