import com.xuuxxi.service.UserService;
import com.xuuxxi.service.UserServiceImpl;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Xuuxxi
 * @Date: 2022/4/11
 */
public class MyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserService userServiceImpl = (UserService) context.getBean("UserServiceImpl");

        userServiceImpl.add();
    }
}
