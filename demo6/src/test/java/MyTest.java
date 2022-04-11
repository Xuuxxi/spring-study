import com.xuuxxi.pojo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Xuuxxi
 * @Date: 2022/4/9
 */
public class MyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
