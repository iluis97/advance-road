package cn.luis.spring.boot.source;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class Cat implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("Cat#afterPropertiesSet run...");
    }

    @PostConstruct
    public void postConstruct() {
        log.info("Cat#postConstruct run...");
    }

}
