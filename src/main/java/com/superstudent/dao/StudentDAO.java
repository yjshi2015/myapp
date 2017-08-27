package com.superstudent.dao;

import com.superstudent.domain.Student;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/8/24.
 */
@Repository
public interface StudentDAO {

    /**
     * 添加、修改学生信息
     */
    int saveStudent(Student student);
}
