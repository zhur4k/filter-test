package com.filtertest;

public interface Filter<T> {
    T apply(T o);
}
