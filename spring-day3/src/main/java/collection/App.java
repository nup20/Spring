package collection;

public class App {

	public static void main(String[] args) {
		System.out.println("IOC");
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Emp radhe=(Emp) context.getBean("radhe");
	    
		System.out.println(radhe);
		
		
		

	}

}
