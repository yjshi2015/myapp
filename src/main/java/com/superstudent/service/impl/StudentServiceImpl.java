package com.superstudent.service.impl;

import com.superstudent.dao.StudentDAO;
import com.superstudent.domain.Student;
import com.superstudent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/8/24.
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDAO studentDAO;

    @Override
    public int saveStudent(Student student) {
        return studentDAO.saveStudent(student);
    }
}
