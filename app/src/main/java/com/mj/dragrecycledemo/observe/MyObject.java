package com.mj.dragrecycledemo.observe;

import java.util.Observable;

/**
 * 作者：Nick on 2016/5/18 17:55
 * 邮箱：mj0120@foxmail.com
 * 主题 相当于主题
 */
public class MyObject extends Observable {

    protected void setMsg(String msg)
    {
        setChanged();
        notifyObservers();
    }
}
