package com.kaka.rxjava;

/**
 * author：jutao
 * time：2019/6/3
 * description：
 */
public interface Action1<T> {
    /**
     * 订阅所需功能
     * @param t
     */
    void subscribe(T t);
}
