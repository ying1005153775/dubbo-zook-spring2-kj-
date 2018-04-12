package com.wzy.dubbo.api;

import com.wzy.bean.UserInfo;

import java.util.List;

public interface UserService {
    public List<UserInfo> getAll();
}
