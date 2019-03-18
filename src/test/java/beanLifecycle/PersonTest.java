package beanLifecycle;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void testPersonBean() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
        Person person = (Person) context.getBean("person");
        assertEquals("dummy person", person.getName());
        context.registerShutdownHook();
    }
}
