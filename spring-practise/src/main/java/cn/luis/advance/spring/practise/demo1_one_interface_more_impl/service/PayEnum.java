package cn.luis.advance.spring.practise.demo1_one_interface_more_impl.service;

import lombok.Getter;

import java.util.Arrays;
import java.util.Objects;

@Getter
public enum PayEnum {

    ALI_PAY("alipay", "支付宝"),
    WECHAT_PAY("wechat", "微信");


    private final String type;
    private final String name;

    PayEnum(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public static PayEnum getByType(String payType) {
        return Arrays.stream(PayEnum.values())
                .filter(en -> Objects.equals(en.getType(), payType))
                .findFirst()
                .orElse(null);

    }

}
