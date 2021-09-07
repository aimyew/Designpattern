package com.fengsao.pattern.ab;

/**
 * @description: TODO
 * @date 2021/9/6 16:37
 */
public class SettingPwd implements Observer{
    @Override
    public void handle(String content) {
        System.out.println("set a pwd == " + content);
    }
}
