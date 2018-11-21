package com.stylefeng.guns.rest.common;

public class CurrentUser {

    // 线程绑定的存储空间
    private static final InheritableThreadLocal<String> threadLocal = new InheritableThreadLocal<>();
    // 因为 Hystrix 会线程切换，InheritableThreadLocal 可以在切换时保存线程信息

    public static void saveUserId(String userId) {
        threadLocal.set(userId);
    }

    public static String getCurrentUserId() {
        return threadLocal.get();
    }

    /*
    不推荐用法，应为 UserInfoModel 很占内存空间
    private static final ThreadLocal<UserInfoModel> threadLocal = new ThreadLocal<>();
    // 将用户信息放入存储空间
    public static void saveUserInfo(UserInfoModel userInfoModel) {
        threadLocal.set(userInfoModel);
    }

    // 取出用户信息
    public static UserInfoModel getCurrentUser() {
        return threadLocal.get();
    }
    */
}
