package cn.luis.advance.spring.practise.demo1_one_interface_more_impl.service.impl;

import cn.luis.advance.spring.practise.demo1_one_interface_more_impl.service.GoodsService;
import cn.luis.advance.spring.practise.demo1_one_interface_more_impl.service.PayEnum;
import cn.luis.advance.spring.practise.demo1_one_interface_more_impl.service.PayService;
import cn.luis.advance.spring.practise.demo1_one_interface_more_impl.service.SpringContextHolder;

public class AbstractPayService implements PayService {
    private final GoodsService goodsService;

    public AbstractPayService(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    @Override
    public boolean pay(String payType) {
        goodsService.findByName("pay test");

        PayEnum payEnum = PayEnum.getByType(payType);
        switch (payEnum) {
            case ALI_PAY:
                return SpringContextHolder.getBean("aliPayService", AliPayService.class).pay(payType);
            case WECHAT_PAY:
                return SpringContextHolder.getBean("weChatPayService", WeChatPayService.class).pay(payType);
            default:
                throw new RuntimeException("暂不支持该方式支付！");
        }
    }

    public void init() {
        System.out.println("abstract PayService init ...");
    }
}
