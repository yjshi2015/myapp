import com.superstudent.domain.Student;
import com.superstudent.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.unitils.UnitilsJUnit4;
import org.unitils.spring.annotation.SpringApplicationContext;
import org.unitils.spring.annotation.SpringBean;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by Administrator on 2017/8/24.
 */
public class StudentServiceTest extends UnitilsJUnit4{

    @SpringApplicationContext({"applicationContext.xml"})
    private ApplicationContext applicationContext;

    @SpringBean("studentService")
    private StudentService studentService;

    @Test
    public void saveStudentTest() {
        Student stu = new Student();
        stu.setStudentId(1);
        stu.setStudentName("张三");
        stu.setStudentAge(12);
        assertNotNull(applicationContext);
        System.out.println("result---->" + studentService.saveStudent(stu));
    }
}
