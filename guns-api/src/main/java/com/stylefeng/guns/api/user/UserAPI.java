package com.stylefeng.guns.api.user;

public interface UserAPI {

    boolean login(String username, String password);

    boolean register(UserModel userModel);

    boolean checkUsername(String username);

    UserInfoModel getUserInfo(int uuid); // 传入用户 id

    UserInfoModel updateUserInfo(UserInfoModel userInfoModel);
}
