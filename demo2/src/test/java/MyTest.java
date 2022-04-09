import com.xuuxxi.pojo.Hello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Xuuxxi
 * @Date: 2022/4/8
 */
public class MyTest {
    public static void main(String[] args) {
        //获取Spring的上下文对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //现在对象都在Spring中管理了，使用则取出即可
        Object bean = context.getBean("Hello");
        System.out.println(bean);
    }
}
