import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        Cat cat =
                (Cat) applicationContext.getBean("cat");
        cat.setName("Barsik");
        Cat cat1 =
                (Cat) applicationContext.getBean("cat");
        cat1.setName("Murzik");

        System.out.println("Объекты класса HelloWorld равны? " + (bean == bean1));
        System.out.println("Объекты класса Cat равны? " + (cat == cat1));
        System.out.println("Имя первого кота " + cat.getName());
        System.out.println("Имя второго кота " + cat1.getName());
    }
}