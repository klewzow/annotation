 
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		 Sum summa = new Sum();
		 
		 Method[] mtd = summa.getClass().getDeclaredMethods();
		 
		 
		 for (Method method : mtd) {
			 
			 if(method.isAnnotationPresent(TestAnnotation.class)) {
				 int a = (int) method.getAnnotation(TestAnnotation.class).a();
				 int b = (int) method.getAnnotation(TestAnnotation.class).b();
				 
				 try {
					System.out.println(method.invoke(summa, a,b) );	;
				} catch ( Exception e) {
					 
					e.printStackTrace();
				}  
 
			 }
			 
			 
			 
		}
		 
		 

	}

}
