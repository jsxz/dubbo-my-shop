package vip.anjun.myshop.service.user.consumer.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import vip.anjun.myshop.service.user.api.UserConsumerService;

@Service(version = "${services.versions.user.v1}")
public class UserConsumerServiceImpl implements UserConsumerService {
    @Override
    public void info() {

    }
}
