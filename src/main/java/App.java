import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat catbean = (Cat) applicationContext.getBean("cat");
        System.out.println(catbean.getName());
        Cat catbean2 = (Cat) applicationContext.getBean("cat");

        System.out.println();
        System.out.println("HelloWorld = "+ bean.equals(bean2));
        System.out.println("Cat = " + catbean.equals(catbean2));

    }
}