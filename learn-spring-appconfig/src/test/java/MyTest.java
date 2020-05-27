import com.chen.config.MyConfig;
import com.chen.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //如果完全使用了配置类的方式去做，我们就只能通过AnnotationConfig上下文来获取容器，通过配置类的class对象加载！
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        //存在两个User对象
//        User getUser = context.getBean("user", User.class);//利用spring自动创建的User对象，对应bean：user
        User getUser = context.getBean("getUser", User.class);//利用Java注解创建的User对象，对应bean：getUser
        System.out.println(getUser.getName());
    }
}
