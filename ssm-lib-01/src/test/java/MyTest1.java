import com.wildchap.pojo.Books;
import com.wildchap.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest1 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService o = context.getBean("BookServiceImpl", BookService.class);
        for (Books books : o.queryAllBook()) {
            System.out.println(books);
        }
    }

}
