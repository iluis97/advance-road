package cn.luis.advance.spring.practise.demo1_one_interface_more_impl.service.impl;

import cn.luis.advance.spring.practise.demo1_one_interface_more_impl.service.GoodsService;

public class WeChatPayService extends AbstractPayService {

    public WeChatPayService(GoodsService goodsService) {
        super(goodsService);
    }

    @Override
    public boolean pay(String payType) {
        System.out.println("wechatpay ...");
        return true;
    }

}
