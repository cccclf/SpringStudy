import com.chen.dao.UserDaoMysqlImpl;
import com.chen.service.UserService;
import com.chen.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

//        //用户调用的是业务层，dao层他们不需要接触
//        UserServiceImpl userService = new UserServiceImpl();
//
//        userService.setUserDao(new UserDaoMysqlImpl());
//        userService.getUser();

        //获取ApplicationContext：通过配置文件，拿到Spring的bean容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //拿到容器后，需要什么就get什么
        UserServiceImpl userServiceImpl = (UserServiceImpl)context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}
