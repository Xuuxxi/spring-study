import com.xuuxxi.service.Impl.UserServiceImpl;
import com.xuuxxi.service.UserService;

/**
 * @Author: Xuuxxi
 * @Date: 2022/4/8
 */
public class MyTest {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.getUser();
    }
}
