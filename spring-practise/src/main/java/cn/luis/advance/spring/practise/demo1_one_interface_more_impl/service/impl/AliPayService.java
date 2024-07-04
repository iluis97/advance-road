package cn.luis.advance.spring.practise.demo1_one_interface_more_impl.service.impl;

import cn.luis.advance.spring.practise.demo1_one_interface_more_impl.service.GoodsService;

public class AliPayService extends AbstractPayService {

    public AliPayService(GoodsService goodsService) {
        super(goodsService);
    }

    @Override
    public boolean pay(String payType) {
        System.out.println("alipay ...");
        return true;
    }

    public void init() {
        super.init();
        System.out.println("alipay init ...");
    }

}
