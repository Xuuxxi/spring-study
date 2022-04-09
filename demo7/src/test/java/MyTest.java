import com.xuuxxi.config.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Xuuxxi
 * @Date: 2022/4/9
 */
public class MyTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Object user = context.getBean("getUser");
        System.out.println(user);
    }
}
