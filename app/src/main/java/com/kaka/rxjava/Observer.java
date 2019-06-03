package com.kaka.rxjava;

import android.support.annotation.NonNull;

/**
 * author：jutao
 * time：2019/6/3
 * description：观察者
 */
public interface Observer<T> {
    void onNext(@NonNull T t);

    void onError(@NonNull Throwable e);

    void onComplete();
}
