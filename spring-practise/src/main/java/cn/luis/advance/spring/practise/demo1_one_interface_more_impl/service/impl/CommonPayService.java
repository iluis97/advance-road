package cn.luis.advance.spring.practise.demo1_one_interface_more_impl.service.impl;

import cn.luis.advance.spring.practise.demo1_one_interface_more_impl.service.GoodsService;

public class CommonPayService extends AbstractPayService {

    public CommonPayService(GoodsService goodsService) {
        super(goodsService);
    }

    @Override
    public boolean pay(String payType) {
        System.out.println("common pay...");
        return super.pay(payType);
    }
}
