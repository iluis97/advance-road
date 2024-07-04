package cn.luis.advance.spring.practise.demo1_one_interface_more_impl.service.impl;

import cn.luis.advance.spring.practise.demo1_one_interface_more_impl.service.OrderService;
import cn.luis.advance.spring.practise.demo1_one_interface_more_impl.service.PayService;
import lombok.Setter;

@Setter
public class OrderServiceImpl implements OrderService {

    private PayService payService;

    @Override
    public void payOrder(double salary, String payType) {
        boolean payResult = payService.pay(payType);
        System.out.println("支付结果：" + payResult + ", " + salary);
    }
}
