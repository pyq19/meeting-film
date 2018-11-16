package com.stylefeng.guns.api.user;

import com.stylefeng.guns.api.user.vo.UserInfoModel;
import com.stylefeng.guns.api.user.vo.UserModel;

public interface UserAPI {

    int login(String username, String password);    // 用 int 原因是要把登录后的用户 id 存在 ThreadLocal

    boolean register(UserModel userModel);

    boolean checkUsername(String username);

    UserInfoModel getUserInfo(int uuid); // 传入用户 id

    UserInfoModel updateUserInfo(UserInfoModel userInfoModel);
}
