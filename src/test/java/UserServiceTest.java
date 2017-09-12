import com.superstudent.domain.User;
import com.superstudent.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.unitils.UnitilsJUnit4;
import org.unitils.spring.annotation.SpringApplicationContext;
import org.unitils.spring.annotation.SpringBean;

/**
 * Created by Administrator on 2017/8/24.
 */
public class UserServiceTest extends UnitilsJUnit4{

    @SpringApplicationContext({"applicationContext.xml"})
    private ApplicationContext applicationContext;

    @SpringBean("userService")
    private UserService userService;

    @Test
    public void testUserService() {
        User user = new User();
        user.setUserName("syj");
        user.setPassword("123");
        boolean result = userService.userExists(user);
        System.out.println("result---->" + result);
    }
}
