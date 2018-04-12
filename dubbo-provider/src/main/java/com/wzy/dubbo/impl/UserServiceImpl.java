package com.wzy.dubbo.impl;

import com.wzy.bean.UserInfo;
import com.wzy.dubbo.api.UserService;
import com.wzy.service.IUserInfoService;

import javax.annotation.Resource;
import java.util.List;

public class UserServiceImpl implements UserService{

    @Resource
    private IUserInfoService iUserInfoService;

    @Override
    public List<UserInfo> getAll() {
        return iUserInfoService.getAll();
    }
}
