import com.xuuxxi.pojo.People;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Xuuxxi
 * @Date: 2022/4/9
 */
public class MyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("people", People.class);
        people.getDog().shout();
        people.getCat().shout();
    }
}
