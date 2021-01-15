import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPublish {

    @Test
    public void publishService() throws Exception{

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext-*.xml");

        System.out.println("服务已经启动");
        System.in.read();

        System.out.println("服务已经关闭");
    }
}
