import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args)
	{
		ApplicationContext Context = new ClassPathXmlApplicationContext("spring.xml");
		Shape shape = (Shape) Context.getBean("circle");
		shape.draw();
	}
}
