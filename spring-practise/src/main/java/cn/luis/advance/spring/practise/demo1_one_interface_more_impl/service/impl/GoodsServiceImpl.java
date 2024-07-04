package cn.luis.advance.spring.practise.demo1_one_interface_more_impl.service.impl;

import cn.luis.advance.spring.practise.demo1_one_interface_more_impl.service.GoodsService;

public class GoodsServiceImpl implements GoodsService {

    @Override
    public boolean findByName(String name) {
        System.out.println("find goods ...");
        return false;
    }
}
