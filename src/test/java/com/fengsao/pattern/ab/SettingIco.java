package com.fengsao.pattern.ab;

/**
 * @description: TODO
 * @date 2021/9/6 16:38
 */
public class SettingIco implements Observer{
    @Override
    public void handle(String content) {
        System.out.println("set an ico == " + content);
    }
}
