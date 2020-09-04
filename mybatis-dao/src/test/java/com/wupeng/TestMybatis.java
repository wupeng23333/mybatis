package com.wupeng;


import com.wupeng.dao.StudentDao;
import com.wupeng.dao.impl.StudentDaoImpl;
import com.wupeng.domain.Student;
import org.junit.Test;

import java.util.List;

public class TestMybatis {
    @Test
    public void testSelectStudents(){

        StudentDao dao= new StudentDaoImpl();
        List<Student> students=dao.selectStudents();
        for(Student stu:students){
            System.out.println("学生="+stu);
        }
    }
}
