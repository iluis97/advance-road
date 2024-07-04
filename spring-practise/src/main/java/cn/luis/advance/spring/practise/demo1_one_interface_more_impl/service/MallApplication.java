package cn.luis.advance.spring.practise.demo1_one_interface_more_impl.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MallApplication {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        OrderService orderService = ac.getBean("orderService", OrderService.class);
        orderService.payOrder(123D, "alipay");

    }

}
