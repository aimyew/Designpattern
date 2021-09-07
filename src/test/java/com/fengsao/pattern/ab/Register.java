package com.fengsao.pattern.ab;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO
 * @date 2021/9/6 16:35
 */
public interface Register {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String content);
}
