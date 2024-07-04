package cn.luis.advance.spring.practise.demo1_one_interface_more_impl.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringContextHolder implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    public static <T> T getBean(String name, Class<T> requiredType) {
        return applicationContext.getBean(name, requiredType);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextHolder.applicationContext = applicationContext;
    }
}
