import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target(value = { ElementType.METHOD })
@Retention(RUNTIME)
public @interface TestAnnotation {
	int a() default 0;

	int b() default 0;
}
