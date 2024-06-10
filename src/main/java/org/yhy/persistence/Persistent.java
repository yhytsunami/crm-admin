package org.yhy.persistence;

import java.util.List;

public interface Persistent<T> {

    int save(T obj);

    T get(String id);

    List<T> queryAll();
}
