package com.mj.dragrecycledemo.observe;

import java.util.Observable;
import java.util.Observer;

/**
 * 作者：Nick on 2016/5/18 17:56
 * 邮箱：mj0120@foxmail.com
 */
public class Obsetver implements Observer {

    //**使用者 观察者

    public void registerSubject(Observable observable)
    {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object data) {

    }
}
