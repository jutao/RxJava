package com.kaka.rxjava;

/**
 * author：jutao
 * time：2019/6/3
 * description：
 */
public class Observable<T> {
    private ObservableOnSubscribe onSubscribe;

    private Observable(ObservableOnSubscribe onSubscribe) {
        this.onSubscribe = onSubscribe;
    }

    public static <T> Observable<T> create(ObservableOnSubscribe<T> onSubscribe) {
        return new Observable<>(onSubscribe);
    }

    public void subscrible(Observer<? super T> subscribe) {
        onSubscribe.subscribe(subscribe);
    }
}
