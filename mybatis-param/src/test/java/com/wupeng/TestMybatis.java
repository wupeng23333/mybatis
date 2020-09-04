package com.wupeng;


import com.wupeng.dao.StudentDao;
import com.wupeng.domain.Student;
import com.wupeng.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestMybatis {
    @Test
    public void testSelectStudentById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = dao.selectStudentById(1);

        System.out.println("学生=" + student);

    }
}
