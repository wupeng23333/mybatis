package com.wupeng.dao.impl;

import com.wupeng.dao.StudentDao;
import com.wupeng.domain.Student;
import com.wupeng.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> selectStudents() {
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        String sqlId="com.wupeng.dao.StudentDao.selectStudents";
        List<Student> studentList=sqlSession.selectList(sqlId);
        sqlSession.close();
        return studentList;
    }
}
