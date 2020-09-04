package com.wupeng;


import com.wupeng.dao.StudentDao;
import com.wupeng.domain.Student;
import com.wupeng.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestMybatis {
    @Test
    public void testSelectStudents(){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        StudentDao dao=sqlSession.getMapper(StudentDao.class);
        List<Student> students=dao.selectStudents();
        for(Student stu:students){
            System.out.println("学生="+stu);
        }
    }
}
