package beanLifecycle;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.logging.Logger;

@Getter
@Setter
public class Person implements InitializingBean, DisposableBean {

    private static final Logger logger = Logger.getLogger(Person.class.getName());

    private String name;

    public Person() {
        logger.info("Constructor");
    }

    @Override
    public void destroy() {
        logger.info("destroy() method");
    }

    @Override
    public void afterPropertiesSet() {
        logger.info("afterPropertiesSet() method");
    }
}
