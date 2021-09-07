package com.fengsao.pattern.ab;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO
 * @date 2021/9/6 16:40
 */
public class RegImpl implements Register {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String content) {
        for (Observer o : observers) {
            o.handle(content);
        }
    }

    public static void main(String[] args) {
        RegImpl reg = new RegImpl();
        reg.registerObserver(new SettingIco());
        reg.registerObserver(new SettingPwd());
        reg.notifyObservers("apple");
    }
}
